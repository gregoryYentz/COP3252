import java.io.File;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.IllegalFormatException;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class FileMatch{
	private static Scanner inOldMaster;
	private static Scanner inTransaction;
	private static Formatter outNewMaster;
	private static Formatter logFile;
	private static TransactionRecord transaction;
	private static AccountRecord account;

	public FileMatch(){
		transaction = new TransactionRecord();
		account = new AccountRecord();
	}

	public void openFiles(){
		try{
			// file streams for input and output files
			inOldMaster = new Scanner( new File( "oldmast.txt" ) );
			inTransaction = new Scanner( new File( "trans.txt" ) );
			outNewMaster = new Formatter( "newmast.txt" );
			logFile = new Formatter( "log.txt" );
		}

		catch ( Exception exception )
			{
			System.err.println( "Error opening the files." );
		}
	}

	public void processFiles(){
		int transactionAccountNumber;
		int accountNumber;
		try{
			// get a transaction record and its account number
			transaction = getTransactionRecord();
			
			// if the transaction is null, we are done
			if ( transaction == null ){
				return;
			}
			transactionAccountNumber = transaction.getAccount();
			
			// get an account record and its account number
			account = getAccountRecord();
			
			// if the account is null, we are done
			if ( account == null ){
				return;
			}
			accountNumber = account.getAccount();
			while ( accountNumber != 0 ){
				while ( accountNumber < transactionAccountNumber ){
					// there is no transaction for this account
					outNewMaster.format( "%d %s %s %.2f\n",
					account.getAccount(), account.getFirstName(),
					account.getLastName(), account.getBalance() );
					account = getAccountRecord(); // get a new account
					if ( account == null ){
						return;
					}
					accountNumber = account.getAccount();
				}

				// if there is a transaction for this account
				if ( accountNumber == transactionAccountNumber ){

					// combine the records
					account.combine( transaction );

					// write to the master file
					outNewMaster.format( "%d %s %s %.2f\n",
					account.getAccount(), account.getFirstName(),
					account.getLastName(), account.getBalance() );

					// get a new transaction
					transaction = getTransactionRecord();
					if ( transaction == null ){
						return;
					}	

					transactionAccountNumber = transaction.getAccount();

					// get a new account
					account = getAccountRecord();

					if ( account == null ){
						return;
					}

					accountNumber = account.getAccount();
				 }

				while ( transactionAccountNumber < accountNumber ){
					
					// there is no account for this transaction
					logFile.format( "%s %d\n", "Unmatched transaction record for account number", transactionAccountNumber );

					// get a new transaction
					transaction = getTransactionRecord();

					if ( transaction == null ){
						return;
					}

					transactionAccountNumber = transaction.getAccount();
				}
			}
		}

		catch ( FormatterClosedException closedException ){
			System.err.println(
			"Error writing to file - file has been closed." );
			System.exit( 1 );
		}

		catch ( IllegalFormatException formatException ){
			System.err.println( "Error with output." );
			System.exit( 1 );
		}
	}

	public void closeFiles(){
		try{
			if ( inTransaction != null ){
				inTransaction.close();
			}
			if ( outNewMaster != null ){
				outNewMaster.close();
			}
			if ( inOldMaster != null ){
				inOldMaster.close();
			}
			if ( logFile != null ){
				logFile.close();
			}
		}

		catch ( Exception exception ){
			System.err.println( "Error closing the files." );
			System.exit( 1 );
		}
	}
	
	private TransactionRecord getTransactionRecord(){
		// try to read the record
		try{
			if ( inTransaction.hasNext() ){
				transaction.setAccount( inTransaction.nextInt() );
				transaction.setAmount( inTransaction.nextDouble() );
				return transaction;
			}

			else{
				// these remaining accounts have
				while ( inOldMaster.hasNext() ){
					account.setAccount( inOldMaster.nextInt() );
					account.setFirstName( inOldMaster.next() );
					account.setLastName( inOldMaster.next() );
					account.setBalance( inOldMaster.nextDouble() );
					// store in new master
					outNewMaster.format( "%d %s %s %.2f\n",
					account.getAccount(), account.getFirstName(),
					account.getLastName(), account.getBalance() );
				}
			}
		}

		catch ( FormatterClosedException closedException ){
			System.err.println(
			"Error writing to file - file has been closed." );
			System.exit( 1 );
		}
		
		catch ( IllegalFormatException formatException ){
			System.err.println( "Error with output." );
			System.exit( 1 );
		}

		catch ( NoSuchElementException elementException ){
			System.err.println( "Invalid input from file." );
		}
		
		return null;
	}

	private AccountRecord getAccountRecord(){
		try{
			if ( inOldMaster.hasNext() ){
				account.setAccount( inOldMaster.nextInt() );
				account.setFirstName( inOldMaster.next() );
				account.setLastName( inOldMaster.next() );
				account.setBalance( inOldMaster.nextDouble() );
				return account;
			} // end if
			
			else{
				logFile.format( "%s %d\n", "Unmatched transaction record for account number", transaction.getAccount() );

				// these records are transactions without accounts
				while ( inTransaction.hasNext() ){
					transaction.setAccount( inTransaction.nextInt() );
					transaction.setAmount( inTransaction.nextDouble() );
				}
			}
		}

		catch ( FormatterClosedException closedException ){
			System.err.println(
			"Error writing to file - file has been closed." );
			System.exit( 1 );
		}

		catch ( IllegalFormatException formatException ){
			System.err.println( "Error with output." );
			System.exit( 1 );
		}

		catch ( NoSuchElementException elementException ){
			System.err.println( "Invalid input from file." );
		}

		return null;
	}
}

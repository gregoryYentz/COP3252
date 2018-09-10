import java.util.*;

public class InvoiceTest extends Invoice{
	public static void printInvoice(Invoice temp, String name){
		System.out.println("*****" + name + "*****");
		System.out.println("Part Number: \t\t" + temp.getPartNumber());
		System.out.println("Part Description: \t" + temp.getPartDescription());
		System.out.println("Quantity: \t\t" + temp.getQuantity());
		System.out.println("Price: \t\t\t$" + String.format("%.2f",temp.getPrice()));
		System.out.println("Invoice Amount: \t$" + String.format("%.2f",temp.getInvoiceAmount()));
	}; 

	public static void main(String args[]){
		Invoice pen = new Invoice("0000a", "Not a pencil", 20, .20);
		printInvoice(pen, "Pen");
		Invoice pencil = new Invoice();
		printInvoice(pencil, "Pencil");
		pencil.setPartNumber("0000b");
		pencil.setPartDescription("Not a pen");
		pencil.setQuantity(30);
		pencil.setPrice(.1);
		System.out.println("Updated");
		System.out.println("Part Number: " + pencil.getPartNumber());
		printInvoice(pencil, "Pencil Update");

		Invoice item1 = new Invoice();
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter product number: ");
		item1.setPartNumber(userInput.nextLine());
		System.out.print("Enter product description: ");
		item1.setPartDescription(userInput.nextLine());
		System.out.print("Enter quantity: ");
		item1.setQuantity(userInput.nextInt());
		System.out.print("Enter price: ");
		item1.setPrice(userInput.nextDouble());
		printInvoice(item1, "Item1");
		
		System.out.print("New price: ");
		item1.setPrice(userInput.nextDouble());
		printInvoice(item1, "Item1 Updated");




	};




}

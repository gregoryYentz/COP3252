import java.util.*;

public class Invoice{
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double price;

	public String getPartNumber(){
		return partNumber;
	};
	public void setPartNumber(String number){
		this.partNumber = number;
	};
	public String getPartDescription(){
		return partDescription;
	};
	public void setPartDescription(String description){
		this.partDescription = description;
	};
	public int getQuantity(){
		return quantity;
	};
	public void setQuantity(int num){
		if(num<0){
			quantity=0;
		}
		else{
			quantity = num;
		}
	};
	public double getPrice(){
		return price;
	};
	public void setPrice(double num){
		if(num<0){
			price=0;
		}
		else{
			price = num;
		}
	};
	public double getInvoiceAmount(){
		return quantity*price;
	};
	public Invoice(){};
	public Invoice(String num, String desc, int quant, double pric){
		this.partNumber = num;
		this.partDescription = desc;
		quantity = quant;
		price = pric;
	};
}

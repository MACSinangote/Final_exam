public class Main{
	
	public static void main(String[]orgs){
		customer Customer;
		regularCustomer RegularCustomer = new regularCustomer("Mitch", 1000);
		seniorcustomer seniorcustomer = new seniorcustomer("Dhae", 1000);	
		Customer = regularCustomer;
		
		System.out.println(customer.calculatedBill() + "\t" + customer.getName()+".");
	}
}

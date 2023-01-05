public class regularCustomer
{
	private double amount;
	
	public regularCustomer (String name, int amount)
	{
		super(name,amount);
		this.amount = amount;
	}
	public double calculatedBill(){
		return amount;
	}
	public double getAmount(){
		return amount;
		
	}
	public double setAmount(double amount){
		return amount;
	}
}

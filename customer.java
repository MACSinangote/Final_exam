public abstract class customer
{
	private String name;
		double amount;
		
		//Constructor
		public customer(String name, int amount){
			this.name = name;
			this.amount = amount;
		}
		
		//Method
		public abstract double calculatedBill();
		
		public String getName(){
			return name;
		}
		public void setName(){
			this.name = name;
		}
}

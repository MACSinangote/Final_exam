public class seniorcustomer
{
	private final double discount;
	
	      public seniorcustomer(String name, int amount)
		  {
			  super(name, amount);
			  this.discount = amount - (amount * 0.20);
		  }
}

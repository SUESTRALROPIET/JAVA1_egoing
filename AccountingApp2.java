public class AccountingApp2 
{
	public static void main(String[] args) 
	{
		
		double ValueOfSupply = 10000.0;
		double vatRate = 0.1;
		double VAT = ValueOfSupply * vatRate;
		double expenseRate = 0.3;
		double expense = ValueOfSupply * expenseRate;
		double income = ValueOfSupply - expense;
		double dividend1 = income * 0.5;
		double dividend2 = income * 0.3;
		double dividend3 = income * 0.2;

		System.out.println("Value of Supply : " + ValueOfSupply);
		System.out.println("VAT : " + VAT);
		System.out.println("Total : " + (ValueOfSupply + VAT));
		System.out.println("Expense : " + expense);
		System.out.println("Income  : " + income);
		System.out.println("Dividend 1  : " + dividend1);
		System.out.println("Dividend 2  : " + dividend2);
		System.out.println("Dividend 3  : " + dividend3);
	}
}

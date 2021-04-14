public class AccountingApp5 
{
	public static void main(String[] args) 
	{	
		double ValueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double VAT = ValueOfSupply * vatRate;
		double expenseRate = 0.3;
		double expense = ValueOfSupply * expenseRate;
		double income = ValueOfSupply - expense;
		
		double[] dividendRates = new double [3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;

		double dividend1 = income * dividendRates[0];
		double dividend2 = income * dividendRates[1];
		double dividend3 = income * dividendRates[2];

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

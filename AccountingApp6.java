public class AccountingApp6 
{
	public static void main(String[] args) 
	{
		double ValueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double VAT = ValueOfSupply * vatRate;
		double expenseRate = 0.3;
		double expense = ValueOfSupply * expenseRate;
		double income = ValueOfSupply - expense;

		System.out.println("Value of Supply : " + ValueOfSupply);
		System.out.println("VAT : " + VAT);
		System.out.println("Total : " + (ValueOfSupply + VAT));
		System.out.println("Expense : " + expense);
		System.out.println("Income  : " + income);
		
		double[] dividendRates = new double [3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		int i = 0;
		
		while (i < dividendRates.length)
		{System.out.println("Dividend " + i + ": " + (income * dividendRates[i]) );
		i = i+1;
		}
	}
}

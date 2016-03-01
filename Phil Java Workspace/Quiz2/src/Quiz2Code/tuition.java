package Quiz2Code;
import java.util.Scanner;
import org.apache.poi.ss.formula.functions.*;
import java.text.*;

public class tuition {
	
	/*private double initialTuition;
	private double tuitionIncrease;
	private double repaymentAPR;
	private double repaymentYears;*/
	

	public tuition() {
		Scanner user = new Scanner(System.in);
		System.out.print("What is the initial tuition rate? $");
		double initialTuition = user.nextDouble();

		System.out.print("What is the annual tuition inflation? (decimal value)");
		double tuitionIncrease = user.nextDouble();

		System.out.print("What is the repayment APR?");
		double repaymentAPR = user.nextDouble();

		System.out.print("What is the repayment schedule (how many years)?");
		double repaymentYears = user.nextDouble();
		
		double futureValue = FinanceLib.fv(tuitionIncrease, 4, initialTuition, 0, false);
		double payment = FinanceLib.pmt(repaymentAPR, repaymentYears, 0, futureValue, false);
		
		System.out.print("Total tuition will be"+futureValue);
		System.out.println("Repayment schedule will be"+payment);

		user.close();


	}





}



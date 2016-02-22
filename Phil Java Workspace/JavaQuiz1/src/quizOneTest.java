import java.util.Scanner;


public class quizOneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner user = new Scanner(System.in); //done to set up for user input
		
		System.out.println("How many touchdowns? "); //Prompting for values
		double TD = user.nextDouble(); //Vhow many touchdowns
		
		System.out.println("How many yards? "); 
		double Yards = user.nextDouble(); //how may yards
		
		System.out.println("How many interceptions? "); 
		double INT = user.nextDouble(); //amount of interceptions
		
		System.out.println("How many completions? "); 
		double comp = user.nextDouble(); //amount of completions
		
		System.out.println("How many passes attempted? "); 
		double ATT = user.nextDouble(); //Attempted passes
		
		double passerA = ((comp/ATT) -.3)*5;
		double passerB = ((Yards/ATT)-3)*.25;
		double passerC = (TD/ATT)*20;
		double passerD = 2.375-(INT/ATT)*25; 
		double passerRating = ((passerA + passerB + passerC + passerD)/6)*100;
		System.out.println("This player's Passer rating is "+passerRating+".");
	}

}

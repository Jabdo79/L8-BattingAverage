/*Jonathan Abdo 6-10-16
 * Calculates batting average and slugging percentage for one or more baseball players
 */
import java.util.Scanner;

public class BattingAverage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//quick title
		System.out.println("Welcome to Batting Average Calculator!");
		
		int[] batters = new int[InputCheck.getInt(sc, "\nHow many batters would you like to enter data for? ")];
		
		System.out.println(batters.length);
		
	}

}

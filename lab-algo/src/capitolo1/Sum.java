/*
 * Questa classe prende in input i numeri scritti da tastiera e ne fa la somma
 * (potenzialmente all'infinito).
 * Questo avviene grazie alla classe scanner che permette la lettura dell'input
 * che una volta letta viene sommata al somma totale. 
 */

package capitolo1;
import java.util.*;

public class Sum {

	public static void main (String[] args){
		new Sum().run();
	}

	public void run(){

		final int SENTINEL = -0;

		final String INPUT_PROMPT = "\nPlease enter a test score" + "( or " + SENTINEL + " to quit ) : ";

		final String SUM_MESSAGE = "\n\nThe sum of the score is ";

		Scanner sc = new Scanner(System.in);

		int score,
				sum = 0;

		while (true){
				System.out.println(INPUT_PROMPT);
				score = sc.nextInt();
				if (score == SENTINEL)
					break;
				sum += score;
		}		//while
		System.out.println(SUM_MESSAGE + sum);
	}  //metodo run

}  //classe Sum

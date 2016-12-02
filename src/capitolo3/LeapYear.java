/*
 * La classe controlla se gli anni inseriti in input sono anni bisestili. 
 * Si utilizza un try e un catch per evitare l'eventuale inserimento di caratteri invece che di numeri 
 * (altrimenti questo genererebbe una eccezione che causa l'interruzione dell'esecuzione)
 */


package capitolo3;
import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
		new LeapYear().run();
	}//metodo main

	public void run(){
		final String INPUT_PROMPT = "Please enter the year: ";
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++){
			try{
				System.out.print(INPUT_PROMPT);
				System.out.println(isLeapYear(sc));
			}//try
			catch(InputMismatchException e){
				System.out.println("The input is not an integer!!");
				sc.nextLine();
			}// catch InputMismatchExeception
			catch(IllegalArgumentException e){
				System.out.println("The input is too big or too small");
				sc.nextLine();
			}
		}//for
	}// metodo run

	public boolean isLeapYear(Scanner sc){
		final int FIRST_YEAR = 1582 ;
		int year = sc.nextInt();
		if(year < FIRST_YEAR)
			throw new IllegalArgumentException();
		if((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0))
			return true;
		return false;
	}//metodo isLeapYear
}//classe LeapYear

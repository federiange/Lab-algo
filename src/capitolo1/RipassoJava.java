package capitolo1;

import java.util.Scanner;

public class RipassoJava {

	String str = new String();
	static int cinque = 3;
	
	public static void setCinque(int num){
		cinque = 5;
		num ++;
		System.out.println(num);
	} 
	
	public static void main (String[] args){
		
		int nume = 4;
		String s1 = new String("iao");
		System.out.printf( "s1 = %s\n",s1);
		String s2 = new String("eccoci");
		System.out.printf( "var di classe cinque = %d\t s2 = %s\n",cinque,s2 );
		setCinque(nume);
		System.out.println("il numero viene incrementato? eccolo : " + nume + "\n");
		System.out.printf( "\nho cambiato 5 var di class ora è = %d\n",cinque);
		System.out.printf("\nla lunghezza di s2 è = %s\n", s2.length());
		
		//String s3 = null;
		// System.out.println(s3.length()); /*si accede a una variabile che non punta a nulla*/
		String s4 = s1;
		System.out.printf("s4 punta a s1? %s\n",s4.equals(s1));
		System.out.printf("s1 punta a s4? %s\n",s1.equals(s4));
		s4 = "caio";
		System.out.println( "s4 =" + s4 + "\t" + "s1 =" + s1);
		
		/*
		 * CLASSE SCANNER 
		 */
		Scanner sc = new Scanner(System.in); //legge da tastiera un int
		int i = sc.nextInt();
		Scanner sic = new Scanner(System.in);//legge da tastiera una stringa
		String sica = sic.next(); 
		System.out.println(i + sica);
	}
}

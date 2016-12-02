package capitolo6;
import java.lang.*;
import java.util.Scanner;

//allora 

public class Compara{

	public static int sequentialSearch( Object[] a, Object key){
		for(int i = 0; i < a.length; i++)
			if(((Comparable)a[i]).compareTo(key) == 0)
				return i;
		return -1;
	}//sequentialSearch
	
	public static int binarySearch(Object[] a, int first, int last, Object key ){
		
		if(first <= last){
			int mid = (first + last) >> 1;
			Comparable midVal = (Comparable)a[mid];
			int comp = midVal.compareTo(key);
			System.out.println("first: " + first + "\tlast: " + last + "		key: "+ key +
								"		mid: " +  mid + "		comp: "+ comp);
			if(comp < 0)
				return binarySearch(a, mid + 1, last, key);
			if(comp > 0)
				return binarySearch(a, first, mid-1, key);
			return mid;
		}
		return -first -1;
	}// metodo binarySearch
	
	public static boolean isPalindrome(String s){	
		int lung = s.length();
		if (lung == 1 || lung == 0){
			return true;
		}//String == 1
		if(s.charAt(0) == s.charAt(lung - 1)){
			return isPalindrome(s.substring(1, lung - 1));
		}//chiamata ricorsiva
		return false;
	}// metodo isPalindrome
	
	public static void main(String[] args){
		/*
		Integer[] aIn = { 1, 1, 23, 4343,54,534,55};
		String[] aString = { "ama","caac", "dcci" ,"fici", "gici"};
		
		//sequentialSearch
		//System.out.println("\nSEQUENTIAL SEARCH SU aINT.....\n");
		int indice = sequentialSearch(aIn, 23);
		//System.out.println("\nSEQUENTIAL SEARCH SU aString.....\n");
		int indic = sequentialSearch(aString, "cici");
		System.out.println("Il numero 23 si trova nell'array aInt in posizione " + indice + 
							"\nLa stringa \"cici\" si trova nella array aString in posizione " + indic);
		
		// binarySearch()
		Integer[] aInt = { 1, 1, 23, 33,54,534,552};
		
		System.out.println("\nBINARY SEARCH SU aINT.....\n");
		int ind = binarySearch(aInt,0, aInt.length - 1, 23);
		System.out.println("\nBINARY SEARCH SU aString.....\n");
		int indico = binarySearch(aString, 0 ,aString.length - 1 , "cwac");
		System.out.println("\nIl numero 23 si trova nell'array aInt in posizione " + ind + 
							"\nLa stringa \"cici\" si trova nella array aString in posizione " + indico);
		*/
		System.out.println("Dimmi la parola che devo valutare: ");		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i <= 10 ; i ++){
			String str = sc.next();
			boolean valore = isPalindrome(str);
			if (valore == true)
				System.out.println("Si la parola \"" + str + "\" è palindroma");
			else
				System.out.println("No la parola \"" + str + "\" non è palindroma...Ritenta");
		}
		sc.close();
		
	}//metodo main

	
}

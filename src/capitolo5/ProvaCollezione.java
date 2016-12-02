package capitolo5;
import java.util.*;

public class ProvaCollezione {

	public static void main(String[] args) {
		ArrayList<Double> conto = new ArrayList<Double>(); 
		conto.add(2.4);
		conto.add(new Double(2.6));
		for(int i = 0; i < conto.size(); i++){
			System.out.println("La lista contiene " + conto.size() + " elementi. Stampo quello in posizione: " + i + " ==> " + conto.get(i));
		}
		System.out.println("La lista è vuota? " + conto.isEmpty());
		conto.remove(1);
		System.out.println("La lista è vuota? " + conto.isEmpty());
		System.out.println("La lista contiene " + conto.size() + " elementi.");
		for(int i = 0; i < conto.size(); i++){
			System.out.println("La lista contiene " + conto.size() + " elementi. Stampo quello in posizione: " + i + " ==> " + conto.get(i));
		}
		
		/*
		 * for che ricerca elementi all'interno della collectiona
		 */
		for(Double due : conto){
			if(due == 2.4)
				System.out.println("Elemento del valore 2.4 trovato: " + due );
		}
		/*
		 * while che ricerca elementi all'interno della collection
		 */
		Iterator<Double> itr = conto.iterator();
		Double elem = itr.next();
		while(itr.hasNext()){
			if(elem == 2.4 )
				try{
					System.out.println("Elemento del valore 2.4 trovato: " + itr.next());
					}
				catch(NoSuchElementException e){
					System.out.print("\nGuarda che sei andato oltre");
				}
		}
		
		/*
		 * bisogna prestare particolare attenzione alla funzione next() che quando invocata può andare oltre il limite massimo della collezione
		 */
		
	}

}

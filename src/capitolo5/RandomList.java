package capitolo5;
import java.util.*;

public class RandomList {
	
	public static void main(String[] args) {
		new RandomList().run();
	}
	
	public void run(){
		final int SEED = 111;
		List<Integer> randList = new LinkedList<Integer>();
		Random r = new Random(SEED);
		//inserisce in randList 10 numeri interi casuali, appartenenti all'intervallo 0...99
		
		for(int i = 0; i < 400; i++){
			randList.add(r.nextInt(100)); //inserimento
		}
		System.out.println(randList);
		
		//controlla se 22 appartiene alla lista
		if(randList.contains(22))
			System.out.println("yes, 22 is in randList");
		else
			System.out.println("no, 22 is not in randList");
	
		//visuallizza il numero associato all'indice 3
		System.out.println(randList.get(3) + " is at index 3");
		
		//elimina il numero intero associato all'indice 6
		randList.remove(6);
		
		//inserisce un nuovo numero casuale all'indice 5
		randList.add(5, r.nextInt(100));
		
		//visuallizza randList
		System.out.println(randList);
		
		//elimina tutti i numeri pari
		Iterator<Integer> itr = randList.iterator();
		while(itr.hasNext())
			if(itr.next() % 2 == 0)
				itr.remove();
		
		//visuallizza randList
		System.out.println(randList);
	}//metodo run
}//classe RandomList

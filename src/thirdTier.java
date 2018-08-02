
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
public class thirdTier{
	
	public static ArrayList <Integer> x = new ArrayList <Integer>();
	public static HashMap <Integer, String> xx = new HashMap <Integer, String>();
	int high = 9;
	int low = 1;

	
	
	public static void firstPot() {
		
		x.add(1);
		x.add(2);
		x.add(3);
		x.add(4);
		x.add(5);
		x.add(6);
		x.add(7);
		x.add(8);
		
		Collections.shuffle(x);
		
		
	xx.put(x.get(0), "Roma");
	xx.put(x.get(1), "Schalke");
	xx.put(x.get(2), "Lyon");
	xx.put(x.get(3), "FC Salzburg");
	xx.put(x.get(4), "CSKA Moscow");
	xx.put(x.get(5), "Sevilla");
	xx.put(x.get(6), "Ludogorets Razgrad");
	xx.put(x.get(7), "Shakhtar Donetsk");
	

	
	}
	
}

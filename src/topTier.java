
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

public class topTier {
	static int high = 9;
	static int low = 1;
	static int test;
	
	public static ArrayList <Integer> x = new ArrayList <Integer>();
	public static HashMap <Integer, String> xx = new HashMap <Integer, String>();

	
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
	
	xx.put(x.get(0), "Manchester United");
	xx.put(x.get(1), "Barcelona");
	xx.put(x.get(2), "Real Madrid");
	xx.put(x.get(3), "Paris St Germain");
	xx.put(x.get(4), "Bayern Munich");
	xx.put(x.get(5), "Juventus");
	xx.put(x.get(6), "Chelsea");
	xx.put(x.get(7), "Liverpool");
	
	
	
	}
	
}

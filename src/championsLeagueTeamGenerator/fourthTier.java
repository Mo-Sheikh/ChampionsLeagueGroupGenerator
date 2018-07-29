package championsLeagueTeamGenerator;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
public class fourthTier {
	
	public static ArrayList <Integer> x = new ArrayList <Integer>();
	public static HashMap <Integer, String> xx = new HashMap();
	int high = 9;
	int low = 1;

	
	
	public void firstPot() {
		
		x.add(1);
		x.add(2);
		x.add(3);
		x.add(4);
		x.add(5);
		x.add(6);
		x.add(7);
		x.add(8);
		
		
		Collections.shuffle(x);
		
	xx.put(x.get(0), "Inter Milan");
	xx.put(x.get(1), "Valencia");
	xx.put(x.get(2), "Hoffenheim");
	xx.put(x.get(3), "Celtic");
	xx.put(x.get(4), "RB Leipzig");
	xx.put(x.get(5), "Olympiacos");
	xx.put(x.get(6), "Feyenoord");
	xx.put(x.get(7), "Maribor");
	
	System.out.println(xx);
	
	}
	
}

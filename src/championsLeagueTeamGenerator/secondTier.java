package championsLeagueTeamGenerator;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
public class secondTier extends GroupStages {
	
	public static ArrayList <Integer> x = new ArrayList <Integer>();
	public static HashMap <Integer, String> xx = new HashMap();
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
	
		
	xx.put(x.get(0), "Borussia Dortmund");
	xx.put(x.get(1), "Napoli");
	xx.put(x.get(2), "FC Porto");
	xx.put(x.get(3), "Napoli");
	xx.put(x.get(4), "FC Basel");
	xx.put(x.get(5), "Benfica");
	xx.put(x.get(6), "Roma");
	xx.put(x.get(7), "Manchester City");
	

	
	}
	
}

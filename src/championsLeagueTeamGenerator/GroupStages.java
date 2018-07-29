package championsLeagueTeamGenerator;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collection;

public class GroupStages {
	
	
	
//	public static HashMap <Integer, String> groupA = new HashMap<Integer, String>();
	public static HashMap <Integer, String> groupA = new HashMap<Integer, String>();
	
	
	public static void groupOne() {
		//needs to be initialised before you can use it.
		topTier.firstPot();
		secondTier.firstPot();
		thirdTier.firstPot();
		fourthTier.firstPot();
		
		groupA.put(1, topTier.xx.get(1));
		groupA.put(2, secondTier.xx.get(1));
		groupA.put(3, thirdTier.xx.get(1));
		groupA.put(4, fourthTier.xx.get(1));
		System.out.println(groupA);

		
	}
	
}

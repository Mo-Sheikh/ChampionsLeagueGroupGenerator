
import java.util.HashMap;


public class GroupStages {


	public static HashMap <Integer, String> groupA = new HashMap<Integer, String>();
	public static HashMap <Integer, String> groupB = new HashMap<Integer, String>();
	public static HashMap <Integer, String> groupC = new HashMap<Integer, String>();
	public static HashMap <Integer, String> groupD = new HashMap<Integer, String>();
	public static HashMap <Integer, String> groupE = new HashMap<Integer, String>();
	public static HashMap <Integer, String> groupF = new HashMap<Integer, String>();
	public static HashMap <Integer, String> groupG = new HashMap<Integer, String>();
	public static HashMap <Integer, String> groupH = new HashMap<Integer, String>();
	

		

	
	
	public static void groupOne() {
		
		
		topTier.firstPot();
		secondTier.firstPot();
		thirdTier.firstPot();
		fourthTier.firstPot();
		
		//needs to be initialised before you can use it.
		
		
		groupA.put(1, topTier.xx.get(1));
		groupA.put(2, secondTier.xx.get(1));
		groupA.put(3, thirdTier.xx.get(1));
		groupA.put(4, fourthTier.xx.get(1));
		System.out.println("Group A " + groupA);
		
		groupB.put(1, topTier.xx.get(2));
		groupB.put(2, secondTier.xx.get(2));
		groupB.put(3, thirdTier.xx.get(2));
		groupB.put(4, fourthTier.xx.get(2));
		System.out.println("Group B " + groupB);
		
		groupC.put(1, topTier.xx.get(3));
		groupC.put(2, secondTier.xx.get(3));
		groupC.put(3, thirdTier.xx.get(3));
		groupC.put(4, fourthTier.xx.get(3));
		System.out.println("Group C " + groupC);
		
		groupD.put(1, topTier.xx.get(4));
		groupD.put(2, secondTier.xx.get(4));
		groupD.put(3, thirdTier.xx.get(4));
		groupD.put(4, fourthTier.xx.get(4));
		System.out.println("Group D " + groupD);
		
		groupE.put(1, topTier.xx.get(5));
		groupE.put(2, secondTier.xx.get(5));
		groupE.put(3, thirdTier.xx.get(5));
		groupE.put(4, fourthTier.xx.get(5));
		System.out.println("Group E " + groupE);
		
		groupF.put(1, topTier.xx.get(6));
		groupF.put(2, secondTier.xx.get(6));
		groupF.put(3, thirdTier.xx.get(6));
		groupF.put(4, fourthTier.xx.get(6));
		System.out.println("Group F " + groupF);
	
		groupG.put(1, topTier.xx.get(7));
		groupG.put(2, secondTier.xx.get(7));
		groupG.put(3, thirdTier.xx.get(7));
		groupG.put(4, fourthTier.xx.get(7));
		System.out.println("Group G " + groupG);

	}
}

		  

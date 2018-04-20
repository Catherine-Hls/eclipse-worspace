package hello;

import java.util.HashMap;
import java.util.Map.Entry;


public class MapMain {

	public static void main(String[] args) {
		HashMap <String, String> myMap = new HashMap<String, String>();
		
		myMap.put("thomas", "le formateur");
		myMap.put("m2i", "centre de formation");
		
		System.out.println(myMap.get("thomas"));
		System.out.println(myMap.get("m2i"));
		
		HashMap colors = new HashMap();
		colors.put("white", "#FFFFFF");
		colors.put("black", "#000000");
		
		System.out.println(colors.get("white"));
		
		/*// java.util.Map.Entry
		for (Entry<String, String> entry: colors.entrySet()) { //foreach
			System.out.println(entry.getKey() + " " + entry.getValue());
		}*/
	}

}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class Ridefile {
	public Map<String, Float> rideFile() {
		Map<String, Float> map = new HashMap<String, Float>();
		Scanner scn;
		try{
			scn = new Scanner(new File("res//value.txt"));
			while(scn.hasNext()){
				map.put(scn.next(), java.lang.Float.valueOf(scn.next()));
			}
			scn.close();	
		} catch(FileNotFoundException e){
			System.out.println("Fail not found " + e.getMessage());
		}
		return map;
	}
}


package in.nareshit.app;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class TestCoreJava {

	public static void main(String[] args) {

		Map<String , Integer> m=new HashMap<String, Integer>();
		m.put("A", 5);
		m.put("B", 25);
		m.put("A", 50);
		m.put("D", 15);
		
		//1
		for(Entry<String,Integer> entry:m.entrySet())
		{
			System.out.println(entry.getKey() +"-----"+entry.getValue());
		}
		
		//2
		Iterator<Entry<String, Integer>> itr=m.entrySet().iterator();
		while(itr.hasNext())
		{
			Entry<String, Integer> entry = itr.next();
			System.out.println(entry.getKey() +"==="+entry.getValue());
		}
		
	}

}

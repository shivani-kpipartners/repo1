package practice;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/**
 * @author ShivaniShukla
 *
 */
public class ListCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList list = new ArrayList();
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("c");
		list.add("c");
		
		
		Set<String> set1=new HashSet<String>();
		Set set2=new HashSet();
		set1.add("a");
		set1.add("a");
		set2.add(1);
		
		System.out.println(set1);
		System.out.println(list);
		
		
		Map<String,Integer> hm =
				new HashMap<String,Integer>();
		
		hm.put("a",50);
		hm.put("b",100);
		hm.put("c",150);
		hm.put("d",200);
		hm.put("d",200);
		
		hm.get("a");
		
		System.out.println(hm);
		
		
	}

}



package Set;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_set {

	public static void main(String[] args) {
		HashSet<String>set=new HashSet<String>();
		set.add("sasi");
		set.add("pachu");
		set.add("vadivelu");
		set.add("vadival vasu");
		set.add("sunny leone");
		Iterator itr1=set.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next()+" ");
	}

}
}
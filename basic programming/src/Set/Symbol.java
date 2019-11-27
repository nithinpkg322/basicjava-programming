package Set;

import java.util.Comparator;

public class Symbol implements Comparator<Newcard> {

	
	public int compare(Newcard c1, Newcard c2) {
		
		return c1.getSymbol().compareTo(c2.getSymbol());
	}

}

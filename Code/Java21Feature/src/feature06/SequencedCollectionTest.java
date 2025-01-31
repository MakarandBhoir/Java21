package feature06;

import java.util.ArrayList;
import java.util.SequencedCollection;

public class SequencedCollectionTest {

	public static void main(String[] args) {
		SequencedCollection<String> list = new ArrayList<String>();
		
		list.add("A");
		list.add("B");
		list.addFirst("C");
		list.addLast("D");
		
		System.out.println(list);
		
		list.removeFirst();
		
		System.out.println(list);
	}

}

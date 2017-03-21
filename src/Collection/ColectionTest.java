
package Collection;
									//ArrayList , LinkedList//
import java.util.*;


public class ColectionTest {
	public static void main(String[] args) {
		//ArrayList list = new ArrayList(); //	 old non-generic example of creating java collection.
		ArrayList<String>list = new ArrayList<String>();
		//LinkedList<String>list = new LinkedList<String>();
		list.add("ram");
		list.add("Aam");
		list.add("khata");
		list.add("hai");
	Iterator itr =	list.iterator();
	while(itr.hasNext()){	//it returns true if iterator has more elements.
		System.out.print(itr.next()+" "); //it returns the element and moves the cursor pointer to the next element
	}
	
	
	}

}

package intermediate.challenge196;

import java.util.Iterator;
import java.util.Vector;

public class MySet<E extends Comparable<E>> implements Iterable<E> {

	private Vector<E> set;

	public <L extends Iterable<E>> MySet(L l) {
		set = new Vector<E>();

		// checks for duplicates
		for (E e : l) {
			boolean alreadyInserted = false;
			for (E insertedE : set) {
				if (e.compareTo(insertedE) == 0) {
					alreadyInserted = true;
				}
			}
			// and adds them to the set if not already done so.
			if (!alreadyInserted) {
				set.add(e);
			}
		}
	}
	
	public boolean contains(E e){
		for (E insertedE : set){
			if(insertedE.compareTo(e) == 0){
				return true;
			}
		}
		return false;
	}
	
	public int size(){
		return set.size();
	}

	@Override
	public Iterator<E> iterator() {
		return new MyIterator<E>(set);
	}
	
	@Override
	public String toString(){
		String ret = "{";
		for (int i = 0; i < set.size()-1; i++){
			ret += set.elementAt(i).toString() + ", ";
		}
		ret += set.lastElement().toString() + "}";
		return ret;
	}
}

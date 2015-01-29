package intermediate.challenge196;

import java.util.Iterator;
import java.util.Vector;

public class MyIterator<E> implements Iterator<E> {
	
	Vector<E> set;
	
	public MyIterator(Vector<E> set){
		this.set = set;
	}

	@Override
	public boolean hasNext() {
		return !set.isEmpty();
	}

	@Override
	public E next() {
		E first = set.firstElement();
		set.remove(first);
		return first;
	}

	@Override
	public void remove() {
		// not implemented		
	}

}

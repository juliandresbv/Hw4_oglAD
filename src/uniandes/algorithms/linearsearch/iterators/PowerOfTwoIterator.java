/**
 * 
 */
package uniandes.algorithms.linearsearch.iterators;

import java.util.Iterator;

/**
 * @author ja.bermudez10
 *
 */
public class PowerOfTwoIterator implements Iterator {
	
	private int x = 1;

	@Override
	public boolean hasNext() {
		return x > 0;
	}

	@Override
	public Object next() {
		
		Integer ans = (int) Math.pow(2, x);
		
		x++;
		// TODO Auto-generated method stub
		return ans;
	}

}

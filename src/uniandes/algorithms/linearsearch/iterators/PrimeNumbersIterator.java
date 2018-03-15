package uniandes.algorithms.linearsearch.iterators;

import java.util.Iterator;

public class PrimeNumbersIterator implements Iterator {
	
	/**
	 * Index of the enumeration
	 */
	private int x = 2;
	
	private static int nextPrime(int n)
	{
		int counter;
		n++;
		
		while (true) {
			
			counter = 0;
			int sqrt = (int) Math.sqrt(n);
			
			for (int i = 2; i <= sqrt ; i++) {
				if (n%i == 0) counter++;
			}
			
			if (counter == 0)
				return n;
			
			else {
				n++;
				continue;
			}
		}
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return nextPrime(x) > 0;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		Integer nextPrime = x;
		
		x = nextPrime(x);
		
		return nextPrime;
	}

}

package uniandes.algorithms.linearsearch.iterators;

import java.util.Iterator;

public class FibonacciIterator implements Iterator {

	private int anterior = 0;
	private int actual = 0;

	private int fibonacci(int n) {
		if(n == 0 && anterior == 0) {
			anterior++;
			return anterior;
		}

		if(n == 1 && actual == 0 )
			return ++actual;

		anterior = actual;
		actual = n + anterior;

		return actual;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object next() {
		// TODO Auto-genera od stub


		return fibonacci(anterior);
	}

}

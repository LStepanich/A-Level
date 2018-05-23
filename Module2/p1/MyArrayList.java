package p1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList<T> implements List<T> {

	private static final int MIN_SIZE = 4, GROW_SIZE = 4;
	private int size = 0;
	private Object[] dataArray = new Object[MIN_SIZE];

	private void resize(int newLength) {
		Object[] newArray = new Object[newLength];
		System.arraycopy(dataArray, 0, newArray, 0, size);
		dataArray = newArray;
	}

	public int addElement(T arg0) {
		if (size == dataArray.length - 1) {
			resize(dataArray.length + GROW_SIZE);
		}
		dataArray[size++] = arg0;
		return size;
	}

	@Override
	public boolean add(T arg0) throws UnsupportedOperationException{
		throw new UnsupportedOperationException("Invalid operation");
	}

	@Override
	public void add(int arg0, T arg1) {

		Object[] firstArray = new Object[arg0];
		Object[] secondArray = new Object[dataArray.length - arg0];
		System.arraycopy(dataArray, 0, firstArray, 0, arg0 - 1);
		System.arraycopy(dataArray, arg0, secondArray, 0, dataArray.length - arg0);
		if (size == dataArray.length - 1) {
			resize(dataArray.length + GROW_SIZE);
		}
		System.arraycopy(firstArray, 0, dataArray, 0, arg0 - 1);
		dataArray[arg0] = arg1;
		System.arraycopy(secondArray, 0, dataArray, arg0 + 1, secondArray.length);
	}

	@Override
	public boolean addAll(Collection<? extends T> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int arg0, Collection<? extends T> arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean contains(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T get(int arg0) {
		// TODO Auto-generated method stub
		if (arg0 > size || arg0 < 0)
			return null;
		else
			return (T) dataArray[arg0];
	}

	@Override
	public int indexOf(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int lastIndexOf(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<T> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<T> listIterator(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T remove(int arg0) {
		if (arg0 > size || arg0 < 0)
			return null;
		else {
			Object[] firstArray = new Object[arg0];
			Object[] secondArray = new Object[dataArray.length - arg0];
			Object deleted = new Object();
			System.arraycopy(dataArray, 0, firstArray, 0, arg0 - 1);
			System.arraycopy(dataArray, arg0 + 1, secondArray, 0, dataArray.length - arg0);
			System.arraycopy(firstArray, 0, dataArray, 0, arg0 - 1);
			System.arraycopy(secondArray, 0, dataArray, arg0, secondArray.length);
			size--;
			resize(size+1);
			// TODO Autogenerated method stub
			return (T) deleted;
		}
	}

	@Override
	public boolean removeAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T set(int arg0, T arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<T> subList(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
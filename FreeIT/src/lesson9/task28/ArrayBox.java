package lesson9.task28;

import java.util.Arrays;

public class ArrayBox<T> {

	private T[] array;

	public ArrayBox() {
		super();
	}

	public ArrayBox(T[] array) {
		super();
		this.array = array;
	}

	public T get(int index) {
		return array[index];

	}

	public T[] getArray() {
		return array;
	}

	public void setArray(T[] array) {
		this.array = array;
	}

	@Override
	public String toString() {
		return "ArrayBox " + Arrays.toString(array);
	}

}

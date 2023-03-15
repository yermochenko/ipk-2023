package by.vsu.test;

public class Array<T> {
	public static final int DEFAULT_SIZE = 2;
	private Object[] values;
	private int size;

	public Array() {
		values = new Object[DEFAULT_SIZE];
	}

	public Array(int size) {
		values = new Object[size];
		this.size = size;
	}

	@SuppressWarnings("unchecked")
	public T get(int index) {
		check(index);
		return (T)values[index];
	}

	public void set(int index, T value) {
		check(index);
		values[index] = value;
	}

	public void add(T value) {
		if(size == values.length) {
			Object[] tmp = new Object[calcNextSize()];
			System.arraycopy(values, 0, tmp, 0, size);
			values = tmp;
		}
		values[size] = value;
		size++;
	}

	public int size() {
		return size;
	}

	public void debug() {
		System.out.print("DEBUG: values [");
		for(int i = 0; i < values.length; i++) {
			if(values[i] != null) {
				System.out.print(values[i].hashCode());
			} else {
				System.out.print("null");
			}
			if(i != values.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
		System.out.println("DEBUG: Current size is " + size);
	}

	private void check(int index) {
		if(index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
	}

	private int calcNextSize() {
		return values.length + DEFAULT_SIZE;
	}
}

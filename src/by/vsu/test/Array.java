package by.vsu.test;

import by.vsu.domain.Product;

public class Array {
	public static final int DEFAULT_SIZE = 2;
	private Product[] values;
	private int size;

	public Array() {
		values = new Product[DEFAULT_SIZE];
	}

	public Array(int size) {
		values = new Product[size];
		this.size = size;
	}

	public Product get(int index) {
		check(index);
		return values[index];
	}

	public void set(int index, Product value) {
		check(index);
		values[index] = value;
	}

	public void add(Product value) {
		if(size == values.length) {
			Product[] tmp = new Product[calcNextSize()];
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

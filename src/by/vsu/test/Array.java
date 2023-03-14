package by.vsu.test;

import by.vsu.domain.Product;

public class Array {
	private Product[] values;

	public Array(int size) {
		values = new Product[size];
	}

	public Product get(int index) {
		return values[index];
	}

	public void set(int index, Product value) {
		values[index] = value;
	}

	public void add(Product value) {
		Product[] tmp = new Product[values.length + 1];
		System.arraycopy(values, 0, tmp, 0, values.length);
		tmp[values.length] = value;
		values = tmp;
	}

	public int size() {
		return values.length;
	}
}

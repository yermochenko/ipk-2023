package by.vsu.test;

import by.vsu.domain.Category;
import by.vsu.domain.Currency;
import by.vsu.domain.Product;

public class Main {
	public static void out(Array products) {
		for(int i = 0; i < products.size(); i++) {
			System.out.println(products.get(i));
		}
	}
	public static void main(String[] args) {
		Array products = new Array(3);

		Category category1 = new Category();
		category1.setName("Молочная продукция");
		Category category2 = new Category();
		category2.setName("Мясная продукция");

		products.set(0, new Product("Молоко", new Currency(2L, 87), category1));
		products.set(1, new Product("Рулька", new Currency(16L, 76)));
		products.get(1).setCategory(category2);
		products.set(2, new Product("Творог", new Currency(3L, 33), category1));

		System.out.println("***********************");
		out(products);

		products.add(new Product("Салями", new Currency(4L, 74), category2));

		System.out.println("***********************");
		out(products);
	}
}

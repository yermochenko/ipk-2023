package by.vsu.test;

import by.vsu.domain.Category;
import by.vsu.domain.Currency;
import by.vsu.domain.Product;

public class Main {
	public static void main(String[] args) {
		Category category1 = new Category();
		category1.setName("Молочная продукция");
		Category category2 = new Category();
		category2.setName("Мясная продукция");

		Product product1 = new Product("Молоко", new Currency(2L, 87), category1);
		Product product2 = new Product("Рулька", new Currency(16L, 76));
		product2.setCategory(category2);
		Product product3 = new Product("Творог", new Currency(3L, 33), category1);

		System.out.println(product1);
		System.out.println(product2);
		System.out.println(product3);
	}
}

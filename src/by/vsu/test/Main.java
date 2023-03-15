package by.vsu.test;

import by.vsu.domain.Category;
import by.vsu.domain.Currency;
import by.vsu.domain.Product;

//class CoffeeMaker {
//	void doCoffee() {
//		System.out.println("Делаем паршивый кофе, но он поможет нам проснуться");
//	}
//	void askResult() {
//		System.out.println("Действительно паршивый! :(");
//	}
//}
//
//class CappuccinoMaker extends CoffeeMaker {
//	void doCoffee() {
//		System.out.println("Делаем очень вкусный капучино");
//	}
//	void askResult() {
//		System.out.println("Классный кофе! :D");
//	}
//}
//
public class Main {
	public static void out(Array<?> products) {
		for(int i = 0; i < products.size(); i++) {
			System.out.println(products.get(i));
		}
	}

//	public static void tryToWakeUp(CoffeeMaker coffeeMaker) {
//		System.out.println("Надо заварить кофе...");
//		coffeeMaker.doCoffee();
//		System.out.println("Выпили кофе...");
//		coffeeMaker.askResult();
//		System.out.println("Проснулись!...");
//	}

	public static void main(String[] args) {
//		System.out.println("******************");
//		tryToWakeUp(new CoffeeMaker());
//		System.out.println("******************");
//		tryToWakeUp(new CappuccinoMaker());

		Array<Product> products = new Array<>();
		products.debug();

		Category category1 = new Category();
		category1.setName("Молочная продукция");
		Category category2 = new Category();
		category2.setName("Мясная продукция");

		products.add(new Product("Молоко", new Currency(2L, 87), category1));
		products.debug();
		products.add(new Product("Рулька", new Currency(16L, 76)));
		products.get(products.size() - 1).setCategory(category2);
		products.debug();
		products.add(new Product("Творог", new Currency(3L, 33), category1));
		products.debug();

		System.out.println("***********************");
		out(products);

		products.add(new Product("Салями", new Currency(4L, 74), category2));
		products.debug();
		products.add(new Product("Сыр", new Currency(35L, 32), category1));
		products.debug();

		System.out.println("***********************");
		out(products);
	}
}

package mikorn;

public class Objects {

	public static void main(String[] args) {
		
		Organization orange = new Organization("Orange", "Страхование", "Краснодар", "Переговоры");
		
		orange.orgInfo();
		orange.lifetimeValue(1800, 500);
		
		System.out.println();
		
		Organization yellow = new Organization("Yellow", "Пищевое производство", "Волгоград", "Отказ");
		
		yellow.orgInfo();
		yellow.lifetimeValue(1200, 700);

	}

}

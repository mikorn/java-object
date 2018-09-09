package mikorn;

public class Objects {

	public static void main(String[] args) {
		
		Organization orange = new Organization();
		
		orange.name = "Orange";
		orange.profile = "Страхование";
		orange.city = "Краснодар";
		orange.status = "Переговоры";
		
		orange.orgInfo();
		orange.lifetimeValue(1800, 500);
		
		System.out.println();
		
		Organization yellow = new Organization();
		
		yellow.name = "Yellow";
		yellow.profile = "Пищевое производство";
		yellow.city = "Волгоград";
		yellow.status = "Отказ";
		
		yellow.orgInfo();
		yellow.lifetimeValue(1200, 700);

	}

}

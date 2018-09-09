package mikorn;

public class Objects {

	public static void main(String[] args) {
		
		Organization orange = new Organization();
		
		orange.name = "Orange";
		orange.profile = "Страхование";
		orange.city = "Краснодар";
		orange.status = "Переговоры";
		
		orange.orgInfo();
		
		System.out.println();
		
		Organization yellow = new Organization();
		
		yellow.name = "Yellow";
		yellow.profile = "Пищевое производство";
		yellow.city = "Волгоград";
		yellow.status = "Отказ";
		
		yellow.orgInfo();

	}

}

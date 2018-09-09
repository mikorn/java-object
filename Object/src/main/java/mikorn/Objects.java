package mikorn;

public class Objects {

	public static void main(String[] args) {
		
		Organization orange = new Organization();
		
		orange.name = "Orange";
		orange.profile = "Страхование";
		orange.city = "Краснодар";
		orange.status = "Переговоры";
		
		System.out.println("Название организации: " + orange.name);
		System.out.println("Отрасль: " + orange.profile);
		System.out.println("Город: " + orange.city);
		System.out.println("Статус: " + orange.status);
		
		System.out.println();
		
		Organization yellow = new Organization();
		
		yellow.name = "Yellow";
		yellow.profile = "Пищевое производство";
		yellow.city = "Волгоград";
		yellow.status = "Отказ";
		
		System.out.println("Название организации: " + yellow.name);
		System.out.println("Отрасль: " + yellow.profile);
		System.out.println("Город: " + yellow.city);
		System.out.println("Статус: " + yellow.status);

	}

}

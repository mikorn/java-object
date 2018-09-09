package mikorn;

public class Organization {
	
	String name; // Название организации
	String profile; // Отрасль
	String city; // Город центрального офиса
	String status; // Статус клиента в CRM
	
	void orgInfo() {
		System.out.println("Название организации: " + name);
		System.out.println("Отрасль: " + profile);
		System.out.println("Город: " + city);
		System.out.println("Статус: " + status);
	}

}

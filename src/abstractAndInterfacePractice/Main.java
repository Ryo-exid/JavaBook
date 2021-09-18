package abstractAndInterfacePractice;

public class Main {
	public static void main(String[] args) {
		Book b = new Book("JavaBook", 3000, "White", "978-4-295-00780-7");
		System.out.println("本のISBN：" + b.getIsbn());
		b.setWeight(1.2);
		System.out.println("本の重さ：" + b.getWeight() + "kg");
		
		Computer c = new Computer("MacBookPro", 200000, "SpaceGray", "M1 Mac");
		System.out.println("コンピュータの色：" + c.getColor());
		c.setWeight(2.0);
		System.out.println("コンピュータの重さ：" + c.getWeight() + "kg");
	}
}

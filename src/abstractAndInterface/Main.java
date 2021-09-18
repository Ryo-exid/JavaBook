package abstractAndInterface;

public class Main {
	public static void main(String[] args) {
		Dancer d1 = new Dancer("踊り子");
		Matango m1 = new Matango("クリボー");
		d1.attack(m1);
		
		Villager v1 = new Villager("村人");
		v1.hear();
	}
}

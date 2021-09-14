package method;

public class Practice3 {
	// 三角形の面積を求めるメソッド
	public static double calcTriangleArea(double bottom, double height) {
		return (bottom * height) / 2;
	}
	// 円の面積を求めるメソッド
	public static double calcCircleArea(double radius) {
		return radius * radius * 3.14;
	}
	
	public static void main(String[] args) {
		System.out.println("三角形の底辺の高さが10.0cm、高さが5.0cmの場合、面積は" + calcTriangleArea(10.0, 5.0) + "㎠");
		System.out.println("円の半径が5.0cmの場合、面積は" + calcCircleArea(5.0) + "㎠");
	}
}

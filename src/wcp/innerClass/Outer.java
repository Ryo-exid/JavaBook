package wcp.innerClass;

public class Outer {
	// 外部クラスで定義したフィールドgreeting
	private String greeting = "こんにちは";
	
	public class Inner { // ※"外部クラスのフィールド"がstaticだった場合、"内部クラス"がstaticでないと参照できない
		public String hello() {
			// 内部クラスInnerから、外部クラスOuterのフィールドgreetingを参照 ※private なフィールドも内側からであれば参照可能
			return greeting;
		}
	}
}

package regexp;

// 正規表現
public class PatternMatching {
	// 文字列パターンを用いたプレイヤー名のチェック
	public boolean isValidPlayerName(String name) {
		return name.matches("[A-Z][A-Z0-9]{7}"); // 最初の文字はA〜Z、その後は7文字の英大文字か数字
	}
}

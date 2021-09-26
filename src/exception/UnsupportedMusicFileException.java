package exception;

public class UnsupportedMusicFileException extends Exception { // extends Exceptionを継承し、チェック例外をオリジナル例外として定義できるようにする
	public UnsupportedMusicFileException(String msg) {
		super(msg);
	}
}

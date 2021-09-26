package exceptionPractice;

import java.io.IOException;

// 起動直後にIOExceptionを早出して異常終了するプログラム
public class Practice3 {
	public static void main(String[] args) throws IOException {
		System.out.println("プログラムが起動しました");
		throw new IOException();
	}
}

package moreAPI;

// Javaで作るWebアプリケーション ※コンパイル・実行するにはサーブレットの開発環境が必要

/*

import java.io.*;
import java.util.Date;
import javax.servlet.http.*;

// 現在時刻を表示するサーブレット
@WebServlet("/HelloServlet");
public class HelloServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		Date d = new Date(); // 現在時刻を取得
		PrintWriter w = res.getWriter();
		res.setContentType("text/html");
		w.write("<html><body>");
		w.write("Today is" + d.toString()); // 現在時刻を出力
		w.write("</body></html>");
}

*/
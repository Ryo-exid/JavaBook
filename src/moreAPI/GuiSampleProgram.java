package moreAPI;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// GUI（グラフィカルユーザーインターフェース）プログラム
public class GuiSampleProgram {
	public static void main(String[] args) {
		JFrame frame = new JFrame("はじめてのGUI");
		JLabel label = new JLabel("Hello World!!");
		JButton button = new JButton("押してね");
		frame.getContentPane().setLayout(new FlowLayout());
		frame.getContentPane().add(label);
		frame.getContentPane().add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 100);
		frame.setVisible(true);
	}
}

package controller;

import javax.swing.JOptionPane;

public class BankController {
	public void start() {
		while(true) {
			switch(JOptionPane
					.showInputDialog("0.종료")) {
			case "0":JOptionPane.showMessageDialog(null,
					"종료합니다 !!");
			}
		}
	}
	
}

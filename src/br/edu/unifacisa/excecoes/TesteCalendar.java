package br.edu.unifacisa.excecoes;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Calendar;

public class TesteCalendar {
	public static void main(String[] args) throws AWTException {
		Robot r = new Robot();
		
		while (true) {
			Calendar hoje = Calendar.getInstance();
			System.out.println(hoje.get(Calendar.HOUR_OF_DAY) + ":" + 
			                   hoje.get(Calendar.MINUTE) + ":" + 
					           hoje.get(Calendar.SECOND));
			r.delay(1000);
		}
	}
}

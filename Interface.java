package br.com.interfaces;

public class Interface {
	public static void main(String [] args) {
		
		Ventilador vent = new Ventilador();
		
		System.out.println("Qual é a marca do produto? " + vent.MARCA);
		
		vent.desligar();
		vent.ligar();
		vent.desligar();
		}
	}

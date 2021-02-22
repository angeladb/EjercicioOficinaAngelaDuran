package paquete1;

import java.util.Scanner;

public class Sobremesa extends Dispositivo {

	private int tamañoHDD;
	private int tamañoRAM;
	private String marcaTeclado;
	private String marcaRaton;
	private String marcaMonitor;
	static Scanner scStirng = new Scanner(System.in);
	static Scanner scInt = new Scanner(System.in);
	static int preguntaInt;
	static String preguntaSiNo;
	// GETTERS Y SETTERS

	public int getTamañoHDD() {
		return tamañoHDD;
	}

	public void setTamañoHDD(int tamañoHDD) {
		this.tamañoHDD = tamañoHDD;
	}

	public int getTamañoRAM() {
		return tamañoRAM;
	}

	public void setTamañoRAM(int tamañoRAM) {
		this.tamañoRAM = tamañoRAM;
	}

	public String getMarcaTeclado() {
		return marcaTeclado;
	}

	public void setMarcaTeclado(String marcaTeclado) {
		this.marcaTeclado = marcaTeclado;
	}

	public String getMarcaRaton() {
		return marcaRaton;
	}

	public void setMarcaRaton(String marcaRaton) {
		this.marcaRaton = marcaRaton;
	}

	public String getMarcaMonitor() {
		return marcaMonitor;
	}

	public void setMarcaMonitor(String marcaMonitor) {
		this.marcaMonitor = marcaMonitor;
	}

	// CONSTRUCTOR

	public Sobremesa() {
	}

	public Sobremesa(int numeroSerie, String marca, String modelo, int pulgadasPantalla, Empleado quienLoTiene,
			boolean enReparacion, boolean asignado, boolean espacioLibre, String tipoDispositivo, int tamañoHDD,
			int tamañoRAM, String marcaTeclado, String marcaRaton, String marcaMonitor) {
		super(numeroSerie, marca, modelo, pulgadasPantalla, quienLoTiene, enReparacion, asignado, espacioLibre,
				tipoDispositivo);
		this.tamañoHDD = tamañoHDD;
		this.tamañoRAM = tamañoRAM;
		this.marcaTeclado = marcaTeclado;
		this.marcaRaton = marcaRaton;
		this.marcaMonitor = marcaMonitor;
	}
	
//metodos

	public static void crearSobremesa(Sobremesa[] arraySobremesa) {
		for (Sobremesa selectSobremesa : arraySobremesa) {

			System.out.println("Introduzca tamaño del disco duro HDD (250, 500...):");
			selectSobremesa.setTamañoHDD(scInt.nextInt());

			System.out.println("Introduzca tamaño de la RAM (8,12,16...):");
			selectSobremesa.setTamañoRAM(scInt.nextInt());

			System.out.println("Introduzca la marca del teclado:");
			selectSobremesa.setMarcaTeclado(scString.next());

			System.out.println("Introduzca la marca del monitor:");
			selectSobremesa.setMarcaMonitor(scString.next());
			
			selectSobremesa.setTipoDispositivo("sobremesa");
			break;
		}

	}

}

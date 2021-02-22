package paquete1;

import java.util.Scanner;

public class Sobremesa extends Dispositivo {

	private int tama�oHDD;
	private int tama�oRAM;
	private String marcaTeclado;
	private String marcaRaton;
	private String marcaMonitor;
	static Scanner scStirng = new Scanner(System.in);
	static Scanner scInt = new Scanner(System.in);
	static int preguntaInt;
	static String preguntaSiNo;
	// GETTERS Y SETTERS

	public int getTama�oHDD() {
		return tama�oHDD;
	}

	public void setTama�oHDD(int tama�oHDD) {
		this.tama�oHDD = tama�oHDD;
	}

	public int getTama�oRAM() {
		return tama�oRAM;
	}

	public void setTama�oRAM(int tama�oRAM) {
		this.tama�oRAM = tama�oRAM;
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
			boolean enReparacion, boolean asignado, boolean espacioLibre, String tipoDispositivo, int tama�oHDD,
			int tama�oRAM, String marcaTeclado, String marcaRaton, String marcaMonitor) {
		super(numeroSerie, marca, modelo, pulgadasPantalla, quienLoTiene, enReparacion, asignado, espacioLibre,
				tipoDispositivo);
		this.tama�oHDD = tama�oHDD;
		this.tama�oRAM = tama�oRAM;
		this.marcaTeclado = marcaTeclado;
		this.marcaRaton = marcaRaton;
		this.marcaMonitor = marcaMonitor;
	}
	
//metodos

	public static void crearSobremesa(Sobremesa[] arraySobremesa) {
		for (Sobremesa selectSobremesa : arraySobremesa) {

			System.out.println("Introduzca tama�o del disco duro HDD (250, 500...):");
			selectSobremesa.setTama�oHDD(scInt.nextInt());

			System.out.println("Introduzca tama�o de la RAM (8,12,16...):");
			selectSobremesa.setTama�oRAM(scInt.nextInt());

			System.out.println("Introduzca la marca del teclado:");
			selectSobremesa.setMarcaTeclado(scString.next());

			System.out.println("Introduzca la marca del monitor:");
			selectSobremesa.setMarcaMonitor(scString.next());
			
			selectSobremesa.setTipoDispositivo("sobremesa");
			break;
		}

	}

}

package paquete1;

import java.util.Scanner;

public class Portatil extends Dispositivo {
	

	private boolean discoEsHDD;
	private boolean discoEsSDD;
	private int tamaņoRAM;
	static Scanner scStirng = new Scanner(System.in);
	static Scanner scInt = new Scanner(System.in);
	static int preguntaInt;
	static String preguntaSiNo;

	// GETTERS Y SETTERS
	public boolean getDiscoEsHDD() {
		return discoEsHDD;
	}

	public void setDiscoEsHDD(boolean discoEsHDD) {
		this.discoEsHDD = discoEsHDD;
	}

	public boolean getDiscoEsSDD() {
		return discoEsSDD;
	}

	public void setDiscoEsSDD(boolean discoEsSDD) {
		this.discoEsSDD = discoEsSDD;
	}

	public int getTamaņoRAM() {
		return tamaņoRAM;
	}

	public void setTamaņoRAM(int tamaņoRAM) {
		this.tamaņoRAM = tamaņoRAM;
	}

	// constructores
	public Portatil(int numeroSerie, String marca, String modelo, int pulgadasPantalla, Empleado quienLoTiene,
			boolean enReparacion, boolean asignado, boolean espacioLibre, String tipoDispositivo, boolean discoEsHDD,
			boolean discoEsSDD, int tamaņoRAM) {
		super(numeroSerie, marca, modelo, pulgadasPantalla, quienLoTiene, enReparacion, asignado, espacioLibre,
				tipoDispositivo);
		this.discoEsHDD = discoEsHDD;
		this.discoEsSDD = discoEsSDD;
		this.tamaņoRAM = tamaņoRAM;
	}

	public Portatil() {

	}
	//METODOS
	
	public static void crearPortatil(Portatil[] arrayPortatil) {
		for (Portatil selectPortatil : arrayPortatil) {
			System.out.println("El disco duro es HDD?(SI/NO)");
			preguntaSiNo = scString.next();
			if (preguntaSiNo.equalsIgnoreCase("si")) {
				selectPortatil.setDiscoEsHDD(true);
				selectPortatil.setDiscoEsSDD(false);
			} else {
				selectPortatil.setDiscoEsSDD(true);
				selectPortatil.setDiscoEsHDD(false);
			}
			System.out.println("Introduzca tamaņo de la RAM (8,12,16...):");
			selectPortatil.setTamaņoRAM(scInt.nextInt());
			selectPortatil.setTipoDispositivo("portatil");
			break;
		}
	}
	



}

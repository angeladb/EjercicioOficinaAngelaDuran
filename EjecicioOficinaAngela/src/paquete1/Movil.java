package paquete1;

import java.util.Scanner;

public class Movil extends Dispositivo {
	

	private int mpxCamara;
	static Scanner scStirng = new Scanner(System.in);
	static Scanner scInt = new Scanner(System.in);
	static int preguntaInt;
	static String preguntaSiNo;

//GETTERS Y SETTERS
	public int getMpxCamara() {
		return mpxCamara;
	}

	public void setMpxCamara(int mpxCamara) {
		this.mpxCamara = mpxCamara;
	}

//CONSTRUCTOR

	public Movil() {
	}

	public Movil(int numeroSerie, String marca, String modelo, int pulgadasPantalla, Empleado quienLoTiene,
			boolean enReparacion, boolean asignado, boolean espacioLibre, String tipoDispositivo, int mpxCamara) {
		super(numeroSerie, marca, modelo, pulgadasPantalla, quienLoTiene, enReparacion, asignado, espacioLibre,
				tipoDispositivo);
		this.mpxCamara = mpxCamara;
	}

//metodos
	public static void crearMovil(Movil[] arrayMovil) {
		for (Movil selectMovil : arrayMovil) {
			System.out.println("Introduzca los MpX de la camara:");
			selectMovil.setMpxCamara(scInt.nextInt());
			selectMovil.setTipoDispositivo("movil");
			break;
		}

	}

}

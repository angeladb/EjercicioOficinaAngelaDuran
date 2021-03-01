package paquete1;

import java.util.Scanner;

public class Dispositivo {

	private int numeroSerie;
	private String marca;
	private String modelo;
	private int pulgadasPantalla;
	private Empleado quienLoTiene;
	private boolean enReparacion;
	private boolean asignado;
	private boolean espacioLibre;
	private String tipoDispositivo;

	// CONSTRUCTOR
	public Dispositivo(int numeroSerie, String marca, String modelo, int pulgadasPantalla, Empleado quienLoTiene,
			boolean enReparacion, boolean asignado, boolean espacioLibre, String tipoDispositivo) {
		super();
		this.numeroSerie = numeroSerie;
		this.marca = marca;
		this.modelo = modelo;
		this.pulgadasPantalla = pulgadasPantalla;
		this.quienLoTiene = quienLoTiene;
		this.enReparacion = enReparacion;
		this.asignado = asignado;
		this.espacioLibre = espacioLibre;
		this.tipoDispositivo = tipoDispositivo;
	}

	public Dispositivo() {
		super();
	}

	// tostring
	@Override
	public String toString() {
		return "Dispositivo " + numeroSerie + "[Marca=" + marca + ", modelo=" + modelo + ", asignado a=" + quienLoTiene
				+ "]";
	}
	// getters y setters

	public int getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(int numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPulgadasPantalla() {
		return pulgadasPantalla;
	}

	public void setPulgadasPantalla(int pulgadasPantalla) {
		this.pulgadasPantalla = pulgadasPantalla;
	}

	public Empleado getquienLoTiene() {
		return quienLoTiene;
	}

	public void setquienLoTiene(Empleado quienLoTiene) {
		this.quienLoTiene = quienLoTiene;
	}

	public boolean isEnReparacion() {
		return enReparacion;
	}

	public void setEnReparacion(boolean enReparacion) {
		this.enReparacion = enReparacion;
	}

	public void introducirEquipo(int equiposActivos) {

	}

	public boolean getAsignado() {
		return asignado;
	}

	public void setAsignado(boolean asignado) {
		this.asignado = asignado;
	}

	public Empleado getQuienLoTiene() {
		return quienLoTiene;
	}

	public void setQuienLoTiene(Empleado quienLoTiene) {
		this.quienLoTiene = quienLoTiene;
	}

	public boolean getEspacioLibre() {
		return espacioLibre;
	}

	public void setEspacioLibre(boolean espacioLibre) {
		this.espacioLibre = espacioLibre;
	}

	public String getTipoDispositivo() {
		return tipoDispositivo;
	}

	public void setTipoDispositivo(String tipoDispositivo) {
		this.tipoDispositivo = tipoDispositivo;
	}
	/*
	 * 2.- Equipos (mostrar/ mostrar equipos asignados). 1.- Introducir equipo 2.-
	 * Modificar equipo 3.- Mostrar listado de todos los equipos (saldrá un listado
	 * numerado indicando tipo de equipo, ,marca y modelo, se podrá elegir el equipo
	 * para que salgan todos sus datos) 3.- Asignar/Desasignar equipos a empleado.
	 * 4.- Reparaciones: 1.- Enviar un equipo a reparar (equipo estropeado) 2.-
	 * Recoger equipo del taller (el equipo ha sido reparado)
	 */
	// Metodos

	// Introducir Dispositivo
	static Scanner scString = new Scanner(System.in);
	static Scanner scInt = new Scanner(System.in);
	static int seleccion;

	public static void IntroducirDispositivo(Portatil[] arrayPortatil, Movil[] arrayMovil, Sobremesa[] arraySobremesa,
			Empleado[] arrayEmpleados, Dispositivo[] arrayDispositivo) {

		System.out.println("Intoducir nuevo dispositivo");

		for (int i = 0; i < arrayDispositivo.length; i++) {
			Dispositivo selectDispositivo = arrayDispositivo[i];

			if (selectDispositivo.getAsignado() == false && selectDispositivo.enReparacion == false) {
				System.out.println("Dispositivo" + selectDispositivo.getNumeroSerie() + "*************************");

				System.out.println(
						"Qué tipo de dispositivo es? \n1. Portatil 2. Sobremesa 3. Movil\nIntroduzca un numero");

				seleccion = scInt.nextInt();
				if (seleccion == 1) {

					System.out.println("Va a introducir un nuevo portatil:");
					Portatil.crearPortatil(arrayPortatil);
					crearDispositivoGeneral(selectDispositivo);
				}
				if (seleccion == 2) {

					System.out.println("Va a introducir un nuevo ordenador de sobremesa:");
					Sobremesa.crearSobremesa(arraySobremesa);
					crearDispositivoGeneral(selectDispositivo);
				}

				if (seleccion == 3) {

					System.out.println("Va a introducir un nuevo telefono movil:");
					Movil.crearMovil(arrayMovil);
					crearDispositivoGeneral(selectDispositivo);
				}

				i = arrayDispositivo.length;
			}
		}
	}

	public static void crearDispositivoGeneral(Dispositivo selectDispositivo) {
		System.out.println("Introduzca marca del dispositivo:");
		selectDispositivo.setMarca(scString.next());
		System.out.println("Introduzca modelo:");
		selectDispositivo.setModelo(scString.next());
		System.out.println("Introduzca las pulgadas (14, 15, 20...):");
		selectDispositivo.setPulgadasPantalla(scInt.nextInt());
		selectDispositivo.setEnReparacion(false);
		selectDispositivo.setAsignado(false);
		System.out.println("Dispositivo " + selectDispositivo.marca + " " + selectDispositivo.modelo
				+ " creado. ");
	}

	public static void modificarDipsositivo(Dispositivo[] arrayDispositivo) {
		System.out.println("¿Qué dispositivo quiere modificar? Introduzca su posicion en la siguiente lista:");
		for (int i = 0; i < arrayDispositivo.length; i++) {
			if (arrayDispositivo[i].getEspacioLibre() == false) {
				System.out.println("* Dispositivo " + (i + 1) + ": " + arrayDispositivo[i]);
			}
		}
		Dispositivo selectDispositivo = arrayDispositivo[scInt.nextInt() - 1];
		System.out.println("Está seguro de que quiere modificar " + selectDispositivo + "????");
		String quiereModificar = scString.next();
		if (quiereModificar.equals("si")) {
			System.out.println("Introduzca marca del dispositivo:");
			selectDispositivo.setMarca(scString.next());
			System.out.println("Introduzca modelo:");
			selectDispositivo.setModelo(scString.next());
			System.out.println("Introduzca las pulgadas (14, 15, 20...):");
			selectDispositivo.setPulgadasPantalla(scInt.nextInt());
			System.out.println("Dispositivo " + selectDispositivo.marca + " " + selectDispositivo.modelo
					+ " creado y asignado a " + selectDispositivo.quienLoTiene.getNombreEmpleado());
		} else {
			System.out.println("Vale, no se han realizado cambios.");
		}
	}
}

package paquete1;

import java.util.Scanner;
import java.util.*;

public class Empleado {

	private String nombreEmpleado;
	private String apellido1;
	private String apellido2;
	private String dniEmpleado;
	private int numeroEmpleado;
	private boolean huecoLibre;
	private int portatilesAsignados;
	private int sobremesasAsignados;
	private int movilesAsignados;

	static Scanner scString = new Scanner(System.in);
	static Scanner scInt = new Scanner(System.in);

	// GETTERS Y SETTERS
	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getDniEmpleado() {
		return dniEmpleado;
	}

	public void setDniEmpleado(String dniEmpleado) {
		this.dniEmpleado = dniEmpleado;
	}

	public int getNumeroEmpleado() {
		return numeroEmpleado;
	}

	public void setNumeroEmpleado(int numeroEmpleado) {
		this.numeroEmpleado = numeroEmpleado;
	}

	public boolean getHuecoLibre() {
		return huecoLibre;
	}

	public void setHuecoLibre(boolean huecoLibre) {
		this.huecoLibre = huecoLibre;
	}

	public int getPortatilesAsignados() {
		return portatilesAsignados;
	}

	public void setPortatilesAsignados(int portatilesAsignados) {
		this.portatilesAsignados = portatilesAsignados;
	}

	public int getSobremesasAsignados() {
		return sobremesasAsignados;
	}

	public void setSobremesasAsignados(int sobremesasAsignados) {
		this.sobremesasAsignados = sobremesasAsignados;
	}

	public int getMovilesAsignados() {
		return movilesAsignados;
	}

	public void setMovilesAsignados(int movilesAsignados) {
		this.movilesAsignados = movilesAsignados;
	}

	public Empleado() {
	}

	public Empleado(String nombreEmpleado, String apellido1, String apellido2, String dniEmpleado, int numeroEmpleado) {
		super();
		this.nombreEmpleado = nombreEmpleado;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dniEmpleado = dniEmpleado;
		this.numeroEmpleado = numeroEmpleado;
	}

	public Empleado(String nomEmpleado, String ap1Empleado, String ap2Empleado, String dniEmpleado2) {
	}

	public Empleado(int numeroEmpleado) {
		super();
		this.numeroEmpleado = numeroEmpleado;
	}

	public Empleado(int i, boolean b) {
		super();
		this.numeroEmpleado = numeroEmpleado;
		this.huecoLibre = huecoLibre;
	}
	// METODOS
	/*
	 * Empleados (mostrar numero de empleados) 1.- Introducir empleado (dar de alta)
	 * METODO CREAREMPLEADO
	 * 
	 * 2.- Dar de baja un empleado METODO SELECCIONAR EMPLEADO
	 * 
	 * 3.- Modificar datos empleado METODO MODIFICAR EMPLEADO
	 * 
	 * 4.- Mostrar listado de todos los empleados (En el listado saldrá numerados y
	 * nombre y apellidos, se podrá elegir el empleado y mostrar todos sus datos)
	 * METODO LISTAR EMPLEADO
	 */

	public String toString() {
		return "Empleado [nombreEmpleado=" + nombreEmpleado + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
				+ ", dniEmpleado=" + dniEmpleado + ", numeroEmpleado=" + numeroEmpleado + ", huecoLibre=" + huecoLibre
				+ "]";
	}

	public String imprimeNombre() {
		return "Empleado " + numeroEmpleado + " :" + nombreEmpleado + " " + apellido1 + " " + apellido2;
	}

	// INTRODUCIREMPLEADO
	public static void IntroducirEmpleado(Empleado[] arrayEmpleados, int empleadosActivos) {

		System.out.println("Creacion de nuevo empleado:");
		for (int i = 0; i < arrayEmpleados.length; i++) {
			if (arrayEmpleados[i].huecoLibre == true) {
				System.out.println("Empleado" + arrayEmpleados[i].getNumeroEmpleado());
				System.out.println("Introduzca nombre empleado:");
				arrayEmpleados[i].setNombreEmpleado(scString.next());
				System.out.println("Introduzca primer apellido:");
				arrayEmpleados[i].setApellido1(scString.next());
				System.out.println("Introduzca segundo apellido:");
				arrayEmpleados[i].setApellido2(scString.next());
				System.out.println("Introduzca DNI:");
				arrayEmpleados[i].setDniEmpleado(scString.next());
				System.out.println(arrayEmpleados[i].toString());
				empleadosActivos++;
				arrayEmpleados[i].huecoLibre = false;
				System.out.println("Empleados activos ahora mismo: " + empleadosActivos);
				i = arrayEmpleados.length;
			}
		}

	}

	public static void BorrarEmpleado(Empleado[] arrayEmpleados, int empleadosActivos, int selectEmpleado) {
		if (arrayEmpleados[selectEmpleado].huecoLibre == false) {
			System.out.println(
					"Está seguro que quiere borrar a " + arrayEmpleados[selectEmpleado].nombreEmpleado + "????");
			String quiereBorrar = scString.next();
			if (quiereBorrar.equals("si")) {
				arrayEmpleados[selectEmpleado].setNombreEmpleado("");
				arrayEmpleados[selectEmpleado].setApellido1("");
				arrayEmpleados[selectEmpleado].setApellido2("");
				arrayEmpleados[selectEmpleado].setDniEmpleado("");
				System.out.println(arrayEmpleados[selectEmpleado].toString());
				arrayEmpleados[selectEmpleado].huecoLibre = true;
			} else {
				System.out.println("Vale, el empleado no ha sido eliminado");
			}
		} else {
			System.out.println("Este empleado no esta activo. No se puede realizar la accion.");
		}
	}

	public static void ModificarEmpleado(Empleado[] arrayEmpleados, int empleadosActivos) {
		System.out.println("¿Qué empleado quiere modificar?:");
		int selectEmpleado = scInt.nextInt() - 1;
		if (arrayEmpleados[selectEmpleado].huecoLibre == false) {
			System.out.println("Introduzca nombre empleado:");
			String nomEmpleado = scString.next();
			System.out.println("Introduzca primer apellido empleado:");
			String ap1Empleado = scString.next();
			System.out.println("Introduzca segundo apellido empleado:");
			String ap2Empleado = scString.next();
			System.out.println("Introduzca DNI/NIE empleado:");
			String dniEmpleado = scString.next();

			System.out.println(
					"Está seguro de que quiere modificar a  " + arrayEmpleados[selectEmpleado].nombreEmpleado + "????");
			String quiereModificar = scString.next();
			if (quiereModificar.equals("si")) {
				arrayEmpleados[selectEmpleado].setNombreEmpleado(nomEmpleado);
				arrayEmpleados[selectEmpleado].setApellido1(ap1Empleado);
				arrayEmpleados[selectEmpleado].setApellido2(ap2Empleado);
				arrayEmpleados[selectEmpleado].setDniEmpleado(dniEmpleado);
				System.out.println("De acuerdo. El empleado ha sido modificado.");
				System.out.println(arrayEmpleados[selectEmpleado]); // TODO REVISAR, SALE NULL AL MODIFICAR
			} else {
				System.out.println("Vale, no se han realizado cambios.");
			}
		} else {
			System.out.println("Este empleado no esta activo. No se puede realizar la accion.");
		}
	}

	/*
	 * 4.- Mostrar listado de todos los empleados (En el listado saldrá numerados y
	 * nombre y apellidos, se podrá elegir el empleado y mostrar todos sus datos)
	 * METODO LISTAR EMPLEADO
	 */
	public String listaNombreApellido() {
		return "Empleado [Nombre Empleado=" + nombreEmpleado + ", Apellido 1=" + apellido1 + ", Apellido 2=" + apellido2
				+ ", DNI=" + dniEmpleado + ", numero Empleado=" + numeroEmpleado + "]";
	}

	public static void ListarEmpleado(Empleado[] arrayEmpleados, int empleadosActivos) {
		int selectEmpleado;
		for (int i = 0; i < arrayEmpleados.length; i++) {
			if (arrayEmpleados[i].getHuecoLibre() == false) {
				System.out.println(arrayEmpleados[i].imprimeNombre());
			}
		}
		System.out.println("Que empleado desea ver con mas detalle? Introduzca su numero de empleado");
		selectEmpleado = scInt.nextInt() - 1;
		System.out.println(arrayEmpleados[selectEmpleado]);
	}

	public static void seleccionarEmpleadoAsignar(Empleado[] arrayEmpleados, Dispositivo selectDispositivo) {

		System.out.println("Introduzca el numero del empleado a quien se lo quiere asignar\nLista de empleados:\n");
		for (int i = 0; i < arrayEmpleados.length; i++) {
			if (arrayEmpleados[i].getHuecoLibre() == false) {
				System.out.println(arrayEmpleados[i].imprimeNombre());
			}
		}
		Empleado selectEmpleado = arrayEmpleados[scInt.nextInt() - 1];
		selectDispositivo.setquienLoTiene(selectEmpleado);
		selectDispositivo.setAsignado(true);
		System.out.println("Creando dispositivo para " + selectEmpleado.getNombreEmpleado());

		// TODO array de dispositivos

	}
}

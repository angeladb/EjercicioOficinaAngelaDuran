package paquete1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		// CREAMOS LOS EMPLEADOS POR DEFECTO ANTES DE INICIAR PROGRAMA
		Empleado[] arrayEmpleados = new Empleado[7];
		arrayEmpleados[0] = new Empleado("Pepe", "Perez", "Gomez", "11111111A", 1);
		arrayEmpleados[1] = new Empleado("Laura", "Rodriguez", "Isidro", "22222222B", 2);
		arrayEmpleados[2] = new Empleado("Jorge", "Martin", "Rodriguez", "33333333C", 3);
		arrayEmpleados[3] = new Empleado("Ana", "Garcia", "Sanchez", "44444444D", 4);
		int empleadosActivos = 4;

		for (int i = 4; i < arrayEmpleados.length; i++) {
			arrayEmpleados[i] = new Empleado();
			arrayEmpleados[i].setNumeroEmpleado(i + 1);
			arrayEmpleados[i].setHuecoLibre(true);
		}

		// CREAMOS LOS SOBREMESA POR DEFECTO ANTES DE INICIAR PROGRAMA

		int contadorSerie = 1; // contador para los numeros de serie

		Sobremesa[] arraySobremesa = new Sobremesa[7];
		int sobremesaActivos = 2;

		arraySobremesa[0] = new Sobremesa(contadorSerie, "HP", "Spadrille", 28, null, false, false, false, "sobremesa", 500, 8, "HP", "HP", "HP");
		contadorSerie++;
		arraySobremesa[1] = new Sobremesa(contadorSerie, "HP", "Centipede", 20, null, false, false, false, "sobremesa", 500, 16, "Microsoft", "Microsoft", "HP");
		contadorSerie++;
		
		for (int i = 2; i < arraySobremesa.length; contadorSerie++, i++) {
			arraySobremesa[i] = new Sobremesa();
			arraySobremesa[i].setNumeroSerie(contadorSerie);
			arraySobremesa[i].setEnReparacion(false);
			arraySobremesa[i].setEspacioLibre(false);
			arraySobremesa[i].setAsignado(false);
			arraySobremesa[i].setTipoDispositivo("sobremesa");
		}

		// CREAMOS LOS PORTATILES POR DEFECTO ANTES DE INICIAR PROGRAMA
		Portatil[] arrayPortatil = new Portatil[7];
		int portatilActivos = 3;
		arrayPortatil[0] = new Portatil(1111, "MSI", "Dragoncin", 14, null, false, false, false, "portatil", true, false, 16);
		contadorSerie++;
		arrayPortatil[1] = new Portatil(2222, "HP", "Mola", 15, null, false, false, false, "portatil",  true, false, 8);
		contadorSerie++;
		arrayPortatil[2] = new Portatil(3333, "Microsoft Surface", "Ventanita", 17, null, false, false, false, "portatil",  true, false, 8);
		contadorSerie++;
		
		for (int i = 3; i < arrayPortatil.length; contadorSerie++, i++) {
			arrayPortatil[i] = new Portatil();
			arrayPortatil[i].setNumeroSerie(contadorSerie);
			arrayPortatil[i].setEnReparacion(false);
			arrayPortatil[i].setEspacioLibre(false);
			arrayPortatil[i].setAsignado(false);
			arrayPortatil[i].setTipoDispositivo("portatil");
		}

		// CREAMOS LOS MOVILES POR DEFECTO ANTES DE INICIAR PROGRAMA
		Movil[] arrayMovil = new Movil[7];
		int movilActivos = 3;
		arrayMovil[0] = new Movil();
		arrayMovil[1] = new Movil();
		arrayMovil[2] = new Movil();

		for (int i = 3; i < arrayMovil.length; contadorSerie++, i++) {
			arrayMovil[i] = new Movil();
			arrayMovil[i].setNumeroSerie(contadorSerie);
			arrayMovil[i].setEnReparacion(false);
			arrayMovil[i].setEspacioLibre(false);
			arrayMovil[i].setAsignado(false);
			arrayMovil[i].setTipoDispositivo("m");
		}

		/*
		 * CREAMOS UN ARRAY DISPOSITIVOS PARA UTILIZARLO EN METODOS Y GUARDAR ATRIBUTOS
		 * DE LA CLASE "PADRE"
		 */

		int contadorDisp = 0;
		Dispositivo[] arrayDispositivo = new Dispositivo[arrayMovil.length + arrayPortatil.length
				+ arraySobremesa.length];
		for (int i = 0; i < arrayPortatil.length; i++) {
			arrayDispositivo[contadorDisp] = new Dispositivo();
			arrayDispositivo[contadorDisp] = arrayPortatil[i];
			contadorDisp++;
		}
		for (int i = 0; i < arrayMovil.length; i++) {
			arrayDispositivo[contadorDisp] = new Dispositivo();
			arrayDispositivo[contadorDisp] = arrayMovil[i];
			contadorDisp++;
		}
		for (int i = 0; i < arraySobremesa.length; i++) {
			arrayDispositivo[contadorDisp] = new Dispositivo();
			arrayDispositivo[contadorDisp] = arraySobremesa[i];
			contadorDisp++;
		}

		boolean retrocederMenu = false;
		int eleccion = 0;
		Scanner sc = new Scanner(System.in);
		Scanner scInt = new Scanner(System.in);
		while (!retrocederMenu) {
			System.out.println("\n¿Qué operación desea realizar? Introduzca un número del 1 al 4\n"
					+ "1.Introducir empleado(dar de alta)\n" + "2.Dar de baja a un empleado\n"
					+ "3.Modificar datos empleado\n" + "4.Mostrar listado de todos los empleados)" + "\n5.Salir"
					+ "\n6.Crear Nuevo dispositivo.");
			eleccion = sc.nextInt();
			switch (eleccion) {
			case 1:
				if (empleadosActivos < arrayEmpleados.length) {
					Empleado.IntroducirEmpleado(arrayEmpleados, empleadosActivos);
					empleadosActivos++;
				} else {
					System.out.println("No se pueden introducir nuevos empleados. La oficina está completa");
				}
				break;
			case 2:
				System.out.println("¿Qué empleado quiere eliminar?:");
				int selectEmpleado = scInt.nextInt() - 1;
				Empleado.BorrarEmpleado(arrayEmpleados, empleadosActivos, selectEmpleado);
				if (arrayEmpleados[selectEmpleado].getHuecoLibre()) {
					System.out.println("Empleado eliminado*****");
					empleadosActivos--;
				}
				break;
			case 3:
				Empleado.ModificarEmpleado(arrayEmpleados, empleadosActivos);
				break;
			case 4:
				Empleado.ListarEmpleado(arrayEmpleados, empleadosActivos);
				break;
			case 5:
				System.out.println("***************\nGracias por venir\n***************");
				return;
			case 6:
				Dispositivo.IntroducirDispositivo(arrayPortatil, arrayMovil, arraySobremesa, arrayEmpleados,
						arrayDispositivo);
			default:
				System.out.println("\n***************\nMENU PRINCIPAL***************");

			}

		}
	}
}

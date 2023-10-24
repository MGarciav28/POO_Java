import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declarar variables
		Scanner lectura = null;

		int numeroInvitacion;
		String direccion;
		int numMesa;
		String familia;
		String horaInicio;

		Invitaciones invitacion = null;

		List<Invitaciones> listaInvitaciones = new ArrayList<Invitaciones>();

		int menuPri, indice, subMenu;
		
		Invitaciones inv1 = new Invitaciones(20, "Alamos 26", 10, "Lopez", "14:00");
		Invitaciones inv2 = new Invitaciones(21, "Chabacano 15", 10, "Perez", "14:00");
		Invitaciones inv3 = new Invitaciones(30, "Alamos 26", 10, "Gonzalez", "14:00");
		

		do {
			System.out.println("Menu Principal");
			System.out.println("1...Alta");
			System.out.println("2...Buscar");
			System.out.println("3...Editar");
			System.out.println("4... Eliminar");
			System.out.println("5... Listar");
			System.out.println("6... Buscar por familia");
			System.out.println("7... Contar registros");
			System.out.println("8... Eliminar por familia");
			System.out.println("9... Vaciar la lista");
			System.out.println("10... Salir");

			lectura = new Scanner(System.in);
			menuPri = lectura.nextInt();

			switch (menuPri) {
			case 1: {
				try {
					System.out.println("Ingrese el numero de invitacion");
					lectura = new Scanner(System.in);
					numeroInvitacion = lectura.nextInt();

					System.out.println("Ingrese la direccion de la invitacion");
					lectura = new Scanner(System.in);
					direccion = lectura.nextLine();

					System.out.println("Ingrese el numero de mesa");
					lectura = new Scanner(System.in);
					numMesa = lectura.nextInt();

					System.out.println("Ingrese el nombre de la familia a invitar");
					lectura = new Scanner(System.in);
					familia = lectura.nextLine();

					System.out.println("Ingrese la hora de inicio");
					lectura = new Scanner(System.in);
					horaInicio = lectura.nextLine();

					// GUARDAR
					// Instancia de clase usando el constructor con parametros
					invitacion = new Invitaciones(numeroInvitacion, direccion, numMesa, familia, horaInicio);

					// AGREGAR A LA LISTA
					listaInvitaciones.add(invitacion);
					System.out.println(
							"Se guardó correctamente la invitación número: " + invitacion.getNumeroInvitacion());

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error al guardar: " + e.getMessage());
				}
				break;
			}
			case 2: {
				System.out.println("\n\nRegistros en la lista por indice");
				for (int i = 0; i < listaInvitaciones.size(); i++) {
					System.out.printf("\n[%d]" + listaInvitaciones.get(i).getFamilia(), i);
				}

				System.out.println("\nIngrese el indice a buscar");
				lectura = new Scanner(System.in);
				indice = lectura.nextInt();

				// Buscar con indice
				invitacion = listaInvitaciones.get(indice);
				System.out.println("Se encontro " + invitacion.toString());

				break;
			}
			case 3: {
				// Mostrar todos los indices
				System.out.println("\n\nRegistros en la lista por indice");
				for (int i = 0; i < listaInvitaciones.size(); i++) {
					System.out.printf("\n[%d]" + listaInvitaciones.get(i).getFamilia(), i);
				}

				System.out.println("\n\nIngrese el indice a editar");
				lectura = new Scanner(System.in);
				indice = lectura.nextInt();

				// Busqueda
				invitacion = listaInvitaciones.get(indice);
				System.out.println("Se encontro la invitacion de la familia: " + invitacion.getFamilia());

				// Actualizacion
				do {
					System.out.println("EDITANDO LA INVITACION");
					System.out.println("1---Direccion");
					System.out.println("2---Numero de invitacion");
					System.out.println("3---Menu Principal");

					lectura = new Scanner(System.in);
					subMenu = lectura.nextInt();

					switch (subMenu) {
					case 1:
						System.out.println("Ingresa la nueva direccion");
						lectura = new Scanner(System.in);
						direccion = lectura.nextLine();						
						invitacion.setDireccion(direccion);
						break;
					case 2:
						System.out.println("Ingresa el nuevo numero de invitacion");
						lectura = new Scanner(System.in);
						numeroInvitacion = lectura.nextInt();						
						invitacion.setNumeroInvitacion(numeroInvitacion);
						break;

					case 3:
						break;

					default:
						break;
					}
				} while (subMenu < 3);

				break;
			}
			case 4: {
				// Mostrar todos los indices
				System.out.println("\n\nRegistros en la lista por indice");
				for (int i = 0; i < listaInvitaciones.size(); i++) {
					System.out.printf("\n[%d]" + listaInvitaciones.get(i).getFamilia(), i);
				}

				System.out.println("\n\nIngrese el indice a eliminar");
				lectura = new Scanner(System.in);
				indice = lectura.nextInt();

				// Eliminar
				listaInvitaciones.remove(indice);
				System.out.println("Se eliminó correctamente");
				break;
			}
			case 5: {
				System.out.println(listaInvitaciones);

				break;
			}
			case 6: {							
				System.out.println("Ingrese la familia que desea buscar");				
				lectura=new Scanner(System.in);
				familia = lectura.nextLine();
				try {
					for (int i=0; i<listaInvitaciones.size(); i++) {
						if(listaInvitaciones.get(i).getFamilia().equals(familia)) {
							System.out.println(listaInvitaciones.get(i));
						}
						}	
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println("Error con datos ingresados");
				}		
				break;
			}
			case 7: {
				int count=0;
				for (Invitaciones invitaciones : listaInvitaciones) {
					count++;
				}
				
				System.out.println("El numero total de registros es de: "+count);
				break;
			}
			case 8: {
				System.out.println("\n\nRegistros en la lista por indice");
				for (int i = 0; i < listaInvitaciones.size(); i++) {
					System.out.printf("\n[%d]" + listaInvitaciones.get(i).getFamilia(), i);
				}

				System.out.println("\n\nIngrese La famila a eliminar");
				lectura = new Scanner(System.in);
				familia = lectura.nextLine();
				
				for (int i=0; i<listaInvitaciones.size(); i++) {
					if(listaInvitaciones.get(i).getFamilia().equals(familia)) {
							listaInvitaciones.remove(i);
							System.out.println("Se eliminó correctamente el registro");
					}
					}

				break;
			}
			case 9: {
				int respuesta;
				System.out.println("¿Esta seguro que desea vaciar la lista?");
				System.out.println("1...Si");
				System.out.println("2...No");
				System.out.println("3...Menu Principal");
				
				lectura = new Scanner(System.in);
				respuesta = lectura.nextInt();
				
				switch (respuesta) {
				case 1: {
					listaInvitaciones.clear();					
				break;	
				}
				case 2: {
					System.out.println("No se han generado cambios");
					break;	
					}
				default:
					throw new IllegalArgumentException("Unexpected value: " + respuesta);
				}
				break;
			}
			case 10: {

				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + menuPri);
			}
		} while (menuPri < 10);

	}

}

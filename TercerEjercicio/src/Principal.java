import java.time.*;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = null;
		
		LocalDate ahora=LocalDate.now();
		LocalDate evento=LocalDate.of(2024, 8, 12);
		LocalDate nueva;
		String fechaRecibida;
		
		System.out.println("Hoy es: "+ahora+ " Y el magno evento es el dia "+evento);
		
		System.out.println("Por favor ingresa una fecha con formato aaaa-mm-dd");
		leer = new Scanner(System.in);
		fechaRecibida = leer.nextLine();
		
		nueva=LocalDate.parse(fechaRecibida);
		
		System.out.println("El dia ingresado es: " +nueva.getDayOfMonth()+" El mes es: "+nueva.getMonth()+
				" y el a�o es: "+nueva.getYear()+". Ese dia es un "+nueva.getDayOfWeek());

	}

}

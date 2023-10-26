import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		List<Candidatos> listaCandidatos = new ArrayList<>();
		Scanner lectura = null;
		
		String nombre;
		int id;
		
		int numCandidatos, numVotantes;
		Candidatos candidatoTemp=null;
		
		Implementar imp=new Implementar();
		
		System.out.println("Ingrese el numero de candidatos");
		lectura = new Scanner(System.in);
		numCandidatos=lectura.nextInt();
		
		System.out.println("Ingrese el numero de votantes");
		lectura = new Scanner(System.in);
		numVotantes=lectura.nextInt();
		
		System.out.println(numCandidatos+" Candidatos");
		System.out.println(numVotantes+" Votantes");
		
		for(int i=0; i<numCandidatos; i++) {
			System.out.println("Ingrese nombre de candidato");
			lectura = new Scanner(System.in);
			nombre=lectura.nextLine();			
			id=i;
			candidatoTemp = new Candidatos(nombre,id);
			imp.registrarCandidato(candidatoTemp);			
		}
		
		for(int i=0; i<numVotantes;i++) {
		System.out.println("Favor de emitir su voto");
		lectura = new Scanner(System.in);
		id=lectura.nextInt();				
		imp.registrarVoto(id);
		}
		
		listaCandidatos=imp.pasarLista();		
		Collections.sort(listaCandidatos);
				
		imp.resultados();
		
		

	}

}

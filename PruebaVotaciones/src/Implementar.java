import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Implementar implements IMetodos{	
	List<Candidatos> listaCandidatos = new ArrayList<Candidatos>();
	
	@Override
	public void registrarCandidato(Candidatos candidatos) {
		listaCandidatos.add(candidatos);
	}

	@Override
	public void registrarVoto(int voto) {
		int incremento =listaCandidatos.get(voto).getVotos();
		incremento++;
		listaCandidatos.get(voto).setVotos(incremento);
	}
	

	@Override
	public void mostrar() {
		System.out.println(listaCandidatos);				
	}
	
	public List<Candidatos> pasarLista(){
	return listaCandidatos;	
	}
	
	public void resultados() {
	for(int i=0; i<listaCandidatos.size(); i++) {
		System.out.println("El candidato en lugar: "+(i+1)+ 
				" Es "+listaCandidatos.get(i).getNombre()+" con "
				+listaCandidatos.get(i).getVotos()+" votos");
	}
	}
	
	
}

import java.util.ArrayList;
import java.util.List;

public interface IMetodos {
	//List<Votos> lista = new ArrayList<Votos>();
	public void registrarCandidato(Candidatos candidato);
	public void registrarVoto(int id);
	
	
	public void mostrar();
}

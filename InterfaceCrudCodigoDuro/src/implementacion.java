import java.util.ArrayList;
import java.util.List;

public class implementacion implements iMetodos, IMetodos2 {

List<Tacos> lista= new ArrayList<Tacos>();

	@Override
	public void contar() {
		// TODO Auto-generated method stub
		System.out.println("Cantidad de registros almacenados: " + lista.size());
	}

	@Override
	public void guardar(Tacos taco) {
		// TODO Auto-generated method stub
		lista.add(taco);
	}

	@Override
	public void editar(int indice, Tacos taco) {
		// TODO Auto-generated method stub
		lista.set(indice, taco);
	}

	@Override
	public void eliminar(int indice) {
		// TODO Auto-generated method stub
		lista.remove(indice);
		
	}

	@Override
	public Tacos buscar(int indice) {
		// TODO Auto-generated method stub
		return lista.get(indice);
	}

	@Override
	public void listar() {
		// TODO Auto-generated method stub
		System.out.println(lista);		
	}

}

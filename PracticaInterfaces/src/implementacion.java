import java.util.ArrayList;
import java.util.List;

public class implementacion implements IMetodos, IMetodos2 {

	List<Muebles> lista= new ArrayList<Muebles>();
	
	@Override
	public void contar() {
	
		System.out.println("Se contaron " + lista.size()+" elementos");
	}
	
	@Override
	public void guardar(Muebles mueble) {
		// TODO Auto-generated method stub
		lista.add(mueble);
	}

	@Override
	public Muebles buscar(int index) {
		// TODO Auto-generated method stub
		return lista.get(index);
	}

	@Override
	public void actualizar(int index, Muebles mueble) {
		lista.set(index, mueble);
		
	}

	@Override
	public void eliminar(int index) {
		lista.remove(index);
	}

}

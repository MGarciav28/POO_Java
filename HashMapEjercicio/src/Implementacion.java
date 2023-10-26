import java.util.HashMap;

public class Implementacion implements IMetodos {
	HashMap<String, Hamburgesa> hashHamburgesas = new HashMap<String, Hamburgesa>();

	@Override
	public void agregar(Hamburgesa hamburgesa) {
		//
		hashHamburgesas.put(hamburgesa.getNombre(), hamburgesa);
	}

	@Override
	public Hamburgesa buscar(Hamburgesa hamburgesa) {
		return hashHamburgesas.get(hamburgesa.getNombre());
	}

	@Override
	public void actualizar(Hamburgesa hamburgesa) {
		hashHamburgesas.put(hamburgesa.getNombre(), hamburgesa);
	}

	@Override
	public void eliminar(Hamburgesa hamburgesa) {
		hashHamburgesas.remove(hamburgesa.getNombre());
	}

	@Override
	public void listar() {
		System.out.println(hashHamburgesas);
	}

}

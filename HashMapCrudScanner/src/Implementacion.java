import java.util.HashMap;

public class Implementacion implements IMetodos{

	//DECLARAR EL HASMAP
	//<tipoDatoLlave,Objeto>
	HashMap<Integer, Carros> hashMapCarros = new HashMap<Integer, Carros>();
	@Override
	public void guardar(Carros carro) {
	//Usamos .put() para agregar elementos a la coleccion
		hashMapCarros.put(carro.getNumSerie(), carro);
	}

	@Override
	public void editar(Carros carro) {
		//Usamos .put() para modificar elementos a la coleccion
		hashMapCarros.put(carro.getNumSerie(), carro);
	}

	@Override
	public void eliminar(Carros carro) {
		hashMapCarros.remove(carro.getNumSerie());
	}

	@Override
	public Carros buscar(Carros carro) {
		return hashMapCarros.get(carro.getNumSerie());
	}

	@Override
	public void listar() {
		System.out.println(hashMapCarros);		
	}
	
	public void contar() {
		System.out.println("Registros: "+hashMapCarros.size());
	}

}

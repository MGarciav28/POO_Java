import java.util.ArrayList;
import java.util.List;

public class implementacion implements IMetodos {

List<Motos> lista = new ArrayList<Motos>();


	@Override
	public void guardar(Motos moto) {
		lista.add(moto);
	}

	@Override
	public void editar(int indice, Motos moto) {
		lista.set(indice, moto);
	}

	@Override
	public void eliminar(int indice) {
		lista.remove(indice);
	}

	@Override
	public Motos buscar(int indice) {
		// TODO Auto-generated method stub
		return lista.get(indice);
	}

	@Override
	public void listar() {
		System.out.println(lista);
	}

	
	//Agregar metodos personalizados
	public void contar() {
	System.out.println("Registros "+lista.size());	
	}
	
	public void indicaMarca() {
	System.out.println("Registros en la empresa");
	for(int i=0; i<lista.size();i++) {
		System.out.printf("\n[%d]  "+lista.get(i).getMarca(),i);
	}	
	}
	
	public void indiPlaca() {
	System.out.println("Registros en la empresa");
	for(int i=0; i<lista.size();i++) {
		System.out.printf("\n[%d]  "+lista.get(i).getMarca()+" "+lista.get(i).getPlaca(),i);
		}
	}
	
	public Motos buscarPlaca(String placa) {
		Motos motoTemp=null;
		for(int i=0; i<lista.size(); i++) {
		if(lista.get(i).getPlaca().equals(placa)) {
		motoTemp=lista.get(i);	
		}
		}
		return motoTemp;
	}
	
	public void ListarMarca(String marca) {
	for (Motos moto : lista) {
		if(moto.getMarca().equals(marca)) {
		System.out.println(moto);	
		}
	}	
	}
	
	public void eliminarPlaca(String placa) {
		for(int i=0; i<lista.size(); i++) {
			if(lista.get(i).getPlaca().equals(placa)) {
			lista.remove(i);	
			}
			}
	}
	
	public int suma(){
		int sumatoria=0;
		for (Motos motos : lista) {
			sumatoria+=motos.getPrecio(); 			
		}
		return sumatoria;
	}
}

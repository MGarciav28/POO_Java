import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Implementacion implements IMetodos1, IMetodos2 {
	List<Peliculas>lista=new ArrayList<Peliculas>();
	List<Peliculas>buscarTitulos = new ArrayList<Peliculas>();
	
	
	@Override
	public List<Peliculas> buscarTitulo(String titulo) {		
		buscarTitulos.clear();		
		for (Peliculas peliculas : lista) {			
			if(peliculas.getTitulo().equals(titulo)) {
				buscarTitulos.add(peliculas);
			}			
		}
		/*
		for(int i=0; i<lista.size(); i++) {
		if(lista.get(i).getTitulo().contains(titulo)) {
				buscarTitulos.add(lista.get(i));				
				}
		}	*/	
		 return buscarTitulos;
	}

	@Override
	public void listarFormato(String formato) {
		boolean flag=false;
		for(int i=0; i<lista.size();i++) {
			if(lista.get(i).getFormato().equals(formato)) {
				System.out.println(lista.get(i));
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println("No hay registros que mostrar");
		}
	}

	@Override
	public void eliminarProductora(String productora) {
		for(int i=0; i<lista.size();i++) {
			if(lista.get(i).getProductora().equals(productora)) {
				lista.remove(i);
			}
		}
	}

	@Override
	public void total() {
		float total;
		for(int i=0; i<lista.size();i++) {
			total=lista.get(i).getCantidad()*lista.get(i).getPrecio();
			System.out.println("Tenemos $"+total+" en la pelicula "+lista.get(i).getTitulo());
		}		
	}

	@Override
	public void guardar(Peliculas pelicula) {
		lista.add(pelicula);		
	}

	@Override
	public void listar() {
		System.out.println(lista);
	}

	@Override
	public Peliculas buscar(int indice) {		
		return lista.get(indice);
	}

	@Override
	public void editar(int indice, Peliculas pelicula) {
		lista.set(indice, pelicula);
	}

	@Override
	public void eliminar(int indice) {
		lista.remove(indice);
	}
	
	public void mostrarindiceTitulo() {
		for(int i=0; i<lista.size(); i++) {
			System.out.printf("\n[%d] -"+lista.get(i).getTitulo(),i);
		}	
	}
	
	public void mostrarFormato() {
		for(int i=0; i<lista.size(); i++) {
			System.out.printf("\n[%d] -"+lista.get(i).getTitulo()+" - "+lista.get(i).getFormato(),i);
		}}
	public void mostrarProductora() {
		for(int i=0; i<lista.size(); i++) {
			System.out.println(lista.get(i).getTitulo()+" - "+lista.get(i).getProductora());
		}}

	public boolean entero(String menup) {
		try {
			int ent=Integer.parseInt(menup);
			return true;
		} catch (NumberFormatException ex) {
			// TODO: handle exception
			return false;
		}
	    
	   
	}
}

import java.util.ArrayList;
import java.util.List;

public interface IMetodos {	
	public void guardar(Muebles mueble);
	public Muebles buscar(int index);
	public void actualizar(int index, Muebles mueble);
	public void eliminar(int index);

}

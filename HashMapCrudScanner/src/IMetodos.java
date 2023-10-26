
public interface IMetodos {
public void guardar(Carros carro);
public void editar(Carros carro); //Aqui se pasa el objeto como argumento
public void eliminar(Carros carro); //Aqui se pasa el objeto como argumento

public Carros buscar(Carros carro);
public void listar();
}

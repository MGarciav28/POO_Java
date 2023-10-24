
public class Principal {
	public static void main(String[] args) {
		Tacos taco1 = new Tacos(1, "Pastor, cebolla, verdura", "gringa", 25, "Grande");
		Tacos taco2 = new Tacos(4, "Bisteck, cebolla, papas", "Taco de bistec", 80, "Grande");
		Tacos taco3 = new Tacos(8, "Suadero, cebolla, verdura", "Taco", 50, "Chicos");

		implementacion imp=new implementacion();
		
		//G
		imp.guardar(taco1);
		imp.guardar(taco2);
		imp.guardar(taco3);
		
		//Listar
		imp.listar();
		
		//Buscar
		Tacos taco = null;
		taco = imp.buscar(0);
		System.out.println("Se encontro " + taco);
		
		//Editar
		taco.setPrecio(60);
		imp.editar(0, taco);
		
		//Mostrar
		imp.listar();
		
		//Eliminar
		imp.eliminar(1);
		
		imp.listar();
		
		//Contar
		imp.contar();
	}
}

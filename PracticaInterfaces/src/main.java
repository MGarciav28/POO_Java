
public class main {

	public static void main(String[] args) {
		implementacion imp = new implementacion();
		
		Muebles mb1 = new Muebles("Silla", "Madera", 50);
		Muebles mb2 = new Muebles("Mesa", "Metal", 150);
		Muebles mb3 = new Muebles("Cama", "Madera", 350);
		
		imp.guardar(mb1);
		imp.guardar(mb2);
		imp.guardar(mb3);
		
		imp.buscar(0);
		
		imp.contar();
		
		imp.eliminar(1);
		
		
		
	}

}


public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// instancia de clase y asigancion
		Television tv1 = new Television();
		tv1.marca = "LG";
		tv1.id = "SE1541";
		tv1.dimension = 45.5;
		tv1.smart = false;
		tv1.precio = 17500.80;

		System.out.println("Catracteristicas de la TV 1");
		System.out.println("Marca: " + tv1.marca);
		System.out.println("Modelo: " + tv1.id);
		System.out.println("Dimension: " + tv1.dimension);
		System.out.println("Precio: " + tv1.precio);
		System.out.println("");

//Instancia de clase y encapsulamiento
		Television tv2 = new Television();
		tv2.setDimension(23);
		tv2.setMarca("Sansui");
		tv2.setPrecio(7800);
		tv2.setSmart(true);
		tv2.setId("HG-56-122");

		System.out.println("Catracteristicas de la TV 2");
		System.out.println("Marca: " + tv2.getMarca());
		System.out.println("Modelo: " + tv2.getId());
		System.out.println("Dimension: " + tv2.getDimension());
		System.out.println("Precio: " + tv2.getPrecio());
		System.out.println("");

//instancia con constructor con parametros
		Television tv3 = new Television("Sony", "45019STV", true, 27654, 60);
		System.out.println(tv3.toString());
	}

}

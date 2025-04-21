
public class Videojuegos {

	//atributos
	private String nombre;
	private String categoria;
	private int precio;
	private int stock;

	
	//costructor
	public Videojuegos(String nombre, String categoria, int precio, int stock) {
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.stock = stock;
	}


	@Override
	public String toString() {
		return "Videojuegos [nombre =" + nombre + ", categoria =" + categoria + ", precio =" + precio + ", stock =" + stock
				+ "]\n";
	}


	//seters y geters
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public float getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	
	
	
}

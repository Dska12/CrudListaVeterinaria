import java.util.*;
public class Principal {

	public static void main(String arg[]) {
		
		Mascotas mascota1 = new Mascotas("capulina", "pitbull", 1, 3500);
		Mascotas mascota2 = new Mascotas("bambi", "chihuahua", 1, 2400);
		Mascotas mascota3 = new Mascotas("burbuja", "maltes", 2, 2300);
		
		//declaramos mi lista 
		List<Mascotas> lista = new ArrayList<Mascotas>();
		
		//tiene los metodos del crud basico
		
		//guardar o agragar elementos a lista .add
		lista.add(mascota1);
		lista.add(mascota2);
		lista.add(mascota3);
		
		//mostrar 
		//System.out.println(lista);
		
		//buscar--- por indice --- get(indice)
		Mascotas mascotaEncont = null; //reserva de espacio en memoria
		
		mascotaEncont = lista.get(0);
		
		//System.out.println("se encontro el registro "+ mascotaEncont);
		
		// para editar primero hay que buscar
		mascotaEncont = lista.get(0);
		mascotaEncont.setNombre("bobby");
		
		//actualizar lista -- set(indice, elemento para actualizar)
		lista.set(0, mascotaEncont);
		
		//mostrar
		//System.out.println(lista);
		
		//eliminar .remove(indice)
		lista.remove(2);
		
		//System.out.println(lista);
		
		
		//ejercicio
		for (Mascotas mascota : lista) {
			if (mascota.getNombre().equals("bambi") ) {
				System.out.println("mascota encotrada "+mascota);
				break;
			}
		}
		
		int inversion = 0;
		for(Mascotas p : lista) {
			inversion += p.getPrecio();
			System.out.println(inversion);
		}
		
		
		
		
		
		//ejercicio -- Videojuegos
		
		
		//objetos
		/*Videojuegos juego1 = new Videojuegos("HALO","aventura",250,100);
		Videojuegos juego2 = new Videojuegos("Gears of war","accion",550,50);
		Videojuegos juego3 = new Videojuegos("Mario kart","carreras",800,30);
		
		//declaramos la lista
		List<Videojuegos> lista = new ArrayList<Videojuegos>();
		
		lista.add(juego1);
		lista.add(juego2);
		lista.add(juego3);
		
		Videojuegos juegoEncot = null;
		
		juegoEncot = lista.get(1);
		System.out.println(juegoEncot);
		
		
		juegoEncot = lista.get(1);
		juegoEncot.setStock(20);
		lista.set(0, juegoEncot);
		System.out.println(lista);
		
		lista.remove(0);
		System.out.println(lista);*/
		
		
		
		

		
		
		
		
		
		
	}
}

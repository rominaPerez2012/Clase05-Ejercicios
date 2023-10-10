package Clase05Ejercicios;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

import Entidades.Carrito;
import Entidades.ItemCarrito;
import Entidades.Producto;

public class Ejercicio02 {
	
	public class GlobalInfo {
		public static int precioCarrito = 0;
	}

	public static void main(String[] args) {

		ItemCarrito[] itemCarrito = new ItemCarrito[3];		
		Carrito carrito = new Carrito();
		
		GlobalInfo.precioCarrito = 0;
		
		carrito.setFecha(LocalDate.now());
		
		for (int i = 0; i < itemCarrito.length; i++) {
			
			carrito.setItems(ArchivoProductos(i, itemCarrito.length));
															
			//System.out.println("Carrito: " + carrito.getFecha() + " - " + carrito.getItems().length);
		}
		
		System.out.println("El precio del carrito es: " + GlobalInfo.precioCarrito);

	}
	
	public static ItemCarrito[] ArchivoProductos(int posicion, int cantidad) {
		
		ItemCarrito[] item = new ItemCarrito[cantidad];

		Path pathDelArchivo = Paths.get("recursos/Archivo.csv");
		
		try {
				
			int i = 0;
			for (String linea : Files.readAllLines(pathDelArchivo)) {
				
				if (posicion == i) {
				
					item[posicion] = new ItemCarrito(Integer.parseInt(linea.split(",")[0]));
					Producto producto = new Producto(linea.split(",")[2], Integer.parseInt(linea.split(",")[1]));// .setNombre(linea.split(",")[2]);
				
					item[posicion].setProducto(producto);
					
					GlobalInfo.precioCarrito += item[posicion].precio();
					
//					System.out.println("Cantidad: " + linea.split(",")[0]);
//					System.out.println("Producto: " + linea.split(",")[2]);
//					System.out.println("Precio unitario: " + linea.split(",")[1]);
//					System.out.println("Precio carrito parcial: " + GlobalInfo.precioCarrito);
					
				}
				
				i++;
			}
			
		} catch (FileNotFoundException s) {
			System.out.println("El archivo no existe");
		}
		catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return item;
	}

}

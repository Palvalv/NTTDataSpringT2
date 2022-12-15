package spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import spring.repository.Order;
import spring.repository.Product;
import spring.services.changePvpI;

/**
 * MainAPP.
 */
@SpringBootApplication()
public class MainAPP implements CommandLineRunner {

	/** Servicio de la peninsula. */
	@Autowired
	@Qualifier("dentroPeninsula")
	private changePvpI dentroPeninsula;

	/** Servicio fuera de la peninsula */
	@Autowired
	@Qualifier("fueraPeninsula")
	private changePvpI fueraPeninsula;

	/**
	 * Main principal.
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(MainAPP.class, args);
	}

	public void run(String... args) throws Exception {

	/** Productos. */	
		Product producto1 = new Product(1, "manzana", 6);
		Product producto2 = new Product(2, "pera", 7);
		Product producto3 = new Product(3, "platano", 12);

	/** Pedidos. */
		Order pedido1 = new Order(1, "Yassine", "Sevilla", true);
		Order pedido2 = new Order(1, "Pejinho", "Las Palmas", false);

	/** Insertamos productos a pedidos. */	
		List<Product> listaProducto1 = new ArrayList<Product>();
		listaProducto1.add(producto1);
		listaProducto1.add(producto2);

		List<Product> listaProducto2 = new ArrayList<Product>();
		listaProducto2.add(producto3);

		pedido1.setListaProductos(listaProducto1);
		pedido2.setListaProductos(listaProducto2);

	/** Set precio posterior a impuestos. */	
		setPVP(pedido1);
		setPVP(pedido2);

	/** Exposicion del precio despues de impuestos. */	
		System.out.println("PVP Lista 1: ");
		for (Product p : pedido1.getListaProductos()) {
			System.out.println(p.getPrecioPVP());
		}
		
		System.out.println("PVP Lista 2: ");
		for (Product p : pedido2.getListaProductos()) {
			System.out.println(p.getPrecioPVP());
		}

	}

	/**
	 * Analiza listaProductos de un determinado pedido & Set de precios posterior a impuestos.
	 * @param pedido a revisar
	 */
	private void setPVP(Order order) {
		if (order.getLocalizacion()) {
			for (Product p : order.getListaProductos()) {
				dentroPeninsula.precioPvp(p);
			}
		} else {
			for (Product p : order.getListaProductos()) {
				fueraPeninsula.precioPvp(p);
			}
		}
	}
}

package spring.services;

import spring.repository.Product;

/**
 * Interfaz para los precios posterior a impuestos.
 */
public interface changePvpI {

	public void precioPvp(final Product product);

}

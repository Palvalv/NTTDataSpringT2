package spring.services;

import org.springframework.stereotype.Service;

import spring.repository.Product;

/**
 * Precio posterior a los impuestos en la peninsula.
 */
@Service("dentroPeninsula")
public class PeninsulaImpl implements changePvpI {

	private static final double IVA = 1.21;

	public void precioPvp(Product product) {
		product.setPrecioPVP(product.getPrecioSinImpuestos() * IVA);		
	}
	
}

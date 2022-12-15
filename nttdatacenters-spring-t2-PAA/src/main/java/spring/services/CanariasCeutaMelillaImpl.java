package spring.services;

import org.springframework.stereotype.Service;

import spring.repository.Product;

/**
 * Precio posterior a los impuestos fuera de la peninsula(Canarias, Ceuta y Melilla).
 */
@Service("fueraPeninsula")
public class CanariasCeutaMelillaImpl implements changePvpI {
	
	private static final double IPSI = 1.04;

	public void precioPvp(Product product) {
		product.setPrecioPVP(product.getPrecioSinImpuestos() * IPSI);		
	}


}

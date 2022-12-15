package spring.repository;

public class Product {
	
	/** productID */
	private int productID;
	
	/** nombre */
	private String nombre;
	
	/** precio PVP */
	private double precioPVP;
	
	/** precio sin impuestos */
	private double precioSinImpuestos;
	
	/** pedido asociado al producto */
	private Order order;
	
	/**
	 * Constructores
	 * @param productID
	 * @param nombre
	 * @param precioSinImpuestos
	 */
	public Product(int productID, String nombre, float precioSinImpuestos) {
		super();
		this.productID = productID;
		this.nombre = nombre;
		this.precioSinImpuestos = precioSinImpuestos;
	}
	
	/** Getters & Setters */
	
	public int getProductId() {
		return productID;
	}
	public void setProductId(int productID) {
		this.productID = productID;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecioPVP() {
		return precioPVP;
	}
	public void setPrecioPVP(double precioPVP) {
		this.precioPVP = precioPVP;
	}
	public double getPrecioSinImpuestos() {
		return precioSinImpuestos;
	}
	public void setPrecioSinImpuestos(double precioSinImpuestos) {
		this.precioSinImpuestos = precioSinImpuestos;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
}

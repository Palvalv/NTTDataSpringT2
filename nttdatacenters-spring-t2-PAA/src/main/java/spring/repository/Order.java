package spring.repository;

import java.util.List;

public class Order {

	/** orderID */
	private int orderID;
	
	/** receptor */
	private String receptor;
	
	/** direccion */
	private String direccion;
	
	/** localizacion (true=Peninsula, false=Canaria,Ceuta,Melilla) */
	private boolean localizacion;
	
	/** lista de productos */
	private List<Product> listaProductos;

	/**
	 * Constructores
	 * @param orderID
	 * @param receptor
	 * @param direccion
	 * @param localizacion
	 */
	public Order(int orderID, String receptor, String direccion, boolean localizacion) {
		super();
		this.orderID = orderID;
		this.receptor = receptor;
		this.direccion = direccion;
		this.localizacion = localizacion;
	}

	/** Getters & Setters */

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public String getReceptor() {
		return receptor;
	}

	public void setReceptor(String receptor) {
		this.receptor = receptor;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public boolean getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(boolean localizacion) {
		this.localizacion = localizacion;
	}

	public List<Product> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(List<Product> listaProductos) {
		this.listaProductos = listaProductos;
	}

}

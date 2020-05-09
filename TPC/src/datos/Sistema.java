package datos;

public class Sistema {
	private Sucursal lstSucursales;
	private Producto lstProductos;
	private Cliente lstClientes;
	private Venta lstVentas;
	
	public Sistema() {
		this.lstSucursales = lstSucursales;
		this.lstProductos = lstProductos;
		this.lstClientes = lstClientes;
		this.lstVentas = lstVentas;
	}

	public Sucursal getLstSucursales() {
		return lstSucursales;
	}

	public void setLstSucursales(Sucursal lstSucursales) {
		this.lstSucursales = lstSucursales;
	}

	public Producto getLstProductos() {
		return lstProductos;
	}

	public void setLstProductos(Producto lstProductos) {
		this.lstProductos = lstProductos;
	}

	public Cliente getLstClientes() {
		return lstClientes;
	}

	public void setLstClientes(Cliente lstClientes) {
		this.lstClientes = lstClientes;
	}

	public Venta getLstVentas() {
		return lstVentas;
	}

	public void setLstVentas(Venta lstVentas) {
		this.lstVentas = lstVentas;
	}

	@Override
	public String toString() {
		return "Sistema [lstSucursales=" + lstSucursales + ", lstProductos=" + lstProductos + ", lstClientes="
				+ lstClientes + ", lstVentas=" + lstVentas + "]";
	}
	
	

}

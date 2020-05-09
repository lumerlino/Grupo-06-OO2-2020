package datos;

public class Pedido {
	private long idPedido;
	private int cantidad;
	private boolean aceptado;
	private Producto producto;
	private Vendedor vendedorAuxiliar;
	
	public Pedido() {}
	
	public Pedido(int cantidad, boolean aceptado, Producto producto, Vendedor vendedorAuxiliar) {
		super();
		this.cantidad = cantidad;
		this.aceptado = aceptado;
		this.producto = producto;
		this.vendedorAuxiliar = vendedorAuxiliar;
	}

	public long getIdPedido() {
		return idPedido;
	}

	protected void setIdPedido(long idPedido) {
		this.idPedido = idPedido;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public boolean isAceptado() {
		return aceptado;
	}

	public void setAceptado(boolean aceptado) {
		this.aceptado = aceptado;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Vendedor getVendedorAuxiliar() {
		return vendedorAuxiliar;
	}

	public void setVendedorAuxiliar(Vendedor vendedorAuxiliar) {
		this.vendedorAuxiliar = vendedorAuxiliar;
	}

	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", cantidad=" + cantidad + ", aceptado=" + aceptado + ", producto="
				+ producto + "]";
	}
	
	

}

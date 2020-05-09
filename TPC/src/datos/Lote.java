package datos;

import java.time.LocalDate;

public class Lote {
	private long idLote;
	private int cantidad;
	private int cantidadTotal;
	private LocalDate fechaIngreso;
	private Producto producto;
	
	public Lote() {}
	
	public Lote(int cantidad, int cantidadTotal, LocalDate fechaIngreso, Producto producto) {
		super();
		this.cantidad = cantidad;
		this.cantidadTotal = cantidadTotal;
		this.fechaIngreso = fechaIngreso;
		this.producto = producto;
	}

	public long getIdLote() {
		return idLote;
	}

	protected void setIdLote(long idLote) {
		this.idLote = idLote;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getCantidadTotal() {
		return cantidadTotal;
	}

	public void setCantidadTotal(int cantidadTotal) {
		this.cantidadTotal = cantidadTotal;
	}

	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "Lote [idLote=" + idLote + ", cantidad=" + cantidad + ", cantidadTotal=" + cantidadTotal
				+ ", fechaIngreso=" + fechaIngreso + ", producto=" + producto + "]";
	}
	
	

}

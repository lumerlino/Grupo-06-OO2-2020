package datos;

import java.time.LocalDate;

public class Producto {
	private long idProducto;
	private boolean estado;
	private String descripcion;
	private float precioUnitario;
	private LocalDate fechaAlta;
	private String marca;
	
	public Producto() {}
	
	public Producto(boolean estado, String descripcion, float precioUnitario, LocalDate fechaAlta, String marca) {
		super();
		this.estado = estado;
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
		this.fechaAlta = fechaAlta;
		this.marca = marca;
	}

	public long getIdProducto() {
		return idProducto;
	}
	protected void setIdProducto(long idProducto) {
		this.idProducto = idProducto;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public float getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(float precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public LocalDate getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", estado=" + estado + ", descripcion=" + descripcion
				+ ", precioUnitario=" + precioUnitario + ", fechaAlta=" + fechaAlta + ", marca=" + marca + "]";
	}

}

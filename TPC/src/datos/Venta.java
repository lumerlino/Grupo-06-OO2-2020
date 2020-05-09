package datos;

import java.time.LocalDate;
import java.time.LocalTime;

public class Venta {
	private long idVenta;
	private int nroVenta;
	private LocalDate fecha;
	private LocalTime hora;
	private float precioTotal;
	private Vendedor vendedorEncargado;
	private Cliente cliente;
	private Pedido lstPedidos;
	
	public Venta() {}
	
	public Venta(int nroVenta, LocalDate fecha, LocalTime hora, float precioTotal, Vendedor vendedorEncargado,
			Cliente cliente, Pedido lstPedidos) {
		super();
		this.nroVenta = nroVenta;
		this.fecha = fecha;
		this.hora = hora;
		this.precioTotal = precioTotal;
		this.vendedorEncargado = vendedorEncargado;
		this.cliente = cliente;
		this.lstPedidos = lstPedidos;
	}

	public long getIdVenta() {
		return idVenta;
	}

	protected void setIdVenta(long idVenta) {
		this.idVenta = idVenta;
	}

	public int getNroVenta() {
		return nroVenta;
	}

	public void setNroVenta(int nroVenta) {
		this.nroVenta = nroVenta;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public float getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(float precioTotal) {
		this.precioTotal = precioTotal;
	}

	public Vendedor getVendedorEncargado() {
		return vendedorEncargado;
	}

	public void setVendedorEncargado(Vendedor vendedorEncargado) {
		this.vendedorEncargado = vendedorEncargado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Pedido getLstPedidos() {
		return lstPedidos;
	}

	public void setLstPedidos(Pedido lstPedidos) {
		this.lstPedidos = lstPedidos;
	}

	@Override
	public String toString() {
		return "Venta [idVenta=" + idVenta + ", nroVenta=" + nroVenta + ", fecha=" + fecha + ", hora=" + hora
				+ ", precioTotal=" + precioTotal + ", vendedorEncargado=" + vendedorEncargado + ", cliente=" + cliente
				+ ", lstPedidos=" + lstPedidos + "]";
	}
	
	
	
	
	
	

}

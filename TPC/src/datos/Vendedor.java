package datos;

import java.time.LocalDate;
import java.time.LocalTime;

public class Vendedor extends Empleado{
	private long idVendedor;
	private float plus;
	private Sucursal sucursal;
	
	public Vendedor() {}
	
	public Vendedor(String apellido, String nombre, long dni, LocalDate fechaDeNacimiento, LocalTime horasPorJornada, float sueldoBasico,
			float plus, Sucursal sucursal) {
		super(apellido, nombre, dni, fechaDeNacimiento, horasPorJornada, sueldoBasico);
		this.plus = plus;
		this.sucursal = sucursal;
		
	}

	public long getIdVendedor() {
		return idVendedor;
	}

	protected void setIdVendedor(long idVendedor) {
		this.idVendedor = idVendedor;
	}

	public float getPlus() {
		return plus;
	}

	public void setPlus(float plus) {
		this.plus = plus;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	@Override
	public String toString() {
		return "Vendedor [idVendedor=" + idVendedor + ", plus=" + plus + "]";
	}
	
	

}

package datos;

import java.time.LocalDate;
import java.time.LocalTime;

public class Empleado extends Persona{
	private long idEmpleado;
	private LocalTime horasPorJornada;
	private float sueldoBasico;
	
	public Empleado() {}
	
	public Empleado(String apellido, String nombre, long dni, LocalDate fechaDeNacimiento, LocalTime horasPorJornada, float sueldoBasico) {
		super(apellido, nombre, dni, fechaDeNacimiento);
		this.horasPorJornada = horasPorJornada;
		this.sueldoBasico = sueldoBasico;
	}

	public long getIdEmpleado() {
		return idEmpleado;
	}

	protected void setIdEmpleado(long idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public LocalTime getHorasPorJornada() {
		return horasPorJornada;
	}

	public void setHorasPorJornada(LocalTime horasPorJornada) {
		this.horasPorJornada = horasPorJornada;
	}

	public float getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(float sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}

	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", horasPorJornada=" + horasPorJornada + ", sueldoBasico="
				+ sueldoBasico + "]";
	}
	
	
	
	

}

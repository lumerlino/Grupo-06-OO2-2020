package datos;

import java.time.LocalDate;
import java.time.LocalTime;

public class Gerente extends Empleado{
	private long idGerente;

	public Gerente() {}

	public Gerente(String apellido, String nombre, long dni, LocalDate fechaDeNacimiento, LocalTime horasPorJornada,
			float sueldoBasico) {
		super(apellido, nombre, dni, fechaDeNacimiento, horasPorJornada, sueldoBasico);
	}

	public long getIdGerente() {
		return idGerente;
	}

	protected void setIdGerente(long idGerente) {
		this.idGerente = idGerente;
	}

	@Override
	public String toString() {
		return "Gerente [idGerente=" + idGerente + "]";
	}
	
	

}

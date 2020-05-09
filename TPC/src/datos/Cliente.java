package datos;

import java.time.LocalDate;

public class Cliente extends Persona{
	private long idCliente;
	private String email;
	
	public Cliente() {}
	
	public Cliente(String apellido, String nombre, long dni, LocalDate fechaDeNacimiento, String email) {
		super(apellido, nombre, dni, fechaDeNacimiento);
		this.email = email;
	}

	public long getIdCliente() {
		return idCliente;
	}

	protected void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", email=" + email + "]";
	}
	
	

}

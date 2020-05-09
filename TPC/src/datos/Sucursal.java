package datos;

public class Sucursal {
	private long idSucursal;
	private long telefono;
	private Gerente gerente;
	private Vendedor lstVendedores;
	private Direccion direccion;
	private Lote lstLote;
	
	public Sucursal() {}
	
	public Sucursal(long telefono, Gerente gerente, Vendedor lstVendedores, Direccion direccion, Lote lstLote) {
		super();
		this.telefono = telefono;
		this.gerente = gerente;
		this.lstVendedores = lstVendedores;
		this.direccion = direccion;
		this.lstLote = lstLote;
	}

	public long getIdSucursal() {
		return idSucursal;
	}

	protected void setIdSucursal(long idSucursal) {
		this.idSucursal = idSucursal;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	public Gerente getGerente() {
		return gerente;
	}

	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}

	public Vendedor getLstVendedores() {
		return lstVendedores;
	}

	public void setLstVendedores(Vendedor lstVendedores) {
		this.lstVendedores = lstVendedores;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public Lote getLstLote() {
		return lstLote;
	}

	public void setLstLote(Lote lstLote) {
		this.lstLote = lstLote;
	}

	@Override
	public String toString() {
		return "Sucursal [idSucursal=" + idSucursal + ", telefono=" + telefono + ", gerente=" + gerente
				+ ", lstVendedores=" + lstVendedores + "]";
	}
	
	

}

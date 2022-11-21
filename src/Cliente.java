
public class Cliente {
	
	private String nombre;
	private String documento;
	private String telefono;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public Cliente getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(String Agencia) {
		this.agencia = agencia;
	}
	
	
}

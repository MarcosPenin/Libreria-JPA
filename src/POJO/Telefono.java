package POJO;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Telefono")
public class Telefono {
	@Id
	@Column(name = "dniAutor")
	private String dniAutor;

	public String getDniAutor() {
		return dniAutor;
	}

	public Telefono() {
	}

	public Telefono(String dniAutor, String numeroTelefono) {
		this.dniAutor = dniAutor;
		this.numeroTelefono = numeroTelefono;
	}

	public void setDniAutor(String dniAutor) {
		this.dniAutor = dniAutor;
	}

	public String getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	@Column(name = "numeroTelefono")
	private String numeroTelefono;

}

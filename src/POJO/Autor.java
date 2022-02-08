package POJO;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

	@Entity
	@Table(name="Autor")
	public class Autor {
	    @Id
	    @Column(name="dniAutor")
	    private String dniAutor;
	    
	    @Column(name="nombre")
	    private String nombre;
	    
	    @Column(name="nacionalidad")
	    private String nacionalidad;
	    
	    @OneToOne(cascade=CascadeType.ALL)
	    @PrimaryKeyJoinColumn
	    private Telefono telefono;
	    
	    @ManyToMany(cascade = {CascadeType.ALL},mappedBy="modulos")
	    private Set<Libro> libros=new HashSet();
         
		public Autor(){ 
	    }

	    public Autor(String dniAutor, String nombre, String nacionalidad) {
	        this.dniAutor=dniAutor;
	        this.nombre=nombre;
	        this.nacionalidad=nacionalidad;
	    }

		public String getDniAutor() {
			return dniAutor;
		}

		public void setDniAutor(String dniAutor) {
			this.dniAutor = dniAutor;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getNacionalidad() {
			return nacionalidad;
		}

		public void setNacionalidad(String nacionalidad) {
			this.nacionalidad = nacionalidad;
		}
	    
	    public Telefono getTelefono() {
				return telefono;
			}

			public void setTelefono(Telefono telefono) {
				this.telefono = telefono;
			}

			public Set<Libro> getLibros() {
				return libros;
			}

			public void setLibros(Set<Libro> libros) {
				this.libros = libros;
			}
		
		
	}
	    
	    
	    
	    

	  
package POJO;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name="Libro")
public class Libro {

    @Id
    @GeneratedValue
    private int idLibro;
    
    private String titulo;
    
    private double precio;
    
    @ManyToMany(cascade = {CascadeType.ALL},fetch=FetchType.EAGER)
    @JoinTable(name="Autor_Libro", joinColumns={@JoinColumn(name="idLibro")}, inverseJoinColumns={@JoinColumn(name="dniAutor")})
    private Set<Autor> autores=new HashSet();
         
	public Libro(){ 
    }

    public Libro(String titulo, double precio) {
        this.titulo = titulo;
        this.precio = precio;
    }

    public int getId() {
        return idLibro;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public Set<Autor> getAutores() {
		return autores;
	}

	public void setAutores(Set<Autor> autores) {
		this.autores = autores;
	}
    

	public String toString() {
		return titulo;
	}
	
	

}

	
	
	
	
	
	
	
	
	
	
	


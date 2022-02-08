package POJO;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="Libro")
public class Libro {

    @Id
    @Column(name="IdLibro")
    private int idLibro;
    
    @Column(name="titulo")
    private String titulo;
    
    @Column(name="precio")
    private double precio;
    
    @ManyToMany(cascade = {CascadeType.ALL},mappedBy="modulos")
    private Set<Autor> autores=new HashSet();
         


	public Libro(){ 
    }

    public Libro(int idLibro, String titulo, double precio) {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.precio = precio;
    }

    public int getId() {
        return idLibro;
    }

    public void setId(int idLibro) {
        this.idLibro = idLibro;
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
    


}

	
	
	
	
	
	
	
	
	
	
	


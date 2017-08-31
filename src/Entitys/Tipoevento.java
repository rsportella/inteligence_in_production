package Entitys;
// Generated 31/08/2017 09:53:48 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Tipoevento generated by hbm2java
 */
@Entity
@Table(name="tipoevento"
    ,schema="public"
)
public class Tipoevento  implements java.io.Serializable {


     private int codigo;
     private String nome;
     private String descricao;
     private Set<Evento> eventos = new HashSet<Evento>(0);

    public Tipoevento() {
    }

	
    public Tipoevento(int codigo) {
        this.codigo = codigo;
    }
    public Tipoevento(int codigo, String nome, String descricao, Set<Evento> eventos) {
       this.codigo = codigo;
       this.nome = nome;
       this.descricao = descricao;
       this.eventos = eventos;
    }
   
     @Id 

    
    @Column(name="codigo", unique=true, nullable=false)
    public int getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    
    @Column(name="nome", length=75)
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    @Column(name="descricao", length=150)
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tipoevento")
    public Set<Evento> getEventos() {
        return this.eventos;
    }
    
    public void setEventos(Set<Evento> eventos) {
        this.eventos = eventos;
    }




}



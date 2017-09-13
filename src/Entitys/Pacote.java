package Entitys;
// Generated 13/09/2017 17:03:39 by Hibernate Tools 4.3.1

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Pacote generated by hbm2java
 */
@Entity
@Table(name = "pacote",
        schema = "public"
)
public class Pacote implements java.io.Serializable {

    private int codigo;
    private String titulo;
    private String descricao;
    private BigDecimal descobnto;

    public Pacote() {
    }

    public Pacote(int codigo) {
        this.codigo = codigo;
    }

    public Pacote(int codigo, String titulo, String descricao, BigDecimal descobnto) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.descricao = descricao;
        this.descobnto = descobnto;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo", unique = true, nullable = false)
    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Column(name = "titulo", length = 75)
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Column(name = "descricao")
    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Column(name = "descobnto", precision = 5)
    public BigDecimal getDescobnto() {
        return this.descobnto;
    }

    public void setDescobnto(BigDecimal descobnto) {
        this.descobnto = descobnto;
    }

}

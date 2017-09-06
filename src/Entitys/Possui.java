package Entitys;
// Generated 05/09/2017 21:55:14 by Hibernate Tools 4.3.1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Possui generated by hbm2java
 */
@Entity
@Table(name = "possui",
         schema = "public"
)
public class Possui implements java.io.Serializable {

    private PossuiId id;
    private Endereco endereco;
    private Pessoa pessoa;
    private Tipoendereco tipoendereco;

    public Possui() {
    }

    public Possui(PossuiId id, Endereco endereco, Pessoa pessoa, Tipoendereco tipoendereco) {
        this.id = id;
        this.endereco = endereco;
        this.pessoa = pessoa;
        this.tipoendereco = tipoendereco;
    }

    @EmbeddedId

    @AttributeOverrides({
        @AttributeOverride(name = "idcliente", column = @Column(name = "idcliente", nullable = false))
        , 
        @AttributeOverride(name = "idendereco", column = @Column(name = "idendereco", nullable = false))})
    public PossuiId getId() {
        return this.id;
    }

    public void setId(PossuiId id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idendereco", nullable = false, insertable = false, updatable = false)
    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idcliente", nullable = false, insertable = false, updatable = false)
    public Pessoa getPessoa() {
        return this.pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tipoendereco", nullable = false)
    public Tipoendereco getTipoendereco() {
        return this.tipoendereco;
    }

    public void setTipoendereco(Tipoendereco tipoendereco) {
        this.tipoendereco = tipoendereco;
    }

}
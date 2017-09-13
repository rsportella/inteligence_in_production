package Entitys;
// Generated 13/09/2017 20:17:35 by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Equipe generated by hbm2java
 */
@Entity
@Table(name = "equipe",
        schema = "public"
)
public class Equipe implements java.io.Serializable {

    private int codigo;
    private Pessoa pessoa;
    private String titulo;
    private String descricao;
    private Set<PacotePossuiServico> pacotePossuiServicos = new HashSet<PacotePossuiServico>(0);
    private Set<Servico> servicos = new HashSet<Servico>(0);

    public Equipe() {
    }

    public Equipe(int codigo) {
        this.codigo = codigo;
    }

    public Equipe(int codigo, Pessoa pessoa, String titulo, String descricao, Set<PacotePossuiServico> pacotePossuiServicos, Set<Servico> servicos) {
        this.codigo = codigo;
        this.pessoa = pessoa;
        this.titulo = titulo;
        this.descricao = descricao;
        this.pacotePossuiServicos = pacotePossuiServicos;
        this.servicos = servicos;
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "responsavel")
    public Pessoa getPessoa() {
        return this.pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "equipe")
    public Set<PacotePossuiServico> getPacotePossuiServicos() {
        return this.pacotePossuiServicos;
    }

    public void setPacotePossuiServicos(Set<PacotePossuiServico> pacotePossuiServicos) {
        this.pacotePossuiServicos = pacotePossuiServicos;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "equipe")
    public Set<Servico> getServicos() {
        return this.servicos;
    }

    public void setServicos(Set<Servico> servicos) {
        this.servicos = servicos;
    }

}

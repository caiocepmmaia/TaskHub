package models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.time.LocalDate;
@Entity
@Table(name = "tarefa")
public class Tarefa {
    private int id;
    private String nome;
    private String propriedade;
    private LocalDate dataVencimeno;
    private String status;
    private LocalDate dataConclusao;

    @ManyToOne
    @JoinColumn(name = "id_projeto")
    private Projeto projeto;
    @ManyToOne
    @JoinColumn(name = "id_responsavel")
    private User responsavel;


    public Tarefa(int id, String nome, String propriedade, LocalDate dataVencimeno, String status, LocalDate dataConclusao, Projeto projeto, User responsavel) {
        this.id = id;
        this.nome = nome;
        this.propriedade = propriedade;
        this.dataVencimeno = dataVencimeno;
        this.status = status;
        this.dataConclusao = dataConclusao;
        this.projeto = projeto;
        this.responsavel = responsavel;
    }
}

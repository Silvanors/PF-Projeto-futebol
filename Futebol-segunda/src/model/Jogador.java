package model;

import java.util.Objects;

public class Jogador {
    //atributos
    int id;

    String nome;

    int golMarcado;
    //construtor;

    public Jogador(int id, String nome, int golMarcado) {
        this.nome = nome;
        this.golMarcado = golMarcado;
        this.id = id;
    }

    //equals() and hashCode()

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jogador jogador = (Jogador) o;
        return golMarcado == jogador.golMarcado && Objects.equals(nome, jogador.nome);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nome, golMarcado);
    }

    //getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Jogador(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getGolMarcado() {
        return golMarcado;
    }

    public void setGolMarcado(int golMarcado) {
        this.golMarcado = golMarcado;
    }

    //To string

    @Override
    public String toString() {
        return "Jogador{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", golMarcado=" + golMarcado +
                '}';
    }
}

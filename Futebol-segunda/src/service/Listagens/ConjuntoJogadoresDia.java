package service.Listagens;

import model.Jogador;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

public class ConjuntoJogadoresDia {
    //atributo
    private Set<Jogador> jogadorSet;
    Date data;

    //construtor
    public ConjuntoJogadoresDia() {
        this.jogadorSet = new LinkedHashSet<>();
    }

    public ConjuntoJogadoresDia(Date data) {
        this.data = data;
    }

    public void adicionarJogador(int id, String nome, int golMarcado) {
        jogadorSet.add(new Jogador(id, nome, golMarcado));
    }

    public Set<Jogador> criarListaAutomaticaDoDia(){
        Set<Jogador> listaListaAutomaticaDoDia = new LinkedHashSet<>();
        int numeroMaximoDaLista = 23;
        int jogadores = 0;
        int numero = 0;
        String nomeLista = "Jogador"+ jogadores;
        while (jogadores <= numeroMaximoDaLista){
            listaListaAutomaticaDoDia.add(new Jogador(numero, nomeLista, 0));
            jogadores++;
            numero++;
            //System.out.println(listaListaAutomaticaDoDia);

        }
        return listaListaAutomaticaDoDia;
    }

    public void exibirListaJogadores(){
        System.out.println(jogadorSet);
    }

    @Override
    public String toString() {
        return "ConjuntoJogadoresDia{" +
                "jogadorSet=" + jogadorSet +
                ", data=" + data +
                '}';
    }
}

import service.Listagens.ConjuntoJogadoresDia;

public class MesaOrganizadora {
    public static void main(String[] args) {
        ConjuntoJogadoresDia conjuntoJogadoresDia = new ConjuntoJogadoresDia();

        System.out.println("Lista dos 25 jogadores do dia!!!");
        conjuntoJogadoresDia.criarListaAutomaticaDoDia();
        conjuntoJogadoresDia.exibirListaJogadores();
        conjuntoJogadoresDia.adicionarJogador(10,"silvano",0);


    }
}
public class Aluno {
    String nome;
    int idade;
    String tipoVeiculo;
    int aulasTeoricas;
    int aulasPraticas;
    boolean aprovado;

    void agendarAulaTeorica() {
        aulasTeoricas++;
    }

    void agendarAulaPratica() {
        aulasPraticas++;
    }

    // Método para colocar quantas aulas foram agendadas e evitar repetição de codigo na Main
    void agendarAulas(int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            agendarAulaPratica();
            agendarAulaTeorica();
        }
    }

    void cancelarAulaTeorica() {
        if (aulasTeoricas > 0) {
            aulasTeoricas--;
        }
    }

    void cancelarAulaPratica() {
        if (aulasPraticas > 0) {
            aulasPraticas--;
        }
    }
}
import java.util.Random;

public class Aluno {
    String nome;
    int idade;
    String tipoVeiculo;
    int aulasTeoricas;
    int aulasPraticas;
    boolean aprovado;

    Instrutor instrutor;

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

    void realizarExame() {
        if (aulasTeoricas >= 5 && aulasPraticas >= 5) {
            Random random = new Random();
            aprovado = random.nextBoolean();
            System.out.println("O aluno(a) " + nome + " possui o total de aulas necessárias e poderá realizar o exame!");
        } else {
            System.out.println("O aluno(a) " + nome + " não possui o total de aulas necessárias e não poderá realizar o exame!");
        }
    }
}
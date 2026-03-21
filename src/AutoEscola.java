import java.util.ArrayList;
import java.util.List;

public class AutoEscola {
    private List<Aluno> alunos = new ArrayList<>();

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    void exibirResumo() {
        System.out.println("\n======= RESUMO FINAL DOS ALUNOS =======");

        for (Aluno a : alunos) {
            int total = a.aulasTeoricas + a.aulasPraticas;

            System.out.println("Nome: " + a.nome +
                    " | Idade: " + a.idade +
                    " | Aulas Feitas: " + total);

        }
    }
}

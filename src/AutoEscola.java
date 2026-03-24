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
                    " | Aulas Feitas: " + total +
                    " | Veículo a ser utilizado: " + a.veiculo.modelo +
                    " | Placa do veículo: " + a.veiculo.placa +
                    " | Instrutor: " + a.instrutor.nome +
                    " | Experiência do instrutor: " + a.instrutor.experiencia + " anos - (" + a.instrutor.categoria + ")" +
                    " | " + (a.aulasTeoricas >= 5 && a.aulasPraticas >= 5
                    ? "Status: " + (a.aprovado ? "Aprovado" : "Reprovado")
                    : "Status: Não realizou o exame"));

        }
    }
}

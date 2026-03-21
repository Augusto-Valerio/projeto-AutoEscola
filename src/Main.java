public class Main {
    public static void main(String[] args) {
        System.out.println("======= AUTO ESCOLA =======");

        Aluno aluno1 = new Aluno();

        System.out.println("\n======= PROCESSO DO ALUNO(A) JONAS =======");
        aluno1.nome = "Jonas";
        aluno1.tipoVeiculo = "Carro";
        aluno1.idade = 20;

        aluno1.agendarAulas(6);

        aluno1.cancelarAulaTeorica();
        aluno1.realizarExame();

        Aluno aluno2 = new Aluno();
        System.out.println("\n======= PROCESSO DO ALUNO(A) VITOR TIGRE =======");
        aluno2.nome = "Vitor Tigre";
        aluno2.tipoVeiculo = "Moto";
        aluno2.idade = 18;

        aluno2.agendarAulas(5);

        aluno2.cancelarAulaPratica();
        aluno2.realizarExame();

        Aluno aluno3 = new Aluno();
        System.out.println("\n======= PROCESSO DO ALUNO(A) MARIANA =======");
        aluno3.nome = "Mariana";
        aluno3.tipoVeiculo = "Moto";
        aluno3.idade = 19;

        aluno3.agendarAulas(9);

        aluno3.cancelarAulaPratica();
        aluno3.cancelarAulaTeorica();
        aluno3.realizarExame();

        Aluno aluno4 = new Aluno();
        System.out.println("\n======= PROCESSO DO ALUNO(A) VALERIO =======");
        aluno4.nome = "Valerio";
        aluno4.tipoVeiculo = "Carro";
        aluno4.idade = 19;

        aluno4.agendarAulas(7);

        aluno4.cancelarAulaTeorica();
        aluno4.realizarExame();
    }
}

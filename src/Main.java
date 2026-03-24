public class Main {
    public static void main(String[] args) {
        System.out.println("======= AUTO ESCOLA =======");

        // Instrutores
        Instrutor instrutor1 = new Instrutor();
        instrutor1.nome = "Messi";
        instrutor1.experiencia = 6;
        instrutor1.categoria = "Moto";

        Instrutor instrutor2 = new Instrutor();
        instrutor2.nome = "Neymar";
        instrutor2.experiencia = 4;
        instrutor2.categoria = "Carro";

        // Veículos
        Veiculo veiculo1 = new Veiculo();
        veiculo1.tipo = "Moto";
        veiculo1.modelo = "Hornet";
        veiculo1.placa = "XYZ4567";

        Veiculo veiculo2 = new Veiculo();
        veiculo2.tipo = "Carro";
        veiculo2.modelo = "HB20";
        veiculo2.placa = "LSN4149";

        Aluno aluno1 = new Aluno();

        System.out.println("\n======= PROCESSO DO ALUNO(A) JONAS =======");
        aluno1.nome = "Jonas";
        aluno1.tipoVeiculo = "Carro";
        aluno1.idade = 20;
        aluno1.instrutor = instrutor2;
        aluno1.veiculo = veiculo2;

        aluno1.agendarAulas(6);

        aluno1.cancelarAulaTeorica();
        aluno1.realizarExame();

        Aluno aluno2 = new Aluno();
        System.out.println("\n======= PROCESSO DO ALUNO(A) VITOR TIGRE =======");
        aluno2.nome = "Vitor Tigre";
        aluno2.tipoVeiculo = "Moto";
        aluno2.idade = 18;
        aluno2.instrutor = instrutor1;
        aluno2.veiculo = veiculo1;

        aluno2.agendarAulas(5);

        aluno2.cancelarAulaPratica();
        aluno2.realizarExame();

        Aluno aluno3 = new Aluno();
        System.out.println("\n======= PROCESSO DO ALUNO(A) MARIANA =======");
        aluno3.nome = "Mariana";
        aluno3.tipoVeiculo = "Moto";
        aluno3.idade = 19;
        aluno3.instrutor = instrutor1;
        aluno3.veiculo = veiculo1;

        aluno3.agendarAulas(9);

        aluno3.cancelarAulaPratica();
        aluno3.cancelarAulaTeorica();
        aluno3.realizarExame();

        Aluno aluno4 = new Aluno();
        System.out.println("\n======= PROCESSO DO ALUNO(A) VALERIO =======");
        aluno4.nome = "Valerio";
        aluno4.tipoVeiculo = "Carro";
        aluno4.instrutor = instrutor2;
        aluno4.idade = 19;
        aluno4.veiculo = veiculo2;

        aluno4.agendarAulas(7);

        aluno4.cancelarAulaTeorica();
        aluno4.realizarExame();

        // Auto Escola
        AutoEscola autoEscola = new AutoEscola();
        autoEscola.adicionarAluno(aluno1);
        autoEscola.adicionarAluno(aluno2);
        autoEscola.adicionarAluno(aluno3);
        autoEscola.adicionarAluno(aluno4);

        autoEscola.exibirResumo();
    }
}

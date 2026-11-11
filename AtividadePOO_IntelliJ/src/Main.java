public class Main {
    public static void main(String[] args) {
        // Exercício 1: Carro
        System.out.println("--- Exercício 1: Carro ---");
        Carro carro = new Carro();
        carro.marca = "Fiat";
        carro.modelo = "Uno";
        carro.velocidade = 0.0;
        carro.acelerar();
        carro.acelerar();
        carro.exibirDados(); // esperado: 20.0

        // Exercício 2: Lampada
        System.out.println("--- Exercício 2: Lampada ---");
        Lampada lampada = new Lampada();
        lampada.comodo = "Cozinha";
        lampada.estaLigada = false;
        lampada.observar();
        lampada.ligar();
        lampada.observar();

        // Exercício 3: ContaBancaria
        System.out.println("--- Exercício 3: ContaBancaria ---");
        ContaBancaria conta = new ContaBancaria();
        conta.titular = "Carlos";
        conta.saldo = 100.0;
        conta.depositar(50.0);
        conta.sacar(30.0);
        conta.consultarSaldo(); // esperado: 120.0

        // Exercício 4: Retangulo
        System.out.println("--- Exercício 4: Retangulo ---");
        Retangulo ret = new Retangulo();
        ret.base = 5.0;
        ret.altura = 3.0;
        System.out.println("Área: " + ret.calcularArea());           // esperado: 15.0
        System.out.println("Perímetro: " + ret.calcularPerimetro()); // esperado: 16.0

        // Exercício 5: Aluno
        System.out.println("--- Exercício 5: Aluno ---");
        Aluno aluno = new Aluno();
        aluno.nome = "Marina";
        aluno.nota1 = 8.0;
        aluno.nota2 = 6.0;
        System.out.println("Média: " + aluno.calcularMedia()); // esperado: 7.0
        aluno.verificarSituacao();                             // esperado: Aprovado
    }
}

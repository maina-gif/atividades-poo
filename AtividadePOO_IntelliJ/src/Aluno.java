public class Aluno {
    public String nome;
    public double nota1;
    public double nota2;

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public void verificarSituacao() {
        double media = calcularMedia();
        if (media >= 7.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}

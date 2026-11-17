package Aluno;

public class Aluno {
    public String nome;
    public double nota1;
    public double nota2;

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public void verificarSituacao() {
        double media = calcularMedia();
        System.out.println("Aluno: " + nome + " | Média: " + media);

        if (media >= 7.0) {
            System.out.println("Situação: Aprovado");
        } else {
            System.out.println("Situação: Reprovado");
        }
    }
}

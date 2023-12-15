import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        float numeroUm = 0.0f;
        float numeroDois = 0.0f;

        System.out.println("Digite um Número: ");
        numeroUm = entrada.nextFloat();

        System.out.println("Digite um Número: ");
        numeroDois = entrada.nextFloat();

        Operacoes.soma(numeroUm,numeroDois);
        Operacoes.substracao(numeroUm,numeroDois);
        Operacoes.multiplicacao(numeroUm,numeroDois);
        Operacoes.divisao(numeroUm,numeroDois);
        entrada.close();




    }
}

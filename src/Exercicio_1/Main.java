package Exercicio_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do empréstimo: ");
        String emprestimo = sc.nextLine();
        emprestimo = emprestimo.replace(',', '.');
        double valorEmprestimo = Double.parseDouble(emprestimo);

        System.out.println("Digite a taxa de juros do empréstimo:");
        String juros = sc.nextLine();
        juros = juros.replace(',', '.');
        double taxaDeJuros = Double.parseDouble(juros)/100;

        System.out.println("Digite o tempo para pagamento: ");
        int tempoPagamento = sc.nextInt();
        sc.close();

        double amortizacao = valorEmprestimo / tempoPagamento;
        double saldoDevedorAtual = valorEmprestimo;
        double jurosMensal = saldoDevedorAtual * taxaDeJuros;
        double parcelaMensal = jurosMensal+ amortizacao;
        double jurosTotal = jurosMensal;

        System.out.printf("Valor fixo da amortização R$ %.2f, Saldo devedor total R$ %.2f com juros de %.2f ao mês\n", amortizacao, valorEmprestimo, taxaDeJuros);

        for (int i = 0; i < tempoPagamento; ++i) {
            System.out.printf("Parcela [%d] | Juros: R$ %.2f | Prestação: R$ %.2f | Saldo Devedor: R$ %.2f\n" , i+1, jurosMensal , parcelaMensal, saldoDevedorAtual);
            saldoDevedorAtual = saldoDevedorAtual - amortizacao;
            jurosMensal = saldoDevedorAtual * taxaDeJuros;
            parcelaMensal = jurosMensal + amortizacao;
            jurosTotal += jurosMensal;
        }
        System.out.printf("Total: Prestação R$ %.2f, Juros R$ %.2f, Amortização R$ %.2f\n" , (valorEmprestimo + jurosTotal), jurosTotal, valorEmprestimo);
    }
}

package Exercicio_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a temperatura:");
        String temperatura = sc.nextLine();
        temperatura = temperatura.replace(',', '.');
        double temperaturaValor = Double.parseDouble(temperatura);

        System.out.println("Qual a unidade de origem dessa temperatura ?");
        String origemTemperatura = sc.nextLine();

        System.out.println("Qual a unidade de origem destino temperatura ?");
        String destinoTemperatura = sc.nextLine();
        sc.close();

        double resultado = 0.0;

        if (origemTemperatura.equals("C") && destinoTemperatura.equals("F")){
            resultado = ((temperaturaValor) / ((double)5/9)) + 32;
            System.out.printf("%.2f %s = %.2f %s%n", temperaturaValor, origemTemperatura, resultado, destinoTemperatura);

        } else if (origemTemperatura.equals("C") && destinoTemperatura.equals("K")){
            resultado = temperaturaValor + 273.15;
            System.out.printf("%.2f %s = %.2f %s%n", temperaturaValor, origemTemperatura, resultado, destinoTemperatura);

        } else if (origemTemperatura.equals("F") && destinoTemperatura.equals("C")){
            resultado = ((temperaturaValor - 32) / ((double)9/5));
            System.out.printf("%.2f %s = %.2f %s%n", temperaturaValor, origemTemperatura, resultado, destinoTemperatura);

        } else if (origemTemperatura.equals("F") && destinoTemperatura.equals("K")){
            resultado = ((temperaturaValor + 459.67) * ((double)5/9));
            System.out.printf("%.2f %s = %.2f %s%n", temperaturaValor, origemTemperatura, resultado, destinoTemperatura);

        } else if (origemTemperatura.equals("K") && destinoTemperatura.equals("C")){
            resultado = temperaturaValor - 273.15 ;
            System.out.printf("%.2f %s = %.2f %s%n", temperaturaValor, origemTemperatura, resultado, destinoTemperatura);

        } else if (origemTemperatura.equals("K") && destinoTemperatura.equals("F")){
            resultado = ((double)9/5) * (temperaturaValor - 273.15) + 32;
            System.out.printf("%.2f %s = %.2f %s%n", temperaturaValor, origemTemperatura, resultado, destinoTemperatura);

        } else {
            System.out.println("A entrada especificada não é válida.");
        }
    }
}
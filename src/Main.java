import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1,num2,soma,subtracao,multiplicacao,divisao;

        System.out.println("Primeiro Numero:");
        Scanner sc = new Scanner(System.in);

        num1 = sc.nextInt();

        System.out.println("Segundo Numero:");
        num2 = sc.nextInt();

        soma = num1+num2;
        subtracao = num1-num2;
        multiplicacao = num1*num2;
        divisao = num1/num2;

        System.out.println("Soma = " + soma);
        System.out.println("Subtração = " + subtracao);
        System.out.println("Multiplicação = " + multiplicacao);
        System.out.println("Divisão = " + divisao);
    }
}
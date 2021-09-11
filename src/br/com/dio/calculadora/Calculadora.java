package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        float a,b;
        System.out.println("Digite o primeiro valor: ");
        a = scan.nextFloat();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextFloat();
        float soma, sub, mul, div;
        soma= somar(a,b);
        sub=diminuir(a,b);
        mul=multiplicar(a,b);
        div=dividir(a,b);
        System.out.println("Soma dos números: "+ soma);
        System.out.println("Subtração dos números: "+ sub);
        System.out.println("Multiplicação dos números: "+ mul);
        System.out.println("Divisão dos números: "+ div);
        scan.close();
    }

    public static float somar(float a , float b){
        return a+b;
    }
    public static float diminuir(float a , float b){
        return a-b;
    }
    public static float multiplicar(float a , float b){
        return a*b;
    }
    public static float dividir(float a , float b){
        return a/b;
    }
}

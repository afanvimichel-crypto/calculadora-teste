import java.util.Scanner;

public class Calculadora {

    static void message(String sal) {
        System.out.println("Seja bem vindo," + sal + " !");
    }

    static void adicao(double n1, double n2) {
        System.out.println("Adição:" + (n1 + n2));
    }

    static void soubi(double nu1, double nu2) {
        System.out.println("Subitração:" + (nu1 - nu2));
    }

    static void multi(double nm1, double nm2) {
        System.out.println("Multiplicação:" + (nm1 * nm2));
    }

    static void divid(double nr1, double nr2) {
        if (nr2 != 0) {
            System.out.println("Divisão:" + (nr1 / nr2));
        } else {
            System.out.println("não pode dividir por zero");
        }
    }


        public static void main (String[]args){

            Scanner sc = new Scanner(System.in);
            System.out.println("Digite seu nome:");
            String nome = sc.nextLine();

            //String nome="mikelvski";
            message(nome);
            System.out.println("digite dois nùmeros:");
            System.out.print("Nùmero 1: ");
            double numero1=sc.nextInt();
            System.out.print("Nùmero 2:");
            double numero2=sc.nextInt();
            System.out.println("*************OPERATÇÃOS***************\n");
            adicao(numero1,numero2);
            soubi(numero1,numero2);
            multi(numero1,numero2);
            divid(numero1,numero2);


        }
    }


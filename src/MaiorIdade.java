import java.util.Scanner;

public class MaiorIdade {
    static boolean verificaIdade(int idade){
        if(idade>=18){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Informe sua idade:");
        int idade= sc.nextInt();
        boolean idadeVerificada=verificaIdade(idade);
        if(idadeVerificada){
            System.out.println("Você é maior de idade!");
        }else {
            System.out.println("Você é menor de idade!");
        }
    }
}

import java.util.Scanner;
public class exercicioElseIf {
    public static Scanner leia=new Scanner(System.in);
    public static void main(String args[]){
        int valor1;
        int valor2;
        System.out.println("Digite o primeiro valor:");
        valor1=leia.nextInt();
        System.out.println("Digite o segundo valor:");
        valor2=leia.nextInt();
        if(valor1>valor2){
            System.out.println("O primeiro valor é maior");
        }else if(valor1<valor2){
            System.out.println("O segundo valor é maior");
        }else{
            System.out.println("São iguais");
        }
    }
}
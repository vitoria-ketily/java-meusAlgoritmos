import java.util.Scanner;
public class td1Q11 {
    public static Scanner leia=new Scanner(System.in);
    public static void main(String args[]){
        int numero;
        int valor1;
        int valor2;
        System.out.println("Digite o primeiro valor:");
        valor1=leia.nextInt();
        System.out.println("Digite o segundo valor:");
        valor2=leia.nextInt();
        if(valor1>valor2){
            System.out.println("O primeiro valor é maior");
        }else{
            System.out.println("O segundo valor é maior");

        }

        }
    }
    

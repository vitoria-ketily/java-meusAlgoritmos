import java.util.Scanner;
public class td2Q2{
    public static Scanner leia=new Scanner(System.in);
    public static void main(String args[]){
        int numero;
        System.out.println("Digite um número:");
        numero=leia.nextInt();
        if(numero>10){
System.out.println("O número é maior que 10");
        }else{
            System.out.println("O número é menor que 10");
        }
    }
}
import java.util.Scanner;
public class td1Q4{
    public static Scanner leia=new Scanner(System.in);
    public static void main(String args[]){
    float base;
    float altura;
    float area;
    System.out.println("Digite a base:");
    base=leia.nextFloat();
    System.out.println("Digite a altura:");
    altura=leia.nextFloat();
    area= base*altura/2;
    System.out.println("O valor da area do retangulo é:"+area);

    }
}
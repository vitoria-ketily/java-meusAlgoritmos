import java.util.Scanner;
public class calculadora{
    public static Scanner leia=new Scanner(System.in);
    public static void main(String args[]){
        int op;
        int valor1, valor2;
        System.out.println("Escolha a opereção: soma:1 ,subtração:2 , multiplicação:3 , divisão:4");
        op=leia.nextInt();
       switch(op){
            case 1 :
            System.out.println("Digite o valor 1:");
            valor1=leia.nextInt();
            System.out.println("Digite o valor 2:");
            valor2=leia.nextInt();
            System.out.println("O resultado é: "+(valor1+valor2));
            case 2:
            System.out.println("Digite o valor 1:");
            valor1=leia.nextInt();
            System.out.println("Digite o valor 2:");
            valor2=leia.nextInt();
            System.out.println("O resultado é: "+(valor1-valor2));
            case 3:
            System.out.println("Digite o valor 1:");
            valor1=leia.nextInt();
            System.out.println("Digite o valor 2:");
            valor2=leia.nextInt();
            System.out.println("O resultado é: "+(valor1*valor2));
            case 4:
            System.out.println("Digite o valor 1:");
            valor1=leia.nextInt();
            System.out.println("Digite o valor 2:");
            valor2=leia.nextInt();
            System.out.println("O resultado é: "+(valor1/valor2));
            default:
            System.out.println("Algo está errado :(");

    }
}
}
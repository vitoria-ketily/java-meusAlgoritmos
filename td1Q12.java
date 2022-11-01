import java.util.Scanner;
public class td1Q12 {
    public static Scanner leia=new Scanner(System.in);
    public static void main(String args[]){
        int valor1;
        int valor2;
        System.out.println("Digite o primeiro valor:");
        valor1=leia.nextInt();
        System.out.println("Digite o segundo valor:");
        valor2=leia.nextInt();
        if(valor1>valor2){
            System.out.println("Esse valor vem primeiro:"+valor2);
            System.out.println("Esse valor vem segundo:"+valor1);
        }else{
            System.out.println("Esse valor vem primeiro:"+valor1);
            System.out.println("Esse valor vem em seguida:"+valor2);
        }
    }
}

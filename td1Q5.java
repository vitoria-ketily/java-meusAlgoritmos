import java.util.Scanner;
public class td1Q5{
    public static Scanner leia=new Scanner(System.in);
    public static void main(String args[]){
        float salario;
        float reajuste;
        System.out.println("Digite o salário:");
        salario=leia.nextFloat();
        System.out.println("Digite o reajuste:");
        reajuste=leia.nextFloat();
        float numero=salario*reajuste/100;
        float se=salario+numero;
        System.out.println("O novo salário é:"+se);
    }
}

import java.util.Scanner;
public class td1Q6{
    public  static Scanner leia=new Scanner(System.in);
    public static void main(String args[]){
       float nota1;
       float nota2;
       float nota3;
       System.out.println("Digite a primeira nota");
       nota1=leia.nextFloat();
       System.out.println("Digite a segunda nota");
       nota2=leia.nextFloat();
       System.out.println("Digite a terceira nota");
       nota3=leia.nextFloat();
       float mediaFinal=(nota1*2+nota2*3+nota3*5)/10;
       System.out.println("A media final é:"+mediaFinal);
    }
}
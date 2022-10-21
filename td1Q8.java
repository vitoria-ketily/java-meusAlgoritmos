import java.util.Scanner;
public class td1Q8{
    public static Scanner leia=new Scanner(System.in);
    public static void main(String args[]){
      float numero;
      System.out.println("Digite o valor:");
      numero=leia.nextFloat();
      if(numero>0){
        System.out.println("O número é positivo.");
      }else{
        System.out.println("O número é negativo.");
      }
}
}
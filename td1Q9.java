import java.util.Scanner;
public class td1Q9{
    public static Scanner leia=new Scanner(System.in);
    public static void main(String args[]){
      int numero; float tbm; float sei; 
 System.out.print("Digite o tanto de maçãs:");
 numero=leia.nextInt();
 tbm = (numero*1.30f);
 sei = (numero*1.00f);
 if (numero >= 12){
    System.out.println("O tanto que irá cobrar de maçãs será:"+tbm);
 }
 else{
    System.out.println("O tanto que irá cobrar de maçãs será:"+sei);
 }
        }
}
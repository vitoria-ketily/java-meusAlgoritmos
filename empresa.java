import java.util.Scanner;
public class empresa{
public static Scanner leia=new Scanner(System.in);
public static void main(String args[]){
    int salario , reajuste, atual;
    System.out.println("Digite o seu salario atual:");
    salario=leia.nextInt();
    
    
    if(salario<=280){
        reajuste=((salario*20)/100);
        System.out.print("Salário atual:");
        atual=reajuste+salario;
        System.out.println(atual);
        System.out.println("Salário antes do reajuste é: "+salario);
        System.out.println("O valor do aumento é: "+reajuste);
        System.out.println("Teve um aumento de 20%");
    }
    else if(salario>=280 && salario<=699){
        reajuste=((salario*15)/100);
        System.out.println("o salario atual:");
        atual=reajuste+salario;
        System.out.println(atual);
        System.out.println("salario antes do reajuste é:"+salario);
        System.out.println("O valor do aumento é: "+reajuste);
        System.out.println("Teve um aumento de 15%");
    }
        else if(salario>=700 && salario<=1499){
            reajuste=((salario*10)/100);
            System.out.println("o salario atual:");
            atual=reajuste+salario;
            System.out.println(atual);
            System.out.println("salario antes do reajuste é:"+salario);
            System.out.println("O valor do aumento é: "+reajuste);
            System.out.println("Teve um aumento de 10%");


    }
    else if(salario>=1500){
        reajuste=((salario*5)/100);
        System.out.println("o salario atual:");
        atual=reajuste+salario;
        System.out.println(atual);
        System.out.println("salario antes do reajuste é:"+salario);
        System.out.println("O valor do aumento é: "+reajuste);
        System.out.println("Teve um aumento de 5%");


}
}
}
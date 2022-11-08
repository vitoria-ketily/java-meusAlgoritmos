import java.util.Scanner;
public class diasSwitchCase1 {
    public static Scanner leia=new Scanner(System.in);
    public static void main(String args[]){
        int dia;
        System.out.println("Digite de  1 a 7 para mostrar o dia da semana:");
        dia=leia.nextInt();

        //O "switch" funciona como o "se", fica mais fácil testar variáveis e executar tal coisa se corresponder com o "case" 
        //E caso não corresponder usa o "default" como se fosse o "se não"
        switch(dia){
            case 1:
            System.out.println("O dia é sábado =)");
            break;
            case 2:
            System.out.println("O dia é segunda-feira =(");
            break;
            case 3:
            System.out.println("O dia é terça-feira =)");
            break;
            case 4:
            System.out.println("O dia é quarta-feira =)");
            break;
            case 5:
            System.out.println("O dia é quinta-feira =)");
            break;
            case 6:
            System.out.println("O dia é sexta-feira =D");
            break;
            case 7:
            System.out.println("O dia é domingo =)");
            break;
            default:
            System.out.println("Esse dia não existe cara '-'");

        }
    
}
}

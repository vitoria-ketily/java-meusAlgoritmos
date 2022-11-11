import java.util.Scanner;
public class precoDeCopias {
    public static Scanner leia=new Scanner(System.in);
    public static void main(String args[]){
        int codigo,quantidade;
        float valor, pago;
        System.out.println("Obs: aluno;10, funcionário;20 professor;30, não aluno;40.");
        System.out.println("Digite seu código para iniciar:");
        codigo=leia.nextInt();
        System.out.println("Digite a quantidade de cópias desejadas:");
        quantidade=leia.nextInt();
        System.out.println("Digite a quantia de dinheiro:");
        pago=leia.nextInt();

        switch(codigo){
            case 10:
            valor=quantidade*1.5f;
            if(pago>valor){
            System.out.println("O valor é: "+(quantidade*1.5));
            System.out.println("O troco é: "+(pago-(quantidade*1.5)));
        }else{
            System.out.println("Falta dinheiro.");
        }
            break;
            case 20:
            valor=quantidade*0.8f;
            if(pago>valor){
            System.out.println("O valor é: "+(quantidade*0.8));
            System.out.println("O troco é: "+(pago-(quantidade*0.8)));
        }else{
            System.out.println("Falta dinheiro.");
        }

            break;
            case 30:
            valor=quantidade*0.6f;
            if(pago>valor){
            System.out.println("O valor é: "+(quantidade*0.6));
            System.out.println("O troco é: "+(pago-(quantidade*0.6)));
        }else{
            System.out.println("Falta dinheiro.");
        }
            break;
            case 40:
            valor=quantidade*2f;
            if(pago>valor){
            System.out.println("O valor é: "+(quantidade*2));
            System.out.println("O troco é: "+(pago-(quantidade*2)));
        }else{
            System.out.println("Falta dinheiro.");
        }
            break;
            default:
            System.out.println("Algo está errado :(");
            
        }
    }
}
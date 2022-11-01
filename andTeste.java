import java.util.Scanner;
public class andTeste{
    public static Scanner leia=new Scanner(System.in);
    public static void main(String args[]){
        float qtdAnos ,horasT ,valorHora ,salarioF, salario;
        System.out.println("Quantos anos o funcionário trabalha na empresa?");
        qtdAnos=leia.nextFloat();
        System.out.println("Quantas horas o funcionário trabalhou?");
        horasT=leia.nextFloat();
        System.out.println("Quanto é o valor de horas?");
        valorHora=leia.nextFloat();

        if(qtdAnos<1){
            salarioF=1500;
            salario=horasT*valorHora+salarioF;
            System.out.println("O salário desse funcionário é:"+salario);
        }
        else if((qtdAnos>1)&&(qtdAnos<3)){
            salarioF=2000;
            salario=horasT*valorHora+salarioF;
            System.out.println("O salário desse funcionário é:"+salario);
        }
        else if(qtdAnos>3){
            salarioF=3000;
            salario=horasT*valorHora+salarioF;
            System.out.println("O salário desse funcionário é:"+salario);
        }
        
        }
    
    }
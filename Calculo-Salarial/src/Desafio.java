import java.util.Scanner;

public class Desafio {
    public static void main(String[] args){
       
        Scanner leitorDeEntrada= new Scanner(System.in);
        System.out.println("Digite seu salário: ");
        float valorSalario = leitorDeEntrada.nextFloat();
        System.out.println("Digite seus beneficios: ");
        float valorBeneficio = leitorDeEntrada.nextFloat();

        double valorImposto = 0;
        if (valorSalario >=0 && valorSalario <=1100 ){
            valorImposto=0.05F * valorSalario;
        }
        else if (valorSalario>1100 && valorSalario <=2500){
            valorImposto=0.10F *valorSalario;
        }
        else{
            valorImposto=0.15 *valorSalario;
        }
        double calculo = valorSalario-valorImposto+valorBeneficio;
        System.out.println(String.format( "Seu Salário liquido é : %.2f", calculo));
        
    }
}

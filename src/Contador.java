import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int firstNumber= scan.nextInt();
        System.out.println("Digite o segundo número: ");
        int secondNumber = scan.nextInt();
        try{
            contar(firstNumber,secondNumber);
        }catch(ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }
    static void contar(int firstNumber, int secondNumber) throws ParametrosInvalidosException{
        if (firstNumber > secondNumber){
            throw new ParametrosInvalidosException();
        }
      
        for (int contagem=firstNumber; contagem<secondNumber; contagem++){
            System.out.println("Imprimindo o número " + (contagem-firstNumber+1));
        }
    }
}

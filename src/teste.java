public class teste {
    public static void main(String[] args) {
        testeNumero(5,1);
    }
    static void testeNumero(int numero1,int numero2){
        
        for (int contagem=numero1-numero2;contagem>0;contagem--){
            System.out.println(numero1-numero2-contagem+1);
        }
    }
}

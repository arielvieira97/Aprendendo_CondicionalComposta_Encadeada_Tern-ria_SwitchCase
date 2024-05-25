

public class ResultadoEscolar {
    public static void main(String[] args) {
        //condiçoes composta e cadeada
        //  int nota = 5;

         //if(nota >= 7)
         //System.out.println("Aprovado");
           // else if (nota >= 5 && nota < 7)
           // System.out.println("recuperação");

         //else
         //System.out.println("Reprovado");
         //UMA FORMA MAIS SIMPLES condiçao ternaria
         int nota = 9;
         String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota <7 ? "Recuperaçao" : "Reprovado";
         System.out.println(resultado);
    }
}

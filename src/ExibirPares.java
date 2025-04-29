import java.util.ArrayList;

public class ExibirPares implements Operacao {
    @Override
    public void executar(ArrayList<Integer> numeros) {
        System.out.println("Exibindo apenas números pares:");
        int contador = 0;
        for (Integer numero : numeros) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
                contador++;
                if (contador % 10 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println();
    }
}
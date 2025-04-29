import java.util.ArrayList;

public class ExibirTodos implements Operacao {
    @Override
    public void executar(ArrayList<Integer> numeros) {
        System.out.println("Exibindo todos os números:");
        int contador = 0;
        for (Integer numero : numeros) {
            System.out.print(numero + " ");
            contador++;
            if (contador % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
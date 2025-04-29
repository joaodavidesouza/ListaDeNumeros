import java.util.ArrayList;

public class ExibirPrimos implements Operacao {
    @Override
    public void executar(ArrayList<Integer> numeros) {
        System.out.println("Exibindo apenas números primos:");
        int contador = 0;
        for (Integer numero : numeros) {
            if (ehPrimo(numero)) {
                System.out.print(numero + " ");
                contador++;
                if (contador % 10 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println();
    }

    private boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        if (numero <= 3) {
            return true;
        }
        if (numero % 2 == 0 || numero % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}
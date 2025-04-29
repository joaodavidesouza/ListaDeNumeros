import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        boolean digitando = true;

        System.out.println("Digite os números (digite 'fim' para encerrar):");

        while (digitando) {
            String input = scan.nextLine();
            if (input.equalsIgnoreCase("fim")) {
                digitando = false;
            } else {
                try {
                    int numero = Integer.parseInt(input);
                    numeros.add(numero);
                } catch (NumberFormatException e) {
                    System.out.println("Por favor, digite um número válido ou 'fim' para encerrar.");
                }
            }
        }

        System.out.println("""
                Escolha uma opção:\
                
                [1] Ver todos os números.\
                
                [2] Ver apenas números ímpares.\
                
                [3] Ver apenas números pares.\
                
                [4] Ver apenas números primos.""");
        int resposta = scan.nextInt();

        Operacao operacao;

        switch (resposta) {
            case 1:
                operacao = new ExibirTodos();
                break;
            case 2:
                operacao = new ExibirImpares();
                break;
            case 3:
                operacao = new ExibirPares();
                break;
            case 4:
                operacao = new ExibirPrimos();
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        operacao.executar(numeros);
    }
}

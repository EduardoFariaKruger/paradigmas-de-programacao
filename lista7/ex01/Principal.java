import java.util.Scanner;
import java.util.TreeSet;
import java.util.Comparator;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Personagem> personagens = new TreeSet<>(Comparator.reverseOrder());

        for (int i = 0; i < 9; i++) {
            System.out.println("Digite o nome do personagem:");
            String nome = scanner.nextLine();

            System.out.println("Digite o nível do personagem:");
            double nivel = scanner.nextDouble();

            System.out.println("Digite a força base do personagem:");
            double forcaBase = scanner.nextDouble();
            scanner.nextLine(); // consumir a quebra de linha pendente

            // Alterna entre os 3 tipos
            Personagem p;
            if (i % 3 == 0) {
                p = new Mago(nome, nivel, forcaBase);
            } else if (i % 3 == 1) {
                p = new Arqueiro(nome, nivel, forcaBase);
            } else {
                p = new Guerreiro(nome, nivel, forcaBase);
            }

            personagens.add(p);
        }

        System.out.println("\n=== Personagens em ordem decrescente de dano ===");
        for (Personagem p : personagens) {
            System.out.printf("%s: Dano = %.2f\n", p.getNome(), p.calcularDano());
        }

        scanner.close();
    }
}

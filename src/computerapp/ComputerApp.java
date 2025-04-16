package computerapp;

import java.util.Scanner;

public class ComputerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Criando dois objetos com o construtor default
        Computer pc1 = new Computer();
        Computer pc2 = new Computer();

        // Preenchendo os atributos dos objetos criados com o construtor default
        System.out.println("Digite os dados do primeiro computador:");
        System.out.print("Marca: ");
        pc1.setMarca(scanner.nextLine());
        System.out.print("Processador: ");
        pc1.setProcessador(scanner.nextLine());
        System.out.print("Memória RAM (GB): ");
        pc1.setMemoriaRAM(scanner.nextInt());
        System.out.print("Armazenamento (GB): ");
        pc1.setArmazenamento(scanner.nextInt());
        System.out.print("Preço (R$): ");
        pc1.setPreco(scanner.nextDouble());
        scanner.nextLine();  // Consumir a quebra de linha
        System.out.println("--------------------------------");

        System.out.println("Digite os dados do segundo computador:");
        System.out.print("Marca: ");
        pc2.setMarca(scanner.nextLine());
        System.out.print("Processador: ");
        pc2.setProcessador(scanner.nextLine());
        System.out.print("Memória RAM (GB): ");
        pc2.setMemoriaRAM(scanner.nextInt());
        System.out.print("Armazenamento (GB): ");
        pc2.setArmazenamento(scanner.nextInt());
        System.out.print("Preço (R$): ");
        pc2.setPreco(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("--------------------------------");

        // Criando dois objetos com o construtor parametrizado
        System.out.println("Digite os dados do terceiro computador:");
        System.out.print("Marca: ");
        String marca3 = scanner.nextLine();
        System.out.print("Processador: ");
        String processador3 = scanner.nextLine();
        System.out.print("Memória RAM (GB): ");
        int memoriaRAM3 = scanner.nextInt();
        System.out.print("Armazenamento (GB): ");
        int armazenamento3 = scanner.nextInt();
        System.out.print("Preço (R$): ");
        double preco3 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("--------------------------------");

        Computer pc3 = new Computer(marca3, processador3, memoriaRAM3, armazenamento3, preco3);

        System.out.println("Digite os dados do quarto computador:");
        System.out.print("Marca: ");
        String marca4 = scanner.nextLine();
        System.out.print("Processador: ");
        String processador4 = scanner.nextLine();
        System.out.print("Memória RAM (GB): ");
        int memoriaRAM4 = scanner.nextInt();
        System.out.print("Armazenamento (GB): ");
        int armazenamento4 = scanner.nextInt();
        System.out.print("Preço (R$): ");
        double preco4 = scanner.nextDouble();
        System.out.println("--------------------------------");

        Computer pc4 = new Computer(marca4, processador4, memoriaRAM4, armazenamento4, preco4);

        // Exibindo os atributos dos objetos criados
        System.out.println("\nInformações dos Computadores Criados:");
        pc1.imprimir();
        pc2.imprimir();
        pc3.imprimir();
        pc4.imprimir();

        scanner.close();

    }
}

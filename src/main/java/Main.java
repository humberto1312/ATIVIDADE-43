import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigoItem, quantidade;
        double valorItem, totalPedido = 0.0;

        System.out.println("Cardápio da Lanchonete:");
        System.out.println("Especificação      Código     Preço");
        System.out.println("Cachorro Quente    100        R$ 1,20");
        System.out.println("Bauru Simples      101        R$ 1,30");
        System.out.println("Bauru com ovo      102        R$ 1,50");
        System.out.println("Hambúrguer         103        R$ 1,20");
        System.out.println("Cheeseburguer      104        R$ 1,30");
        System.out.println("Refrigerante       105        R$ 1,00");

        do {
            System.out.print("\nDigite o código do item (ou -1 para encerrar o pedido): ");
            codigoItem = scanner.nextInt();

            if (codigoItem != -1) {
                System.out.print("Digite a quantidade desejada: ");
                quantidade = scanner.nextInt();

                switch (codigoItem) {
                    case 100:
                        valorItem = 1.20;
                        break;
                    case 101:
                        valorItem = 1.30;
                        break;
                    case 102:
                        valorItem = 1.50;
                        break;
                    case 103:
                        valorItem = 1.20;
                        break;
                    case 104:
                        valorItem = 1.30;
                        break;
                    case 105:
                        valorItem = 1.00;
                        break;
                    default:
                        System.out.println("Código de item inválido. Digite novamente.");
                        continue; // Volta para o início do loop
                }

                double valorTotalItem = valorItem * quantidade;
                totalPedido += valorTotalItem;
                System.out.printf("Valor a ser pago pelo item: R$ %.2f%n", valorTotalItem);
            }
        } while (codigoItem != -1);

        System.out.printf("Total do pedido: R$ %.2f%n", totalPedido);

        scanner.close();
    }
}

import java.util.Scanner;

public class PCMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Computador p1 = new Computador();
        Computador p2 = new Computador();
        Computador p3 = new Computador();

        p1.marca = "Apple";
        p1.preco = 2025123;
        p1.hardwareBasico[0] = new HardwareBasico("Pentium Core i3", 2200);
        p1.hardwareBasico[1] = new HardwareBasico("Memória RAM", 8);
        p1.hardwareBasico[2] = new HardwareBasico("HD", 500);
        p1.sistemaOperacional = new SistemaOperacional("Linux Ubuntu", 32);
        p1.adicionaMemoriaUSB(new MemoriaUSB("Pen-drive", 16));

        p2.marca = "Samsung";
        p2.preco = 2025123 + 1234;
        p2.hardwareBasico[0] = new HardwareBasico("Pentium Core i5", 3370);
        p2.hardwareBasico[1] = new HardwareBasico("Memória RAM", 16);
        p2.hardwareBasico[2] = new HardwareBasico("HD", 1000);
        p2.sistemaOperacional = new SistemaOperacional("Windows 8", 64);
        p2.adicionaMemoriaUSB(new MemoriaUSB("Pen-drive", 32));

        p3.marca = "Dell";
        p3.preco = 2025123 + 5678;
        p3.hardwareBasico[0] = new HardwareBasico("Pentium Core i7", 4500);
        p3.hardwareBasico[1] = new HardwareBasico("Memória RAM", 32);
        p3.hardwareBasico[2] = new HardwareBasico("HD", 2000);
        p3.sistemaOperacional = new SistemaOperacional("Windows 10", 64);
        p3.adicionaMemoriaUSB(new MemoriaUSB("HD Externo", 1000));

        Cliente cliente = new Cliente();
        System.out.print("Digite o nome do cliente: ");
        cliente.nome = scanner.nextLine();
        System.out.print("Digite o CPF do cliente: ");
        cliente.cpf = scanner.nextLong();

        int opcao;
        do {
            System.out.println("\nDigite o código da promoção (1, 2, 3) ou 0 para sair:");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cliente.comprar(p1);
                    break;
                case 2:
                    cliente.comprar(p2);
                    break;
                case 3:
                    cliente.comprar(p3);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Código inválido.");
            }
        } while (opcao != 0);

        cliente.mostraCliente();
        scanner.close();
    }
}

public class Cliente {
    String nome;
    long cpf;
    Computador[] computadores = new Computador[10];
    int cont = 0;

    public void comprar(Computador computador) {
        if (cont < computadores.length) {
            computadores[cont] = computador;
            cont++;
        } else {
            System.out.println("Limite de computadores atingido.");
        }
    }

    public float calculaTotalCompra() {
        float total = 0;
        for (int i = 0; i < cont; i++) {
            total += computadores[i].preco;
        }
        return total;
    }

    public void mostraCliente() {
        System.out.println("Cliente: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Computadores comprados:");
        for (int i = 0; i < cont; i++) {
            computadores[i].mostraPCConfigs();
        }
        System.out.println("Total da compra: R$" + calculaTotalCompra());
    }
}

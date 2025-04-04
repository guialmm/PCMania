public class Computador {
    String marca;
    float preco;
    SistemaOperacional sistemaOperacional;
    HardwareBasico[] hardwareBasico = new HardwareBasico[3];
    MemoriaUSB memoriaUSB;

    public void mostraPCConfigs() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$" + preco);
        for (HardwareBasico h : hardwareBasico) {
            System.out.println("Hardware: " + h.nome + " - " + h.capacidade);
        }
        System.out.println("Sistema Operacional: " + sistemaOperacional.nome + " (" + sistemaOperacional.tipo + " bits)");
        if (memoriaUSB != null) {
            memoriaUSB.mostraInfo();
        }
        System.out.println("-----------------------------");
    }

    public void adicionaMemoriaUSB(MemoriaUSB musb) {
        memoriaUSB = musb;
    }
}

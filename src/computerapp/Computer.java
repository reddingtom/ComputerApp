package computerapp;

public class Computer {

    // Criando os atributos
    private String marca;
    private String processador;
    private int memoriaRAM;
    private int armazenamento;
    private double preco;

    // Construtor default
    public Computer() {
        this.marca = "";
        this.processador = "";
        this.memoriaRAM = 0;
        this.armazenamento = 0;
        this.preco = 0.0;
    }

    // Construtor com parâmetros
    public Computer(String marca, String processador, int memoriaRAM, int armazenamento, double preco) {
        this.marca = marca;
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
        this.preco = preco;
    }

    // Métodos getters e setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método para exibir todos os atributos
    public void imprimir() {
        System.out.println("Marca: " + marca);
        System.out.println("Processador: " + processador);
        System.out.println("Memória RAM: " + memoriaRAM + " GB");
        System.out.println("Armazenamento: " + armazenamento + " GB");
        System.out.println("Preço: R$ " + preco);
        System.out.println("--------------------------------");

    }
}

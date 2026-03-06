public class Cachorro {
    public String nome = "nome";
    public int dtNasc; 
    public String cor;

    public Cachorro() {

    }

    public Cachorro(String nome, int dtNasc, String cor) {
        this.nome = nome;
        this.dtNasc = dtNasc;
        this.cor = cor;
    }

    public void latir() {
        System.out.println("Latindo");
    }

    public void correr() {
        System.out.println("Correndo");
    }
}
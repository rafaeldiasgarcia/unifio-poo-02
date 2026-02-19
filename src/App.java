import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro();

        Cachorro meuCachorro2 = new Cachorro();

        String nome, cor;
        int dt;
    

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o nome do cachorro: ");
        nome = entrada.nextLine();
        meuCachorro.nome = nome;

        System.out.println("Informe o a data de nascimento: ");
        dt = entrada.nextInt();
        meuCachorro.dtNasc = dt;

        System.out.println("Informe a cor do animal: ");
        cor = entrada.nextLine();
        meuCachorro.nome = cor;

        meuCachorro.correr();
        meuCachorro.latir();
    }
}
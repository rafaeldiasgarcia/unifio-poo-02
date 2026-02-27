import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();    

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escreva seu nome: ");
        p1.nome = entrada.nextLine();

        System.out.println("Escreva seu telefone: ");
        p1.telefone = entrada.nextLine();

        System.out.println("Escreva seu endereçco: ");
        p1.endereco = entrada.nextLine();


        System.out.println("\n\nNome: " + p1.nome + "\nTelefone: " + p1.telefone + "\nEndereço: " + p1.endereco);

        entrada.close();


        Carro meuCarro = new Carro();   

        String modelo = meuCarro.getModelo();

        System.out.println(modelo);
    }
    
}
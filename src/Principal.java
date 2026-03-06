import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        Motor meuMotor = new Motor();

        System.out.println("Informe o id do motor: ");
        meuMotor.setId(sc.nextInt());

        System.out.println("Informe o modelo do motor: ");
        meuMotor.setModelo(sc.next());

        Carro meuCarro = new Carro();

        System.out.println("Informe o id do carro: ");
        meuMotor.setId(sc.nextInt());

        System.out.println("Informe o modelo do carro: ");
        meuMotor.setModelo(sc.next());

        meuCarro.setMotor(meuMotor);

        System.out.println(meuCarro.getMotor().getModelo());
    }  
}

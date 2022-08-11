import java.util.Scanner;

public class testMain {
    public static void main(String[] args) {
        test obj = new test();
        Scanner op = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("Menu de la pila: ");
            System.out.println("1.Seguir comprando:");
            System.out.println("2.Mostrar carrito de compras:");
            System.out.println("3.Ya no comprar:");
            System.out.println("Ingresar una opcion:");
            opcion = op.nextInt();

            switch (opcion){
                case 1:
                    obj.push();
                    break;
                case 2:
                    obj.mostrar();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Ingrese un dato valido");
            }
        }while(opcion!=4);
    }
}

import java.util.Scanner;

public class test {
    Scanner teclado = new Scanner(System.in);
    int pilaNumerica[] = new int [3];
    int tope = -1;

    public void push(){
        if(tope >=pilaNumerica.length-1){
            System.out.println("La pila esta llena");
        }else {
            tope+=1;
            System.out.println("Ingrese dato: ");
            pilaNumerica[tope]=teclado.nextInt();
        }
    }
    public void pop(){
        if (tope == -1){
            System.out.println("La pila esta vacia");
        }else {
            System.out.println("Se ah eliminado un elemento de la pila");
            pilaNumerica[tope]=0;
        }
    }
    public void mostrar(){
//        for (int tope = 4; tope >=0 ; tope--) {
//            System.out.println("Datos de la pila "+pilaNumerica[tope]);
//        }
        for (int i = 0; i < pilaNumerica.length; i++) {
            System.out.println("Datos de la pila "+pilaNumerica[i]);
        }
    }
}

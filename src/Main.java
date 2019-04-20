import SingletonsHerencia.SingletonA;
import SingletonsHerencia.SingletonB;
import SingletonsHerencia.SingletonPadre;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        System.out.println("Digite 0 para la demostracion de resistencia multihilos " +
                "\n 1 para la demostracion de herencia con singleton \n" +
                "entrada : ");

        int opcion = s.nextByte();

        if(opcion == 0){
            Thread hilo1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    SingletonPadre singleton = SingletonPadre.getInstance();
                    singleton.mensaje("hola mundo! implementacion del singleton simple");
                    System.out.println(singleton.getMensaje());
                }
            });

            Thread hilo2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    SingletonPadre singleton2 = SingletonPadre.getInstance();
                    singleton2.mensaje("otro hilo");
                    System.out.println(singleton2.getMensaje());
                }
            });



            hilo1.start();
            hilo2.start();

        }
        else if(opcion == 1){
            SingletonPadre singleton = SingletonA.getInstance();
            singleton.mensaje("Hola");
            System.out.println(singleton.getMensaje());

            SingletonPadre singleton2 = SingletonB.getInstance();
            singleton2.mensaje("konichiwa");
            System.out.println(singleton2.getMensaje());
        }



    }
}

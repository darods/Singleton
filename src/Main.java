import SingletonsHerencia.SingletonA;
import SingletonsHerencia.SingletonB;
import SingletonsHerencia.SingletonPadre;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Thread hilo1 = new Thread(new Runnable() {
            @Override
            public void run() {
                SingletonFirst singleton = SingletonFirst.getInstance();
                singleton.mensaje("hola mundo! implementacion del singleton simple");
                System.out.println(singleton.getMensaje());
            }
        });

        Thread hilo2 = new Thread(new Runnable() {
            @Override
            public void run() {
                SingletonFirst singleton2 = SingletonFirst.getInstance();
                singleton2.mensaje("otro hilo");
                System.out.println(singleton2.getMensaje());
            }
        });

        hilo1.start();
        hilo2.start();
        System.out.println("digite 0 para A o 1 para B : ");
        int opcion = s.nextByte();
        if (opcion == 0){
            SingletonPadre singletonHerencia = new SingletonA();
            singletonHerencia.getInstance();
            singletonHerencia.setMensaje("hola");
            System.out.println(singletonHerencia.getMensaje());
        } else if(opcion == 1){
            SingletonPadre singletonHerencia = new SingletonB();
            singletonHerencia.getInstance();
            singletonHerencia.setMensaje("hola");
            System.out.println(singletonHerencia.getMensaje());
        }




    }
}

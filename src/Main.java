public class Main {
    public static void main(String[] args) {

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
    }
}

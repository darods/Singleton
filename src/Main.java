public class Main {
    public static void main(String[] args) {
        SingletonFirst singleton = SingletonFirst.getInstance();
        singleton.mensaje("hola mundo! implementacion del singleton simple");
        SingletonFirst singleton2 = SingletonFirst.getInstance();
        System.out.println(singleton2.getMensaje());

    }
}

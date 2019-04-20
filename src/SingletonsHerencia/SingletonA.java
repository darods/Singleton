package SingletonsHerencia;

public class SingletonA extends SingletonPadre {

    private static SingletonA singleton;
    private SingletonA(){}

    public static synchronized SingletonPadre getInstance(){

        synchronized (SingletonPadre.class){
            if(singleton == null){

                singleton = new SingletonA();
            }
        }
        return singleton;
    }

    @Override
    public void mensaje(String mensaje) {
        this.mensaje = mensaje + " este es el singleton A";
    }

    @Override
    public String getMensaje() {
        return this.mensaje;
    }
}

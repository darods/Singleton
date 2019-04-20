package SingletonsHerencia;

public class SingletonA extends SingletonPadre{

    private static SingletonA singleton;

    public static synchronized SingletonPadre getInstance(){
        if(singleton == null){
            singleton = new SingletonA();
        }
        return singleton;
    }
    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje + " este es el singleton A";
    }

    @Override
    public String getMensaje() {
        return this.mensaje;
    }
}

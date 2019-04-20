package SingletonsHerencia;

public class SingletonPadre {
    private static SingletonPadre singleton = null;
    protected String mensaje;

    protected SingletonPadre(){}

    public static synchronized SingletonPadre getInstance(){
        if(singleton == null){
            singleton = new SingletonPadre();
        }
        return singleton;
    }

    public void setMensaje(String a){
        mensaje = a;
    }
    public String getMensaje(){
        return mensaje;
    }

}

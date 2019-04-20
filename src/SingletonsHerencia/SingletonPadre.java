package SingletonsHerencia;

public abstract class SingletonPadre {
    protected SingletonPadre singleton = null;
    protected String mensaje;

    protected SingletonPadre(){}

    public abstract  SingletonPadre getInstance();

    public abstract void setMensaje(String a);
    public abstract String getMensaje();

}

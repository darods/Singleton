package SingletonsHerencia;

public class SingletonB extends SingletonPadre{

    private static SingletonB singleton;

    public static SingletonPadre getInstance(){
        if(singleton == null){
            singleton = new SingletonB();
        }
        return singleton;
    }

    @Override
    public void setMensaje(String a) {
        this.mensaje = a +  " este es el singleton B";
    }

    @Override
    public String getMensaje() {
        return this.mensaje;
    }
}

package SingletonsHerencia;

public class SingletonB extends SingletonPadre{
    @Override
    public SingletonPadre getInstance() {
        if (singleton==null){
            singleton =new SingletonB();

        }
        return singleton;
    }

    @Override
    public void setMensaje(String a) {
        this.mensaje = a +  " este es el singleton b";
    }

    @Override
    public String getMensaje() {
        return this.mensaje;
    }
}

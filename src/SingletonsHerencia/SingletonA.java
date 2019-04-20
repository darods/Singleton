package SingletonsHerencia;

public class SingletonA extends SingletonPadre{

    @Override
    public  SingletonPadre getInstance() {
        if (singleton == null){
            singleton = new SingletonA();
        }
        return singleton;
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMensaje() {
        return this.mensaje;
    }
}

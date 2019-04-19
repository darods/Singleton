public class SingletonFirst {

    private  static SingletonFirst singleton;
    private String mensaje;

    private SingletonFirst(){

    }

    public static SingletonFirst getInstance(){

        if(singleton == null){
            singleton = new SingletonFirst();
        }
        return singleton;
    }

    public void mensaje(String mensaje){
        this.mensaje = mensaje;
    }

    public  String getMensaje(){
        return this.mensaje;
    }
}

package SingletonsHerencia;

public class SingletonPadre {

    //Uno de los problemas con java es su manejo de mejoria, por lo que la palabra "volatile" nos asegura que en vez
    //de que los hilos se sincronizen en desorden por el manejo de la memoria, esta variable se alamacena en la memoria
    //principal. De hecho se usa para gaarantizar que los cambios se vean en todos los hilos

    //si la linea volatile es borrada empiezan a aparecer los mensajes de acuerdo a que hilo es mas rapido


    private  static volatile SingletonPadre singleton = null;

    protected String mensaje;

    // para el caso de la herencia tenemos que cambiar la instancia a protected en vez de privada y sobreescribrla
    // en las clases hijas

    protected SingletonPadre(){

    }

    public static SingletonPadre getInstance(){

        if(singleton == null){
    //hacemos una verificacion de si la clase está instanciada en todos los hilos, se pone aquí porque reduce el consumo
    //de memoria, luego hacemos una nueva verificacion de si ya está creada y ya está solucionado

            synchronized (SingletonPadre.class){

                if(singleton == null){

                    singleton = new SingletonPadre();
                }

            }

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

package level3;

public class Generic <T> {
    public static <T extends Telephone> void call(T telephone){
        telephone.call();
    }
    public static <T extends Smarthphone> void takeAPicture(T smartphone){
        smartphone.takeAPicture();
    }

}
// Pregunta del ejercicio: ¿El método limitado por la interfaz Telefon, de la clase Generica, puede llamar al método hacerFotos()?

//No, no puede porque hacerFotos no es un metodo de la interfaz de Telefono, el extends restringe el acceso a metodos de otras clases.
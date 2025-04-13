package level3;

public class Smarthphone implements Telephone {

    @Override
    public void call () {
        System.out.println("Calling...");}

   public void takeAPicture(){
       System.out.println("Taking a picture...");
   }
}

package level3;

public class Main {
    public static void main(String[] args) {
        Generic generic = new Generic();
        Smarthphone smarthphone = new Smarthphone();

        generic.call(smarthphone);
        generic.takeAPicture(smarthphone);
    }
}

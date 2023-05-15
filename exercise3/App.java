import Cat.*;
import Dog.*;

public class App {
    public static void main(String[] args) throws Exception {
        Pet myPetCat = new Pet();
        myPetCat.meow();
        System.out.println("Eye color:" + myPetCat.eyeColor);
        System.out.println("Fur color:" + myPetCat.furColor + "\n");

        Labradog labradog = new Labradog();
        labradog.bark();
        System.out.println("Eye color:" + labradog.eyeColor);
        System.out.println("Fur color:" + labradog.furColor);
    }
}

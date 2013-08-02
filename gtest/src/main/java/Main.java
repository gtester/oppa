
public class Main {
    public static void main(String[] args) {
        Volkswagen volkswagen = new ClownVolkswagen();
        for(int i=0; i<20; i++) {
            volkswagen.add(new Clown());
        }
        volkswagen.done();
    }
}

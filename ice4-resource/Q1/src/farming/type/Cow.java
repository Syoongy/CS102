package farming.type;

import farming.type.Animal;

public class Cow implements Animal {
    @Override
    public void makeNoise() {
        System.out.println("moo moo");
    }
}

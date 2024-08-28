package Exercise_46;

public class Mammal extends Animal {



    public Mammal (String name) {
        super(name);
        super.setName(name);
    }

    @Override
    public String toString() {
        return "[Mammal" +super.toString() +']';
    }
}

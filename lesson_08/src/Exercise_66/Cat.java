package Exercise_66;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }


    @Override
    public void greets() {
        System.out.println("Mew");
    }

    @Override
    public String toString() {
        return "Cat[" + super.toString() + ']';
    }
}

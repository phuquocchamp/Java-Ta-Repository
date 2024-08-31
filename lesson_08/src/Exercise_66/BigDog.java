package Exercise_66;

public class BigDog extends Dog{

    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        super.greets();
    }

    @Override
    public void greets(Dog another) {
        super.greets(another);
    }

    public void greets(BigDog another) {
        super.greets(another);
    }

    @Override
    public String toString() {
        return "BigDog[" + super.toString() +']';
    }

}

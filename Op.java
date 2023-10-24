public interface Op {
    public void eat();

}

class Cat implements Op{
    @Override
    public void eat() {
        System.out.println("cat is eating");
    }

}
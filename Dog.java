public class Dog extends Animal {
    String host;


    Dog(String host) {
        super(1, 3);
        this.host = host;
    }

    public String getHost() {
        return this.host;
    }

    @Override
    public void scream() {
        System.out.println("汪汪");
    }

    //静态方法既不是复写也不是重载
    public static void sleep() {
        System.out.println("我是 Dog 的睡觉");
    }

    public static void main(String[] args) {
        Dog dog = new Dog("小明");
        dog.scream();
        System.out.println(dog.getHost());
        System.out.println(dog.getColor());
        System.out.println(dog.getNumberOfLegs());
    }
}

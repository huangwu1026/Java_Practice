public class Animal {
    int color;
    int numberOfLegs;

    Animal(int color, int numberOfLegs) {
        this.color = color;
        this.numberOfLegs = numberOfLegs;
    }

    Animal() {
        this(0, 4);
    }

    //直接get就会出现相应的函数、再进行选择即可
    public int getColor() {
        return color;
    }

    //直接get就会出现相应的函数
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void scream() {
        System.out.println("吱吱");
    }

    public static void sleep() {
        System.out.println("我是 Animal 的睡觉");
    }
}


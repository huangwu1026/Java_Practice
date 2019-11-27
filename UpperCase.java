public class UpperCase {
    public static void main(String[] args) {
        Animal p1 = new Dog("小明");
        Animal p2 = new Pig();
        Animal p3 = new Human();

        p1.scream();
        p2.scream();//未复写
        p3.scream();

        //不建议用对象调方法
        //静态方法的调用随引用类型
        //Alt+Enter尝试修复
        // p1.sleep();
        Animal.sleep();
        //p2.sleep();
        Animal.sleep();
        //p3.sleep();
        Animal.sleep();

        //p3.scream("我");错误
        //将p3强行转换为Human类型
        ((Human) p3).scream("我");

        //类型转换异常 编译时期正常 运行期间出现问题(Dog()强行转换为Human()) ClassCastException
        //((Human)p1).scream("我");
    }
}

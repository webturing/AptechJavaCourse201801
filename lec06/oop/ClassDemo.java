package lec06.oop;

class Person {
    static Person HERO = null;
    String name;
    int age;

}

public class ClassDemo {
    static int age = 19;

    public static void main(String[] args) {
        int age = 18;
        Person me = new Person(); //实例化 instance
        Person you = new Person();
        System.out.println(me.age);//ok
        System.out.println(age);// localVariable
        System.out.println(ClassDemo.age);//static Field;
        // System.out.println(Person.age);//error
        System.out.println(Person.HERO);//OK
        System.out.println(me.HERO);//OK;
        System.out.println(you.HERO);//OK;
        me.name = "zhangsan";
        System.out.println(you.name);
    }
}

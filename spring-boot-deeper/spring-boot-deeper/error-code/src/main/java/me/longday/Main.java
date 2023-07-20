package me.longday;


import jdk.nashorn.internal.ir.debug.ObjectSizeCalculator;
import org.openjdk.jol.info.ClassLayout;

/**
 * TODO
 *
 * @author 刘恒君
 * @since 2023/7/20
 */
public class Main {

    public static void main(String[] args) {

        Object[] lock = new Object[2];
        Object lock2 = new Object();

        System.out.println(ClassLayout.parseInstance(lock).toPrintable());
        System.out.println("================ ================");
        System.out.println(ClassLayout.parseInstance(lock2).toPrintable());

        User[] u1 = new User[2];
        User u2 = new User();

        System.out.println(ClassLayout.parseInstance(u1).toPrintable());
        System.out.println("================ ================");
        System.out.println(ClassLayout.parseInstance(u2).toPrintable());


        Integer[] i1 = new Integer[2];
        Integer i2 = new Integer(2);

        System.out.println(ClassLayout.parseInstance(i1).toPrintable());
        System.out.println("================ ================");
        System.out.println(ClassLayout.parseInstance(i2).toPrintable());
    }
}

class User{
    Integer age;
}
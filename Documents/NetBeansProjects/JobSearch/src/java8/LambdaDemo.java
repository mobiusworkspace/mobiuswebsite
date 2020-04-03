/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8;

/**
 *
 * @author Dotmons
 */
interface A {

    void show(int i);
}

class Xyz implements A {

    @Override
    public void show(int i) {
        System.out.println("Hello world> " + i);
    }

}

public class LambdaDemo {

    public static void main(String[] arg) {
        A obj;

        obj = new A() {
            @Override
            public void show(int i) {
                System.out.println("Anonymous inner class > " + i);
            }

        };
        obj.show(4);

        // Using java 8, anonymmous inner class can be defined as
        // This is called consumer interface
        obj = (i) -> System.out.println("Java 8 Anonymous inner class> " + i);

        obj.show(9);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionJava;

/**
 *
 * @author Dotmons
 */
public class GenericDemo {

    public GenericDemo() {

    }

    public static void main(String[] args) {

        Collect<Double> col = new Collect<>();
        col.value = 0.5;
        col.show();
        //GenericDemo gen = new GenericDemo();
    }

}

class Collect<T> {

    T value;

    public void show() {
        System.out.println(value.getClass().getName());
    }
}

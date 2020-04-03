/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.function.Consumer;

/**
 *
 * @author Dotmons
 */
class ConsImpl implements Consumer<Integer> {

    @Override
    public void accept(Integer t) {
        System.out.println("Value of t >> " + t);
    }

}

public class DemoForEach {

    public static void main(String[] args) {
        List<Integer> value = Arrays.asList(4, 5, 6, 7, 8);
        Consumer<Integer> c;
        List listValue = new LinkedList<>();

        //First way of implementing Consumer
        c = new Consumer<Integer>() {
            @Override
            public void accept(Integer k) {
                System.out.println("First Value for k " + k);
            }
        };
        value.forEach(c);

        //Second way of implementing Consumer
        c = (t) -> {
            System.out.println("Second Value<<>> of t >> " + t);
            listValue.add(t);
        };
        value.forEach(c);
        // Third way of implementing Consumer
        c = t -> System.out.println("Third Value<<>> of t >> " + t);
        value.forEach(c);

        //Fourth way
        value.forEach(q -> System.out.println("Fourth way " + q));
    }
}

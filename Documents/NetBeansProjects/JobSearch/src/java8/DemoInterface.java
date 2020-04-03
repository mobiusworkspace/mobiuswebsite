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
interface android {

    default public void callMe() {
        System.out.println("Hello world");
    }
    
    default public void Message(){
        System.out.println("Sent");
    }
}

class DemoInterfaceSample implements android {

    @Override
    public void callMe() {
        System.out.println("Hi boss");
    }

}

public class DemoInterface {

    public static void main(String[] args) {
        DemoInterfaceSample demo = new DemoInterfaceSample();
        demo.callMe();
        demo.Message();
    }
}

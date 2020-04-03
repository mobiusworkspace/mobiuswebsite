/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Training;

/**
 *
 * @author Dotmons
 */
public class Palindrome {
    
    public Palindrome(){
        System.out.println(isPalindrome("LAWAL"));
    }
    
    public boolean isPalindrome(String data){
        int b = 0;
        for (int i=data.length()-1; i>data.length()/2; i--){
            if (data.charAt(i) != data.charAt(b++)){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args){
        new Palindrome();
    }
}

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
public class JAva8 {

    /**
     * @param args the command line arguments
     */
    
    //28699
    //1289
    
    public static void main(String[] args) {
        // TODO code application logic here               
        int N = 999999999;
        long t;
          {
            StringBuilder sb = new StringBuilder();
            t = System.currentTimeMillis();
            
            for (int i=N; i-- >0;){
                sb.append("");
            }
            System.out.println(System.currentTimeMillis() - t);
        }
        {
            StringBuffer sb = new StringBuffer();
            t = System.currentTimeMillis();
            
            for (int i=N; i-- >0;){
                sb.append("");
            }
            System.out.println(System.currentTimeMillis() - t);
        }
        
      
        
    }
    
}

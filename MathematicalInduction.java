/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathematicalinduction;

/**
 *
 * @author joseph
 */
public class MathematicalInduction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
       stringSearch sSearch = new stringSearch();
       
       
       if(sSearch.stringSearch("cabc","dbcabcabcabdcbabcdab") == 1){
           System.out.println("True");
       }
    }
    
}

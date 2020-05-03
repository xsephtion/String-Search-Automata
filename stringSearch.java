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
public class stringSearch {
    public int stringSearch(String pattern, String text) throws Exception{
       int j = 0; // first character 
       int patternCount = 0;
       int a =0, b=0;
       int textLength = text.length();
       int patternLength = pattern.length();
       try{
       for(;;){
           if(j == textLength ){break;}
           
           if(pattern.charAt(a) == text.charAt(b)){
               patternCount++;
               a++;
               b++;
               if(patternCount == patternLength){
                   return 1;
               }
           }
           else if(pattern.charAt(a) != text.charAt(b)){
               patternCount = 0;
               a = 0;
               b++;
           }
           else if(j == textLength){
               return 0;
           }
       }
       
    }catch(Exception e){
        System.out.println(pattern +" Not Found");
    }
    return 0;
    }  
}

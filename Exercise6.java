/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise_6;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author TechCare
 */
public class Exercise6 {

    public static ArrayList<String> ReplaceRepetitive(String input) {
        
        String [] arr = input.split("\\s");
        ArrayList<String> a = new ArrayList<String>(Arrays.asList(arr));
        
        for (int i = 0; i < a.size() - 1; i++){
            if(a.size() > 1){
                int j = i +1;
                String x="";           
                while(j<a.size() && a.get(i).equals(a.get(j))){
                    x = a.get(j);                
                    a.remove(j);                
                    }
            
                if (x != "") {                
                    a.set(i, "REPEAT");                
                }
            }            
        }
        return a;
    }
    public static void Test(String input, String expect, int numberOfCase){
        ArrayList<String> r = ReplaceRepetitive(input);
        System.out.println("Case "+numberOfCase+": "+input);
        System.out.println("Expect output: "+expect);
        System.out.print("Real output: ");
        for (String str:r){
            System.out.print(str+" ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Test("I want to to go to the the the zoo ","I want REPEAT go to REPEAT zoo",1);
        Test("i go go go the the the zoo","i REPEAT REPEAT zoo ",2);
        Test("i i i go go go go ","REPEAT REPEAT REPEAT  ",3);
    }
    
}

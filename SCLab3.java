/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sclab3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author fa14-bse-095
 */
public class SCLab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in= new Scanner(System.in);
        System.out.println("Enter Declaration Statement:");
        String Ds=in.nextLine();
        Pattern pat= Pattern.compile("((([int|float|boolean|String|char|long|double]*) [a-zA-Z_][a-zA-Z0-9_]*=)(.*)?;)");
        Matcher match = pat.matcher(Ds);
        
      
        
        System.out.println("\nDeclaration Statement in the code: ");
        while(match.find()){
             System.out.println(match.group()+"\n\nType with var name: "+ match.group(2) +"\nType: "+ match.group(3)+"\nValue: "+ match.group(4));
         
             
         }
        System.out.println("\n Enter Condition Statement:");
        String Cs=in.nextLine();
          Pattern pat1= Pattern.compile("([if](.*) ([==|>=|<=|!=]{2}) (.*))");
        Matcher match1 = pat1.matcher(Cs);
        
      
        
        System.out.println("\nCondition Statement in the code: ");
        if(match1.find()){
             System.out.println(match1.group()+"\n"+match1.group(2)+"\n"+match1.group(3));
         
             
         }
        else{
            System.out.println("Wrong Syntax...");
        }
        
        in.close();
    }
    
}

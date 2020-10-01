
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lokharke
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TableDrivenFSA fsa = new TableDrivenFSA("C:\\Users\\Lokharke\\Documents\\NetBeansProjects\\tdfsa\\src\\a.txt");
        
        

        System.out.println(fsa.validateState(-1));
        System.out.println(fsa.validateSymbol("a"));
        System.out.println(fsa.nextState(1, "a"));
        System.out.println(fsa.processString("abbcde"));
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geneticselection;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author ryan
 */
public class MutationRate {
    
    int parent1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    
    public MutationRate() {
        
        
    }
    
    public void mutate() {
     
        double rateOfMutation = 5; 
        
        Random random = new Random();
        
        double mutation = random.nextDouble();
        
        if (mutation <= rateOfMutation) {
            
            int min = 0;
            int max = parent1.length - 1;
            
            int randIndex1 = min + (int)(Math.random() * ((max - min) + 1));
            int randIndex2 = min + (int)(Math.random() * ((max - min) + 1));
            
            int temp = parent1[randIndex1];         
            parent1[randIndex1] = parent1[randIndex2];
            parent1[randIndex2] = temp; 
            
            System.out.println(Arrays.toString(parent1));
        }
        
    }
    
}


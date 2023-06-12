/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geneticselection;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author ryan
 */
public class StochasticUniversalSampling {
    
    double population[] = {8, 7, 6, 5, 4, 3, 2};
    double selected[] = {0, 0, 0, 0, 0, 0, 0};
    double[] probabilities = new double[population.length];
    Random random = new Random();
    DecimalFormat df = new DecimalFormat("###.#####");
    
    public StochasticUniversalSampling() {
 
    }
    
    public void select() {
        double total = 0;
        
        Arrays.sort(population);
        
         for (int i = 0; i < population.length; i++) {
            total = total + population[i];

        }

        for (int i = 0; i < population.length; i++) {
            double newInt = population[i] / total;

            probabilities[i] = newInt;
        }
        
        double samples = 10000;       
        double fOfN  = 1.0/samples; 
        
        double totalProb = 0.0;
        
        
        double selectedValue =random.nextDouble() * fOfN; // also starting value
        
        int count = 0;
        
        double totalSamples = 0;
        boolean flag = true;

        while (flag) {
            
            if (selectedValue <= totalProb) {
                selected[count] = selected[count] + 1;
                selectedValue = selectedValue + fOfN;
                totalSamples += 1; 
                
                
            } else {
                totalProb = totalProb + probabilities[count];
 
                if (count != 6) {
                    count += 1;
                }
                
            }
            
            if (totalSamples == samples) {
                flag = false; 
            }

        }

        
        for (int i = 0; i < selected.length; i++) {
            System.out.println(population[i] + " was selected " + selected[i] + " times.");
        }

    }    
}

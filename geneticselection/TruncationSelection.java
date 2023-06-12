/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geneticselection;

import java.util.Arrays;

/**
 *
 * @author ryan
 */
public class TruncationSelection {

    double population[] = {8, 7, 6, 5, 4, 3, 2};
    double selected[] = {0, 0, 0, 0, 0, 0, 0};

    public TruncationSelection() {

    }

    public void select() {
        double percent = 0.5;

        Arrays.sort(population);

        int percentile = (int) Math.round(percent * population.length);

        int starting = population.length - percentile; 
        
        for (int i = 0; i < population.length; i++) {
            
            if (i >= starting) {
                selected[i] = selected[i] + 1;
            }
           
        }
        
        for (int i = 0; i < selected.length; i++) {
            System.out.println(population[i] + " was selected " + selected[i] + " times.");
        }


    }

}

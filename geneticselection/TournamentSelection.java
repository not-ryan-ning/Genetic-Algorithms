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
public class TournamentSelection {
    
    double population[] = {8, 7, 6, 5, 4, 3, 2};
    double selected[] = {0, 0, 0, 0, 0, 0, 0};
    
    int tournamentSize = 4;
    double[] tournament = new double[tournamentSize]; 
    
    public TournamentSelection() {
        
       
    }
    
    public void select() {
        
        Arrays.sort(population);
        
        Random rand = new Random(); 
        
        int tournaments = 5;
        
        for (int i = 0; i < tournaments; i++) {
            
            for (int j = 0; j < tournament.length; j++) {
                int random = rand.nextInt(population.length); 
            
                tournament[j] = population[random];
            }
            
            double max = 0;

            for (int k = 0; k < tournament.length; k++) {
                if (tournament[k] > max) {
                    max = tournament[k];
                }      
            }
            
            for (int l = 0; l < population.length; l++) {   
                if (max == population[l]) {
                    selected[l] = selected [l] + 1;
                }
            }

        }
        
        for (int i = 0; i < selected.length; i++) {
            System.out.println(population[i] + " was selected " + selected[i] + " times.");
        }

        
        
    }
    
    
    
}

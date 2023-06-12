/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geneticselection;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author ryan
 */
public class GeneticSelection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        StochasticUniversalSampling SUS = new StochasticUniversalSampling(); 
        
//        SUS.select();

        TruncationSelection trunS = new TruncationSelection();
        
//        tS.select();

        TournamentSelection tournS = new TournamentSelection();
        
//        tourn.select();
        
        PartiallyMappedCrossover PMC = new PartiallyMappedCrossover();
        
//        PMC.crossover();

        OrderedCrossover OX = new OrderedCrossover(); 
        
//        OX.crossover(); 

        MutationRate mutationRate = new MutationRate();
        
        mutationRate.mutate();
        
        
    }
    
}

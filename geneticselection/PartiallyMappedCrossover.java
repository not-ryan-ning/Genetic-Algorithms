/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geneticselection;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author ryan
 */
public class PartiallyMappedCrossover {

    int parent1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int parent2[] = {9, 3, 7, 8, 2, 6, 5, 1, 4};

    int child[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};

    ArrayList<Integer> notPresent = new ArrayList<>(); // stores index locations of not present values

    public PartiallyMappedCrossover() {

    }

    public void crossover() {

        int lowerbound = 3;
        int upperbound = 7;

        for (int i = lowerbound; i < upperbound; i++) {
            child[i] = parent1[i];
        }

        for (int i = lowerbound; i < upperbound; i++) {
            boolean flag = true;

            for (int j = lowerbound; j < upperbound; j++) {
                if (parent2[i] == child[j]) {
                    flag = false;
                }

            }
            if (flag == true) {
                notPresent.add(i);
            }

        }


        for (int i = 0; i < notPresent.size(); i++) {
            int currentValue = parent1[notPresent.get(i)];
            int storedValue = parent2[notPresent.get(i)];
            boolean flag = true;

            while (flag) {

                int index = -1;

                for (int j = 0; j < parent2.length; j++) {
                    if (parent2[j] == currentValue) {          
                        index = j;
                    }
                }
   

                if (child[index] == 0) {
                    child[index] = storedValue;
                    flag = false;
                } else {
                    currentValue = parent1[index];
                }

            }

            System.out.println(Arrays.toString(child));

        }

        for (int i = 0; i < parent2.length; i++) {

            if (child[i] == 0) {
                child[i] = parent2[i];

            }

        }
        System.out.println(Arrays.toString(child));

    }

}

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
public class OrderedCrossover {

    int parent1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int parent2[] = {9, 3, 7, 8, 2, 6, 5, 1, 4};

    int child[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};

    ArrayList<Integer> notPresent = new ArrayList<>();

    public OrderedCrossover() {

    }

    public void crossover() {
        
        System.out.println(Arrays.toString(parent1));
        System.out.println(Arrays.toString(parent2));

        int lowerbound = 3;
        int upperbound = 7;

        for (int i = lowerbound; i < upperbound; i++) {
            child[i] = parent1[i];
        }

        for (int i = upperbound; i < parent2.length; i++) {
            boolean flag = true;

            for (int j = lowerbound; j < upperbound; j++) {
                if (parent2[i] == child[j]) {
                    flag = false;
                }

            }
            if (flag == true) {
                notPresent.add(parent2[i]);
            }

        }

        for (int i = 0; i < upperbound; i++) {
            boolean flag = true;

            for (int j = lowerbound; j < upperbound; j++) {
                if (parent2[i] == child[j]) {
                    flag = false;
                }

            }
            if (flag == true) {
                notPresent.add(parent2[i]);
            }

        }
        System.out.println(notPresent.toString());

        int count = 0;
        for (int i = upperbound; i < child.length; i++) {
            child[i] = notPresent.get(count);

            System.out.println(Arrays.toString(child));
            count += 1;

        }

        for (int i = 0; i < lowerbound; i++) {
            child[i] = notPresent.get(count);

            System.out.println(Arrays.toString(child));
            count += 1;

        }
    }

}

package com.kea;

import java.util.*;

public class Lotto {


    public Set generateSet7(){
        int minNumber = 1;
        int maxNumber = 36;
        Set<Integer> randomSet7 = new HashSet<>();

        while(randomSet7.size() < 7) {
            int randomNUmber = (int) Math.floor(Math.random()*(maxNumber-minNumber+1)+minNumber);
            randomSet7.add(randomNUmber);
        }
        return randomSet7;
    }


    public Set<Integer> winnerNumbers(Set<Integer> myNumbers, Set<Integer> randomNumbers) {
        randomNumbers.retainAll(myNumbers);
        return randomNumbers;
    }

    public Set myNumbers(){
        int minNumber = 1;
        int maxNumber = 36;
        Set<Integer> myNumbers = new HashSet<>();

        while(myNumbers.size() < 7) {
            int randomNUmber = (int) Math.floor(Math.random()*(maxNumber-minNumber+1)+minNumber);
            myNumbers.add(randomNUmber);
        }
        return myNumbers;
    }
}

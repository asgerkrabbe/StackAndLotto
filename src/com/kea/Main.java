package com.kea;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	Lotto lotto = new Lotto();
        Set randomNumbers = lotto.generateSet7();
        Set myNumbers = lotto.myNumbers();

        MyStack<Integer> myStack = new MyStack<>();
        Deque<Integer> stack = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            myStack.push(i, stack);
        }


        System.out.println(stack);
        System.out.println(myStack.peek(stack));
        System.out.println(myStack.pop(stack));
        System.out.println(myStack.peek(stack));



        System.out.println("My numbers: " + myNumbers);
        System.out.println("Lotto numbers: " + randomNumbers);
        System.out.println("Matching numbers: " + lotto.winnerNumbers(myNumbers, randomNumbers));


    }


}

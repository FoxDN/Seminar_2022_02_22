package com.app;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        // fori первая часть
        for (int i = 0; i < 100; i++) {
            if (i == 13 || i == 66) {
                continue;
            }
            System.out.println("первое задание " + i);

        }

        System.out.println("Второе задание ");
        System.out.println("______________________________________");

        int sum = 1;
        for (int i = 0; i <= 100; i++) {
            sum = sum + sum * i;

            //ctrl + D
            if (sum > 1000) {
                System.out.println("цикл завершон на значении i = " + i + " , sum = " + sum);
                break;

            }
        }
        System.out.println("Sum =" + sum) ;

        System.out.println("Задание во втором файле ");
        System.out.println("______________________________________");

        String[] arrayOfFruits = {"Kiwi", "cabasa", "Apple", "papaya", "Orange"};
        String[] arrayOfFood = Arrays.copyOf(arrayOfFruits, arrayOfFruits.length);

        for (int i = 0; i < arrayOfFood.length; i++) {
            System.out.println("массив arrayOfFood элемент : " + i + " содержит значение: " + arrayOfFood[i]);
        }
        // еще один метот вывода массива
        for (String value:arrayOfFood) {
            System.out.println("массив arrayOfFood элемент содержит значение: " + value);
        }

        int [][] score = {{10,11,12,13},{20,21,22,23},{30,31,32,33}};
        int [] result = new int[score.length];
        int resultOfScore = 0;
        for (int i = 0; i < score.length; i++) {
            result[i]  = 0;
            for (int j = 0; j < score[i].length; j++) {
                result[i] = result[i] + score[i][j];
            }
            System.out.println( "result" + i + " "+ result[i] );
        }




    }
}


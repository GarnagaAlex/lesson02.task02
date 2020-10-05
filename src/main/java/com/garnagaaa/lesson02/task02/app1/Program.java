/*
 * Copyright (C) 2020 ;)
 */

package com.garnagaaa.lesson02.task02.app1;

import java.util.Random;

/**
 * @author Aleksei Garnaga
 */
public class Program {

    static final int N = 10000; // Кол-во чисел
    static final int MIN = -1; // Минимальное число
    static final int MAX = 1000; // Максимальное число

    public static void main(String[] args) throws Exception {

        for (int i : RandomArrGenerator(MAX, MIN, N)) {
            if (i < 0) {
                throw new Exception("Число должно быть положительным.");
            }

            if (i == (int) Math.pow((int) Math.sqrt(i), 2)) {
                System.out.println(i);
            }

        }
    }

    /**
     * Генератор массива случайных чисел (RAG)
     *
     * @param max   Максимальное число
     * @param min   Минимальное число
     * @param count Кол-во чисел в массива
     * @return int[] Массив случайных чисел
     */
    public static int[] RandomArrGenerator(int max, int min, int count) {
        Random rd = new Random();
        int[] temp = new int[count];
        for (int i = 0; i < count; i++) {
            temp[i] = rd.nextInt(max - min) + min;
        }
        return temp;
    }

}
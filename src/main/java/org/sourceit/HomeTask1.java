package org.sourceit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class HomeTask1 {

    /**
     * Проверить, является ли число четным.
     *
     * @param number
     * @return является ли число четным.
     */
    public static boolean isEven(int number)
    {

        if((number%2)==0){
            System.out.println("Число " + number +" четное");
        }
        else if((number%1)==0){
            System.out.println("Число "+number+" нечетное");
        }
        return number %2 == 0;
    }

    /**
     * Метод возвращает значение гипотенузы.
     * Числа должны быть больше 0. Если какое-либо значение
     * меньше 0, возращать 0.
     *
     * @param a должно быть больше 0.
     * @param b должно быть больше 0.
     * @return значение гипотенузы.
     */
    public static double findHypotenuse(double a, double b)
    {

        double h =0;

        h = Math.sqrt(a*a+b*b);
        if (a<0) {
            return 0;
        }
        if (b<0){
            return 0;
        }
        return h;

    }

    /**
     * Метод находит периметр треугольника.
     *
     * @param a
     * @param b
     * @param c
     * @return периметр треугольника.
     */
    public static double perimeter(double a, double b, double c)
    {
        double p=0;
        p = a + b + c;

        return p;
            }

    /**
     * Метод находит площадь треугольника.
     * Значения должны быть больше 0.
     *
     * @param a
     * @param b
     * @return площадь треугольника.
     */
    public static double area(double a, double b) {

        double area =0;
        if(a<0){
            return 0;
        }
        else if(b<0){
            return 0;
        }
        if(a>0&&b>0) {
            area = (1 / 2) * a * b;
            return area;
        }

        return area;
    }

    /**
     * Генерирует случайное число в заданных пределах.
     *
     * @param min минимальное значение.
     * @param max саксимальное значение.
     * @return сгенерированное число.
     */
    public static int generateNumberFromRange(int min, int max)
    {
        
        int random = min + (int) (Math.random()*(max-min)+1);


        return random;
    }

    /**
     * Считает сумму цифр числа.
     * Число может быть любое,
     * как и положительное так и отрицательное.
     *
     * @param number
     * @return сумма цифр.
     */
    public static long calculateSum(long number)
    {
        long sum =0;

        /*if (number>0){
        for (long i =number;i>0;i/=10){
            sum+=i%10;
            i=i/10;
        }
        }*/
        /*else if (number<0){
            for (long j =number;j<0;j/=10){
                sum+=j%10;
            }
        }*/
        if(number>0){
            while(number>0){
                sum+=number%10;
                number=number/10;
            }
        }
        else if(number<0){
            while(number<0){
                sum+=number%10;
                number=number/10;
            }
        }

        return Math.abs(sum);

    }

    /**
     * Посчитайте элемент последовательности Фибоначчи.
     * Первый и второй члены последовательности равны единицам,
     * а каждый следующий сумме двух предыдущих.
     *
     * @param till до какого элемента считать.
     * @return элемент последовательности.
     */
    public static int fibonacci(int till)
    {

        int a=1;
        int b=1;
        int fib=0;
        int i =2;

        while(i<=till){
            fib = a+b;
            a=b;
            b=fib;
            i++;
        }
        if(till<0){
            /*fib=a+b;
            a=b;
            b=fib;
            i++;*/
        return 1;
        }
        return fib;
            }

    /**
     * "Счастливым" считается билетик у которого
     * сумма первых трёх цифр номера равна сумме последних
     * трёх цифр, как, например, в билетах с номерами 003102 или 567576.
     *
     * @param ticket должен быть от 1 до 999999
     * @return является ли билет счастливым.
     */
    public static boolean isHappy(long ticket)
    {
        int tick =0;

        for(int i=1;i<1000000;i++){
            int i1=i/100000%10, i2=i/10000%10,
                    i3=i/1000%10,i4=i/100%10,
                    i5=i/10%10,i6=i%10;
            if((i1+i2+i3)==(i4+i5+i6)){
                tick++;
            }
        }
        if(ticket<0){
            return false;
        }
        return true;
    }
}

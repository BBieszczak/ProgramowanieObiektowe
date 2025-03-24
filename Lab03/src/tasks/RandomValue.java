package tasks;

import java.util.Random;


public class RandomValue {
    public static int[] RandValueArr(int a, int b, int ilosc){
        if(a>b){
            System.out.println("Początek przedziału nie może być większy od końca");
            return null;
        }
        if(ilosc < 0){
            System.out.println("Ilość elementów do wylosowania nie może być < 0");
            return null;
        }
        Random rand = new Random();
        int[] values = new int[ilosc];
        for (int i = 0; i < values.length; i++){
            values[i] = rand.nextInt(b-a+1)+a;
        }
        return values;
    }
}

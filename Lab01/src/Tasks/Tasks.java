package Tasks;

import java.util.Scanner;

public class Tasks {
    public void task01(){
        System.out.println("Bartosz, 19");
    }
    public void task02(){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
    }
    public boolean task03(int num){
        if (num % 2==0){
            System.out.println("prawda");}
        else{
            System.out.println("fałsz");}
        return num % 2 == 0;
    }
    public boolean task04(int num){
        if (num % 3==0 && num % 5==0 ){
            System.out.println("prawda");}
        else{
            System.out.println("fałsz");}
        return num % 3 == 0 || num % 5 == 0;
    }
    public double task05(int num){
        System.out.println(Math.pow(num,3));
        return Math.pow(num, 3);
    }
    public double task06(int num){
        System.out.println(Math.sqrt(num));
        return Math.sqrt(num);
    }
    public boolean task07(int a, int b, int c){

        return a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a;
    }
}
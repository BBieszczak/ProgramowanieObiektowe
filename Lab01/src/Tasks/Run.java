package Tasks;

import java.util.Scanner;

public class Run {
    public void RunTasks(){
        int a, b, c;
        Tasks tasks = new Tasks();
        Scanner input = new Scanner(System.in);
        System.out.println("Laboratorium 1");
        System.out.println("1. Zadanie 1\n2. Zadanie 2\n3. Zadanie 3\n4. Zadanie 4\n5. Zadanie 5\n6. Zadanie 6\n7. Zadanie 7\n");
        System.out.println("Wybierz które zadanie rozwiązać.");
        int task = input.nextInt();
        switch(task){
            case 1:
                tasks.task01();
                break;
            case 2:
                tasks.task02();
                break;
            case 3:
                System.out.println("Wprowadź liczbę.");
                a = input.nextInt();
                tasks.task03(a);
                break;
            case 4:
                System.out.println("Wprowadź liczbę.");
                a = input.nextInt();
                tasks.task04(a);
                break;
            case 5:
                System.out.println("Wprowadź liczbę.");
                a = input.nextInt();
                tasks.task05(a);
                break;
            case 6:
                System.out.println("Wprowadź liczbę.");
                a = input.nextInt();
                tasks.task06(a);
                break;
            case 7:
                System.out.println("Wprowadź 3 liczby.");
                a = input.nextInt();
                b = input.nextInt();
                c = input.nextInt();
                tasks.task07(a, b, c);
                break;
            default:
                System.out.println("Niepoprawne dane.");
                break;
        }
    }
}
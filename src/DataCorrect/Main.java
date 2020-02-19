package DataCorrect;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class Main {

    private static int a;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Программа корректная дата");
        System.out.print("Введите год и нажмите enter: ");
        int year = sc.nextInt();
        int i = year;
        int a = 0;
        if (i % 4 == 0) {
            if ((i % 100 != 0) || (i % 400 == 0)){
                System.out.println("Год високосный ");
                a = 29;
          }
        }
        else {
            System.out.println("Год не високосный ");
            a = 28;
        }
        String s = null;
        int max_day = 0;
        System.out.print("Введите месяц и нажмите enter: ");
        int month = sc.nextInt();
        switch (month){
    case 1: s = "Января"; max_day = 31; break;
    case 2: s = "Февраля"; max_day = a; /* System.out.println("a = "+ a);*/ break;
    case 3: s = "Марта"; max_day = 31; break;
    case 4: s = "Апреля"; max_day = 30; break;
    case 5: s = "Мая"; max_day = 31; break;
    case 6: s = "Июня"; max_day = 30; break;
    case 7: s = "Июля"; max_day = 31; break;
    case 8: s = "Августа"; max_day = 31; break;
    case 9: s = "Сентябя"; max_day = 30; break;
    case 10: s = "Октября"; max_day = 31; break;
    case 11: s = "Ноября"; max_day = 30; break;
    case 12: s = "Декабря"; max_day = 31; break;
}
        System.out.print("Введите день и нажмите enter: ");
        int day = sc.nextInt();
if (s== null || day <=0 || year <=0 || day > max_day)
    System.out.println("ВВДИТЕ ПРАВИЛЬНУЮ ДАТУ!!!");
else
System.out.println("Дата правильна:  " + day +" "+ s + " " + year + " года");

    }
}

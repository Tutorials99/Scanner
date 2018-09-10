import java.util.Scanner;

/**
 *
 */
public class Tutorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //تعريف السكانر المسؤول عن اخذ الانبوت من اليوزر
        System.out.println("Enter your name: "); //سؤال اليوزر عن اسمه
        String name = scanner.next();//اخذ الانبوت وتخزينه في فاريبل
        System.out.println("your name is: " + name); //طباعة الاسم لليوزر
    }
}

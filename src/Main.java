import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        //int age;
        if (age<14) {
            System.out.println("Тебе всего " + age  + ", разрешен прокол ушей исключительно в присутствии родителей");
        }
        if (age>=14 && age<18) {
            System.out.println("Тебе уже " + age +", ты можешь проколоть: нос, пупок, язык, но только в присутствии родителей");
        }
        if (age>=18) {
            System.out.println("Ты уже взрослый, тебе можно все, в рамках закона");
        }
    }
}
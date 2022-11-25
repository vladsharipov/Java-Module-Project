import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int friendsNumber;
        System.out.println("На скольких человек необходимо разделить счёт?");
        
        Scanner scanner = new Scanner(System.in);
            
        while (true){
            friendsNumber = scanner.nextInt();
            if (friendsNumber > 1) {
                break;
            }
            System.out.println("Упс! Для верного расчёта количество человек должно быть больше 1. Попробуйте ещё раз:");
        }
        System.out.println("Введите название товара");
        String name = scanner.nextLine();
        System.out.println(name);
    }
}
    


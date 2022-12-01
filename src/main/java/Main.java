import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int friendsNumber;
        System.out.println("На скольких человек необходимо разделить счёт?");
        
        Scanner scanner = new Scanner(System.in);
            
        while (true){
            try{
                friendsNumber = Integer.parseInt(scanner.nextLine());
                if (friendsNumber > 1) {
                    break;
                }
                System.out.println("Упс! Для верного расчёта количество человек должно быть больше 1. Попробуйте ещё раз:");
            }
            catch (NumberFormatException exception) {
                System.out.println("Нужно ввести целое число больше 1. Попробуйте ещё раз:");
            }
        }
        Goods goodsList = new Goods();
        goodsList.collectNamesAndPrices();
    }
}
    


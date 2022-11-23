public class Main {

    public static void main(String[] args) {
        int friendsNumber = 1;
        System.out.println("На скольких человек необходимо разделить счёт?");
        
        Scanner scanner = new Scanner(System.in);
            
        while (friendsNumber <= 1){
            friendsNumber = scanner.nextInt();
            System.out.println("Упс! Для верного расчёта количество челове должно быть больше 1. Попробуйте ещё раз:");
        }
    }
}
    

public class Goods {
    String goodName;
    float goodPrice;
}
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
        Goods goods = new Goods();
        goods.collectNamesAndPrices();
        float debtPerFriend = goods.priceSum / friendsNumber;
        String rubleForm = getWordForm((int)debtPerFriend);
        String debtPhraseTemplate = "С каждого %.2f %s";
        System.out.print("Добавленные товары:\n" + goods.goodList);
        System.out.print(String.format(debtPhraseTemplate, debtPerFriend, rubleForm));
    }
    public static String getWordForm(int num){
        int num100 = num % 100;
        if (num100 <= 4 || num100 >= 21) {
            int num10 = num100 % 10;
            if (num10 == 1) {
                return " рубль";
            } else if (num10 > 1 && num10 < 5) {
                return " рубля";
            }
        }
        return " рублей";
    }

}
    


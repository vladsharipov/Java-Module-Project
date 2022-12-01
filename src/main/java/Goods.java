import java.util.Scanner;

public class Goods {
    StringBuffer goodList = new StringBuffer();
    float priceSum = 0.0f;
    public void collectNamesAndPrices() {
        String name, stopWord, userChoseToStop;
        float price = 0.0f;
        boolean stopper = false;
        stopWord = "завершить";
        Scanner goodScanner = new Scanner(System.in);
        while(!stopper) {
            System.out.println("Введите название товара:");
            name = goodScanner.nextLine();
            System.out.println("Введите цену товара в формате: рубли.копейки:");
            while(true) {
                try {
                    price = Float.parseFloat(goodScanner.nextLine());
                    if (price > 0) {
                        break;
                    }
                    System.out.println("Цена должна быть больше нуля. Попробуйте ещё раз:");
                } catch (NumberFormatException exception) {
                    System.out.println("Цена должна быть в формате: рубли.копейки. Попробуйте ещё раз:");
                }
            }
            goodList.append(name + "\n");
            priceSum = priceSum + price;
            System.out.println("Товар успешно добавлен. Добавить ещё товар или завершить?");
            userChoseToStop = goodScanner.nextLine();
            stopper = userChoseToStop.equalsIgnoreCase(stopWord);
        }
        goodScanner.close();
    }
}

package exercise.task_24;

import exercise.task_25.BasketFullCheckedException;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.IntStream;

/**
 * Stwórz klasę Basket, która imituje koszyk i przechowuje aktualną ilość elementów w koszyku.
 * Dodaj metodę addToBasket(), która dodaje element do koszyka (zwiększając aktualny stan o 1)
 * oraz metodę removeFromBasket(), która usuwa element z koszyka (zmniejszając aktualny stan o 1).
 * Koszyk może przechowywać od 0 do 10 elementów.
 * W przypadku, kiedy użytkownik chce wykonać akcję usunięcia przy stanie 0 lub dodania przy stanie 10,
 * rzuć odpowiedni runtime exception (BasketFullException lub BasketEmptyException).
 */

public class Basket {

    private List basket = new ArrayList();

    public void addToBasket(Object object) throws BasketFullCheckedException {
        basket.add(object);
        if (basket.size() > 10) {
            throw new BasketFullCheckedException();
//            throw new BasketFullException("Unable to add more elements", -1);
        }
    }

    public static void main(String[] args) {
        Basket basket = new Basket();

            IntStream.rangeClosed(1, 12).forEach(i -> {
                try {
                    basket.addToBasket(new Object());
                } catch (BasketFullCheckedException e) {
                    e.printStackTrace();
                }
            });

    }

}

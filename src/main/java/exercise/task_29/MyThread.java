package exercise.task_29;

/**
 * Utwórz klasę rozszerzającą klasę Thread, przeciąż metodę run(),
 * w której wyświetlisz w konsoli nazwę wątku odczytując ją ze statycznej metody aktualnego wątku:
 *
 * Thread.currentThread().getName()
 *
 * Utwórz klasę z metodą public static void main(String[] args).
 * Wewnątrz metody main utwórz zmienną typu naszej klasy stworzonej powyżej oraz zainicjuj klasę.
 * Na zmiennej wykonać metodę start().
 */

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread thread = new MyThread();
        thread.start();
    }
}

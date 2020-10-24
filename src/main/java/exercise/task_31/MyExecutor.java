package exercise.task_31;

import exercise.task_29.MyThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Stwórz klasę zawierającą standardową metodę statyczną main oraz zmienną typu Executor
 * i korzystając z metody fabrykującej new FixedThreadPool klasy Executor stwórz pulę executorów o rozmiarze 2.
 *
 * W iteracji dodaj do Executora 10 obiektów klasy poprzedniego zadania.
 * Jako nazwy użyj dowolnego ciągu znaków oraz numeru aktualnej iteracji.
 */
public class MyExecutor {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for(int i = 0; i < 10; i++) {
            executorService.execute(new MyThread());
        }
        executorService.awaitTermination(2, TimeUnit.SECONDS);
        executorService.shutdown();
    }

}

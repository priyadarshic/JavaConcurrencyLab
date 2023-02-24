# JavaConcurrencyLab

---

Explore Multithreading and Concurrency concepts with Java

``` Java
    /*
 * Copyright (c) 2021.
 * All Intellectual Property Rights to this File/Digital Product belong to the @Author
 * PriyadarshiChaudhuri. Contact priyadarshi.c@gmail.com for enquiries.
 * This File maybe used for Non-commercial purpose only with Credits and link to GitHub repository.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureCallableDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        Float floatArr[] = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        ArrayList<Float> fltArr = new ArrayList<>(Arrays.asList(floatArr));
        MyCallable<Float> floatMyCallable = new MyCallable<Float>(fltArr);
        Future future = executorService.submit(floatMyCallable);

        System.out.println("future.isDone(): " + future.isDone());
        System.out.println("future.get(): " + future.get());       // Blocking Call get()
        executorService.shutdown();


    }
}

```    




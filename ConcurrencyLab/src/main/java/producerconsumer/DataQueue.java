package producerconsumer;

import java.util.LinkedList;

public class DataQueue {

    private LinkedList<Integer> queue;
    private int MAX_SIZE = 10;

    public DataQueue() {
        this.queue = new LinkedList<>();
    }

    public void putData(Integer data) throws InterruptedException {
        synchronized (queue)
        {
            Thread.sleep(500);
            if(queue.size()==MAX_SIZE)
            {
                queue.wait();
            }
            if(!queue.contains(data))
            {
                queue.addFirst(data);
                System.out.println("Write Data: " + data);

            }


            queue.notifyAll();
        }
    }

    public Integer getData() throws InterruptedException {

        Integer field;
        synchronized (queue)
        {
            Thread.sleep(500);
            if(queue.size()==0)
            {
                queue.wait();
            }

            field = queue.pollLast();

            queue.notifyAll();
        }

        return field;
    }
}

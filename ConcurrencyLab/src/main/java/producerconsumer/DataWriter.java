package producerconsumer;

import java.util.LinkedList;

public class DataWriter implements Runnable{

    DataQueue dataQueue;

    public DataWriter(DataQueue dataQueue) {
        this.dataQueue = dataQueue;
    }

    @Override
    public void run() {

        int writeData = 0;
        while(true){
            try {

                Thread.sleep(500);
                dataQueue.putData(++writeData);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

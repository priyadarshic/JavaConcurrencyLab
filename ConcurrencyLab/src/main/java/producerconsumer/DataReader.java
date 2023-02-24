package producerconsumer;

public class DataReader implements Runnable{
    DataQueue dataQueue;

    public DataReader(DataQueue dataQueue) {
        this.dataQueue = dataQueue;
    }


    @Override
    public void run() {
        while(true)
        {
            try {
                Thread.sleep(1000 * 2);
                System.out.println("Read Data: " + dataQueue.getData());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

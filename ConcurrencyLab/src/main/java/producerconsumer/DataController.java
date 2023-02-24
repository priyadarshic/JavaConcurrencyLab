package producerconsumer;

public class DataController {

    public static void main(String[] args) {

        DataQueue dataQueue = new DataQueue();
        DataWriter dataWriter = new DataWriter(dataQueue);
        DataReader dataReader = new DataReader(dataQueue);
        DataWriter dataWriter1 = new DataWriter(dataQueue);

        Thread readerThread = new Thread(dataReader);
        Thread writerThread = new Thread(dataWriter);
        Thread writerThread2 = new Thread(dataWriter1);

        readerThread.start();
        writerThread.start();
//        writerThread2.start();

    }
}

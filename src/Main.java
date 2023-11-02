public class Main {
    public static void main(String[] args) {

        MultiThread multiThread = new MultiThread();
        MultiThread multiThread2 = new MultiThread();
        multiThread.run();
        multiThread2.run();
        System.out.println("Hello world!");
    }
}
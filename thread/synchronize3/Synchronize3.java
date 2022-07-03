package thread.synchronize3;

class MyData{
    int data = 3;

    public synchronized void plusData() {
        synchronized (this){
        int mydata = data;
        try{ Thread.sleep(2000);} catch (InterruptedException e){}
        data = mydata+1;
    }
    }

}
class PlusThread extends Thread {
    MyData myData;
    public PlusThread(MyData myData) {
        this.myData = myData;
    }
    @Override
    public void run() {
        myData.plusData();
        System.out.println(getName()+ "실행결과 : " + myData.data);
    }
}
public class Synchronize3 {
    public static void main(String[] args) {
        //공유객체 생성하기
        MyData myData = new MyData();
        //쓰레드 생성하기
        Thread plusThread1 = new PlusThread(myData);
        plusThread1.setName("쓰레드1");
        plusThread1. start();
        //중간에 딜레이 주기
        try{ Thread.sleep(1000);} catch (InterruptedException e){}
        Thread plusThread2 = new PlusThread(myData);
        plusThread2.setName("쓰레드2");
        plusThread2. start();
    }
}


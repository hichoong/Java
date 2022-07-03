package thread.synchronize5;

class MyData{
    synchronized void abc() {
        for(int i=0; i<3;i++) {
            System.out.println(i + "sec");
            try{Thread.sleep(1000);} catch (InterruptedException e) {}
        }
    }
    synchronized void bcd() {
        for(int i=0; i<3;i++) {
            System.out.println(i + "초");
            try{Thread.sleep(1000);} catch (InterruptedException e) {}
        }
    }
    void cde () {
        synchronized(new Object()) {
            for(int i=0; i<3;i++) {
                System.out.println(i + "번째");
                try{Thread.sleep(1000);} catch (InterruptedException e) {}
            }
        }
    }
}
public class Synchronize5 {
    public static void main(String[] args) {
        //공유객체 만들기
       MyData myData = new MyData();
        //비교를 위한 각각의 쓰레드 추가
        new Thread() {
            public void run() {
                myData.abc();
            }
        }.start();
        new Thread() {
            public void run() {
                myData.bcd();
            }
        }.start();
        new Thread() {
            public void run() {
                myData.cde();
            }
        }.start();

    }
}
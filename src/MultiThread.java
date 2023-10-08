public class MultiThread {
    public static void main(String[] args) {
        /*MyThread thread1 = new MyThread("Мыть посуду");
        MyThread thread2 = new MyThread("Мыть полы");
        MyThread thread3 = new MyThread("Стирать белье");
        thread1.start();
        thread2.start();
        thread3.start();*/
        /*Thread thread1 = new Thread(new MyRunnableClass("Мыть посуду"));
        Thread thread2 = new Thread(new MyRunnableClass("Мыть полы"));
        Thread thread3 = new Thread(new MyRunnableClass("Стирать белье"));
        thread1.start();
        thread2.start();
        thread3.start();*/
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    System.out.println("Мыть посуду "+i+"%");
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    System.out.println("Мыть полы "+i+"%");
                }
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    System.out.println("Стирать белье "+i+"%");
                }
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class MyRunnableClass implements Runnable{
    String task;

    public MyRunnableClass(String task) {
        this.task = task;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(task+" "+i+"%");
        }
    }
}

class MyThread extends Thread{
    String task;
    public MyThread(String task){
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        for (int i = 1; i <= 100; i++) {
            System.out.println(task+" "+i+"%");
        }
    }
}
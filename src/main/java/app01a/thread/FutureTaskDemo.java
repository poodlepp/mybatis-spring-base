package app01a.thread;

import java.util.concurrent.*;

/**
 * 参考   https://www.cnblogs.com/kenshinobiy/p/4671314.html
 */
public class FutureTaskDemo {
    //线程安全
    private static ConcurrentHashMap<String, FutureTask> fileName2Data = new ConcurrentHashMap<String, FutureTask>();
    //新建连接池
    private static ExecutorService exec = Executors.newCachedThreadPool();

    //被多次调用的方法，主要利用了concurrentHashMap的安全性，肯定的肯定是同一个futureTask，get的也就肯定是同样的结果。
//    private void processFile3(String fName) throws ExecutionException, InterruptedException {
//        FutureTask data = fileName2Data.get(fName);
//        //“偶然”-- 1000个线程同时到这里，同时发现data为null
//        if(data==null){
//            data = newFutureTask(fName);
//            FutureTask old = fileName2Data.putIfAbsent(fName, data);
//            if(old==null){
//                exec.execute(data);
//            }else{
//                data = old;
//            }
//        }
//        String d = (String) data.get();
//        //process with data
//    }

    //callable的使用之一  可以得到多线程的执行结果，同时增加了很多功能，状态参数等。
    //详细讲解  http://www.importnew.com/25286.html
    private FutureTask newFutureTask(final String file){
        return  new FutureTask(new Callable<String>() {
            public String call() {
                return readFromFile(file);
            }
            private String readFromFile(String file){return "";}
        });
    }


    /**
     * 知识点：
     * Thread 也可以共享资源，也可以被多个thread执行，这一点有些争议，runnable的主要优势是其实现类还可以继承实现其他的类，而thread只能单继承，不能再继承其他类。
     */


    public void testDemo1(){
        //固定的线程池
        ExecutorService pool = Executors.newFixedThreadPool(5);
        pool.execute(new Thread());
        pool.shutdown();

        //还有多中线程池

        //阻塞队列  感觉类似于size=1的线程池 但是先进先出 blockingqueue
        // https://www.jianshu.com/p/4c24e246400f
        //  https://www.cnblogs.com/superfj/p/7757876.html
        /**
         *ArrayBlockingQueue  大小有限制
         * DelayQueue   可设置阻塞时间
         * linkedBlockingQueue  链表 可以设置大小
         * 有优先级的队列
         * size=1的队列
         */

        /**
         * Semaphore  信号灯 可以控制最多只有3个线程在异步执行
         * Exchanger  两线程间交换数据，两个线程都准备好时开始，否则等待
         * CountDownLatch 计数器  与信号灯有一点点类似  1个人通知多个人做某事，然后这个人再去做某事
         * CyclicBarrier 所有人到齐了再走  类似上面的类
         */
    }
}

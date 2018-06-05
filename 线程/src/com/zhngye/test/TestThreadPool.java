package com.zhngye.test;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.apache.tomcat.util.collections.SynchronizedQueue;
/**
 * @author zhaoqide
 * @desciption  线程池会吃掉堆栈，能不能想办法，在异常的时候 ，打印出提交线程的堆栈？并给出你的实现代码
 * @updatetime 2018年5月7日上午10:43:53
 */
public class TestThreadPool {

    static ExecutorService executor = new ThreadPoolExecutor(5, 5, 0, TimeUnit.SECONDS, new SynchronousQueue<Runnable>());
    
    public static void main(String[] args) {
    		//没有打印堆栈信息
            executor.submit(new Worker());
            //
            new Worker().run();
            
    }

    static class Worker implements Runnable{
            @Override
            public void run() {
            		System.out.println("nihao");
                    throw new RuntimeException("asdasd");
            }
            
    }
}

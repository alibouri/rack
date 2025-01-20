package tvo.webrtc;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

public class ThreadUtils {
    public interface BlockingOperation {
        void run();
    }

    public static class ThreadChecker {
        private Thread thread;

        public void checkIsOnValidThread() {
        }

        public void detachThread() {
        }
    }

    public static void awaitUninterruptibly(CountDownLatch countDownLatch0) {

        class tvo.webrtc.ThreadUtils.2 implements BlockingOperation {
            final CountDownLatch val$latch;

            public tvo.webrtc.ThreadUtils.2(CountDownLatch countDownLatch0) {
            }

            @Override  // tvo.webrtc.ThreadUtils$BlockingOperation
            public void run() {
            }
        }

    }

    public static boolean awaitUninterruptibly(CountDownLatch countDownLatch0, long v) {
    }

    public static void checkIsOnMainThread() {
    }

    public static StackTraceElement[] concatStackTraces(StackTraceElement[] arr_stackTraceElement, StackTraceElement[] arr_stackTraceElement1) {
    }

    public static void executeUninterruptibly(BlockingOperation threadUtils$BlockingOperation0) {
    }

    public static Object invokeAtFrontUninterruptibly(Handler handler0, Callable callable0) {
        class 1CaughtException {
            Exception e;

        }


        class 1Result {
            public Object value;

        }


        class tvo.webrtc.ThreadUtils.3 implements Runnable {
            final CountDownLatch val$barrier;
            final Callable val$callable;
            final 1CaughtException val$caughtException;
            final 1Result val$result;

            public tvo.webrtc.ThreadUtils.3(1Result threadUtils$1Result0, Callable callable0, 1CaughtException threadUtils$1CaughtException0, CountDownLatch countDownLatch0) {
            }

            @Override
            public void run() {
            }
        }

    }

    public static void invokeAtFrontUninterruptibly(Handler handler0, Runnable runnable0) {

        class tvo.webrtc.ThreadUtils.4 implements Callable {
            final Runnable val$runner;

            public tvo.webrtc.ThreadUtils.4(Runnable runnable0) {
            }

            @Override
            public Object call() {
            }

            public Void call() {
            }
        }

    }

    public static void joinUninterruptibly(Thread thread0) {

        class tvo.webrtc.ThreadUtils.1 implements BlockingOperation {
            final Thread val$thread;

            public tvo.webrtc.ThreadUtils.1(Thread thread0) {
            }

            @Override  // tvo.webrtc.ThreadUtils$BlockingOperation
            public void run() {
            }
        }

    }

    public static boolean joinUninterruptibly(Thread thread0, long v) {
    }
}


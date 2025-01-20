package e5;

import H6.e;
import I2.J;
import J2.w;
import Nb.j;
import yc.l;

public final class a implements Thread.UncaughtExceptionHandler {
    public final Thread.UncaughtExceptionHandler X;
    public static final e Y;
    public static a Z;

    static {
        a.Y = new e(19);
    }

    public a(Thread.UncaughtExceptionHandler thread$UncaughtExceptionHandler0) {
        this.X = thread$UncaughtExceptionHandler0;
    }

    @Override
    public final void uncaughtException(Thread thread0, Throwable throwable0) {
        j.f(thread0, "t");
        j.f(throwable0, "e");
        Throwable throwable1 = null;
        Throwable throwable2 = throwable0;
    alab1:
        while(throwable2 != null && throwable2 != throwable1) {
            StackTraceElement[] arr_stackTraceElement = throwable2.getStackTrace();
            j.e(arr_stackTraceElement, "t.stackTrace");
            int v = 0;
            while(v < arr_stackTraceElement.length) {
                StackTraceElement stackTraceElement0 = arr_stackTraceElement[v];
                ++v;
                j.e(stackTraceElement0, "element");
                if(!w.L(stackTraceElement0)) {
                    continue;
                }
                l.r(throwable0);
                J.k(throwable0, c5.a.b0).b();
                break alab1;
            }
            throwable1 = throwable2;
            throwable2 = throwable2.getCause();
        }
        Thread.UncaughtExceptionHandler thread$UncaughtExceptionHandler0 = this.X;
        if(thread$UncaughtExceptionHandler0 != null) {
            thread$UncaughtExceptionHandler0.uncaughtException(thread0, throwable0);
        }
    }
}


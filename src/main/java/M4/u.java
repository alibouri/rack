package M4;

import Nb.j;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import f5.a;
import io.sentry.hints.i;
import java.util.Arrays;
import java.util.List;

public final class u extends AsyncTask {
    public final v a;
    public Exception b;

    public u(v v0) {
        j.f(v0, "requests");
        super();
        this.a = v0;
    }

    @Override  // android.os.AsyncTask
    public final Object doInBackground(Object[] arr_object) {
        if(a.b(this)) {
            return null;
        }
        try {
            Void[] arr_void = (Void[])arr_object;
            if(!a.b(this)) {
                try {
                    j.f(arr_void, "params");
                    try {
                        this.a.getClass();
                        return i.p(this.a);
                    }
                    catch(Exception exception0) {
                        this.b = exception0;
                        return null;
                    }
                }
                catch(Throwable throwable1) {
                    a.a(throwable1, this);
                    return null;
                }
            }
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
        }
        return null;
    }

    @Override  // android.os.AsyncTask
    public final void onPostExecute(Object object0) {
        if(a.b(this)) {
            return;
        }
        try {
            List list0 = (List)object0;
            if(!a.b(this)) {
                try {
                    j.f(list0, "result");
                    super.onPostExecute(list0);
                    Exception exception0 = this.b;
                    if(exception0 != null) {
                        Arrays.copyOf(new Object[]{exception0.getMessage()}, 1);
                    }
                }
                catch(Throwable throwable1) {
                    a.a(throwable1, this);
                }
            }
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
        }
    }

    @Override  // android.os.AsyncTask
    public final void onPreExecute() {
        v v0 = this.a;
        if(a.b(this)) {
            return;
        }
        try {
            super.onPreExecute();
            if(v0.X == null) {
                v0.X = Thread.currentThread() instanceof HandlerThread ? new Handler() : new Handler(Looper.getMainLooper());
            }
            return;
        }
        catch(Throwable throwable0) {
        }
        a.a(throwable0, this);
    }

    @Override
    public final String toString() {
        String s = "{RequestAsyncTask:  connection: null, requests: " + this.a + "}";
        j.e(s, "StringBuilder()\n        .append(\"{RequestAsyncTask: \")\n        .append(\" connection: \")\n        .append(connection)\n        .append(\", requests: \")\n        .append(requests)\n        .append(\"}\")\n        .toString()");
        return s;
    }
}


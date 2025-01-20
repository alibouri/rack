package O7;

import M7.e;
import com.google.firebase.perf.util.Timer;
import org.apache.http.HttpMessage;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

public final class f implements ResponseHandler {
    public final ResponseHandler a;
    public final Timer b;
    public final e c;

    public f(ResponseHandler responseHandler0, Timer timer0, e e0) {
        this.a = responseHandler0;
        this.b = timer0;
        this.c = e0;
    }

    public final Object handleResponse(HttpResponse httpResponse0) {
        long v = this.b.b();
        this.c.n(v);
        int v1 = httpResponse0.getStatusLine().getStatusCode();
        this.c.h(v1);
        Long long0 = h.a(((HttpMessage)httpResponse0));
        if(long0 != null) {
            this.c.m(((long)long0));
        }
        String s = h.b(httpResponse0);
        if(s != null) {
            this.c.l(s);
        }
        this.c.c();
        return this.a.handleResponse(httpResponse0);
    }
}


package O7;

import L7.a;
import M.J;
import T7.r;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;

public final class e {
    public final HttpURLConnection a;
    public final M7.e b;
    public long c;
    public long d;
    public final Timer e;
    public static final a f;

    static {
        e.f = a.d();
    }

    public e(HttpURLConnection httpURLConnection0, Timer timer0, M7.e e0) {
        this.c = -1L;
        this.d = -1L;
        this.a = httpURLConnection0;
        this.b = e0;
        this.e = timer0;
        e0.o(httpURLConnection0.getURL().toString());
    }

    public final void a() {
        M7.e e0 = this.b;
        Timer timer0 = this.e;
        if(Long.compare(this.c, -1L) == 0) {
            timer0.g();
            this.c = timer0.X;
            e0.k(timer0.X);
        }
        try {
            this.a.connect();
        }
        catch(IOException iOException0) {
            J.n(timer0, e0, e0);
            throw iOException0;
        }
    }

    public final Object b() {
        Object object0;
        Timer timer0 = this.e;
        this.i();
        HttpURLConnection httpURLConnection0 = this.a;
        int v = httpURLConnection0.getResponseCode();
        M7.e e0 = this.b;
        e0.h(v);
        try {
            object0 = httpURLConnection0.getContent();
        }
        catch(IOException iOException0) {
            J.n(timer0, e0, e0);
            throw iOException0;
        }
        if(object0 instanceof InputStream) {
            e0.l(httpURLConnection0.getContentType());
            return new O7.a(((InputStream)object0), e0, timer0);
        }
        e0.l(httpURLConnection0.getContentType());
        e0.m(((long)httpURLConnection0.getContentLength()));
        e0.n(timer0.b());
        e0.c();
        return object0;
    }

    public final Object c(Class[] arr_class) {
        Object object0;
        Timer timer0 = this.e;
        this.i();
        HttpURLConnection httpURLConnection0 = this.a;
        int v = httpURLConnection0.getResponseCode();
        M7.e e0 = this.b;
        e0.h(v);
        try {
            object0 = httpURLConnection0.getContent(arr_class);
        }
        catch(IOException iOException0) {
            J.n(timer0, e0, e0);
            throw iOException0;
        }
        if(object0 instanceof InputStream) {
            e0.l(httpURLConnection0.getContentType());
            return new O7.a(((InputStream)object0), e0, timer0);
        }
        e0.l(httpURLConnection0.getContentType());
        e0.m(((long)httpURLConnection0.getContentLength()));
        e0.n(timer0.b());
        e0.c();
        return object0;
    }

    public final InputStream d() {
        HttpURLConnection httpURLConnection0 = this.a;
        M7.e e0 = this.b;
        this.i();
        try {
            e0.h(httpURLConnection0.getResponseCode());
        }
        catch(IOException unused_ex) {
            e.f.a("IOException thrown trying to obtain the response code");
        }
        InputStream inputStream0 = httpURLConnection0.getErrorStream();
        return inputStream0 != null ? new O7.a(inputStream0, e0, this.e) : null;
    }

    public final InputStream e() {
        Timer timer0 = this.e;
        this.i();
        int v = this.a.getResponseCode();
        M7.e e0 = this.b;
        e0.h(v);
        e0.l(this.a.getContentType());
        try {
            InputStream inputStream0 = this.a.getInputStream();
            return inputStream0 != null ? new O7.a(inputStream0, e0, timer0) : null;
        }
        catch(IOException iOException0) {
            J.n(timer0, e0, e0);
            throw iOException0;
        }
    }

    @Override
    public final boolean equals(Object object0) {
        return this.a.equals(object0);
    }

    public final OutputStream f() {
        M7.e e0;
        Timer timer0;
        try {
            timer0 = this.e;
            e0 = this.b;
            OutputStream outputStream0 = this.a.getOutputStream();
            return outputStream0 != null ? new b(outputStream0, e0, timer0) : null;
        }
        catch(IOException iOException0) {
            J.n(timer0, e0, e0);
            throw iOException0;
        }
    }

    public final int g() {
        this.i();
        Timer timer0 = this.e;
        M7.e e0 = this.b;
        if(Long.compare(this.d, -1L) == 0) {
            long v = timer0.b();
            this.d = v;
            e0.b0.j();
            r.B(((r)e0.b0.Y), v);
        }
        try {
            int v1 = this.a.getResponseCode();
            e0.h(v1);
            return v1;
        }
        catch(IOException iOException0) {
            J.n(timer0, e0, e0);
            throw iOException0;
        }
    }

    public final String h() {
        HttpURLConnection httpURLConnection0 = this.a;
        this.i();
        Timer timer0 = this.e;
        M7.e e0 = this.b;
        if(Long.compare(this.d, -1L) == 0) {
            long v = timer0.b();
            this.d = v;
            e0.b0.j();
            r.B(((r)e0.b0.Y), v);
        }
        try {
            String s = httpURLConnection0.getResponseMessage();
            e0.h(httpURLConnection0.getResponseCode());
            return s;
        }
        catch(IOException iOException0) {
            J.n(timer0, e0, e0);
            throw iOException0;
        }
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void i() {
        M7.e e0 = this.b;
        if(Long.compare(this.c, -1L) == 0) {
            this.e.g();
            this.c = this.e.X;
            e0.k(this.e.X);
        }
        HttpURLConnection httpURLConnection0 = this.a;
        String s = httpURLConnection0.getRequestMethod();
        if(s != null) {
            e0.g(s);
            return;
        }
        if(httpURLConnection0.getDoOutput()) {
            e0.g("POST");
            return;
        }
        e0.g("GET");
    }

    @Override
    public final String toString() {
        return this.a.toString();
    }
}


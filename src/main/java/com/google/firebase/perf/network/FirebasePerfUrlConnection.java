package com.google.firebase.perf.network;

import M7.e;
import O7.c;
import O7.d;
import O7.h;
import R7.f;
import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

public class FirebasePerfUrlConnection {
    @Keep
    public static Object getContent(URL uRL0) {
        Timer timer0 = new Timer();
        timer0.g();
        long v = timer0.X;
        e e0 = new e(f.q0);
        try {
            URLConnection uRLConnection0 = uRL0.openConnection();
            if(uRLConnection0 instanceof HttpsURLConnection) {
                return new d(((HttpsURLConnection)uRLConnection0), timer0, e0).a.b();
            }
            return uRLConnection0 instanceof HttpURLConnection ? new c(((HttpURLConnection)uRLConnection0), timer0, e0).a.b() : uRLConnection0.getContent();
        }
        catch(IOException iOException0) {
        }
        e0.k(v);
        e0.n(timer0.b());
        e0.o(uRL0.toString());
        h.c(e0);
        throw iOException0;
    }

    @Keep
    public static Object getContent(URL uRL0, Class[] arr_class) {
        Timer timer0 = new Timer();
        timer0.g();
        long v = timer0.X;
        e e0 = new e(f.q0);
        try {
            URLConnection uRLConnection0 = uRL0.openConnection();
            if(uRLConnection0 instanceof HttpsURLConnection) {
                return new d(((HttpsURLConnection)uRLConnection0), timer0, e0).a.c(arr_class);
            }
            return uRLConnection0 instanceof HttpURLConnection ? new c(((HttpURLConnection)uRLConnection0), timer0, e0).a.c(arr_class) : uRLConnection0.getContent(arr_class);
        }
        catch(IOException iOException0) {
        }
        e0.k(v);
        e0.n(timer0.b());
        e0.o(uRL0.toString());
        h.c(e0);
        throw iOException0;
    }

    @Keep
    public static Object instrument(Object object0) {
        if(object0 instanceof HttpsURLConnection) {
            return new d(((HttpsURLConnection)object0), new Timer(), new e(f.q0));
        }
        return object0 instanceof HttpURLConnection ? new c(((HttpURLConnection)object0), new Timer(), new e(f.q0)) : object0;
    }

    @Keep
    public static InputStream openStream(URL uRL0) {
        f f0 = f.q0;
        Timer timer0 = new Timer();
        if(!f0.Z.get()) {
            return uRL0.openConnection().getInputStream();
        }
        timer0.g();
        long v = timer0.X;
        e e0 = new e(f0);
        try {
            URLConnection uRLConnection0 = uRL0.openConnection();
            if(uRLConnection0 instanceof HttpsURLConnection) {
                return new d(((HttpsURLConnection)uRLConnection0), timer0, e0).a.e();
            }
            return uRLConnection0 instanceof HttpURLConnection ? new c(((HttpURLConnection)uRLConnection0), timer0, e0).a.e() : uRLConnection0.getInputStream();
        }
        catch(IOException iOException0) {
        }
        e0.k(v);
        e0.n(timer0.b());
        e0.o(uRL0.toString());
        h.c(e0);
        throw iOException0;
    }
}


package com.google.firebase.perf.network;

import M.J;
import M7.e;
import O7.h;
import R7.f;
import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpMessage;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

public class FirebasePerfHttpClient {
    @Keep
    public static Object execute(HttpClient httpClient0, HttpHost httpHost0, HttpRequest httpRequest0, ResponseHandler responseHandler0) {
        Timer timer0 = new Timer();
        e e0 = e.f(f.q0);
        try {
            e0.o(httpHost0.toURI() + httpRequest0.getRequestLine().getUri());
            e0.g(httpRequest0.getRequestLine().getMethod());
            Long long0 = h.a(((HttpMessage)httpRequest0));
            if(long0 != null) {
                e0.j(((long)long0));
            }
            timer0.g();
            e0.k(timer0.f());
            return httpClient0.execute(httpHost0, httpRequest0, new O7.f(responseHandler0, timer0, e0));
        }
        catch(IOException iOException0) {
        }
        J.n(timer0, e0, e0);
        throw iOException0;
    }

    @Keep
    public static Object execute(HttpClient httpClient0, HttpHost httpHost0, HttpRequest httpRequest0, ResponseHandler responseHandler0, HttpContext httpContext0) {
        Timer timer0 = new Timer();
        e e0 = e.f(f.q0);
        try {
            e0.o(httpHost0.toURI() + httpRequest0.getRequestLine().getUri());
            e0.g(httpRequest0.getRequestLine().getMethod());
            Long long0 = h.a(((HttpMessage)httpRequest0));
            if(long0 != null) {
                e0.j(((long)long0));
            }
            timer0.g();
            e0.k(timer0.f());
            return httpClient0.execute(httpHost0, httpRequest0, new O7.f(responseHandler0, timer0, e0), httpContext0);
        }
        catch(IOException iOException0) {
        }
        J.n(timer0, e0, e0);
        throw iOException0;
    }

    @Keep
    public static Object execute(HttpClient httpClient0, HttpUriRequest httpUriRequest0, ResponseHandler responseHandler0) {
        Timer timer0 = new Timer();
        e e0 = e.f(f.q0);
        try {
            e0.o(httpUriRequest0.getURI().toString());
            e0.g(httpUriRequest0.getMethod());
            Long long0 = h.a(((HttpMessage)httpUriRequest0));
            if(long0 != null) {
                e0.j(((long)long0));
            }
            timer0.g();
            e0.k(timer0.f());
            return httpClient0.execute(httpUriRequest0, new O7.f(responseHandler0, timer0, e0));
        }
        catch(IOException iOException0) {
        }
        J.n(timer0, e0, e0);
        throw iOException0;
    }

    @Keep
    public static Object execute(HttpClient httpClient0, HttpUriRequest httpUriRequest0, ResponseHandler responseHandler0, HttpContext httpContext0) {
        Timer timer0 = new Timer();
        e e0 = e.f(f.q0);
        try {
            e0.o(httpUriRequest0.getURI().toString());
            e0.g(httpUriRequest0.getMethod());
            Long long0 = h.a(((HttpMessage)httpUriRequest0));
            if(long0 != null) {
                e0.j(((long)long0));
            }
            timer0.g();
            e0.k(timer0.f());
            return httpClient0.execute(httpUriRequest0, new O7.f(responseHandler0, timer0, e0), httpContext0);
        }
        catch(IOException iOException0) {
        }
        J.n(timer0, e0, e0);
        throw iOException0;
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient0, HttpHost httpHost0, HttpRequest httpRequest0) {
        Timer timer0 = new Timer();
        e e0 = e.f(f.q0);
        try {
            e0.o(httpHost0.toURI() + httpRequest0.getRequestLine().getUri());
            e0.g(httpRequest0.getRequestLine().getMethod());
            Long long0 = h.a(((HttpMessage)httpRequest0));
            if(long0 != null) {
                e0.j(((long)long0));
            }
            timer0.g();
            e0.k(timer0.f());
            HttpResponse httpResponse0 = httpClient0.execute(httpHost0, httpRequest0);
            e0.n(timer0.b());
            e0.h(httpResponse0.getStatusLine().getStatusCode());
            Long long1 = h.a(((HttpMessage)httpResponse0));
            if(long1 != null) {
                e0.m(((long)long1));
            }
            String s = h.b(httpResponse0);
            if(s != null) {
                e0.l(s);
            }
            e0.c();
            return httpResponse0;
        }
        catch(IOException iOException0) {
        }
        J.n(timer0, e0, e0);
        throw iOException0;
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient0, HttpHost httpHost0, HttpRequest httpRequest0, HttpContext httpContext0) {
        Timer timer0 = new Timer();
        e e0 = e.f(f.q0);
        try {
            e0.o(httpHost0.toURI() + httpRequest0.getRequestLine().getUri());
            e0.g(httpRequest0.getRequestLine().getMethod());
            Long long0 = h.a(((HttpMessage)httpRequest0));
            if(long0 != null) {
                e0.j(((long)long0));
            }
            timer0.g();
            e0.k(timer0.f());
            HttpResponse httpResponse0 = httpClient0.execute(httpHost0, httpRequest0, httpContext0);
            e0.n(timer0.b());
            e0.h(httpResponse0.getStatusLine().getStatusCode());
            Long long1 = h.a(((HttpMessage)httpResponse0));
            if(long1 != null) {
                e0.m(((long)long1));
            }
            String s = h.b(httpResponse0);
            if(s != null) {
                e0.l(s);
            }
            e0.c();
            return httpResponse0;
        }
        catch(IOException iOException0) {
        }
        J.n(timer0, e0, e0);
        throw iOException0;
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient0, HttpUriRequest httpUriRequest0) {
        Timer timer0 = new Timer();
        e e0 = e.f(f.q0);
        try {
            e0.o(httpUriRequest0.getURI().toString());
            e0.g(httpUriRequest0.getMethod());
            Long long0 = h.a(((HttpMessage)httpUriRequest0));
            if(long0 != null) {
                e0.j(((long)long0));
            }
            timer0.g();
            e0.k(timer0.f());
            HttpResponse httpResponse0 = httpClient0.execute(httpUriRequest0);
            e0.n(timer0.b());
            e0.h(httpResponse0.getStatusLine().getStatusCode());
            Long long1 = h.a(((HttpMessage)httpResponse0));
            if(long1 != null) {
                e0.m(((long)long1));
            }
            String s = h.b(httpResponse0);
            if(s != null) {
                e0.l(s);
            }
            e0.c();
            return httpResponse0;
        }
        catch(IOException iOException0) {
        }
        J.n(timer0, e0, e0);
        throw iOException0;
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient0, HttpUriRequest httpUriRequest0, HttpContext httpContext0) {
        Timer timer0 = new Timer();
        e e0 = e.f(f.q0);
        try {
            e0.o(httpUriRequest0.getURI().toString());
            e0.g(httpUriRequest0.getMethod());
            Long long0 = h.a(((HttpMessage)httpUriRequest0));
            if(long0 != null) {
                e0.j(((long)long0));
            }
            timer0.g();
            e0.k(timer0.f());
            HttpResponse httpResponse0 = httpClient0.execute(httpUriRequest0, httpContext0);
            e0.n(timer0.b());
            e0.h(httpResponse0.getStatusLine().getStatusCode());
            Long long1 = h.a(((HttpMessage)httpResponse0));
            if(long1 != null) {
                e0.m(((long)long1));
            }
            String s = h.b(httpResponse0);
            if(s != null) {
                e0.l(s);
            }
            e0.c();
            return httpResponse0;
        }
        catch(IOException iOException0) {
        }
        J.n(timer0, e0, e0);
        throw iOException0;
    }
}


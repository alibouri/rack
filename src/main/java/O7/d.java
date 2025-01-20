package O7;

import android.os.Build.VERSION;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

public final class d extends HttpsURLConnection {
    public final e a;
    public final HttpsURLConnection b;

    public d(HttpsURLConnection httpsURLConnection0, Timer timer0, M7.e e0) {
        super(httpsURLConnection0.getURL());
        this.b = httpsURLConnection0;
        this.a = new e(httpsURLConnection0, timer0, e0);
    }

    @Override
    public final void addRequestProperty(String s, String s1) {
        this.a.a.addRequestProperty(s, s1);
    }

    @Override
    public final void connect() {
        this.a.a();
    }

    @Override
    public final void disconnect() {
        long v = this.a.e.b();
        this.a.b.n(v);
        this.a.b.c();
        this.a.a.disconnect();
    }

    @Override
    public final boolean equals(Object object0) {
        return this.a.a.equals(object0);
    }

    @Override
    public final boolean getAllowUserInteraction() {
        return this.a.a.getAllowUserInteraction();
    }

    @Override  // javax.net.ssl.HttpsURLConnection
    public final String getCipherSuite() {
        return this.b.getCipherSuite();
    }

    @Override
    public final int getConnectTimeout() {
        return this.a.a.getConnectTimeout();
    }

    @Override
    public final Object getContent() {
        return this.a.b();
    }

    @Override
    public final Object getContent(Class[] arr_class) {
        return this.a.c(arr_class);
    }

    @Override
    public final String getContentEncoding() {
        this.a.i();
        return this.a.a.getContentEncoding();
    }

    @Override
    public final int getContentLength() {
        this.a.i();
        return this.a.a.getContentLength();
    }

    @Override
    public final long getContentLengthLong() {
        this.a.i();
        return Build.VERSION.SDK_INT < 24 ? 0L : this.a.a.getContentLengthLong();
    }

    @Override
    public final String getContentType() {
        this.a.i();
        return this.a.a.getContentType();
    }

    @Override
    public final long getDate() {
        this.a.i();
        return this.a.a.getDate();
    }

    @Override
    public final boolean getDefaultUseCaches() {
        return this.a.a.getDefaultUseCaches();
    }

    @Override
    public final boolean getDoInput() {
        return this.a.a.getDoInput();
    }

    @Override
    public final boolean getDoOutput() {
        return this.a.a.getDoOutput();
    }

    @Override
    public final InputStream getErrorStream() {
        return this.a.d();
    }

    @Override
    public final long getExpiration() {
        this.a.i();
        return this.a.a.getExpiration();
    }

    @Override
    public final String getHeaderField(int v) {
        this.a.i();
        return this.a.a.getHeaderField(v);
    }

    @Override
    public final String getHeaderField(String s) {
        this.a.i();
        return this.a.a.getHeaderField(s);
    }

    @Override
    public final long getHeaderFieldDate(String s, long v) {
        this.a.i();
        return this.a.a.getHeaderFieldDate(s, v);
    }

    @Override
    public final int getHeaderFieldInt(String s, int v) {
        this.a.i();
        return this.a.a.getHeaderFieldInt(s, v);
    }

    @Override
    public final String getHeaderFieldKey(int v) {
        this.a.i();
        return this.a.a.getHeaderFieldKey(v);
    }

    @Override
    public final long getHeaderFieldLong(String s, long v) {
        this.a.i();
        return Build.VERSION.SDK_INT < 24 ? 0L : this.a.a.getHeaderFieldLong(s, v);
    }

    @Override
    public final Map getHeaderFields() {
        this.a.i();
        return this.a.a.getHeaderFields();
    }

    @Override  // javax.net.ssl.HttpsURLConnection
    public final HostnameVerifier getHostnameVerifier() {
        return this.b.getHostnameVerifier();
    }

    @Override
    public final long getIfModifiedSince() {
        return this.a.a.getIfModifiedSince();
    }

    @Override
    public final InputStream getInputStream() {
        return this.a.e();
    }

    @Override
    public final boolean getInstanceFollowRedirects() {
        return this.a.a.getInstanceFollowRedirects();
    }

    @Override
    public final long getLastModified() {
        this.a.i();
        return this.a.a.getLastModified();
    }

    @Override  // javax.net.ssl.HttpsURLConnection
    public final Certificate[] getLocalCertificates() {
        return this.b.getLocalCertificates();
    }

    @Override  // javax.net.ssl.HttpsURLConnection
    public final Principal getLocalPrincipal() {
        return this.b.getLocalPrincipal();
    }

    @Override
    public final OutputStream getOutputStream() {
        return this.a.f();
    }

    @Override  // javax.net.ssl.HttpsURLConnection
    public final Principal getPeerPrincipal() {
        return this.b.getPeerPrincipal();
    }

    @Override
    public final Permission getPermission() {
        e e0 = this.a;
        e0.getClass();
        try {
            return e0.a.getPermission();
        }
        catch(IOException iOException0) {
            long v = e0.e.b();
            e0.b.n(v);
            h.c(e0.b);
            throw iOException0;
        }
    }

    @Override
    public final int getReadTimeout() {
        return this.a.a.getReadTimeout();
    }

    @Override
    public final String getRequestMethod() {
        return this.a.a.getRequestMethod();
    }

    @Override
    public final Map getRequestProperties() {
        return this.a.a.getRequestProperties();
    }

    @Override
    public final String getRequestProperty(String s) {
        return this.a.a.getRequestProperty(s);
    }

    @Override
    public final int getResponseCode() {
        return this.a.g();
    }

    @Override
    public final String getResponseMessage() {
        return this.a.h();
    }

    @Override  // javax.net.ssl.HttpsURLConnection
    public final SSLSocketFactory getSSLSocketFactory() {
        return this.b.getSSLSocketFactory();
    }

    @Override  // javax.net.ssl.HttpsURLConnection
    public final Certificate[] getServerCertificates() {
        return this.b.getServerCertificates();
    }

    @Override
    public final URL getURL() {
        return this.a.a.getURL();
    }

    @Override
    public final boolean getUseCaches() {
        return this.a.a.getUseCaches();
    }

    @Override
    public final int hashCode() {
        return this.a.a.hashCode();
    }

    @Override
    public final void setAllowUserInteraction(boolean z) {
        this.a.a.setAllowUserInteraction(z);
    }

    @Override
    public final void setChunkedStreamingMode(int v) {
        this.a.a.setChunkedStreamingMode(v);
    }

    @Override
    public final void setConnectTimeout(int v) {
        this.a.a.setConnectTimeout(v);
    }

    @Override
    public final void setDefaultUseCaches(boolean z) {
        this.a.a.setDefaultUseCaches(z);
    }

    @Override
    public final void setDoInput(boolean z) {
        this.a.a.setDoInput(z);
    }

    @Override
    public final void setDoOutput(boolean z) {
        this.a.a.setDoOutput(z);
    }

    @Override
    public final void setFixedLengthStreamingMode(int v) {
        this.a.a.setFixedLengthStreamingMode(v);
    }

    @Override
    public final void setFixedLengthStreamingMode(long v) {
        this.a.a.setFixedLengthStreamingMode(v);
    }

    @Override  // javax.net.ssl.HttpsURLConnection
    public final void setHostnameVerifier(HostnameVerifier hostnameVerifier0) {
        this.b.setHostnameVerifier(hostnameVerifier0);
    }

    @Override
    public final void setIfModifiedSince(long v) {
        this.a.a.setIfModifiedSince(v);
    }

    @Override
    public final void setInstanceFollowRedirects(boolean z) {
        this.a.a.setInstanceFollowRedirects(z);
    }

    @Override
    public final void setReadTimeout(int v) {
        this.a.a.setReadTimeout(v);
    }

    @Override
    public final void setRequestMethod(String s) {
        this.a.a.setRequestMethod(s);
    }

    @Override
    public final void setRequestProperty(String s, String s1) {
        e e0 = this.a;
        e0.getClass();
        if("User-Agent".equalsIgnoreCase(s)) {
            e0.b.d0 = s1;
        }
        e0.a.setRequestProperty(s, s1);
    }

    @Override  // javax.net.ssl.HttpsURLConnection
    public final void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory0) {
        this.b.setSSLSocketFactory(sSLSocketFactory0);
    }

    @Override
    public final void setUseCaches(boolean z) {
        this.a.a.setUseCaches(z);
    }

    @Override
    public final String toString() {
        return this.a.a.toString();
    }

    @Override
    public final boolean usingProxy() {
        return this.a.a.usingProxy();
    }
}


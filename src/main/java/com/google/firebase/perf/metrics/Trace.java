package com.google.firebase.perf.metrics;

import H6.e;
import H7.c;
import H7.d;
import P7.a;
import R7.f;
import T7.A;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.util.Timer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import m5.b;
import v.h;

public class Trace extends d implements a, Parcelable {
    @Keep
    public static final Parcelable.Creator CREATOR;
    public final WeakReference X;
    public final Trace Y;
    public final GaugeManager Z;
    public final String b0;
    public final ConcurrentHashMap c0;
    public final ConcurrentHashMap d0;
    public final List e0;
    public final ArrayList f0;
    public final f g0;
    public final e h0;
    public Timer i0;
    public Timer j0;
    public static final L7.a k0;

    static {
        Trace.k0 = L7.a.d();
        new ConcurrentHashMap();
        Trace.CREATOR = new C2.a(17);
    }

    public Trace(Parcel parcel0, boolean z) {
        super((z ? null : c.a()));
        this.X = new WeakReference(this);
        this.Y = (Trace)parcel0.readParcelable(Trace.class.getClassLoader());
        this.b0 = parcel0.readString();
        ArrayList arrayList0 = new ArrayList();
        this.f0 = arrayList0;
        parcel0.readList(arrayList0, Trace.class.getClassLoader());
        ConcurrentHashMap concurrentHashMap0 = new ConcurrentHashMap();
        this.c0 = concurrentHashMap0;
        this.d0 = new ConcurrentHashMap();
        parcel0.readMap(concurrentHashMap0, Counter.class.getClassLoader());
        this.i0 = (Timer)parcel0.readParcelable(Timer.class.getClassLoader());
        this.j0 = (Timer)parcel0.readParcelable(Timer.class.getClassLoader());
        List list0 = Collections.synchronizedList(new ArrayList());
        this.e0 = list0;
        parcel0.readList(list0, PerfSession.class.getClassLoader());
        if(z) {
            this.g0 = null;
            this.h0 = null;
            this.Z = null;
            return;
        }
        this.g0 = f.q0;
        this.h0 = new e(11);
        this.Z = GaugeManager.getInstance();
    }

    public Trace(String s, f f0, e e0, c c0) {
        this(s, f0, e0, c0, GaugeManager.getInstance());
    }

    public Trace(String s, f f0, e e0, c c0, GaugeManager gaugeManager0) {
        super(c0);
        this.X = new WeakReference(this);
        this.Y = null;
        this.b0 = s.trim();
        this.f0 = new ArrayList();
        this.c0 = new ConcurrentHashMap();
        this.d0 = new ConcurrentHashMap();
        this.h0 = e0;
        this.g0 = f0;
        this.e0 = Collections.synchronizedList(new ArrayList());
        this.Z = gaugeManager0;
    }

    @Override  // P7.a
    public final void b(PerfSession perfSession0) {
        if(perfSession0 == null) {
            Trace.k0.f("Unable to add new SessionId to the Trace. Continuing without it.");
            return;
        }
        if(this.i0 != null && !this.f()) {
            this.e0.add(perfSession0);
        }
    }

    public final void c(String s, String s1) {
        if(this.f()) {
            throw new IllegalArgumentException(b.y(new StringBuilder("Trace \'"), this.b0, "\' has been stopped"));
        }
        if(!this.d0.containsKey(s) && this.d0.size() >= 5) {
            throw new IllegalArgumentException("Exceeds max limit of number of attributes - 5");
        }
        N7.e.b(s, s1);
    }

    @Override  // android.os.Parcelable
    @Keep
    public int describeContents() {
        return 0;
    }

    public final boolean f() {
        return this.j0 != null;
    }

    @Override
    public final void finalize() {
        try {
            if(this.i0 != null && !this.f()) {
                Trace.k0.g("Trace \'%s\' is started but not stopped when it is destructed!", new Object[]{this.b0});
                this.incrementTsnsCount(1);
            }
        }
        finally {
            super.finalize();
        }
    }

    @Keep
    public String getAttribute(String s) {
        return (String)this.d0.get(s);
    }

    @Keep
    public Map getAttributes() {
        return new HashMap(this.d0);
    }

    @Keep
    public long getLongMetric(String s) {
        Counter counter0 = s == null ? null : ((Counter)this.c0.get(s.trim()));
        return counter0 == null ? 0L : counter0.Y.get();
    }

    @Keep
    public void incrementMetric(String s, long v) {
        String s1 = N7.e.c(s);
        L7.a a0 = Trace.k0;
        if(s1 != null) {
            a0.c("Cannot increment metric \'%s\'. Metric name is invalid.(%s)", new Object[]{s, s1});
            return;
        }
        String s2 = this.b0;
        if(this.i0 == null) {
            a0.g("Cannot increment metric \'%s\' for trace \'%s\' because it\'s not started", new Object[]{s, s2});
            return;
        }
        if(this.f()) {
            a0.g("Cannot increment metric \'%s\' for trace \'%s\' because it\'s been stopped", new Object[]{s, s2});
            return;
        }
        String s3 = s.trim();
        ConcurrentHashMap concurrentHashMap0 = this.c0;
        Counter counter0 = (Counter)concurrentHashMap0.get(s3);
        if(counter0 == null) {
            counter0 = new Counter(s3);
            concurrentHashMap0.put(s3, counter0);
        }
        counter0.Y.addAndGet(v);
        a0.b("Incrementing metric \'%s\' to %d on trace \'%s\'", new Object[]{s, counter0.Y.get(), s2});
    }

    @Keep
    public void putAttribute(String s, String s1) {
        String s3;
        String s2;
        L7.a a0;
        boolean z = true;
        try {
            a0 = Trace.k0;
            s2 = s.trim();
            s3 = s1.trim();
            this.c(s2, s3);
            a0.b("Setting attribute \'%s\' to \'%s\' on trace \'%s\'", new Object[]{s2, s3, this.b0});
        }
        catch(Exception exception0) {
            a0.c("Can not set attribute \'%s\' with value \'%s\' (%s)", new Object[]{s2, s3, exception0.getMessage()});
            z = false;
        }
        if(z) {
            this.d0.put(s2, s3);
        }
    }

    @Keep
    public void putMetric(String s, long v) {
        String s1 = N7.e.c(s);
        L7.a a0 = Trace.k0;
        if(s1 != null) {
            a0.c("Cannot set value for metric \'%s\'. Metric name is invalid.(%s)", new Object[]{s, s1});
            return;
        }
        String s2 = this.b0;
        if(this.i0 == null) {
            a0.g("Cannot set value for metric \'%s\' for trace \'%s\' because it\'s not started", new Object[]{s, s2});
            return;
        }
        if(this.f()) {
            a0.g("Cannot set value for metric \'%s\' for trace \'%s\' because it\'s been stopped", new Object[]{s, s2});
            return;
        }
        String s3 = s.trim();
        ConcurrentHashMap concurrentHashMap0 = this.c0;
        Counter counter0 = (Counter)concurrentHashMap0.get(s3);
        if(counter0 == null) {
            counter0 = new Counter(s3);
            concurrentHashMap0.put(s3, counter0);
        }
        counter0.Y.set(v);
        a0.b("Setting metric \'%s\' to \'%s\' on trace \'%s\'", new Object[]{s, v, s2});
    }

    @Keep
    public void removeAttribute(String s) {
        if(this.f()) {
            L7.a a0 = Trace.k0;
            if(a0.b) {
                a0.a.getClass();
                Log.e("FirebasePerformance", "Can\'t remove a attribute from a Trace that\'s stopped.");
            }
            return;
        }
        this.d0.remove(s);
    }

    @Keep
    public void start() {
        String s2;
        String s = null;
        boolean z = I7.a.e().u();
        L7.a a0 = Trace.k0;
        if(!z) {
            a0.a("Trace feature is disabled.");
            return;
        }
        String s1 = this.b0;
        if(s1 == null) {
            s = "Trace name must not be null";
        }
        else if(s1.length() > 100) {
            s = "Trace name must not exceed 100 characters";
        }
        else if(s1.startsWith("_")) {
            int[] arr_v = h.e(6);
            for(int v = 0; true; ++v) {
                if(v >= arr_v.length) {
                    if(s1.startsWith("_st_")) {
                        break;
                    }
                    s = "Trace name must not start with \'_\'";
                    break;
                }
                switch(arr_v[v]) {
                    case 1: {
                        s2 = "_as";
                        break;
                    }
                    case 2: {
                        s2 = "_astui";
                        break;
                    }
                    case 3: {
                        s2 = "_astfd";
                        break;
                    }
                    case 4: {
                        s2 = "_asti";
                        break;
                    }
                    case 5: {
                        s2 = "_fs";
                        break;
                    }
                    case 6: {
                        s2 = "_bs";
                        break;
                    }
                    default: {
                        throw null;
                    }
                }
                if(s2.equals(s1)) {
                    break;
                }
            }
        }
        if(s != null) {
            a0.c("Cannot start trace \'%s\'. Trace name is invalid.(%s)", new Object[]{s1, s});
            return;
        }
        if(this.i0 != null) {
            a0.c("Trace \'%s\' has already started, should not start again!", new Object[]{s1});
            return;
        }
        this.h0.getClass();
        this.i0 = new Timer();
        this.registerForAppState();
        PerfSession perfSession0 = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.X);
        this.b(perfSession0);
        if(perfSession0.Z) {
            this.Z.collectGaugeMetricOnce(perfSession0.Y);
        }
    }

    @Keep
    public void stop() {
        String s = this.b0;
        L7.a a0 = Trace.k0;
        if(this.i0 == null) {
            a0.c("Trace \'%s\' has not been started so unable to stop!", new Object[]{s});
            return;
        }
        if(this.f()) {
            a0.c("Trace \'%s\' has already stopped, should not stop again!", new Object[]{s});
            return;
        }
        SessionManager.getInstance().unregisterForSessionUpdates(this.X);
        this.unregisterForAppState();
        this.h0.getClass();
        Timer timer0 = new Timer();
        this.j0 = timer0;
        if(this.Y == null) {
            ArrayList arrayList0 = this.f0;
            if(!arrayList0.isEmpty()) {
                Trace trace0 = (Trace)b.r(1, arrayList0);
                if(trace0.j0 == null) {
                    trace0.j0 = timer0;
                }
            }
            if(!s.isEmpty()) {
                A a1 = new I5.h(15, this).j();
                this.g0.c(a1, this.getAppState());
                if(SessionManager.getInstance().perfSession().Z) {
                    this.Z.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().Y);
                }
            }
            else if(a0.b) {
                a0.a.getClass();
                Log.e("FirebasePerformance", "Trace name is empty, no log is sent to server");
            }
        }
    }

    @Override  // android.os.Parcelable
    @Keep
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeParcelable(this.Y, 0);
        parcel0.writeString(this.b0);
        parcel0.writeList(this.f0);
        parcel0.writeMap(this.c0);
        parcel0.writeParcelable(this.i0, 0);
        parcel0.writeParcelable(this.j0, 0);
        synchronized(this.e0) {
            parcel0.writeList(this.e0);
        }
    }
}


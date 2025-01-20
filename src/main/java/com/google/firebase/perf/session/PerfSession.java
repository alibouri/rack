package com.google.firebase.perf.session;

import C2.a;
import H6.e;
import I7.o;
import I7.r;
import S7.d;
import T7.v;
import T7.w;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.google.firebase.perf.util.Timer;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class PerfSession implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String X;
    public final Timer Y;
    public boolean Z;

    static {
        PerfSession.CREATOR = new a(27);
    }

    public PerfSession(Parcel parcel0) {
        boolean z = false;
        this.Z = false;
        this.X = parcel0.readString();
        if(parcel0.readByte() != 0) {
            z = true;
        }
        this.Z = z;
        this.Y = (Timer)parcel0.readParcelable(Timer.class.getClassLoader());
    }

    public PerfSession(String s, e e0) {
        this.Z = false;
        this.X = s;
        this.Y = new Timer();
    }

    public final w b() {
        v v0 = w.y();
        v0.j();
        w.u(((w)v0.Y), this.X);
        if(this.Z) {
            v0.j();
            w.v(((w)v0.Y));
        }
        return (w)v0.h();
    }

    public static w[] c(List list0) {
        if(list0.isEmpty()) {
            return null;
        }
        w[] arr_w = new w[list0.size()];
        w w0 = ((PerfSession)list0.get(0)).b();
        boolean z = false;
        for(int v = 1; v < list0.size(); ++v) {
            w w1 = ((PerfSession)list0.get(v)).b();
            if(z || !((PerfSession)list0.get(v)).Z) {
                arr_w[v] = w1;
            }
            else {
                arr_w[0] = w1;
                arr_w[v] = w0;
                z = true;
            }
        }
        if(!z) {
            arr_w[0] = w0;
        }
        return arr_w;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public static PerfSession f(String s) {
        r r0;
        boolean z;
        double f1;
        PerfSession perfSession0 = new PerfSession(s.replace("-", ""), new e(11));
        I7.a a0 = I7.a.e();
        if(a0.u()) {
            double f = Math.random();
            synchronized(r.class) {
                if(r.b == null) {
                    r.b = new r();  // initializer: Ljava/lang/Object;-><init>()V
                }
                r0 = r.b;
            }
            d d0 = a0.k(r0);
            if(d0.b()) {
                f1 = ((double)(((Double)d0.a()))) / 100.0;
                if(!I7.a.v(f1)) {
                    goto label_17;
                }
            }
            else {
            label_17:
                d d1 = a0.a.getDouble("fpr_vc_session_sampling_rate");
                if(!d1.b() || !I7.a.v(((double)(((Double)d1.a()))))) {
                    d d2 = a0.b(r0);
                    if(!d2.b() || !I7.a.v(((double)(((Double)d2.a()))))) {
                        f1 = a0.a.isLastFetchFailed() ? 0.00001 : 0.01;
                    }
                    else {
                        f1 = (double)(((Double)d2.a()));
                    }
                }
                else {
                    double f2 = (double)(((Double)d1.a()));
                    a0.c.e("com.google.firebase.perf.SessionSamplingRate", f2);
                    f1 = (double)(((Double)d1.a()));
                }
            }
            z = f < f1;
        }
        else {
            z = false;
        }
        perfSession0.Z = z;
        return perfSession0;
    }

    public final boolean g() {
        o o0;
        long v = TimeUnit.MICROSECONDS.toMinutes(this.Y.b());
        I7.a a0 = I7.a.e();
        a0.getClass();
        synchronized(o.class) {
            if(o.b == null) {
                o.b = new o();  // initializer: Ljava/lang/Object;-><init>()V
            }
            o0 = o.b;
        }
        d d0 = a0.l(o0);
        if(d0.b() && ((long)(((Long)d0.a()))) > 0L) {
            return v > ((long)(((Long)d0.a())));
        }
        d d1 = a0.a.getLong("fpr_session_max_duration_min");
        if(d1.b() && ((long)(((Long)d1.a()))) > 0L) {
            long v2 = (long)(((Long)d1.a()));
            a0.c.d(v2, "com.google.firebase.perf.SessionsMaxDurationMinutes");
            return v > ((long)(((Long)d1.a())));
        }
        d d2 = a0.c(o0);
        return v > (!d2.b() || ((long)(((Long)d2.a()))) <= 0L ? 0xF0L : ((long)(((Long)d2.a()))));
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeString(this.X);
        parcel0.writeByte(((byte)this.Z));
        parcel0.writeParcelable(this.Y, 0);
    }
}


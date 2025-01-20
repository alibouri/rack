package I2;

import Bb.B;
import Bb.p;
import L5.d;
import M5.b;
import M5.f;
import M5.r;
import M5.x;
import android.os.Build.VERSION;
import android.os.Message;
import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import java.util.LinkedHashSet;
import java.util.Set;
import o6.c;
import o6.h;

public final class e implements c {
    public int X;
    public final long Y;
    public final long Z;
    public Object b0;
    public final Object c0;

    public e() {
        this.b0 = new S2.e(null);
        this.X = 1;
        this.Y = -1L;
        this.Z = -1L;
        this.c0 = new LinkedHashSet();
    }

    public e(f f0, int v, b b0, long v1, long v2) {
        this.b0 = f0;
        this.X = v;
        this.c0 = b0;
        this.Y = v1;
        this.Z = v2;
    }

    public g a() {
        if(Build.VERSION.SDK_INT >= 24) {
            Set set0 = p.U0(((LinkedHashSet)this.c0));
            return new g(((S2.e)this.b0), this.X, false, false, false, false, this.Y, this.Z, set0);
        }
        return new g(((S2.e)this.b0), this.X, false, false, false, false, -1L, -1L, B.X);
    }

    public static ConnectionTelemetryConfiguration b(r r0, N5.e e0, int v) {
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration0 = e0.t0 == null ? null : e0.t0.b0;
        if(connectionTelemetryConfiguration0 != null && connectionTelemetryConfiguration0.Y) {
            int[] arr_v = connectionTelemetryConfiguration0.b0;
            int v1 = 0;
            if(arr_v == null) {
                int[] arr_v1 = connectionTelemetryConfiguration0.d0;
                if(arr_v1 == null) {
                    return r0.o >= connectionTelemetryConfiguration0.c0 ? null : connectionTelemetryConfiguration0;
                }
                while(v1 < arr_v1.length) {
                    if(arr_v1[v1] == v) {
                        return null;
                    }
                    ++v1;
                }
                return r0.o >= connectionTelemetryConfiguration0.c0 ? null : connectionTelemetryConfiguration0;
            }
            else {
                while(v1 < arr_v.length) {
                    if(arr_v[v1] == v) {
                        return r0.o >= connectionTelemetryConfiguration0.c0 ? null : connectionTelemetryConfiguration0;
                    }
                    ++v1;
                }
            }
        }
        return null;
    }

    @Override  // o6.c
    public void s(h h0) {
        int v6;
        int v5;
        int v4;
        long v11;
        int v10;
        int v8;
        int v7;
        if(((f)this.b0).b()) {
            RootTelemetryConfiguration rootTelemetryConfiguration0 = N5.h.a().a;
            if(rootTelemetryConfiguration0 == null || rootTelemetryConfiguration0.Y) {
                r r0 = (r)((f)this.b0).j.get(((b)this.c0));
                if(r0 != null) {
                    L5.c c0 = r0.e;
                    if(c0 instanceof N5.e) {
                        long v = 0L;
                        boolean z = true;
                        boolean z1 = Long.compare(this.Y, 0L) > 0;
                        int v1 = ((N5.e)c0).o0;
                        if(rootTelemetryConfiguration0 == null) {
                            v4 = 0;
                            v6 = 100;
                            v5 = 5000;
                        label_31:
                            f f0 = (f)this.b0;
                            if(h0.h()) {
                                v7 = 0;
                                v8 = 0;
                            }
                            else if(((o6.p)h0).d) {
                                v7 = 100;
                                v8 = -1;
                            }
                            else {
                                Exception exception0 = h0.e();
                                if(exception0 instanceof d) {
                                    int v9 = ((d)exception0).X.X;
                                    ConnectionResult connectionResult0 = ((d)exception0).X.b0;
                                    if(connectionResult0 == null) {
                                        v7 = v9;
                                        v8 = -1;
                                    }
                                    else {
                                        v8 = connectionResult0.Y;
                                        v7 = v9;
                                    }
                                }
                                else {
                                    v7 = 101;
                                    v8 = -1;
                                }
                            }
                            if(z1) {
                                v10 = (int)(SystemClock.elapsedRealtime() - this.Z);
                                v11 = this.Y;
                                v = System.currentTimeMillis();
                            }
                            else {
                                v11 = 0L;
                                v10 = -1;
                            }
                            MethodInvocation methodInvocation0 = new MethodInvocation(this.X, v7, v8, v11, v, null, null, v1, v10);
                            f0.getClass();
                            x x0 = new x(methodInvocation0, v4, ((long)v5), v6);
                            Message message0 = f0.n.obtainMessage(18, x0);
                            f0.n.sendMessage(message0);
                        }
                        else {
                            z1 &= rootTelemetryConfiguration0.Z;
                            int v2 = rootTelemetryConfiguration0.b0;
                            int v3 = rootTelemetryConfiguration0.c0;
                            v4 = rootTelemetryConfiguration0.X;
                            if(((N5.e)c0).t0 == null || ((N5.e)c0).g()) {
                                v5 = v2;
                                v6 = v3;
                                goto label_31;
                            }
                            else {
                                ConnectionTelemetryConfiguration connectionTelemetryConfiguration0 = e.b(r0, ((N5.e)c0), this.X);
                                if(connectionTelemetryConfiguration0 != null) {
                                    if(!connectionTelemetryConfiguration0.Z || this.Y <= 0L) {
                                        z = false;
                                    }
                                    z1 = z;
                                    v5 = v2;
                                    v6 = connectionTelemetryConfiguration0.c0;
                                    goto label_31;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}


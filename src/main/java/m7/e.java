package M7;

import H7.c;
import H7.d;
import O7.h;
import P7.a;
import R7.f;
import T7.p;
import T7.r;
import T7.w;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import pc.q;

public final class e extends d implements a {
    public final List X;
    public final GaugeManager Y;
    public final f Z;
    public final p b0;
    public final WeakReference c0;
    public String d0;
    public boolean e0;
    public boolean f0;
    public static final L7.a g0;

    static {
        e.g0 = L7.a.d();
    }

    public e(f f0) {
        c c0 = c.a();
        GaugeManager gaugeManager0 = GaugeManager.getInstance();
        super(c0);
        this.b0 = r.a0();
        this.c0 = new WeakReference(this);
        this.Z = f0;
        this.Y = gaugeManager0;
        this.X = Collections.synchronizedList(new ArrayList());
        this.registerForAppState();
    }

    @Override  // P7.a
    public final void b(PerfSession perfSession0) {
        if(perfSession0 == null) {
            e.g0.f("Unable to add new SessionId to the Network Trace. Continuing without it.");
            return;
        }
        if(((r)this.b0.Y).S() && !((r)this.b0.Y).Y()) {
            this.X.add(perfSession0);
        }
    }

    public final void c() {
        List list1;
        SessionManager.getInstance().unregisterForSessionUpdates(this.c0);
        this.unregisterForAppState();
        synchronized(this.X) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: this.X) {
                PerfSession perfSession0 = (PerfSession)object0;
                if(perfSession0 != null) {
                    arrayList0.add(perfSession0);
                }
            }
            list1 = Collections.unmodifiableList(arrayList0);
        }
        w[] arr_w = PerfSession.c(list1);
        if(arr_w != null) {
            List list2 = Arrays.asList(arr_w);
            this.b0.j();
            r.D(((r)this.b0.Y), list2);
        }
        r r0 = (r)this.b0.h();
        if(this.d0 != null && h.a.matcher(this.d0).matches()) {
            e.g0.a("Dropping network request from a \'User-Agent\' that is not allowed");
            return;
        }
        if(!this.e0) {
            this.Z.g0.execute(new E7.h(this.Z, r0, this.getAppState(), 8));
            this.e0 = true;
            return;
        }
        if(this.f0) {
            e.g0.a("This metric has already been queued for transmission.  Please create a new HttpMetric for each request/response");
        }
    }

    public static e f(f f0) {
        return new e(f0);
    }

    public final void g(String s) {
        int v = 8;
        if(s != null) {
            String s1 = s.toUpperCase();
            s1.getClass();
            switch(s1) {
                case "CONNECT": {
                    v = 10;
                    break;
                }
                case "DELETE": {
                    v = 5;
                    break;
                }
                case "GET": {
                    v = 2;
                    break;
                }
                case "HEAD": {
                    v = 6;
                    break;
                }
                case "OPTIONS": {
                    break;
                }
                case "PATCH": {
                    v = 7;
                    break;
                }
                case "POST": {
                    v = 4;
                    break;
                }
                case "PUT": {
                    v = 3;
                    break;
                }
                case "TRACE": {
                    v = 9;
                    break;
                }
                default: {
                    v = 1;
                }
            }
            this.b0.j();
            r.E(((r)this.b0.Y), v);
        }
    }

    public final void h(int v) {
        this.b0.j();
        r.w(((r)this.b0.Y), v);
    }

    public final void j(long v) {
        this.b0.j();
        r.F(((r)this.b0.Y), v);
    }

    public final void k(long v) {
        PerfSession perfSession0 = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.c0);
        this.b0.j();
        r.z(((r)this.b0.Y), v);
        this.b(perfSession0);
        if(perfSession0.Z) {
            this.Y.collectGaugeMetricOnce(perfSession0.Y);
        }
    }

    public final void l(String s) {
        p p0 = this.b0;
        if(s == null) {
            p0.j();
            r.y(((r)p0.Y));
            return;
        }
        if(s.length() <= 0x80) {
            for(int v = 0; v < s.length(); ++v) {
                int v1 = s.charAt(v);
                if(v1 <= 0x1F || v1 > 0x7F) {
                    e.g0.f("The content type of the response is not a valid content-type:" + s);
                    return;
                }
            }
            p0.j();
            r.x(((r)p0.Y), s);
            return;
        }
        e.g0.f("The content type of the response is not a valid content-type:" + s);
    }

    public final void m(long v) {
        this.b0.j();
        r.G(((r)this.b0.Y), v);
    }

    public final void n(long v) {
        this.b0.j();
        r.C(((r)this.b0.Y), v);
        if(SessionManager.getInstance().perfSession().Z) {
            this.Y.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().Y);
        }
    }

    public final void o(String s) {
        pc.r r1;
        pc.r r0;
        if(s != null) {
            try {
                r0 = null;
                q q0 = new q();
                q0.d(null, s);
                r1 = null;
                r1 = q0.a();
            }
            catch(IllegalArgumentException unused_ex) {
            }
            if(r1 != null) {
                q q1 = r1.f();
                q1.b = "";
                q1.c = "";
                q1.g = null;
                q1.h = null;
                s = q1.toString();
            }
            if(s.length() > 2000) {
                if(s.charAt(2000) == 0x2F) {
                    s = s.substring(0, 2000);
                }
                else {
                    try {
                        q q2 = new q();
                        q2.d(null, s);
                        r0 = q2.a();
                    }
                    catch(IllegalArgumentException unused_ex) {
                    }
                    if(r0 == null) {
                        s = s.substring(0, 2000);
                    }
                    else if(r0.b().lastIndexOf(0x2F) >= 0) {
                        int v = s.lastIndexOf(0x2F, 0x7CF);
                        s = v >= 0 ? s.substring(0, v) : s.substring(0, 2000);
                    }
                    else {
                        s = s.substring(0, 2000);
                    }
                }
            }
            this.b0.j();
            r.u(((r)this.b0.Y), s);
        }
    }
}


package T7;

import com.google.protobuf.S;
import com.google.protobuf.W;
import com.google.protobuf.p;
import v.h;

public final class t extends p implements u {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    private static final t DEFAULT_INSTANCE = null;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile S PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private g applicationInfo_;
    private int bitField0_;
    private o gaugeMetric_;
    private r networkRequestMetric_;
    private A traceMetric_;
    private C transportInfo_;

    static {
        t t0 = new t();  // initializer: Lcom/google/protobuf/p;-><init>()V
        t.DEFAULT_INSTANCE = t0;
        p.s(t.class, t0);
    }

    public static s A() {
        return (s)t.DEFAULT_INSTANCE.l();
    }

    @Override  // T7.u
    public final boolean b() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override  // T7.u
    public final o c() {
        return this.gaugeMetric_ == null ? o.A() : this.gaugeMetric_;
    }

    @Override  // T7.u
    public final boolean d() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override  // T7.u
    public final A e() {
        return this.traceMetric_ == null ? A.H() : this.traceMetric_;
    }

    @Override  // T7.u
    public final boolean f() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override  // T7.u
    public final r g() {
        return this.networkRequestMetric_ == null ? r.I() : this.networkRequestMetric_;
    }

    @Override  // com.google.protobuf.p
    public final Object m(int v) {
        switch(h.d(v)) {
            case 0: {
                return (byte)1;
            }
            case 1: {
                return null;
            }
            case 2: {
                return new W(t.DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
            }
            case 3: {
                return new t();  // initializer: Lcom/google/protobuf/p;-><init>()V
            }
            case 4: {
                return new s(t.DEFAULT_INSTANCE);  // initializer: Lcom/google/protobuf/n;-><init>(Lcom/google/protobuf/p;)V
            }
            case 5: {
                return t.DEFAULT_INSTANCE;
            }
            case 6: {
                S s0 = t.PARSER;
                if(s0 == null) {
                    Class class0 = t.class;
                    synchronized(class0) {
                        s0 = t.PARSER;
                        if(s0 == null) {
                            s0 = new com.google.protobuf.o();  // initializer: Ljava/lang/Object;-><init>()V
                            t.PARSER = s0;
                        }
                    }
                }
                return s0;
            }
            default: {
                throw new UnsupportedOperationException();
            }
        }
    }

    public static void u(t t0, g g0) {
        t0.getClass();
        t0.applicationInfo_ = g0;
        t0.bitField0_ |= 1;
    }

    public static void v(t t0, o o0) {
        t0.getClass();
        t0.gaugeMetric_ = o0;
        t0.bitField0_ |= 8;
    }

    public static void w(t t0, A a0) {
        t0.getClass();
        t0.traceMetric_ = a0;
        t0.bitField0_ |= 2;
    }

    public static void x(t t0, r r0) {
        t0.getClass();
        t0.networkRequestMetric_ = r0;
        t0.bitField0_ |= 4;
    }

    public final g y() {
        return this.applicationInfo_ == null ? g.A() : this.applicationInfo_;
    }

    public final boolean z() {
        return (this.bitField0_ & 1) != 0;
    }
}


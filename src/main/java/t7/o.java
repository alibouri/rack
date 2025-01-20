package T7;

import com.google.protobuf.S;
import com.google.protobuf.V;
import com.google.protobuf.W;
import com.google.protobuf.b;
import com.google.protobuf.p;
import com.google.protobuf.t;
import v.h;

public final class o extends p {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    private static final o DEFAULT_INSTANCE = null;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile S PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private t androidMemoryReadings_;
    private int bitField0_;
    private t cpuMetricReadings_;
    private m gaugeMetadata_;
    private String sessionId_;

    static {
        o o0 = new o();
        o.DEFAULT_INSTANCE = o0;
        p.s(o.class, o0);
    }

    public o() {
        this.sessionId_ = "";
        this.cpuMetricReadings_ = V.b0;
        this.androidMemoryReadings_ = V.b0;
    }

    public static o A() {
        return o.DEFAULT_INSTANCE;
    }

    public final m B() {
        return this.gaugeMetadata_ == null ? m.x() : this.gaugeMetadata_;
    }

    public final boolean C() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean D() {
        return (this.bitField0_ & 1) != 0;
    }

    public static n E() {
        return (n)o.DEFAULT_INSTANCE.l();
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
                return new W(o.DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001B\u0003ဉ\u0001\u0004\u001B", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", k.class, "gaugeMetadata_", "androidMemoryReadings_", d.class});
            }
            case 3: {
                return new o();
            }
            case 4: {
                return new n(o.DEFAULT_INSTANCE);  // initializer: Lcom/google/protobuf/n;-><init>(Lcom/google/protobuf/p;)V
            }
            case 5: {
                return o.DEFAULT_INSTANCE;
            }
            case 6: {
                S s0 = o.PARSER;
                if(s0 == null) {
                    Class class0 = o.class;
                    synchronized(class0) {
                        s0 = o.PARSER;
                        if(s0 == null) {
                            s0 = new com.google.protobuf.o();  // initializer: Ljava/lang/Object;-><init>()V
                            o.PARSER = s0;
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

    public static void u(o o0, String s) {
        o0.getClass();
        s.getClass();
        o0.bitField0_ |= 1;
        o0.sessionId_ = s;
    }

    public static void v(o o0, d d0) {
        o0.getClass();
        d0.getClass();
        t t0 = o0.androidMemoryReadings_;
        if(!((b)t0).X) {
            o0.androidMemoryReadings_ = p.r(t0);
        }
        o0.androidMemoryReadings_.add(d0);
    }

    public static void w(o o0, m m0) {
        o0.getClass();
        m0.getClass();
        o0.gaugeMetadata_ = m0;
        o0.bitField0_ |= 2;
    }

    public static void x(o o0, k k0) {
        o0.getClass();
        k0.getClass();
        t t0 = o0.cpuMetricReadings_;
        if(!((b)t0).X) {
            o0.cpuMetricReadings_ = p.r(t0);
        }
        o0.cpuMetricReadings_.add(k0);
    }

    public final int y() {
        return this.androidMemoryReadings_.size();
    }

    public final int z() {
        return this.cpuMetricReadings_.size();
    }
}


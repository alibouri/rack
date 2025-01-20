package T7;

import com.google.protobuf.S;
import com.google.protobuf.W;
import com.google.protobuf.b;
import com.google.protobuf.o;
import com.google.protobuf.p;
import com.google.protobuf.q;
import com.google.protobuf.r;
import com.google.protobuf.s;
import java.util.Arrays;

public final class w extends p {
    private static final w DEFAULT_INSTANCE = null;
    private static volatile S PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int SESSION_VERBOSITY_FIELD_NUMBER = 2;
    private int bitField0_;
    private String sessionId_;
    private r sessionVerbosity_;
    private static final s sessionVerbosity_converter_;

    static {
        w.sessionVerbosity_converter_ = new h();  // initializer: Ljava/lang/Object;-><init>()V
        w w0 = new w();
        w.DEFAULT_INSTANCE = w0;
        p.s(w.class, w0);
    }

    public w() {
        this.sessionId_ = "";
        this.sessionVerbosity_ = q.b0;
    }

    @Override  // com.google.protobuf.p
    public final Object m(int v) {
        switch(v.h.d(v)) {
            case 0: {
                return (byte)1;
            }
            case 1: {
                return null;
            }
            case 2: {
                return new W(w.DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002ࠞ", new Object[]{"bitField0_", "sessionId_", "sessionVerbosity_", h.d});
            }
            case 3: {
                return new w();
            }
            case 4: {
                return new v(w.DEFAULT_INSTANCE);  // initializer: Lcom/google/protobuf/n;-><init>(Lcom/google/protobuf/p;)V
            }
            case 5: {
                return w.DEFAULT_INSTANCE;
            }
            case 6: {
                S s0 = w.PARSER;
                if(s0 == null) {
                    Class class0 = w.class;
                    synchronized(class0) {
                        s0 = w.PARSER;
                        if(s0 == null) {
                            s0 = new o();  // initializer: Ljava/lang/Object;-><init>()V
                            w.PARSER = s0;
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

    public static void u(w w0, String s) {
        w0.getClass();
        s.getClass();
        w0.bitField0_ |= 1;
        w0.sessionId_ = s;
    }

    public static void v(w w0) {
        w0.getClass();
        r r0 = w0.sessionVerbosity_;
        if(!((b)r0).X) {
            int v = r0.size();
            int v1 = v == 0 ? 10 : v * 2;
            if(v1 < ((q)r0).Z) {
                throw new IllegalArgumentException();
            }
            w0.sessionVerbosity_ = new q(Arrays.copyOf(((q)r0).Y, v1), ((q)r0).Z, true);
        }
        ((q)w0.sessionVerbosity_).c(v.h.d(2));
    }

    public final int w() {
        switch(((q)this.sessionVerbosity_).e(0)) {
            case 0: {
                return 1;
            }
            case 1: {
                return 2;
            }
            default: {
                return 1;
            }
        }
    }

    public final int x() {
        return this.sessionVerbosity_.size();
    }

    public static v y() {
        return (v)w.DEFAULT_INSTANCE.l();
    }
}


package T7;

import com.google.protobuf.S;
import com.google.protobuf.W;
import com.google.protobuf.o;
import com.google.protobuf.p;
import v.h;

public final class k extends p {
    public static final int CLIENT_TIME_US_FIELD_NUMBER = 1;
    private static final k DEFAULT_INSTANCE = null;
    private static volatile S PARSER = null;
    public static final int SYSTEM_TIME_US_FIELD_NUMBER = 3;
    public static final int USER_TIME_US_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientTimeUs_;
    private long systemTimeUs_;
    private long userTimeUs_;

    static {
        k k0 = new k();  // initializer: Lcom/google/protobuf/p;-><init>()V
        k.DEFAULT_INSTANCE = k0;
        p.s(k.class, k0);
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
                return new W(k.DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "clientTimeUs_", "userTimeUs_", "systemTimeUs_"});
            }
            case 3: {
                return new k();  // initializer: Lcom/google/protobuf/p;-><init>()V
            }
            case 4: {
                return new j(k.DEFAULT_INSTANCE);  // initializer: Lcom/google/protobuf/n;-><init>(Lcom/google/protobuf/p;)V
            }
            case 5: {
                return k.DEFAULT_INSTANCE;
            }
            case 6: {
                S s0 = k.PARSER;
                if(s0 == null) {
                    Class class0 = k.class;
                    synchronized(class0) {
                        s0 = k.PARSER;
                        if(s0 == null) {
                            s0 = new o();  // initializer: Ljava/lang/Object;-><init>()V
                            k.PARSER = s0;
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

    public static void u(k k0, long v) {
        k0.bitField0_ |= 1;
        k0.clientTimeUs_ = v;
    }

    public static void v(k k0, long v) {
        k0.bitField0_ |= 2;
        k0.userTimeUs_ = v;
    }

    public static void w(k k0, long v) {
        k0.bitField0_ |= 4;
        k0.systemTimeUs_ = v;
    }

    public static j x() {
        return (j)k.DEFAULT_INSTANCE.l();
    }
}


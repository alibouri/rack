package T7;

import com.google.protobuf.S;
import com.google.protobuf.W;
import com.google.protobuf.o;
import com.google.protobuf.p;
import v.h;

public final class m extends p {
    public static final int CPU_CLOCK_RATE_KHZ_FIELD_NUMBER = 2;
    public static final int CPU_PROCESSOR_COUNT_FIELD_NUMBER = 6;
    private static final m DEFAULT_INSTANCE = null;
    public static final int DEVICE_RAM_SIZE_KB_FIELD_NUMBER = 3;
    public static final int MAX_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 4;
    public static final int MAX_ENCOURAGED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 5;
    private static volatile S PARSER = null;
    public static final int PROCESS_NAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private int cpuClockRateKhz_;
    private int cpuProcessorCount_;
    private int deviceRamSizeKb_;
    private int maxAppJavaHeapMemoryKb_;
    private int maxEncouragedAppJavaHeapMemoryKb_;
    private String processName_;

    static {
        m m0 = new m();
        m.DEFAULT_INSTANCE = m0;
        p.s(m.class, m0);
    }

    public m() {
        this.processName_ = "";
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
                return new W(m.DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006င\u0002", new Object[]{"bitField0_", "processName_", "cpuClockRateKhz_", "deviceRamSizeKb_", "maxAppJavaHeapMemoryKb_", "maxEncouragedAppJavaHeapMemoryKb_", "cpuProcessorCount_"});
            }
            case 3: {
                return new m();
            }
            case 4: {
                return new l(m.DEFAULT_INSTANCE);  // initializer: Lcom/google/protobuf/n;-><init>(Lcom/google/protobuf/p;)V
            }
            case 5: {
                return m.DEFAULT_INSTANCE;
            }
            case 6: {
                S s0 = m.PARSER;
                if(s0 == null) {
                    Class class0 = m.class;
                    synchronized(class0) {
                        s0 = m.PARSER;
                        if(s0 == null) {
                            s0 = new o();  // initializer: Ljava/lang/Object;-><init>()V
                            m.PARSER = s0;
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

    public static void u(m m0, int v) {
        m0.bitField0_ |= 16;
        m0.maxAppJavaHeapMemoryKb_ = v;
    }

    public static void v(m m0, int v) {
        m0.bitField0_ |= 0x20;
        m0.maxEncouragedAppJavaHeapMemoryKb_ = v;
    }

    public static void w(m m0, int v) {
        m0.bitField0_ |= 8;
        m0.deviceRamSizeKb_ = v;
    }

    public static m x() {
        return m.DEFAULT_INSTANCE;
    }

    public final boolean y() {
        return (this.bitField0_ & 16) != 0;
    }

    public static l z() {
        return (l)m.DEFAULT_INSTANCE.l();
    }
}


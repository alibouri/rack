package T7;

import com.google.protobuf.I;
import com.google.protobuf.S;
import com.google.protobuf.V;
import com.google.protobuf.W;
import com.google.protobuf.a;
import com.google.protobuf.b;
import com.google.protobuf.o;
import com.google.protobuf.p;
import com.google.protobuf.t;
import java.util.List;
import v.h;

public final class r extends p {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    private static final r DEFAULT_INSTANCE = null;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile S PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private I customAttributes_;
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private t perfSessions_;
    private long requestPayloadBytes_;
    private String responseContentType_;
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private String url_;

    static {
        r r0 = new r();
        r.DEFAULT_INSTANCE = r0;
        p.s(r.class, r0);
    }

    public r() {
        this.customAttributes_ = I.Y;
        this.url_ = "";
        this.responseContentType_ = "";
        this.perfSessions_ = V.b0;
    }

    public static void A(r r0, long v) {
        r0.bitField0_ |= 0x100;
        r0.timeToRequestCompletedUs_ = v;
    }

    public static void B(r r0, long v) {
        r0.bitField0_ |= 0x200;
        r0.timeToResponseInitiatedUs_ = v;
    }

    public static void C(r r0, long v) {
        r0.bitField0_ |= 0x400;
        r0.timeToResponseCompletedUs_ = v;
    }

    public static void D(r r0, List list0) {
        t t0 = r0.perfSessions_;
        if(!((b)t0).X) {
            r0.perfSessions_ = p.r(t0);
        }
        a.a(list0, r0.perfSessions_);
    }

    public static void E(r r0, int v) {
        r0.getClass();
        r0.httpMethod_ = h.d(v);
        r0.bitField0_ |= 2;
    }

    public static void F(r r0, long v) {
        r0.bitField0_ |= 4;
        r0.requestPayloadBytes_ = v;
    }

    public static void G(r r0, long v) {
        r0.bitField0_ |= 8;
        r0.responsePayloadBytes_ = v;
    }

    public final long H() {
        return this.clientStartTimeUs_;
    }

    public static r I() {
        return r.DEFAULT_INSTANCE;
    }

    public final int J() {
        switch(this.httpMethod_) {
            case 0: {
                return 1;
            }
            case 1: {
                return 2;
            }
            case 2: {
                return 3;
            }
            case 3: {
                return 4;
            }
            case 4: {
                return 5;
            }
            case 5: {
                return 6;
            }
            case 6: {
                return 7;
            }
            case 7: {
                return 8;
            }
            case 8: {
                return 9;
            }
            case 9: {
                return 10;
            }
            default: {
                return 1;
            }
        }
    }

    public final int K() {
        return this.httpResponseCode_;
    }

    public final t L() {
        return this.perfSessions_;
    }

    public final long M() {
        return this.requestPayloadBytes_;
    }

    public final long N() {
        return this.responsePayloadBytes_;
    }

    public final long O() {
        return this.timeToRequestCompletedUs_;
    }

    public final long P() {
        return this.timeToResponseCompletedUs_;
    }

    public final long Q() {
        return this.timeToResponseInitiatedUs_;
    }

    public final String R() {
        return this.url_;
    }

    public final boolean S() {
        return (this.bitField0_ & 0x80) != 0;
    }

    public final boolean T() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean U() {
        return (this.bitField0_ & 0x20) != 0;
    }

    public final boolean V() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean W() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean X() {
        return (this.bitField0_ & 0x100) != 0;
    }

    public final boolean Y() {
        return (this.bitField0_ & 0x400) != 0;
    }

    public final boolean Z() {
        return (this.bitField0_ & 0x200) != 0;
    }

    public static T7.p a0() {
        return (T7.p)r.DEFAULT_INSTANCE.l();
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
                return new W(r.DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000B᠌\u0004\f2\r\u001B", new Object[]{"bitField0_", "url_", "httpMethod_", T7.h.b, "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", T7.h.c, "customAttributes_", q.a, "perfSessions_", w.class});
            }
            case 3: {
                return new r();
            }
            case 4: {
                return new T7.p(r.DEFAULT_INSTANCE);  // initializer: Lcom/google/protobuf/n;-><init>(Lcom/google/protobuf/p;)V
            }
            case 5: {
                return r.DEFAULT_INSTANCE;
            }
            case 6: {
                S s0 = r.PARSER;
                if(s0 == null) {
                    Class class0 = r.class;
                    synchronized(class0) {
                        s0 = r.PARSER;
                        if(s0 == null) {
                            s0 = new o();  // initializer: Ljava/lang/Object;-><init>()V
                            r.PARSER = s0;
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

    public static void u(r r0, String s) {
        r0.getClass();
        s.getClass();
        r0.bitField0_ |= 1;
        r0.url_ = s;
    }

    public static void v(r r0) {
        r0.getClass();
        r0.networkClientErrorReason_ = h.d(2);
        r0.bitField0_ |= 16;
    }

    public static void w(r r0, int v) {
        r0.bitField0_ |= 0x20;
        r0.httpResponseCode_ = v;
    }

    public static void x(r r0, String s) {
        r0.getClass();
        s.getClass();
        r0.bitField0_ |= 0x40;
        r0.responseContentType_ = s;
    }

    public static void y(r r0) {
        r0.bitField0_ &= -65;
        r0.responseContentType_ = r.DEFAULT_INSTANCE.responseContentType_;
    }

    public static void z(r r0, long v) {
        r0.bitField0_ |= 0x80;
        r0.clientStartTimeUs_ = v;
    }
}


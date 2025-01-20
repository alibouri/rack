package Q3;

import Bb.F;
import Eb.a;
import I2.B;
import I2.H;
import N2.l;
import Nb.j;
import Nb.w;
import O3.k;
import V3.b;
import W5.f;
import Y8.P6;
import Y8.R6;
import Y8.W3;
import Y8.e6;
import Y8.m2;
import Y8.r2;
import ac.i;
import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.api.ApolloResponse.Builder;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.sendwave.backend.FragmentHandle;
import hb.A;
import hb.n;
import hb.u;
import io.sentry.i1;
import java.io.File;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.g;

public final class t implements i {
    public final int X;
    public final Object Y;
    public final Serializable Z;
    public final Object b0;
    public final Object c0;
    public final Object d0;
    public final Object e0;

    public t(i i0, R6 r60, FragmentHandle fragmentHandle0, Class class0, w w0, r2 r20) {
        this.X = 1;
        super();
        this.Y = i0;
        this.b0 = r60;
        this.c0 = fragmentHandle0;
        this.d0 = class0;
        this.Z = w0;
        this.e0 = r20;
    }

    public t(Object object0, Object object1, Object object2, Serializable serializable0, Object object3, Object object4, int v) {
        this.X = v;
        this.Y = object0;
        this.b0 = object1;
        this.c0 = object2;
        this.Z = serializable0;
        this.d0 = object3;
        this.e0 = object4;
        super();
    }

    @Override  // ac.i
    public final Object c(Object object0, g g0) {
        Set set1;
        t t0;
        i i0;
        P6 p60;
        s s1;
        Object object1 = this.e0;
        Serializable serializable0 = this.Z;
        Object object2 = Ab.t.a;
        Object object3 = this.d0;
        Object object4 = this.c0;
        Object object5 = this.Y;
        Object object6 = this.b0;
        switch(this.X) {
            case 0: {
                if(g0 instanceof s) {
                    s1 = (s)g0;
                    int v1 = s1.c0;
                    if((v1 & 0x80000000) == 0) {
                        s1 = new s(this, g0);
                    }
                    else {
                        s1.c0 = v1 ^ 0x80000000;
                    }
                }
                else {
                    s1 = new s(this, g0);
                }
                Object object7 = s1.b0;
                a a0 = a.X;
                switch(s1.c0) {
                    case 0: {
                        f.b0(object7);
                        l l0 = j.a(object0, object2) ? new l(4, new Builder(((ApolloRequest)object6).getOperation(), ((ApolloRequest)object6).getRequestUuid()).exception(z.a).build()) : new ac.w(((b)object4).a(((ApolloRequest)object6)), new Q3.w(((w)serializable0), ((x)object3), ((ApolloRequest)object6), ((CustomScalarAdapters)object1), null), 4);
                        s1.c0 = 1;
                        return ((i)object5).c(l0, s1) == a0 ? a0 : object2;
                    }
                    case 1: {
                        f.b0(object7);
                        return object2;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 1: {
                if(g0 instanceof P6) {
                    p60 = (P6)g0;
                    int v2 = p60.c0;
                    if((v2 & 0x80000000) == 0) {
                        p60 = new P6(this, g0);
                    }
                    else {
                        p60.c0 = v2 ^ 0x80000000;
                    }
                }
                else {
                    p60 = new P6(this, g0);
                }
                Object object8 = p60.b0;
                a a1 = a.X;
                int v3 = p60.c0;
                switch(v3) {
                    case 0: {
                        f.b0(object8);
                        Set set0 = (Set)object0;
                        p60.d0 = this;
                        i0 = (i)object5;
                        p60.f0 = i0;
                        p60.c0 = 1;
                        object8 = ((R6)object6).e(((FragmentHandle)object4), ((Class)object3), p60);
                        if(object8 != a1) {
                            t0 = this;
                            goto label_77;
                        }
                        break;
                    }
                    case 1: {
                        i0 = p60.f0;
                        t0 = p60.d0;
                        f.b0(object8);
                    label_77:
                        u u0 = A.a.e("normalize_plus_dependent_keys");
                        u0.start();
                        try {
                            u0.b("fragment", ((Class)t0.d0).getName());
                            u0.b("first_emit", "false");
                            W3 w30 = new W3();  // initializer: Ljava/lang/Object;-><init>()V
                            O3.b b0 = ((FragmentHandle)t0.c0).b();
                            set1 = k.a(k.b(((r2)t0.e0), ((m2)object8), ((e6)(((R6)t0.b0))).h.c0, w30, b0.a).values());
                        }
                        finally {
                            u0.stop();
                        }
                        ((w)t0.Z).X = set1;
                        p60.d0 = null;
                        p60.f0 = null;
                        p60.c0 = 2;
                        if(i0.c(((m2)object8), p60) != a1) {
                            return object2;
                        }
                        break;
                    }
                    default: {
                        if(v3 != 2) {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                        f.b0(object8);
                        return object2;
                    }
                }
                return a1;
            }
            default: {
                if(((H)object0) == null) {
                    i1 i10 = i1.WARNING;
                    Ab.k k0 = new Ab.k("fileHash", ((String)object5));
                    Ab.k k1 = new Ab.k("IdPhotoType", ((String)object6));
                    Ab.k k2 = new Ab.k("walletId", ((String)object4));
                    String s = (String)serializable0;
                    if(s == null) {
                        s = "NO_DESCRIPTOR_TAG";
                    }
                    n.d("Work info is null when uploading", i10, F.K(new Ab.k[]{k0, k1, k2, new Ab.k("descriptorTag", s), new Ab.k("fileUriPathKey", ((File)object3).toURI().getPath()), new Ab.k("uploadWorkRequestId", ((B)object1).a.toString())}), false, 8);
                }
                if((((H)object0) == null ? 0 : ((H)object0).l) == 1) {
                    int v = ((H)object0).e;
                    if(v >= 1) {
                        Map map0 = F.K(new Ab.k[]{new Ab.k("fileHash", ((String)object5)), new Ab.k("retryAttemptCount", String.valueOf(v))});
                        n.d("ID photo upload is retried", i1.WARNING, map0, false, 8);
                    }
                }
                return object2;
            }
        }
    }
}


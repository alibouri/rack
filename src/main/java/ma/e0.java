package ma;

import Ab.e;
import Ab.t;
import Bb.p;
import Eb.a;
import Nb.j;
import W5.f;
import Y8.V;
import Y8.m2;
import a9.k4;
import ac.i;
import com.sendwave.backend.fragment.LinkedAccountFragment;
import com.sendwave.backend.fragment.LinkedAccountTypeFragment;
import com.sendwave.backend.fragment.LinkedAccountsFragment;
import com.sendwave.backend.type.LinkedAccountTransferDirection.FROM_WALLET;
import com.sendwave.backend.type.LinkedAccountTransferDirection.TO_WALLET;
import com.sendwave.backend.type.LinkedAccountTransferDirection.UNKNOWN__;
import com.sendwave.backend.type.LinkedAccountTransferDirection;
import kotlin.coroutines.g;

public final class e0 implements i {
    public final int X;
    public final i Y;
    public final q0 Z;

    public e0(i i0, q0 q00, int v) {
        this.X = v;
        this.Y = i0;
        this.Z = q00;
        super();
    }

    @Override  // ac.i
    public final Object c(Object object0, g g0) {
        String s;
        m0 m00;
        g0 g00;
        d0 d00;
        switch(this.X) {
            case 0: {
                if(g0 instanceof d0) {
                    d00 = (d0)g0;
                    int v1 = d00.c0;
                    if((v1 & 0x80000000) == 0) {
                        d00 = new d0(this, g0);
                    }
                    else {
                        d00.c0 = v1 ^ 0x80000000;
                    }
                }
                else {
                    d00 = new d0(this, g0);
                }
                Object object3 = d00.b0;
                Object object4 = a.X;
                switch(d00.c0) {
                    case 0: {
                        f.b0(object3);
                        String s1 = this.Z.b0.h(((LinkedAccountTypeFragment)object0).d);
                        d00.c0 = 1;
                        return this.Y.c(s1, d00) != object4 ? t.a : object4;
                    }
                    case 1: {
                        f.b0(object3);
                        return t.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 1: {
                if(g0 instanceof g0) {
                    g00 = (g0)g0;
                    int v2 = g00.c0;
                    if((v2 & 0x80000000) == 0) {
                        g00 = new g0(this, g0);
                    }
                    else {
                        g00.c0 = v2 ^ 0x80000000;
                    }
                }
                else {
                    g00 = new g0(this, g0);
                }
                Object object5 = g00.b0;
                Object object6 = a.X;
                switch(g00.c0) {
                    case 0: {
                        f.b0(object5);
                        q0 q00 = this.Z;
                        LinkedAccountFragment linkedAccountFragment0 = null;
                        if(q00.j0 == null) {
                        label_77:
                            k4 k40 = (k4)p.q0(((LinkedAccountsFragment)((m2)object0).a).c);
                            if(k40 != null) {
                                linkedAccountFragment0 = k40.b;
                            }
                        }
                        else {
                            Object object7 = null;
                            for(Object object8: ((LinkedAccountsFragment)((m2)object0).a).c) {
                                if(j.a(((k4)object8).b.getId(), q00.j0)) {
                                    object7 = object8;
                                    break;
                                }
                            }
                            if(((k4)object7) != null) {
                                linkedAccountFragment0 = ((k4)object7).b;
                                goto label_80;
                            }
                            goto label_77;
                        }
                    label_80:
                        g00.c0 = 1;
                        return this.Y.c(linkedAccountFragment0, g00) != object6 ? t.a : object6;
                    }
                    case 1: {
                        f.b0(object5);
                        return t.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            default: {
                if(g0 instanceof m0) {
                    m00 = (m0)g0;
                    int v = m00.c0;
                    if((v & 0x80000000) == 0) {
                        m00 = new m0(this, g0);
                    }
                    else {
                        m00.c0 = v ^ 0x80000000;
                    }
                }
                else {
                    m00 = new m0(this, g0);
                }
                Object object1 = m00.b0;
                Object object2 = a.X;
                switch(m00.c0) {
                    case 0: {
                        f.b0(object1);
                        LinkedAccountTransferDirection linkedAccountTransferDirection0 = this.Z.Z.Z;
                        boolean z = false;
                        if(linkedAccountTransferDirection0 instanceof TO_WALLET) {
                            z = true;
                            s = ((LinkedAccountTypeFragment)object0).j.b;
                        }
                        else if(linkedAccountTransferDirection0 instanceof FROM_WALLET) {
                            z = true;
                            s = ((LinkedAccountTypeFragment)object0).h.b;
                        }
                        if(z) {
                            m00.c0 = 1;
                            return this.Y.c(s, m00) != object2 ? t.a : object2;
                        }
                        if(!(linkedAccountTransferDirection0 instanceof UNKNOWN__)) {
                            throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                        }
                        throw new V(null);
                    }
                    case 1: {
                        f.b0(object1);
                        return t.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }
    }
}


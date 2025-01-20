package N3;

import Ab.t;
import Bb.p;
import Eb.a;
import Nb.w;
import Q3.r;
import Q3.z;
import W5.f;
import Y8.O6;
import ac.i;
import com.apollographql.apollo.api.ApolloResponse;
import java.util.Set;
import kotlin.coroutines.g;

public final class v implements i {
    public final int X;
    public final w Y;
    public final i Z;

    public v(w w0, i i0) {
        this.X = 1;
        super();
        this.Y = w0;
        this.Z = i0;
    }

    public v(i i0, w w0, int v) {
        this.X = v;
        this.Z = i0;
        this.Y = w0;
        super();
    }

    public Object a(ApolloResponse apolloResponse0, g g0) {
        G g1;
        if(g0 instanceof G) {
            g1 = (G)g0;
            int v = g1.e0;
            if((v & 0x80000000) == 0) {
                g1 = new G(this, g0);
            }
            else {
                g1.e0 = v ^ 0x80000000;
            }
        }
        else {
            g1 = new G(this, g0);
        }
        Object object0 = g1.c0;
        Object object1 = a.X;
        Object object2 = t.a;
        switch(g1.e0) {
            case 0: {
                f.b0(object0);
                i i0 = this.Z;
                if(apolloResponse0.exception != z.a) {
                    g1.e0 = 2;
                    return i0.c(apolloResponse0, g1) == object1 ? object1 : object2;
                }
                Object object3 = this.Y.X;
                if(object3 != null) {
                    g1.b0 = this;
                    g1.e0 = 1;
                    if(i0.c(object3, g1) == object1) {
                        return object1;
                    }
                    this.Y.X = null;
                    return object2;
                }
                break;
            }
            case 1: {
                v v1 = g1.b0;
                f.b0(object0);
                v1.Y.X = null;
                break;
            }
            case 2: {
                f.b0(object0);
                return object2;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        return object2;
    }

    @Override  // ac.i
    public final Object c(Object object0, g g0) {
        v v1;
        ac.z z0;
        O6 o60;
        r r0;
        u u0;
        switch(this.X) {
            case 0: {
                if(g0 instanceof u) {
                    u0 = (u)g0;
                    int v2 = u0.c0;
                    if((v2 & 0x80000000) == 0) {
                        u0 = new u(this, g0);
                    }
                    else {
                        u0.c0 = v2 ^ 0x80000000;
                    }
                }
                else {
                    u0 = new u(this, g0);
                }
                Object object3 = u0.b0;
                Object object4 = a.X;
                switch(u0.c0) {
                    case 0: {
                        f.b0(object3);
                        ApolloResponse apolloResponse0 = (ApolloResponse)object0;
                        if(this.Y.X != null) {
                            apolloResponse0 = apolloResponse0.newBuilder().isLast(false).build();
                        }
                        u0.c0 = 1;
                        return this.Z.c(apolloResponse0, u0) != object4 ? t.a : object4;
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
                return this.a(((ApolloResponse)object0), g0);
            }
            case 2: {
                if(g0 instanceof r) {
                    r0 = (r)g0;
                    int v3 = r0.c0;
                    if((v3 & 0x80000000) == 0) {
                        r0 = new r(this, g0);
                    }
                    else {
                        r0.c0 = v3 ^ 0x80000000;
                    }
                }
                else {
                    r0 = new r(this, g0);
                }
                Object object5 = r0.b0;
                Object object6 = a.X;
                switch(r0.c0) {
                    case 0: {
                        f.b0(object5);
                        if(object0 instanceof Set) {
                            Object object7 = this.Y.X;
                            if(object7 == null || !p.s0(((Iterable)object0), ((Iterable)object7)).isEmpty()) {
                                r0.c0 = 1;
                                return this.Z.c(object0, r0) != object6 ? t.a : object6;
                            }
                            return t.a;
                        }
                        r0.c0 = 1;
                        return this.Z.c(object0, r0) != object6 ? t.a : object6;
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
            case 3: {
                if(g0 instanceof O6) {
                    o60 = (O6)g0;
                    int v4 = o60.c0;
                    if((v4 & 0x80000000) == 0) {
                        o60 = new O6(this, g0);
                    }
                    else {
                        o60.c0 = v4 ^ 0x80000000;
                    }
                }
                else {
                    o60 = new O6(this, g0);
                }
                Object object8 = o60.b0;
                Object object9 = a.X;
                switch(o60.c0) {
                    case 0: {
                        f.b0(object8);
                        if(!p.s0(((Set)object0), ((Iterable)this.Y.X)).isEmpty()) {
                            o60.c0 = 1;
                            if(this.Z.c(object0, o60) == object9) {
                                return object9;
                            }
                        }
                        return t.a;
                    }
                    case 1: {
                        f.b0(object8);
                        return t.a;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            default: {
                if(g0 instanceof ac.z) {
                    z0 = (ac.z)g0;
                    int v = z0.e0;
                    if((v & 0x80000000) == 0) {
                        z0 = new ac.z(this, g0);
                    }
                    else {
                        z0.e0 = v ^ 0x80000000;
                    }
                }
                else {
                    z0 = new ac.z(this, g0);
                }
                Object object1 = z0.c0;
                Object object2 = a.X;
                switch(z0.e0) {
                    case 0: {
                        f.b0(object1);
                        try {
                            z0.b0 = this;
                            z0.e0 = 1;
                            return this.Z.c(object0, z0) != object2 ? t.a : object2;
                        }
                        catch(Throwable throwable0) {
                            v1 = this;
                            v1.Y.X = throwable0;
                            throw throwable0;
                        }
                    }
                    case 1: {
                        try {
                            v1 = z0.b0;
                            f.b0(object1);
                            return t.a;
                        }
                        catch(Throwable throwable0) {
                        }
                        v1.Y.X = throwable0;
                        throw throwable0;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }
    }
}


package W3;

import Ab.t;
import B3.a;
import Bb.p;
import Bb.r;
import Ec.F;
import Ec.b;
import Ec.l;
import Ec.m;
import Fb.j;
import Nb.w;
import Vb.q;
import W5.f;
import ac.i;
import com.apollographql.apollo.api.http.HttpHeader;
import com.apollographql.apollo.api.http.HttpHeaders;
import com.apollographql.apollo.api.http.HttpResponse;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;

public final class g extends j implements Function2 {
    public int c0;
    public Object d0;
    public final w e0;
    public final HttpResponse f0;

    public g(w w0, HttpResponse httpResponse0, kotlin.coroutines.g g0) {
        this.e0 = w0;
        this.f0 = httpResponse0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((g)this.t(((i)object0), ((kotlin.coroutines.g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final kotlin.coroutines.g t(Object object0, kotlin.coroutines.g g0) {
        kotlin.coroutines.g g1 = new g(this.e0, this.f0, g0);
        g1.d0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        String s3;
        boolean z1;
        a a0;
        String s2;
        i i0;
        Object object1 = Eb.a.X;
        w w0 = this.e0;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                i0 = (i)this.d0;
                l l0 = this.f0.getBody();
                Nb.j.c(l0);
                String s = HttpHeaders.valueOf(this.f0.getHeaders(), "Content-Type");
                if(s == null) {
                    s2 = null;
                }
                else {
                    Iterable iterable0 = Vb.j.q0(s, new char[]{';'});
                    ArrayList arrayList0 = new ArrayList(r.b0(iterable0));
                    for(Object object2: iterable0) {
                        arrayList0.add(Vb.j.z0(((String)object2)).toString());
                    }
                    Object object3 = null;
                    for(Object object4: arrayList0) {
                        if(q.O(((String)object4), "boundary=", false)) {
                            object3 = object4;
                            break;
                        }
                    }
                    if(((String)object3) == null) {
                        s2 = null;
                    }
                    else {
                        String s1 = (String)p.r0(1, Vb.j.q0(((String)object3), new char[]{'='}));
                        if(s1 == null) {
                            s2 = null;
                        }
                        else {
                            int v = s1.length() - 1;
                            int v1 = 0;
                            boolean z = false;
                            while(v1 <= v) {
                                int v2 = s1.charAt((z ? v : v1));
                                int v3 = 0;
                                while(true) {
                                    if(v3 < 2) {
                                        if(v2 == new char[]{'\"', '\''}[v3]) {
                                            break;
                                        }
                                        else {
                                            ++v3;
                                            continue;
                                        }
                                    }
                                    v3 = -1;
                                    break;
                                }
                                if(!z) {
                                    if(v3 < 0) {
                                        z = true;
                                    }
                                    else {
                                        ++v1;
                                    }
                                    continue;
                                }
                                else if(v3 >= 0) {
                                    --v;
                                    continue;
                                }
                                else {
                                    s2 = s1.subSequence(v1, v + 1).toString();
                                }
                                goto label_56;
                            }
                            s2 = s1.subSequence(v1, v + 1).toString();
                        }
                    }
                }
            label_56:
                if(s2 == null) {
                    throw new U3.g("Expected the Content-Type to have a boundary parameter", null);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
                }
                w0.X = new W3.j(l0, s2);
                break;
            }
            case 1: {
                i0 = (i)this.d0;
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    alab1:
        while(true) {
            Object object5 = w0.X;
            Nb.j.c(object5);
            W3.j j0 = (W3.j)object5;
            if(j0.c0) {
                throw new IllegalStateException("closed");
            }
            if(j0.d0) {
                a0 = null;
                goto label_112;
            }
            l l1 = j0.X;
            if(j0.b0 == 0) {
                m m0 = j0.Y;
                if(l1.E(0L, m0)) {
                    l1.skip(((long)m0.e()));
                }
            }
            else {
                long v4;
                while((v4 = j0.a(0x2000L)) != 0L) {
                    l1.skip(v4);
                }
                l1.skip(((long)j0.Z.e()));
            }
            z1 = false;
        label_81:
            int v5 = l1.J(j0.f0);
            if(v5 != -1) {
                switch(v5) {
                    case 0: {
                        if(j0.b0 == 0) {
                            throw new U3.g("expected at least 1 part", null);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
                        }
                        j0.d0 = true;
                        a0 = null;
                        goto label_112;
                    }
                    case 1: {
                        ++j0.b0;
                        ArrayList arrayList1 = new ArrayList();
                        while(true) {
                            s3 = l1.t();
                            if(s3.length() == 0) {
                                W3.i i1 = new W3.i(j0);
                                j0.e0 = i1;
                                a0 = new a(arrayList1, b.c(i1));
                                goto label_112;
                            }
                            int v6 = Vb.j.Z(s3, ':', 0, false, 6);
                            if(v6 == -1) {
                                break;
                            }
                            String s4 = s3.substring(0, v6);
                            Nb.j.e(s4, "substring(...)");
                            String s5 = Vb.j.z0(s4).toString();
                            String s6 = s3.substring(v6 + 1);
                            Nb.j.e(s6, "substring(...)");
                            arrayList1.add(new HttpHeader(s5, Vb.j.z0(s6).toString()));
                        }
                        throw new IllegalStateException(("Unexpected header: " + s3).toString());
                    }
                    case 2: {
                        if(z1) {
                            throw new U3.g("unexpected characters after boundary", null);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
                        }
                        if(j0.b0 == 0) {
                            throw new U3.g("expected at least 1 part", null);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
                        }
                        j0.d0 = true;
                        a0 = null;
                    label_112:
                        if(a0 == null) {
                            return t.a;
                        }
                        this.d0 = i0;
                        this.c0 = 1;
                        if(i0.c(((F)a0.Y), this) != object1) {
                            continue;
                        }
                        break alab1;
                    }
                    case 3: 
                    case 4: {
                        z1 = true;
                        goto label_81;
                    }
                    default: {
                        goto label_81;
                    }
                }
            }
            throw l1.x() ? new U3.g("premature end of multipart body", null) : new U3.g("unexpected characters after boundary", null);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V / initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
        }
        return object1;
    }
}


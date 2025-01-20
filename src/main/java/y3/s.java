package Y3;

import Ab.o;
import C3.i;
import Eb.a;
import Fb.c;
import I2.J;
import Nb.j;
import R9.F2;
import W4.f;
import Xb.k;
import b4.A0;
import com.apollographql.apollo.api.http.HttpBody;
import com.apollographql.apollo.api.http.HttpHeader;
import com.apollographql.apollo.api.http.HttpMethod;
import com.apollographql.apollo.api.http.HttpRequest;
import com.apollographql.apollo.api.http.HttpResponse.Builder;
import java.io.IOException;
import java.util.ArrayList;
import pc.d;
import pc.e;
import pc.y;

public final class s implements b {
    public final F2 X;
    public final o Y;
    public static final q Z;

    static {
        s.Z = new q();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public s(d d0) {
        j.f(d0, "httpCallFactory");
        F2 f20 = new F2(7, d0);
        super();
        this.X = f20;
        this.Y = f.A(new F2(8, this));
    }

    @Override  // Y3.b
    public final Object K(HttpRequest httpRequest0, c c0) {
        q q1;
        r r0;
        if(c0 instanceof r) {
            r0 = (r)c0;
            int v = r0.e0;
            if((v & 0x80000000) == 0) {
                r0 = new r(this, c0);
            }
            else {
                r0.e0 = v ^ 0x80000000;
            }
        }
        else {
            r0 = new r(this, c0);
        }
        Object object0 = r0.c0;
        Object object1 = a.X;
        switch(r0.e0) {
            case 0: {
                W5.f.b0(object0);
                q q0 = s.Z;
                d d0 = (d)this.Y.getValue();
                j.f(httpRequest0, "<this>");
                i i0 = new i();
                i0.G(httpRequest0.getUrl());
                i0.Z = X3.b.a(httpRequest0.getHeaders()).e();
                y y0 = null;
                if(httpRequest0.getMethod() == HttpMethod.Get) {
                    i0.z("GET", null);
                    goto label_27;
                }
                else {
                    HttpBody httpBody0 = httpRequest0.getBody();
                    if(httpBody0 == null) {
                        throw new IllegalStateException("HTTP POST requires a request body");
                    }
                    i0.z("POST", new p(0, httpBody0));
                label_27:
                    A0 a00 = i0.j();
                    r0.b0 = q0;
                    r0.e0 = 1;
                    k k0 = new k(1, N4.j.w(r0));
                    k0.v();
                    e e0 = d0.b(a00);
                    k0.y(new Y3.o(0, e0));
                    try {
                        y0 = e0.a();
                        iOException0 = null;
                    }
                    catch(IOException iOException0) {
                    }
                    if(iOException0 == null) {
                        j.c(y0);
                        k0.i(y0);
                    }
                    else {
                        k0.i(W5.f.v(new U3.f(iOException0, "Failed to execute GraphQL http network request")));
                    }
                    Object object2 = k0.u();
                    if(object2 == object1) {
                        return object1;
                    }
                    object0 = object2;
                    q1 = q0;
                    break;
                }
                break;
            }
            case 1: {
                q1 = r0.b0;
                W5.f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        q1.getClass();
        j.f(((y)object0), "<this>");
        Builder httpResponse$Builder0 = new Builder(((y)object0).b0);
        j.c(((y)object0).e0);
        Builder httpResponse$Builder1 = httpResponse$Builder0.body(((y)object0).e0.h());
        pc.p p0 = ((y)object0).d0;
        Sb.d d1 = J.R(0, p0.size());
        ArrayList arrayList0 = new ArrayList(Bb.r.b0(d1));
        Sb.c c1 = d1.a();
        while(c1.Z) {
            int v1 = c1.a();
            arrayList0.add(new HttpHeader(p0.d(v1), p0.g(v1)));
        }
        return httpResponse$Builder1.addHeaders(arrayList0).build();
    }

    @Override
    public final void close() {
    }
}


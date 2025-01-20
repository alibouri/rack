package H9;

import Ab.o;
import Ea.e0;
import M.J;
import Nb.j;
import O3.h;
import R3.c;
import W4.f;
import android.content.Context;
import com.sendwave.util.Country;
import hb.C;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

public final class d {
    public final String a;
    public final String b;
    public final Country c;
    public final Context d;
    public final Function0 e;
    public final int f;
    public final Function0 g;
    public final Function1 h;
    public final Function1 i;
    public final String j;
    public final String k;
    public final String l;
    public final C m;
    public final o n;
    public final o o;
    public final o p;
    public final o q;
    public final o r;
    public final o s;

    public d(String s, String s1, Country country0, Context context0, Function0 function00, int v, Function0 function01, Function1 function10, Function1 function11) {
        j.f(country0, "country");
        super();
        this.a = s;
        this.b = s1;
        this.c = country0;
        this.d = context0;
        this.e = function00;
        this.f = v;
        this.g = function01;
        this.h = function10;
        this.i = function11;
        String s2 = (String)function00.invoke();
        if(s2 == null) {
            s2 = country0.w0;
        }
        if(v == 1) {
            s2 = "10.0.2.2";
        }
        else if(v != 2) {
            s2 = "uninitialized-build-flavor-should-not-hit-network.ninja";
        }
        this.j = s2;
        String s3 = v == 1 ? "http://10.0.2.2:5000/" : J.e("https://", s2, "/");
        this.k = s3;
        this.l = s3 + "graphql";
        C c0 = new C(0);  // initializer: LO3/j;-><init>(I)V
        h h0 = new h();
        O3.j j0 = c0;
        O3.j j1;
        while((j1 = (O3.j)j0.Y) != null) {
            j0 = j1;
        }
        j0.Y = h0;
        c c1 = new c(context0, (s == null ? "apollo_wave_app" : "apollo_wave_app_" + s));
        O3.j j2 = c0;
        O3.j j3;
        while((j3 = (O3.j)j2.Y) != null) {
            j2 = j3;
        }
        j2.Y = c1;
        this.m = c0;
        this.n = f.A(new e0(2));
        this.o = f.A(new b(this, 0));
        this.p = f.A(new b(this, 1));
        this.q = f.A(new b(this, 2));
        this.r = f.A(new b(this, 3));
        this.s = f.A(new b(this, 4));
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof d)) {
            return false;
        }
        if(!j.a(this.a, ((d)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((d)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((d)object0).c)) {
            return false;
        }
        if(!j.a(this.d, ((d)object0).d)) {
            return false;
        }
        if(!j.a(this.e, ((d)object0).e)) {
            return false;
        }
        if(this.f != ((d)object0).f) {
            return false;
        }
        if(!j.a(this.g, ((d)object0).g)) {
            return false;
        }
        return j.a(this.h, ((d)object0).h) ? j.a(this.i, ((d)object0).i) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        String s = this.b;
        if(s != null) {
            v = s.hashCode();
        }
        return this.i.hashCode() + (this.h.hashCode() + (this.g.hashCode() + ((this.e.hashCode() + (this.d.hashCode() + (this.c.hashCode() + (v1 * 0x1F + v) * 0x1F) * 0x1F) * 0x1F) * 0x1F + this.f) * 0x1F) * 0x1F) * 0x1F;
    }

    @Override
    public final String toString() {
        return "ApolloDi(mobile=" + this.a + ", sessionId=" + this.b + ", country=" + this.c + ", ctx=" + this.d + ", overrideProdBackendHostname=" + this.e + ", buildFlavor=" + this.f + ", getCronetEngine=" + this.g + ", customizeApolloClientBuilder=" + this.h + ", onBackendInitiatedLogout=" + this.i + ")";
    }
}


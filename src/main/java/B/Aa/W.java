package Aa;

import Ab.t;
import Nb.h;
import Nb.j;
import R9.n3;
import R9.o3;
import R9.x3;
import R9.y3;
import Y8.N;
import ac.h0;
import android.net.Uri;
import androidx.compose.ui.platform.AndroidComposeView;
import com.sendwave.backend.type.AnnouncementEventType.TAPPED;
import com.wave.customer.CustomerApp;
import f9.K;
import kotlin.jvm.functions.Function2;
import l0.b;
import m0.c;
import q9.C3;
import q9.Z1;
import q9.a2;
import q9.d0;

public final class w extends h implements Function2 {
    public final int g0;

    public w(int v, Object object0, Class class0, String s, String s1, int v1, int v2) {
        this.g0 = v2;
        super(v, v1, class0, object0, s, s1);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        switch(this.g0) {
            case 0: {
                j.f(((String)object0), "p0");
                j.f(((String)object1), "p1");
                return Boolean.valueOf(((C3)this.Y).c(((String)object0), ((String)object1)));
            }
            case 1: {
                return Boolean.valueOf(AndroidComposeView.e(((AndroidComposeView)this.Y), ((b)object0), ((c)object1)));
            }
            case 2: {
                j.f(((String)object0), "p0");
                j.f(((String)object1), "p1");
                return Boolean.valueOf(((CustomerApp)this.Y).c(((String)object0), ((String)object1)));
            }
            case 3: {
                j.f(((String)object0), "p0");
                j.f(((h0)object1), "p1");
                return ((K)this.Y).b(((String)object0), ((h0)object1));
            }
            case 4: {
                j.f(((String)object0), "p0");
                j.f(((h0)object1), "p1");
                return ((K)this.Y).b(((String)object0), ((h0)object1));
            }
            case 5: {
                j.f(((String)object0), "p0");
                j.f(((h0)object1), "p1");
                return ((K)this.Y).b(((String)object0), ((h0)object1));
            }
            case 6: {
                j.f(((String)object0), "p0");
                j.f(((h0)object1), "p1");
                ((o3)this.Y).getClass();
                n3 n30 = new n3(((o3)this.Y), ((String)object0), null);
                return N.k(((o3)this.Y), ((o3)this.Y).Y, true, n30);
            }
            case 7: {
                j.f(((String)object0), "p0");
                j.f(((String)object1), "p1");
                return Boolean.valueOf(((C3)this.Y).c(((String)object0), ((String)object1)));
            }
            case 8: {
                j.f(((String)object0), "p0");
                j.f(((h0)object1), "p1");
                ((y3)this.Y).getClass();
                x3 x30 = new x3(((y3)this.Y), ((String)object0), ((h0)object1), null);
                return N.k(((y3)this.Y), ((y3)this.Y).g0, true, x30);
            }
            case 9: {
                j.f(((String)object0), "p0");
                j.f(((String)object1), "p1");
                ((d0)this.Y).getClass();
                ((d0)this.Y).e0.a(TAPPED.X, ((String)object1));
                Uri uri0 = Uri.parse(((String)object0));
                q9.N n0 = new q9.N(((d0)this.Y), uri0, null);
                N.j(((d0)this.Y), ((d0)this.Y).c0, true, n0);
                return t.a;
            }
            case 10: {
                j.f(((String)object0), "p0");
                j.f(((String)object1), "p1");
                return Boolean.valueOf(((C3)this.Y).c(((String)object0), ((String)object1)));
            }
            case 11: {
                j.f(((String)object0), "p0");
                j.f(((String)object1), "p1");
                return Boolean.valueOf(((C3)this.Y).c(((String)object0), ((String)object1)));
            }
            case 12: {
                j.f(((String)object0), "p0");
                j.f(((String)object1), "p1");
                return Boolean.valueOf(((C3)this.Y).c(((String)object0), ((String)object1)));
            }
            case 13: {
                j.f(((String)object0), "p0");
                j.f(((String)object1), "p1");
                return Boolean.valueOf(((C3)this.Y).c(((String)object0), ((String)object1)));
            }
            case 14: {
                j.f(((String)object0), "p0");
                j.f(((h0)object1), "p1");
                ((a2)this.Y).getClass();
                Z1 z10 = new Z1(((a2)this.Y), ((String)object0), ((h0)object1), null);
                return N.k(((a2)this.Y), ((a2)this.Y).i0, true, z10);
            }
            default: {
                j.f(((String)object0), "p0");
                j.f(((String)object1), "p1");
                return Boolean.valueOf(((C3)this.Y).c(((String)object0), ((String)object1)));
            }
        }
    }
}


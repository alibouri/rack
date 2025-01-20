package ha;

import Ab.k;
import Ab.t;
import Bb.F;
import Bb.p;
import Bb.r;
import Bb.z;
import Eb.a;
import Fb.j;
import Sa.c;
import V8.d;
import W5.f;
import Y8.R9;
import a9.c9;
import ac.o0;
import android.net.Uri;
import com.sendwave.backend.fragment.PayableWalletFragment;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import q9.n;
import q9.r1;

public final class f1 extends j implements Function2 {
    public int c0;
    public Object d0;
    public final S2 e0;

    public f1(S2 s20, g g0) {
        this.e0 = s20;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((f1)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        g g1 = new f1(this.e0, g0);
        g1.d0 = object0;
        return g1;
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object1 = a.X;
        S2 s20 = this.e0;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                this.d0 = (R9)this.d0;
                this.c0 = 1;
                object5 = o0.v(s20.y1, this);
                if(object5 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                R9 r90 = (R9)this.d0;
                f.b0(object0);
                object5 = object0;
                break;
            }
            case 2: {
                f.b0(object0);
                return t.a;
            }
            case 3: {
                f.b0(object0);
                object4 = object0;
                goto label_62;
            }
            case 4: {
                f.b0(object0);
                object3 = object0;
                goto label_70;
            }
            case 5: {
                f.b0(object0);
                object2 = object0;
                goto label_75;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        List list0 = (List)object5;
        if(list0 == null) {
            list0 = z.X;
        }
        if(list0.size() > 1) {
            Map map0 = F.J(new k("multiplePartners", Boolean.TRUE));
            s20.i0.d("Transport: button clicked", map0);
            n n0 = s20.h0;
            Nb.j.f(n0, "assetLoader");
            ArrayList arrayList0 = new ArrayList(r.b0(list0));
            for(Object object6: list0) {
                PayableWalletFragment payableWalletFragment0 = ((c9)object6).b;
                String s = n0.c(payableWalletFragment0);
                if(s == null) {
                    s = "";
                }
                arrayList0.add(new Sa.a(s, payableWalletFragment0.b, payableWalletFragment0));
            }
            c c0 = new c(arrayList0);
            do {
                Object object7 = s20.z1.getValue();
                c c1 = (c)object7;
            }
            while(!s20.z1.j(object7, c0));
            return t.a;
        }
        if(list0.size() == 1) {
            Map map1 = F.J(new k("multiplePartners", Boolean.FALSE));
            s20.i0.d("Transport: button clicked", map1);
            PayableWalletFragment payableWalletFragment1 = ((c9)p.p0(list0)).b;
            this.d0 = null;
            this.c0 = 2;
            if(s20.B(payableWalletFragment1, this) == object1) {
                return object1;
            }
        }
        else {
            s20.i0.d("Transport: update app alert", null);
            this.d0 = null;
            this.c0 = 3;
            object4 = s20.r0.e(this);
            if(object4 == object1) {
                return object1;
            }
        label_62:
            String s1 = r1.d(0x7F120446, new Object[0]);  // string:transport "Transport"
            String s2 = r1.d(0x7F120447, new Object[0]);  // string:transport_update_message "Update your app in order to buy a ticket"
            String s3 = r1.d(0x7F120461, new Object[0]);  // string:update "Update"
            String s4 = r1.d(0x7F120091, new Object[0]);  // string:cancel "Cancel"
            this.c0 = 4;
            object3 = Pb.a.O(((d)object4), s1, s2, s3, s4, false, null, null, this, 488);
            if(object3 == object1) {
                return object1;
            }
        label_70:
            if(((Integer)object3) != null && ((int)(((Integer)object3))) == -1) {
                this.c0 = 5;
                object2 = s20.r0.e(this);
                if(object2 == object1) {
                    return object1;
                }
            label_75:
                Uri uri0 = Uri.parse("https://play.google.com/store/apps/details?id=com.wave.personal");
                Nb.j.e(uri0, "parse(...)");
                ((w)object2).o(uri0);
            }
        }
        return t.a;
    }
}


package o9;

import Bb.r;
import Nb.j;
import Nb.p;
import Nb.x;
import Qa.T;
import Tb.e;
import a9.e0;
import a9.j0;
import ac.B0;
import ac.h0;
import ac.h;
import ac.o0;
import androidx.lifecycle.FlowWatcherKt;
import androidx.lifecycle.ViewModel;
import com.sendwave.backend.fragment.BillFieldsFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

public final class t extends n {
    public final h0 e0;
    public final B0 f0;
    public final Function1 g0;
    public final B0 h0;
    public final T i0;
    public String j0;
    public final T k0;
    public static final e[] l0;

    static {
        p p0 = new p(t.class, "wHasVal", "getWHasVal()Ljava/lang/Boolean;", 0);
        x.a.getClass();
        t.l0 = new e[]{p0};
    }

    public t(ViewModel viewModel0, BillFieldsFragment billFieldsFragment0, j0 j00, h0 h00, B0 b00, Function1 function10) {
        j.f(viewModel0, "parent");
        j.f(j00, "field");
        j.f(b00, "focusTracker");
        super(viewModel0, 0x7F0D00CB, billFieldsFragment0, j00);  // layout:personal_bill_multi_choice_field
        this.e0 = h00;
        this.f0 = b00;
        this.g0 = function10;
        String s = "";
        B0 b01 = o0.c("");
        this.h0 = b01;
        T t0 = new T(b01, 11);
        this.i0 = t0;
        int v = 0;
        FlowWatcherKt.b(t0).a(this, t.l0[0]);
        String s1 = (String)((B0)h00).getValue();
        List list0 = j00.a;
        if(s1.length() != 0) {
            Iterator iterator0 = list0.iterator();
            while(true) {
                if(!iterator0.hasNext()) {
                    v = -1;
                    break;
                }
                Object object0 = iterator0.next();
                if(((e0)object0).a.equals(s1)) {
                    break;
                }
                ++v;
            }
            if(v > -1) {
                String s2 = ((e0)list0.get(v)).b;
                this.h0.getClass();
                this.h0.l(null, s2);
                s = ((e0)list0.get(v)).b;
            }
        }
        this.j0 = s;
        this.k0 = this.i0;
        ArrayList arrayList0 = new ArrayList(r.b0(list0));
        for(Object object1: list0) {
            arrayList0.add(((e0)object1).b);
        }
    }

    @Override  // o9.n
    public final String c() {
        return this.j0;
    }

    @Override  // o9.n
    public final h d() {
        return this.k0;
    }
}


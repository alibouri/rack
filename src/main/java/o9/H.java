package o9;

import Bb.p;
import Bb.q;
import Bb.r;
import Bb.z;
import Nb.j;
import Pb.a;
import V8.c;
import a9.d0;
import a9.g0;
import ac.B0;
import ac.h0;
import ac.o0;
import android.widget.TextView;
import androidx.appcompat.app.AlertController.RecycleListView;
import androidx.lifecycle.ViewModel;
import com.sendwave.backend.fragment.BillFieldsFragment;
import i.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import q9.M0;

public final class h extends n {
    public final h0 e0;
    public final B0 f0;
    public final c g0;
    public final ArrayList h0;
    public final B0 i0;
    public final B0 j0;
    public boolean[] k0;

    public h(ViewModel viewModel0, BillFieldsFragment billFieldsFragment0, a9.h0 h00, h0 h01, B0 b00, c c0) {
        j.f(viewModel0, "parent");
        j.f(h00, "field");
        j.f(b00, "focusTracker");
        j.f(c0, "actions");
        super(viewModel0, 0x7F0D00C2, billFieldsFragment0, h00);  // layout:personal_bill_addons_field
        this.e0 = h01;
        this.f0 = b00;
        this.g0 = c0;
        this.h0 = p.R0(Vb.j.p0(((CharSequence)((B0)h01).getValue()), new String[]{";"}, 0, 6));
        this.i0 = o0.c(this.i());
        this.j0 = o0.c(Boolean.TRUE);
        ArrayList arrayList0 = new ArrayList(r.b0(h00.a));
        for(Object object0: h00.a) {
            arrayList0.add(Boolean.valueOf(this.h0.contains(((d0)object0).a)));
        }
        this.k0 = p.N0(arrayList0);
    }

    @Override  // o9.n
    public final String c() {
        return (String)this.i0.getValue();
    }

    @Override  // o9.n
    public final ac.h d() {
        return this.j0;
    }

    public final List g(String s) {
        List list0 = ((a9.h0)this.b0).b;
        if(list0 != null) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: list0) {
                if(((g0)object0).a.equals(s) || ((g0)object0).b.equals(s)) {
                    arrayList0.add(object0);
                }
            }
            List list1 = new ArrayList(r.b0(arrayList0));
            for(Object object1: arrayList0) {
                g0 g00 = (g0)object1;
                ((ArrayList)list1).add((g00.a.equals(s) ? g00.b : g00.a));
            }
            return list1;
        }
        return z.X;
    }

    public final String i() {
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: ((a9.h0)this.b0).a) {
            if(this.h0.contains(((d0)object0).a)) {
                arrayList0.add(object0);
            }
        }
        ArrayList arrayList1 = new ArrayList(r.b0(arrayList0));
        for(Object object1: arrayList0) {
            arrayList1.add(h.j(((d0)object1)));
        }
        return p.v0(arrayList1, "\n", null, null, null, 62);
    }

    public static String j(d0 d00) {
        String s = M0.a(d00.c);
        return d00.b + " (" + s + ")";
    }

    public final void k(g g0) {
        ArrayList arrayList0 = this.h0;
        ArrayList arrayList1 = new ArrayList(r.b0(arrayList0));
        for(Object object0: arrayList0) {
            arrayList1.add(this.g(((String)object0)));
        }
        Set set0 = p.U0(r.c0(arrayList1));
        int v = 0;
        for(Object object1: ((a9.h0)this.b0).a) {
            if(v >= 0) {
                int v1 = set0.contains(((d0)object1).a) ? 0x7F060016 : 0x7F06007B;  // color:Gray400
                g0.d0.f.setItemChecked(v, arrayList0.contains(((d0)object1).a));
                AlertController.RecycleListView alertController$RecycleListView0 = g0.d0.f;
                j.e(alertController$RecycleListView0, "getListView(...)");
                ((TextView)a.z(alertController$RecycleListView0, v)).setTextColor(g0.getContext().getColor(v1));
                boolean[] arr_z = this.k0;
                arr_z[v] = arrayList0.contains(((d0)object1).a);
                ++v;
                continue;
            }
            q.Z();
            throw null;
        }
    }

    public final void l() {
        String s = this.i();
        this.i0.getClass();
        this.i0.l(null, s);
        String s1 = p.v0(this.h0, ";", null, null, null, 62);
        ((B0)this.e0).getClass();
        ((B0)this.e0).l(null, s1);
    }
}


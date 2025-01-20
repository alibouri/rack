package i9;

import Bb.n;
import Bb.p;
import Bb.q;
import Bb.r;
import Nb.j;
import ac.B0;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import java.util.ArrayList;
import java.util.Set;
import p9.U;
import p9.z;

public final class g0 implements CompoundButton.OnCheckedChangeListener {
    public final int a;
    public U b;

    public g0(int v) {
        this.a = v;
        super();
    }

    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        if(this.a != 0) {
            U u0 = this.b;
            u0.getClass();
            j.f(compoundButton0, "view");
            int v = compoundButton0.getContext().getColor(0x7F06007B);  // color:black
            int v1 = compoundButton0.getContext().getColor(0x7F060016);  // color:Gray400
            CharSequence charSequence0 = compoundButton0.getText();
            int v2 = n.u0(u0.Y.c0, charSequence0);
            ArrayList arrayList0 = u0.o(v2);
            u0.p(v2, z);
            int v3 = 0;
            if(z) {
                for(Object object0: arrayList0) {
                    u0.p(((Number)object0).intValue(), false);
                }
            }
            B0 b00 = u0.Z;
            Iterable iterable0 = (Iterable)b00.getValue();
            ArrayList arrayList1 = new ArrayList(r.b0(iterable0));
            for(Object object1: iterable0) {
                arrayList1.add(((z)((f9.j)object1).c));
            }
            ArrayList arrayList2 = new ArrayList(r.b0(arrayList1));
            for(Object object2: arrayList1) {
                z z1 = (z)object2;
                ArrayList arrayList3 = z1.c ? u0.o(z1.a) : Bb.z.X;
                arrayList2.add(arrayList3);
            }
            Set set0 = p.U0(r.c0(arrayList2));
            for(Object object3: ((Iterable)b00.getValue())) {
                if(v3 >= 0) {
                    ((z)((f9.j)object3).c).d = set0.contains(v3) ? v1 : v;
                    ++v3;
                    continue;
                }
                q.Z();
                throw null;
            }
            u0.b0.invoke();
            return;
        }
        U u1 = this.b;
        u1.getClass();
        j.f(compoundButton0, "expected");
        u1.d0.getClass();
        u1.d0.l(null, Boolean.valueOf(z));
        u1.e0.k((z ? u1.Y.Z : u1.Y.b0));
    }
}


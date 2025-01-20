package o9;

import Ab.k;
import Ea.r;
import Nb.j;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.I;
import androidx.recyclerview.widget.m;
import com.apollographql.apollo.api.b;
import java.util.List;

public final class k1 extends m {
    public final r e;
    public static final j1 f;

    static {
        k1.f = new j1();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public k1(r r0) {
        super(k1.f);
        this.e = r0;
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final void i(I i0, int v) {
        Object object0 = this.d.f.get(v);
        j.e(object0, "getItem(...)");
        int v1 = 0;
        List list0 = Vb.j.p0(((h1)object0).b, new String[]{" ("}, 0, 6);
        k k0 = list0.size() == 2 ? new k(list0.get(0), b.o(list0.get(1), "(")) : new k(((h1)object0).b, null);
        ((m1)i0).v.setText(((String)k0.X));
        ((m1)i0).w.setText(((String)k0.Y));
        k k1 = ((h1)object0).c ? new k(((int)((m1)i0).y), ((int)((m1)i0).y)) : new k(((int)((m1)i0).z), ((int)((m1)i0).A));
        int v2 = ((Number)k1.X).intValue();
        int v3 = ((Number)k1.Y).intValue();
        ((m1)i0).v.setTextColor(v2);
        ((m1)i0).w.setTextColor(v3);
        if(!((h1)object0).c) {
            v1 = 8;
        }
        ((m1)i0).x.setVisibility(v1);
        l1 l10 = new l1(((m1)i0), 0, ((h1)object0));
        ((m1)i0).a.setOnClickListener(l10);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public final I j(ViewGroup viewGroup0, int v) {
        j.f(viewGroup0, "parent");
        View view0 = LayoutInflater.from(viewGroup0.getContext()).inflate(0x7F0D009E, viewGroup0, false);  // layout:multichoice_bottomsheet_item
        j.c(view0);
        return new m1(view0, this.e);
    }
}


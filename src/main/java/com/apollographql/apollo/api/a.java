package com.apollographql.apollo.api;

import Aa.K;
import Aa.Q;
import Aa.S;
import Aa.U;
import Aa.s;
import Ab.t;
import C.E;
import C.i;
import Ea.F0;
import Ea.b0;
import Nb.j;
import Nb.w;
import T0.G;
import T3.d;
import Va.c;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import c0.b;
import dc.e;
import ha.U2;
import ha.h0;
import ha.m0;
import ha.m;
import ha.n;
import i.g;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

public final class a implements Function1 {
    public final int X;
    public final Object Y;
    public final Object Z;
    public final Object b0;
    public final Object c0;

    public a(Object object0, Object object1, Object object2, Object object3, int v) {
        this.X = v;
        this.Y = object0;
        this.Z = object1;
        this.b0 = object2;
        this.c0 = object3;
        super();
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        Object object1 = t.a;
        Object object2 = this.c0;
        Object object3 = this.b0;
        Object object4 = this.Z;
        Object object5 = this.Y;
        switch(this.X) {
            case 0: {
                return Boolean.valueOf(BooleanExpressions.evaluate$lambda$2(((Set)object5), ((Set)object4), ((List)object3), ((String)object2), ((BTerm)object0)));
            }
            case 1: {
                j.f(((i)object0), "$this$LazyColumn");
                ((i)object0).e("top_part", "top_part", new b(1491276707, new h0(((m0)object5), ((n)object4), 0), true));
                if(!((m0)object5).g.a.isEmpty()) {
                    ((i)object0).e("announcements", "announcements", new b(-232706712, new h0(((m0)object5), ((n)object4), 1), true));
                }
                if(((m0)object5).h != null) {
                    ((i)object0).e("error_indicator", "error_indicator", new b(0xB21CA91, new K(8, ((m0)object5)), true));
                }
                s s0 = ((n)object4).j;
                F0 f00 = new F0(((n)object4), ((e)object3), ((E)object2), 6);
                U2 u20 = ((m0)object5).i;
                j.f(u20, "state");
                j.f(s0, "onHistoryItemSwipe");
                m m0 = ((n)object4).i;
                j.f(m0, "onHistoryItemClick");
                b0 b00 = ((n)object4).f;
                j.f(b00, "onContactSupportClick");
                if(u20.d) {
                    ((i)object0).e("empty_tx_history", "empty_tx_history", new b(340077438, new U(u20, 7, b00), true));
                }
                if(u20.f) {
                    ((i)object0).e("no_recent_tx", "no_recent_tx", ia.i.a);
                }
                ((i)object0).e("divider", "divider", ia.i.b);
                boolean z = u20.c;
                if(z) {
                    ((i)object0).e("loading_indicator", "loading_indicator", ia.i.c);
                }
                d d0 = new d(26);
                d d1 = new d(27);
                List list0 = u20.a;
                ((i)object0).f(list0.size(), new G(d0, 12, list0), new G(d1, 13, list0), new b(0xDA480CDF, new ia.m(list0, s0, u20, m0), true));
                if(u20.g) {
                    ((i)object0).e("search_button", "search_button", new b(1630198117, new K(9, f00), true));
                }
                List list1 = ((m0)object5).o;
                if(list1 != null && (!list0.isEmpty() || !z)) {
                    d d2 = new d(23);
                    ((i)object0).f(list1.size(), new Q(5, list1), new G(d2, 11, list1), new b(0xDA480CDF, new S(list1, ((n)object4), ((m0)object5), 2), true));
                }
                return object1;
            }
            case 2: {
                j.f(((g)object0), "$this$showAndAwait");
                Button button0 = ((g)object0).j(-1);
                String s1 = (String)object2;
                if(s1 == null) {
                    s1 = "";
                }
                button0.setEnabled(((Boolean)((Function1)object3).n(s1)).booleanValue());
                ((w)object5).X = (g)object0;
                Window window0 = ((g)object0).getWindow();
                if(window0 != null) {
                    window0.setSoftInputMode(5);
                }
                ((EditText)object4).requestFocus();
                return object1;
            }
            default: {
                j.f(((Va.d)object0), "it");
                if(((Va.d)object0).equals(((c)object5))) {
                    ((Function0)object4).invoke();
                    return object1;
                }
                if(((Va.d)object0).equals(((c)object3))) {
                    ((Function0)object2).invoke();
                }
                return object1;
            }
        }
    }
}


package oa;

import Ab.e;
import Bb.p;
import Bb.q;
import Bb.z;
import Cb.c;
import E7.o;
import F0.W;
import J1.E;
import Nb.j;
import W5.f;
import a9.T7;
import ac.i;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sendwave.backend.type.LinkedAccountKind.BANK;
import com.sendwave.backend.type.LinkedAccountKind.MFI;
import com.wave.voip.VoipCallActivity;
import com.wave.voip.VoipCallParams;
import com.wave.voip.call.VoipCaller.CallParams;
import io.sentry.android.core.m;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.g;
import o9.l1;
import p9.N;
import p9.O;
import pb.d;
import pb.w;
import q9.C3;
import q9.n;
import q9.o0;
import q9.r1;
import q9.z3;
import qb.a;
import va.t;
import va.x;

public final class s implements i {
    public final int X;
    public final Object Y;
    public final Object Z;

    public s(Object object0, int v, Object object1) {
        this.X = v;
        this.Y = object0;
        this.Z = object1;
        super();
    }

    @Override  // ac.i
    public final Object c(Object object0, g g0) {
        t t0;
        a a3;
        boolean z1;
        N n0;
        r r0;
        CharSequence charSequence0 = null;
        boolean z = false;
        Object object1 = Ab.t.a;
        Object object2 = this.Y;
        Object object3 = this.Z;
        switch(this.X) {
            case 0: {
                if(g0 instanceof r) {
                    r0 = (r)g0;
                    int v1 = r0.c0;
                    if((v1 & 0x80000000) == 0) {
                        r0 = new r(this, g0);
                    }
                    else {
                        r0.c0 = v1 ^ 0x80000000;
                    }
                }
                else {
                    r0 = new r(this, g0);
                }
                Object object6 = r0.b0;
                Eb.a a1 = Eb.a.X;
                switch(r0.c0) {
                    case 0: {
                        f.b0(object6);
                        ((oa.t)object3).getClass();
                        c c0 = q.m();
                        List list0 = (List)((Map)object0).get(BANK.X);
                        List list1 = z.X;
                        if(list0 == null) {
                            list0 = list1;
                        }
                        if(!list0.isEmpty()) {
                            c0.add(new oa.c(r1.d(0x7F120064, new Object[0])));  // string:bank_short "Bank"
                            c0.addAll(list0);
                        }
                        List list2 = (List)((Map)object0).get(MFI.X);
                        if(list2 != null) {
                            list1 = list2;
                        }
                        if(!list1.isEmpty()) {
                            c0.add(new oa.c(r1.d(0x7F120283, new Object[0])));  // string:mfi_short "MFI"
                            c0.addAll(list1);
                        }
                        c c1 = q.i(c0);
                        r0.c0 = 1;
                        return ((i)object2).c(c1, r0) == a1 ? a1 : object1;
                    }
                    case 1: {
                        f.b0(object6);
                        return object1;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 1: {
                if(g0 instanceof N) {
                    n0 = (N)g0;
                    int v2 = n0.c0;
                    if((v2 & 0x80000000) == 0) {
                        n0 = new N(this, g0);
                    }
                    else {
                        n0.c0 = v2 ^ 0x80000000;
                    }
                }
                else {
                    n0 = new N(this, g0);
                }
                Object object7 = n0.b0;
                Eb.a a2 = Eb.a.X;
                switch(n0.c0) {
                    case 0: {
                        f.b0(object7);
                        n n1 = C3.t0;
                        if(n1 != null) {
                            String[] arr_s = n1.a.getResources().getStringArray(0x7F030005);  // array:pay_bill_favorite_labels
                            j.e(arr_s, "getStringArray(...)");
                            ArrayList arrayList1 = p.G0(p.E0(Bb.n.y0(arr_s), ((List)object0)), ((O)object3).Z);
                            n0.c0 = 1;
                            return ((i)object2).c(arrayList1, n0) == a2 ? a2 : object1;
                        }
                        j.p("translator");
                        throw null;
                    }
                    case 1: {
                        f.b0(object7);
                        return object1;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
            case 2: {
                Ab.t t1 = (Ab.t)object0;
                VoipCaller.CallParams voipCaller$CallParams0 = (VoipCaller.CallParams)((W)((jc.i)object3).Y).i;
                if(voipCaller$CallParams0 != null) {
                    z = voipCaller$CallParams0.c0;
                }
                VoipCallParams voipCallParams0 = new VoipCallParams(null, z, null);
                o0.F(((z3)object2), VoipCallActivity.class, voipCallParams0);
                return object1;
            }
            case 3: {
                j.f(((w)object0), "<this>");
                d d0 = ((w)object0).a;
                switch(d0.ordinal()) {
                    case 1: 
                    case 2: 
                    case 3: 
                    case 4: {
                        z1 = true;
                        break;
                    }
                    case 0: 
                    case 5: 
                    case 6: {
                        z1 = false;
                        break;
                    }
                    default: {
                        throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                    }
                }
                if(z1) {
                    ((o)object2).getClass();
                    j.f(((z3)object3), "<this>");
                    a3 = (a)((z3)object3).findViewById(a.j0);
                    if(a3 == null) {
                        ViewGroup viewGroup0 = (ViewGroup)((z3)object3).findViewById(0x1020002);
                        if(viewGroup0 == null) {
                            a3 = null;
                        }
                        else {
                            View view0 = viewGroup0.getChildAt(0);
                            LinearLayout linearLayout0 = view0 instanceof LinearLayout ? ((LinearLayout)view0) : null;
                            if(linearLayout0 == null) {
                                a3 = null;
                            }
                            else {
                                a a4 = new a(((z3)object3));
                                a4.setOnClickListener(new l1(((o)object2), 1, ((z3)object3)));
                                E.k(a4, new m7.o(18));
                                linearLayout0.addView(a4, 0);
                                a3 = a4;
                            }
                        }
                    }
                }
                else {
                    j.f(((z3)object3), "<this>");
                    a3 = (a)((z3)object3).findViewById(a.j0);
                }
                if(a3 != null) {
                    switch(d0.ordinal()) {
                        case 1: 
                        case 2: 
                        case 3: 
                        case 4: {
                            a3.setVisibility(0);
                            boolean z2 = ((w)object0).e;
                            int v3 = d0 == d.c0 || z2 ? a3.i0 : a3.h0;
                            a3.setBackgroundColor(v3);
                            a3.post(new K.g(v3, 1, a3));
                            TextView textView0 = a3.e0;
                            j.e(a3.getContext(), "getContext(...)");
                            switch(d0.ordinal()) {
                                case 1: 
                                case 2: 
                                case 3: {
                                    charSequence0 = "Tap to return to call";
                                    break;
                                }
                                case 4: {
                                    charSequence0 = "Reconnecting call…";
                                    break;
                                }
                                case 0: 
                                case 5: 
                                case 6: {
                                    break;
                                }
                                default: {
                                    throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                                }
                            }
                            textView0.setText(charSequence0);
                            a3.f0.setImageResource((z2 ? 0x7F08022E : 0x7F0801F4));  // drawable:ic_exclamation_16
                            String s = z2 ? "On hold" : Q4.i.B(((w)object0).b);
                            a3.g0.setText(s);
                            return object1;
                        }
                        case 0: 
                        case 5: 
                        case 6: {
                            a3.setVisibility(8);
                            a3.post(new m(5, a3));
                            break;
                        }
                        default: {
                            throw new e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                        }
                    }
                }
                return object1;
            }
            default: {
                if(g0 instanceof t) {
                    t0 = (t)g0;
                    int v = t0.c0;
                    if((v & 0x80000000) == 0) {
                        t0 = new t(this, g0);
                    }
                    else {
                        t0.c0 = v ^ 0x80000000;
                    }
                }
                else {
                    t0 = new t(this, g0);
                }
                Object object4 = t0.b0;
                Eb.a a0 = Eb.a.X;
                switch(t0.c0) {
                    case 0: {
                        f.b0(object4);
                        ArrayList arrayList0 = new ArrayList();
                        for(Object object5: ((List)object0)) {
                            if(((Boolean)((x)object3).b0.j(((T7)object5).e, ((T7)object5).f.d)).booleanValue()) {
                                arrayList0.add(object5);
                            }
                        }
                        t0.c0 = 1;
                        return ((i)object2).c(arrayList0, t0) == a0 ? a0 : object1;
                    }
                    case 1: {
                        f.b0(object4);
                        return object1;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
            }
        }
    }
}


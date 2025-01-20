package Ea;

import Aa.J;
import Aa.Q;
import Aa.S;
import Ab.k;
import Ab.t;
import B.G0;
import Bb.F;
import Bb.p;
import C.i;
import Fa.C;
import G0.W;
import G0.e0;
import Nb.j;
import Nb.w;
import O0.d;
import O0.f;
import Qa.A;
import Qa.Y;
import Qa.c;
import Qa.e;
import R.W0;
import R9.Z1;
import T0.G;
import U.N0;
import a1.g;
import android.content.Context;
import android.support.v4.media.session.a;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.unit.Density;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c.o;
import c0.b;
import com.google.android.material.textfield.TextInputEditText;
import com.sendwave.backend.type.Currency;
import com.sendwave.models.CurrencyAmount;
import com.wave.customer.BuyAirtimeDialogActivity;
import com.wave.customer.receipts.HistoryEntryId;
import com.wave.customer.scratchCardRewards.ScratchCard.Unlocked.KnownAward;
import com.wave.customer.transactions.ui.TransactionsParams;
import ha.l;
import ha.m;
import i9.q;
import io.sentry.M1;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import o9.g0;
import o9.i1;
import o9.k1;
import pa.s;
import pa.z;
import q9.o0;
import q9.r1;
import q9.u0;
import ra.I;

public final class r implements Function1 {
    public final int X;
    public final Object Y;
    public final Object Z;

    public r(w w0, TextInputEditText textInputEditText0) {
        this.X = 15;
        super();
        this.Y = w0;
        this.Z = textInputEditText0;
    }

    public r(Object object0, int v, Object object1) {
        this.X = v;
        this.Y = object0;
        this.Z = object1;
        super();
    }

    public r(Function0 function00, Function0 function01) {
        this.X = 19;
        super();
        this.Z = function00;
        this.Y = function01;
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        W0 w00 = W0.Y;
        boolean z = true;
        boolean z1 = false;
        Object object1 = t.a;
        Object object2 = this.Y;
        Object object3 = this.Z;
        switch(this.X) {
            case 0: {
                j.f(((Context)object0), "context");
                Object object4 = new R0(((Context)object0));
                ((R0)object4).setForegroundRes(((KnownAward)object2).b0.X);
                ((R0)object4).setRevealListener(((Function0)object3));
                return object4;
            }
            case 1: {
                j.f(((Density)object0), "$this$offset");
                float f = (float)((ParcelableSnapshotMutableIntState)object3).k();
                return new g(a.i(0, ((int)((((C)object2).c() - 1.0f) * f))));
            }
            case 2: {
                int v = (int)(((Integer)object0));
                if(((d)p.q0(((f)object2).c(v, v, "TC"))) != null) {
                    ((Function0)object3).invoke();
                }
                return object1;
            }
            case 3: {
                j.f(((W0)object0), "it");
                if(((W0)object0) == w00) {
                    z1 = ((Boolean)((Function1)object2).n(((c)object3))).booleanValue();
                }
                return Boolean.valueOf(z1);
            }
            case 4: {
                j.f(((A)object0), "$this$updateState");
                Map map0 = ((A)object0).b;
                Boolean boolean0 = (Boolean)map0.get(((e)object2));
                if(boolean0 != null) {
                    if(boolean0.booleanValue()) {
                        TransactionsParams transactionsParams0 = ((Y)object3).Y;
                        if(((e)object2) == transactionsParams0.b0) {
                            transactionsParams0.b0 = null;
                        }
                        return A.a(((A)object0), null, F.R(map0, new k(((e)object2), Boolean.FALSE)), null, null, false, null, 61);
                    }
                    ((e)object2).getClass();
                    LinkedHashMap linkedHashMap0 = F.a0(map0);
                    for(Object object5: linkedHashMap0.keySet()) {
                        ((e)object5).getClass();
                        linkedHashMap0.put(((e)object5), Boolean.FALSE);
                    }
                    linkedHashMap0.put(((e)object2), Boolean.TRUE);
                    return A.a(((A)object0), null, linkedHashMap0, null, null, false, null, 61);
                }
                return (A)object0;
            }
            case 5: {
                j.f(((u0)object0), "controller");
                q q0 = (q)R1.d.a(LayoutInflater.from(((BuyAirtimeDialogActivity)object2)), 0x7F0D002B, null);  // layout:bill_pay_2_confirmation
                q0.r(((BuyAirtimeDialogActivity)object2));
                q0.u(((o9.c)object3).b);
                q0.x(((o9.c)object3).a(((BuyAirtimeDialogActivity)object2)));
                q0.y(((o9.c)object3).d);
                q0.v(((o9.c)object3).e);
                q0.w(((u0)object0));
                r1.b(((BuyAirtimeDialogActivity)object2)).e().d("view airtime confirmation bottom sheet", null);
                j.e(q0.d, "getRoot(...)");
                ((u0)object0).a.setContentView(q0.d);
                return object1;
            }
            case 6: {
                j.f(((i)object0), "$this$LazyColumn");
                List list0 = (List)((l)object2).invoke();
                ((i)object0).f(list0.size(), new Q(3, list0), new Q(list0, 4, false), new b(0xDA480CDF, new S9.e(list0, ((m)object3), 0), true));
                return object1;
            }
            case 7: {
                if(((cb.l)object0) != null) {
                    j.f(((E9.a)object2), "<this>");
                    j.f(((String)object3), "id");
                    ((E9.a)object2).d("bottom sheet announcement dimissed", F.K(new k[]{new k("id", ((String)object3)), new k("dismissal_source", ((cb.l)object0).X)}));
                }
                return object1;
            }
            case 8: {
                ((Function1)object2).n(((Boolean)object0));
                ((HapticFeedback)object3).a(0);
                return object1;
            }
            case 9: {
                j.f(((String)object0), "v");
                BigDecimal bigDecimal0 = Vb.p.H(o0.n(((String)object0)));
                ((Function1)object2).n((bigDecimal0 == null ? null : new CurrencyAmount(((Currency)object3), bigDecimal0)));
                return object1;
            }
            case 10: {
                j.f(((u0)object0), "controller");
                q q1 = (q)R1.d.a(LayoutInflater.from(((g0)object2)), 0x7F0D002B, null);  // layout:bill_pay_2_confirmation
                q1.r(((g0)object2));
                q1.u(((o9.c)object3).b);
                q1.x(((o9.c)object3).a(((g0)object2)));
                q1.y(((o9.c)object3).d);
                q1.v(((o9.c)object3).e);
                q1.w(((u0)object0));
                j.e(q1.d, "getRoot(...)");
                ((u0)object0).a.setContentView(q1.d);
                r1.b(((g0)object2)).e().d("view payment confirmation bottom sheet", null);
                return object1;
            }
            case 11: {
                View view0 = LayoutInflater.from(((o)object2)).inflate(0x7F0D009D, null);  // layout:multichoice_bottomsheet
                ((TextView)view0.findViewById(0x7F0A0302)).setText(((i1)object3).a);  // id:title
                view0.findViewById(0x7F0A00D6).setOnClickListener(new Z1(3, ((u0)object0)));  // id:close
                RecyclerView recyclerView0 = (RecyclerView)view0.findViewById(0x7F0A00CC);  // id:choices
                recyclerView0.setLayoutManager(new LinearLayoutManager(1));
                k1 k10 = new k1(new r(((u0)object0), 12, ((i1)object3)));
                k10.q(((i1)object3).b);
                recyclerView0.setAdapter(k10);
                ((u0)object0).getClass();
                ((u0)object0).a.setContentView(view0);
                return object1;
            }
            case 12: {
                ((Integer)object0).getClass();
                ((u0)object2).a();
                ((i1)object3).c.n(((Integer)object0));
                return object1;
            }
            case 13: {
                j.f(((i)object0), "$this$LazyColumn");
                ((i)object0).f(((List)object2).size(), new G(new J(8), 18, ((List)object2)), new Q(((List)object2), 8, false), new b(0xBEF78951, new S(((List)object2), ((List)object2), ((Function1)object3), 3), true));
                return object1;
            }
            case 14: {
                j.f(((Density)object0), "$this$offset");
                return ((oa.i)object2).a.length() == 0 ? new g(a.i(0, ((Number)((N0)object3).getValue()).intValue())) : new g(0L);
            }
            case 15: {
                j.f(((i.g)object0), "$this$showAndAwait");
                Button button0 = ((i.g)object0).j(-1);
                Editable editable0 = ((TextInputEditText)object3).getText();
                if(editable0 == null) {
                    editable0 = "";
                }
                button0.setEnabled(((Boolean)p9.b.g0.n(editable0)).booleanValue());
                ((w)object2).X = (i.g)object0;
                Window window0 = ((i.g)object0).getWindow();
                if(window0 != null) {
                    window0.setSoftInputMode(5);
                }
                ((TextInputEditText)object3).requestFocus();
                return object1;
            }
            case 16: {
                j.f(((i)object0), "$this$LazyColumn");
                Q q2 = new Q(9, ((s)(((z)object2))).a);
                Q q3 = new Q(((s)(((z)object2))).a, 10, false);
                b b0 = new b(0xDA480CDF, new S9.e(((s)(((z)object2))).a, ((Function1)object3), 1), true);
                ((i)object0).f(((s)(((z)object2))).a.size(), q2, q3, b0);
                return object1;
            }
            case 17: {
                ((Boolean)object0).getClass();
                ((View)object2).postDelayed(new M1(((View)object2), 18, ((View)object3)), 50L);
                return object1;
            }
            case 18: {
                j.f(((W0)object0), "it");
                if(((W0)object0) != w00 || !((Boolean)((Function1)object2).n(new HistoryEntryId(((I)object3).a))).booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
            case 19: {
                j.f(((Va.d)object0), "it");
                if(((Va.d)object0) instanceof Va.a) {
                    ((Function0)object3).invoke();
                    return object1;
                }
                if(((Va.d)object0) instanceof Va.b) {
                    ((Function0)object2).invoke();
                    return object1;
                }
                if(!(((Va.d)object0) instanceof Va.c)) {
                    throw new Ab.e();  // initializer: Ljava/lang/RuntimeException;-><init>()V
                }
                return object1;
            }
            case 20: {
                j.f(((U.F)object0), "$this$DisposableEffect");
                return new G0(((v9.a)object2), 10, ((e0)object3));
            }
            default: {
                Integer integer0 = (Integer)object0;
                ((W)object2).a("tel:" + ((String)object3));
                return object1;
            }
        }
    }
}


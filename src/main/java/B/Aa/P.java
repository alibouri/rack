package Aa;

import Ab.t;
import B.l0;
import Ca.s;
import D.b;
import D.v;
import Ea.S;
import Nb.j;
import Qa.A;
import Qa.h;
import a1.g;
import com.apollographql.apollo.api.CompiledArgument;
import com.wave.customer.scratchCardRewards.ScratchCard.Unlocked;
import com.wave.customer.scratchCardRewards.components.RewardsPathState;
import hb.u;
import kotlin.jvm.functions.Function1;
import u.C;
import u.D;
import u.O;
import u.Q;
import u.k;
import u.r;
import u.x;
import v.U;
import v.c;

public final class p implements Function1 {
    public final int X;

    public p(int v) {
        this.X = v;
        super();
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object n(Object object0) {
        boolean z = true;
        Object object1 = t.a;
        switch(this.X) {
            case 0: {
                j.f(((c0)object0), "it");
                if(((c0)object0).c == null) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
            case 1: {
                j.f(((String)object0), "it");
                return object1;
            }
            case 2: {
                j.f(((k)object0), "$this$AnimatedContent");
                if(((s)((k)object0).b()).compareTo(((Enum)((k)object0).c())) < 0) {
                    p p0 = new p(3);
                    U u0 = c.i(400.0f, 1, new g(0x100000001L));
                    return new r(new C(new Q(null, new O(new l0(4, p0), u0), null, null, false, null, 61)).a(x.a(null, 3)), x.b(null, 3));
                }
                C c0 = x.a(null, 3);
                p p1 = new p(3);
                U u1 = c.i(400.0f, 1, new g(0x100000001L));
                return new r(c0, new D(new Q(null, new O(new l0(5, p1), u1), null, null, false, null, 61)).a(x.b(null, 3)));
            }
            case 3: {
                ((Integer)object0).intValue();
                return (Integer)object0;
            }
            case 4: {
                j.f(((String)object0), "it");
                return object1;
            }
            case 5: {
                j.f(((ScratchCard.Unlocked)object0), "it");
                return object1;
            }
            case 6: {
                j.f(((S)object0), "it");
                return object1;
            }
            case 7: {
                j.f(((RewardsPathState)object0), "it");
                return object1;
            }
            case 8: {
                j.f(((v)object0), "$this$item");
                return new b(2L);
            }
            case 9: {
                j.f(((v)object0), "$this$item");
                return new b(2L);
            }
            case 10: {
                j.f(((v)object0), "$this$item");
                return new b(2L);
            }
            case 11: {
                j.f(((ScratchCard.Unlocked)object0), "item");
                return m5.b.w("unlocked-", ((ScratchCard.Unlocked)object0).b());
            }
            case 12: {
                j.f(((Ea.Q)object0), "item");
                return "locked-" + ((Ea.Q)object0).X;
            }
            case 13: {
                j.f(((Ea.O)object0), "it");
                return "claimed-" + ((Ea.O)object0).X;
            }
            case 14: {
                j.f(((v)object0), "$this$item");
                return new b(2L);
            }
            case 15: {
                return (float)(((float)(((Float)object0))) / 2.0f);
            }
            case 16: {
                j.f(((Ha.s)object0), "it");
                return Boolean.valueOf(!j.a(((Ha.s)object0).a, ""));
            }
            case 17: {
                j.f(((M0.j)object0), "$this$semantics");
                M0.s.f(((M0.j)object0), "SettingsScreen");
                return object1;
            }
            case 18: {
                j.f(((Exception)object0), "it");
                return object1;
            }
            case 19: {
                j.f(((String)object0), "it");
                return "\'" + ((String)object0) + "\'";
            }
            case 20: {
                j.f(((String)object0), "it");
                System.out.println(((String)object0));
                return object1;
            }
            case 21: {
                j.f(((CompiledArgument)object0), "it");
                return Boolean.valueOf(((CompiledArgument)object0).getDefinition().isKey());
            }
            case 22: {
                j.f(((A)object0), "it");
                return Boolean.valueOf(((A)object0).c instanceof h);
            }
            case 23: {
                j.f(((Qa.c)object0), "it");
                return ((Qa.c)object0).a;
            }
            case 24: {
                j.f(((Qa.c)object0), "it");
                return "HistoryEntryType";
            }
            case 25: {
                return (float)(((float)(((Float)object0))) / 2.0f);
            }
            case 26: {
                j.f(((String)object0), "it");
                return ((String)object0).length() <= 0 ? 0L : 0xFAL;
            }
            case 27: {
                j.f(((u)object0), "$this$stopE2eTrace");
                ((u)object0).b("landing", "signup_login");
                return object1;
            }
            case 28: {
                j.f(((Function1)object0), "emit");
                ((Function1)object0).n("records");
                return object1;
            }
            default: {
                j.f(((Function1)object0), "emit");
                ((Function1)object0).n("records");
                return object1;
            }
        }
    }
}


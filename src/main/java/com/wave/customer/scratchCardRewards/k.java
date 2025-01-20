package com.wave.customer.scratchCardRewards;

import Ab.t;
import Bb.F;
import Ea.O0;
import Eb.a;
import Fb.j;
import V8.c;
import V8.d;
import W5.f;
import Y8.R9;
import java.util.Map;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;
import q9.r1;

public final class k extends j implements Function2 {
    public int c0;
    public final O0 d0;
    public final ScratchCard.Unlocked e0;

    public k(O0 o00, ScratchCard.Unlocked scratchCard$Unlocked0, g g0) {
        this.d0 = o00;
        this.e0 = scratchCard$Unlocked0;
        super(2, g0);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((k)this.t(((R9)object0), ((g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final g t(Object object0, g g0) {
        return new k(this.d0, this.e0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        ScratchCard.Unlocked scratchCard$Unlocked0 = this.e0;
        switch(this.c0) {
            case 0: {
                f.b0(object0);
                Map map0 = F.J(new Ab.k("scratchCardId", scratchCard$Unlocked0.b()));
                this.d0.Z.d("scratch cards rewards card clicked", map0);
                c c0 = this.d0.e0;
                if(scratchCard$Unlocked0 instanceof KnownAward) {
                    this.c0 = 1;
                    object0 = c0.e(this);
                    if(object0 != object1) {
                        goto label_20;
                    }
                    return object1;
                }
                this.c0 = 2;
                object0 = c0.e(this);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                f.b0(object0);
            label_20:
                RedeemScratchCardParams redeemScratchCardParams0 = new RedeemScratchCardParams(((KnownAward)scratchCard$Unlocked0));
                ((d)object0).V(RedeemScratchCardActivity.class, redeemScratchCardParams0);
                return t.a;
            }
            case 2: {
                f.b0(object0);
                break;
            }
            case 3: {
                f.b0(object0);
                return t.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        String s = r1.d(0x7F120157, new Object[0]);  // string:error "Error"
        String s1 = r1.d(0x7F1203B0, new Object[0]);  // string:scratch_card_error_unknown_reward "You must update your app to reveal this 
                                                      // award."
        String s2 = r1.d(0x7F1202DC, new Object[0]);  // string:ok "OK"
        this.c0 = 3;
        return Pb.a.O(((d)object0), s, s1, s2, null, false, null, null, this, 504) == object1 ? object1 : t.a;
    }
}


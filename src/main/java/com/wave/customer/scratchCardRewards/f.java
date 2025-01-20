package com.wave.customer.scratchCardRewards;

import Ab.t;
import Eb.a;
import Fb.j;
import Y8.G6;
import Y8.R9;
import Y8.f8;
import com.apollographql.apollo.api.Optional;
import kotlin.jvm.functions.Function2;

public final class f extends j implements Function2 {
    public int c0;
    public final g d0;

    public f(g g0, kotlin.coroutines.g g1) {
        this.d0 = g0;
        super(2, g1);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object j(Object object0, Object object1) {
        return ((f)this.t(((R9)object0), ((kotlin.coroutines.g)object1))).v(t.a);
    }

    @Override  // Fb.a
    public final kotlin.coroutines.g t(Object object0, kotlin.coroutines.g g0) {
        return new f(this.d0, g0);
    }

    @Override  // Fb.a
    public final Object v(Object object0) {
        Object object1 = a.X;
        switch(this.c0) {
            case 0: {
                W5.f.b0(object0);
                ScratchCardTermsAndConditions scratchCardTermsAndConditions0 = this.d0.Z.c0;
                f8 f80 = new f8(this.d0.Z.X, Optional.Companion.presentIfNotNull((scratchCardTermsAndConditions0 == null ? null : scratchCardTermsAndConditions0.X)));
                this.c0 = 1;
                return this.d0.Y.f(f80, G6.X, this) == object1 ? object1 : t.a;
            }
            case 1: {
                W5.f.b0(object0);
                return t.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}


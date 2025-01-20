package com.wave.customer.scratchCardRewards;

import Ab.k;
import Bb.F;
import E9.a;
import Nb.j;
import V8.c;
import V8.e;
import Y8.R6;
import ac.B0;
import ac.j0;
import ac.o0;
import androidx.lifecycle.ViewModel;

public final class g extends ViewModel {
    public final R6 Y;
    public final KnownAward Z;
    public final a b0;
    public final c c0;
    public final B0 d0;
    public final j0 e0;

    public g(R6 r60, KnownAward scratchCard$Unlocked$KnownAward0, a a0) {
        j.f(r60, "repo");
        j.f(scratchCard$Unlocked$KnownAward0, "card");
        j.f(a0, "analytics");
        super();
        this.Y = r60;
        this.Z = scratchCard$Unlocked$KnownAward0;
        this.b0 = a0;
        this.c0 = new c(new e());  // initializer: Ljava/lang/Object;-><init>()V
        a0.d("redeem scratch card opened", F.J(new k("scratchCardId", scratchCard$Unlocked$KnownAward0.X)));
        B0 b00 = o0.c(new com.wave.customer.scratchCardRewards.e(false, scratchCard$Unlocked$KnownAward0));
        this.d0 = b00;
        this.e0 = new j0(b00);
    }
}


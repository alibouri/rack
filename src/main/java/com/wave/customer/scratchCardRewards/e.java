package com.wave.customer.scratchCardRewards;

import Nb.j;

public final class e {
    public final boolean a;
    public final KnownAward b;

    public e(boolean z, KnownAward scratchCard$Unlocked$KnownAward0) {
        j.f(scratchCard$Unlocked$KnownAward0, "card");
        super();
        this.a = z;
        this.b = scratchCard$Unlocked$KnownAward0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof e)) {
            return false;
        }
        return this.a == ((e)object0).a ? j.a(this.b, ((e)object0).b) : false;
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public final int hashCode() {
        return this.a ? this.b.hashCode() + 0x9511 : this.b.hashCode() + 0x95CB;
    }

    @Override
    public final String toString() {
        return "RedeemScratchCardUIState(isRevealed=" + this.a + ", card=" + this.b + ")";
    }
}


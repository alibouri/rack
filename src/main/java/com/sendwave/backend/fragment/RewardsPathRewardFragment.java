package com.sendwave.backend.fragment;

import Nb.j;
import a9.q6;
import com.apollographql.apollo.api.Fragment.Data;

public final class RewardsPathRewardFragment implements Data {
    public final String a;
    public final q6 b;

    public RewardsPathRewardFragment(String s, q6 q60) {
        j.f(s, "__typename");
        super();
        this.a = s;
        this.b = q60;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof RewardsPathRewardFragment)) {
            return false;
        }
        return j.a(this.a, ((RewardsPathRewardFragment)object0).a) ? j.a(this.b, ((RewardsPathRewardFragment)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? v * 0x1F : v * 0x1F + this.b.hashCode();
    }

    @Override
    public final String toString() {
        return "RewardsPathRewardFragment(__typename=" + this.a + ", onScratchCardRewardPathReward=" + this.b + ")";
    }
}


package a9;

import Nb.j;
import com.sendwave.backend.type.ScratchCardBackground;

public final class q6 {
    public final ScratchCardBackground a;

    public q6(ScratchCardBackground scratchCardBackground0) {
        this.a = scratchCardBackground0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof q6 ? j.a(this.a, ((q6)object0).a) : false;
    }

    @Override
    public final int hashCode() {
        return this.a == null ? 0 : this.a.hashCode();
    }

    @Override
    public final String toString() {
        return "OnScratchCardRewardPathReward(background=" + this.a + ")";
    }
}


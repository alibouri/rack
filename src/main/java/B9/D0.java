package b9;

import Bb.q;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import com.sendwave.backend.type.ScratchCardBackground;
import com.sendwave.backend.type.z3;
import d9.r1;
import java.util.List;

public abstract class d0 {
    public static final List a;

    static {
        ScratchCardBackground.G.getClass();
        List list0 = q.K(new Builder("background", z3.b).build());
        d0.a = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("ScratchCardRewardPathReward", q.K("ScratchCardRewardPathReward")).selections(list0).build()});
    }
}


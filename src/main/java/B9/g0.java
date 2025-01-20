package b9;

import Bb.q;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import d9.A3;
import d9.p1;
import d9.r1;
import java.util.List;

public abstract class g0 {
    public static final List a;

    static {
        List list0 = q.L(new CompiledField[]{new Builder("title", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("body", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("lottieAnimationUrl", CompiledGraphQL.-notNull(r1.a)).build()});
        g0.a = q.L(new CompiledField[]{new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new Builder("scratchCardBottomSheetAnnouncement", A3.a).selections(list0).build()});
    }
}


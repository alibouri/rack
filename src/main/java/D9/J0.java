package d9;

import Bb.q;
import com.apollographql.apollo.api.ObjectType.Builder;
import com.apollographql.apollo.api.ObjectType;

public abstract class j0 {
    public static final ObjectType a;

    static {
        j0.a = new Builder("ClaimedScratchCard").interfaces(q.K(l2.a)).build();
    }
}


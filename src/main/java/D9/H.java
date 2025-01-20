package d9;

import Bb.q;
import com.apollographql.apollo.api.CompiledArgumentDefinition.Builder;
import com.apollographql.apollo.api.ObjectType;

public abstract class h {
    public static final ObjectType a;

    static {
        new Builder("isActive").build();
        new Builder("isPrincipal").build();
        new Builder("before").build();
        new Builder("last").build();
        new Builder("id").build();
        new Builder("before").build();
        new Builder("includePending").build();
        new Builder("last").build();
        new Builder("aggregation").build();
        new Builder("before").build();
        new Builder("last").build();
        new Builder("agentContractType").build();
        new Builder("documentType").build();
        new Builder("version").build();
        new Builder("coords").build();
        new Builder("approved").build();
        new Builder("topic").build();
        h.a = new com.apollographql.apollo.api.ObjectType.Builder("Agent").interfaces(q.K(l2.a)).build();
    }
}


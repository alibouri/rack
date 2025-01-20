package c9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledGraphQL;
import d9.T4;
import d9.i2;
import d9.n1;
import java.util.List;

public abstract class e1 {
    public static final List a;

    static {
        List list0 = q.K(new Builder("success", CompiledGraphQL.-notNull(n1.a)).build());
        Builder compiledField$Builder0 = new Builder("verifySecurityQuestionForm", T4.a);
        e1.a = o.C(new CompiledArgument[]{o.r("agentPin", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.z)), o.r("answers", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.A)), o.r("securityQuestionFormId", new com.apollographql.apollo.api.CompiledArgument.Builder(i2.B))}, compiledField$Builder0, list0);
    }
}


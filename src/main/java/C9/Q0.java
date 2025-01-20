package c9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import d9.h1;
import d9.n1;
import java.util.List;

public abstract class q0 {
    public static final List a;

    static {
        List list0 = q.L(new CompiledField[]{new Builder("appPerformanceMonitoringEnabled", CompiledGraphQL.-notNull(n1.a)).build(), new Builder("appFileLoggingEnabled", CompiledGraphQL.-notNull(n1.a)).build(), new Builder("appReportApolloInternalErrors", CompiledGraphQL.-notNull(n1.a)).build()});
        q0.a = o.A(new Builder("appProps", CompiledGraphQL.-notNull(h1.b)), list0);
    }
}


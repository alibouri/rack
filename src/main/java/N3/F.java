package N3;

import U3.b;
import com.apollographql.apollo.api.ExecutionContext.Element;
import com.apollographql.apollo.api.ExecutionContext.Key;
import com.apollographql.apollo.api.ExecutionContext;
import com.apollographql.apollo.api.d;
import kotlin.jvm.functions.Function2;

public final class f implements Element {
    public final boolean a;
    public static final e b;

    static {
        f.b = new e();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public f(long v, long v1, long v2, long v3, boolean z, b b0) {
        this.a = z;
    }

    @Override  // com.apollographql.apollo.api.ExecutionContext$Element
    public final Object fold(Object object0, Function2 function20) {
        return com.apollographql.apollo.api.e.a(this, object0, function20);
    }

    @Override  // com.apollographql.apollo.api.ExecutionContext$Element
    public final Element get(Key executionContext$Key0) {
        return com.apollographql.apollo.api.e.b(this, executionContext$Key0);
    }

    @Override  // com.apollographql.apollo.api.ExecutionContext$Element
    public final Key getKey() {
        return f.b;
    }

    @Override  // com.apollographql.apollo.api.ExecutionContext$Element
    public final ExecutionContext minusKey(Key executionContext$Key0) {
        return com.apollographql.apollo.api.e.c(this, executionContext$Key0);
    }

    @Override  // com.apollographql.apollo.api.ExecutionContext
    public final ExecutionContext plus(ExecutionContext executionContext0) {
        return d.a(this, executionContext0);
    }
}


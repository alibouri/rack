package N3;

import O3.a;
import com.apollographql.apollo.api.ExecutionContext.Element;
import com.apollographql.apollo.api.ExecutionContext.Key;
import com.apollographql.apollo.api.ExecutionContext;
import com.apollographql.apollo.api.e;
import kotlin.jvm.functions.Function2;

public final class d implements Element {
    public final a a;
    public static final c b;

    static {
        d.b = new c();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public d(a a0) {
        this.a = a0;
    }

    @Override  // com.apollographql.apollo.api.ExecutionContext$Element
    public final Object fold(Object object0, Function2 function20) {
        return e.a(this, object0, function20);
    }

    @Override  // com.apollographql.apollo.api.ExecutionContext$Element
    public final Element get(Key executionContext$Key0) {
        return e.b(this, executionContext$Key0);
    }

    @Override  // com.apollographql.apollo.api.ExecutionContext$Element
    public final Key getKey() {
        return d.b;
    }

    @Override  // com.apollographql.apollo.api.ExecutionContext$Element
    public final ExecutionContext minusKey(Key executionContext$Key0) {
        return e.c(this, executionContext$Key0);
    }

    @Override  // com.apollographql.apollo.api.ExecutionContext
    public final ExecutionContext plus(ExecutionContext executionContext0) {
        return com.apollographql.apollo.api.d.a(this, executionContext0);
    }
}


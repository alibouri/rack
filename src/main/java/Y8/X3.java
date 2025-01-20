package Y8;

import Nb.j;
import Nb.x;
import Z8.K1;
import c9.Q;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import d9.R2;

public final class x3 implements Query {
    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.-obj$default(K1.a, false, 1, null);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query LockScreenQuery { session { id user { __typename id ...LockScreenPropsFragment } } }  fragment LockScreenPropsFragment on User { id appProps { maxLockscreenUnlockAttempts shouldLogLockscreenEvents shouldLogFingerprintEvents enableBiometricFraudPrevention canResetOwnPinOnLockscreen } }";
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 != null && object0.getClass() == x3.class;
    }

    @Override
    public final int hashCode() {
        return x.a(x3.class).hashCode();
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        return "5c088304f626fc23dab6211ae5f1aa9f9f1e1549be480b6671e322499cbe017f";
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "LockScreenQuery";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return new Builder("data", R2.t).selections(Q.a).build();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
    }
}


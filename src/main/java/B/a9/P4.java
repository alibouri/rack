package a9;

import Bb.q;
import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;

public final class p4 implements Adapter {
    public static final p4 a;
    public static final List b;

    static {
        p4.a = new p4();  // initializer: Ljava/lang/Object;-><init>()V
        p4.b = q.L(new String[]{"maxLockscreenUnlockAttempts", "shouldLogLockscreenEvents", "shouldLogFingerprintEvents", "enableBiometricFraudPrevention", "canResetOwnPinOnLockscreen"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        Integer integer0 = null;
        Boolean boolean0 = null;
        Boolean boolean1 = null;
        Boolean boolean2 = null;
        Boolean boolean3 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(p4.b)) {
                case 0: {
                    integer0 = (Integer)Adapters.IntAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    boolean0 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 2: {
                    boolean1 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 3: {
                    boolean2 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 4: {
                    boolean3 = (Boolean)Adapters.BooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(integer0 == null) {
            throw o.q(jsonReader0, "maxLockscreenUnlockAttempts");
        }
        int v = (int)integer0;
        if(boolean0 == null) {
            throw o.q(jsonReader0, "shouldLogLockscreenEvents");
        }
        boolean z = boolean0.booleanValue();
        if(boolean1 == null) {
            throw o.q(jsonReader0, "shouldLogFingerprintEvents");
        }
        boolean z1 = boolean1.booleanValue();
        if(boolean2 == null) {
            throw o.q(jsonReader0, "enableBiometricFraudPrevention");
        }
        boolean z2 = boolean2.booleanValue();
        if(boolean3 == null) {
            throw o.q(jsonReader0, "canResetOwnPinOnLockscreen");
        }
        return new o4(v, z, z1, z2, boolean3.booleanValue());
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((o4)object0), "value");
        jsonWriter0.name("maxLockscreenUnlockAttempts");
        o.D(((o4)object0).a, Adapters.IntAdapter, jsonWriter0, customScalarAdapters0, "shouldLogLockscreenEvents");
        o.E(((o4)object0).b, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "shouldLogFingerprintEvents");
        o.E(((o4)object0).c, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "enableBiometricFraudPrevention");
        o.E(((o4)object0).d, Adapters.BooleanAdapter, jsonWriter0, customScalarAdapters0, "canResetOwnPinOnLockscreen");
        Adapters.BooleanAdapter.toJson(jsonWriter0, customScalarAdapters0, Boolean.valueOf(((o4)object0).e));
    }
}


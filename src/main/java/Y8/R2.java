package Y8;

import Nb.j;
import O3.b;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Fragment;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.ParcelableVariables;

public final class r2 implements Query {
    public final b a;
    public final ParcelableVariables b;
    public final Class c;
    public final StackTraceElement[] d;
    public final Fragment e;

    public r2(b b0, ParcelableVariables parcelableVariables0, Class class0) {
        j.f(parcelableVariables0, "variables");
        super();
        this.a = b0;
        this.b = parcelableVariables0;
        this.c = class0;
        this.d = Thread.currentThread().getStackTrace();
        this.e = S6.b(class0);
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return new q2(this.e.adapter(), this);
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String document() {
        throw new p2();
    }

    @Override  // com.apollographql.apollo.api.Operation
    public String id() {
        Ab.j j0 = new Ab.j("cache only (mapper=" + this.c.getName() + ", id=" + this.a.a + ")");
        j0.setStackTrace(this.d);
        throw j0;
    }

    @Override  // com.apollographql.apollo.api.Operation
    public final String name() {
        return "WaveNodeQuery";
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final CompiledField rootField() {
        return this.e.rootField();
    }

    @Override  // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, boolean z) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        this.e.serializeVariables(jsonWriter0, customScalarAdapters0, z);
    }
}


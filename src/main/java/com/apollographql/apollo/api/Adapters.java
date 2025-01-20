package com.apollographql.apollo.api;

import Ab.a;
import Nb.j;
import com.apollographql.apollo.api.json.BufferedSinkJsonWriter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.ArrayList;

public final class Adapters {
    public static final Adapter AnyAdapter;
    public static final ApolloOptionalAdapter ApolloOptionalAnyAdapter;
    public static final ApolloOptionalAdapter ApolloOptionalBooleanAdapter;
    public static final ApolloOptionalAdapter ApolloOptionalDoubleAdapter;
    public static final ApolloOptionalAdapter ApolloOptionalIntAdapter;
    public static final ApolloOptionalAdapter ApolloOptionalStringAdapter;
    public static final Adapter BooleanAdapter;
    public static final Adapter DoubleAdapter;
    public static final Adapter FloatAdapter;
    public static final Adapter IntAdapter;
    public static final Adapter LongAdapter;
    public static final NullableAdapter NullableAnyAdapter;
    public static final NullableAdapter NullableBooleanAdapter;
    public static final NullableAdapter NullableDoubleAdapter;
    public static final NullableAdapter NullableIntAdapter;
    public static final NullableAdapter NullableStringAdapter;
    public static final Adapter StringAdapter;
    public static final Adapter UploadAdapter;

    public static final Adapter -array(Adapter adapter0) {
        j.f(adapter0, "<this>");
        j.o();
        throw null;

        public final class com.apollographql.apollo.api.Adapters.array.1 implements Adapter {
            public com.apollographql.apollo.api.Adapters.array.1(Adapter adapter0) {
            }

            private final Object[] arrayFromJson(Adapter adapter0, JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
                jsonReader0.beginArray();
                ArrayList arrayList0 = new ArrayList();
                while(jsonReader0.hasNext()) {
                    arrayList0.add(adapter0.fromJson(jsonReader0, customScalarAdapters0));
                }
                jsonReader0.endArray();
                j.o();
                throw null;
            }

            public Object[] fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
                j.f(jsonReader0, "reader");
                j.f(customScalarAdapters0, "customScalarAdapters");
                Adapter adapter0 = this.$this_array;
                jsonReader0.beginArray();
                ArrayList arrayList0 = new ArrayList();
                while(jsonReader0.hasNext()) {
                    arrayList0.add(adapter0.fromJson(jsonReader0, customScalarAdapters0));
                }
                jsonReader0.endArray();
                j.o();
                throw null;
            }

            public void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object[] arr_object) {
                j.f(jsonWriter0, "writer");
                j.f(customScalarAdapters0, "customScalarAdapters");
                j.f(arr_object, "value");
                Adapter adapter0 = this.$this_array;
                jsonWriter0.beginArray();
                for(int v = 0; v < arr_object.length; ++v) {
                    adapter0.toJson(jsonWriter0, customScalarAdapters0, arr_object[v]);
                }
                jsonWriter0.endArray();
            }
        }

    }

    public static final Adapter -catchToNull(Adapter adapter0) {
        j.f(adapter0, "<this>");
        return new CatchToNullAdapter(adapter0);
    }

    public static final Adapter -catchToResult(Adapter adapter0) {
        j.f(adapter0, "<this>");
        return new CatchToResultAdapter(adapter0);
    }

    public static final Adapter -errorAware(Adapter adapter0) {
        j.f(adapter0, "<this>");
        return new ErrorAwareAdapter(adapter0);
    }

    public static final ListAdapter -list(Adapter adapter0) {
        j.f(adapter0, "<this>");
        return new ListAdapter(adapter0);
    }

    public static final NullableAdapter -nullable(Adapter adapter0) {
        j.f(adapter0, "<this>");
        return new NullableAdapter(adapter0);
    }

    public static final ObjectAdapter -obj(Adapter adapter0, boolean z) {
        j.f(adapter0, "<this>");
        return new ObjectAdapter(adapter0, z);
    }

    public static ObjectAdapter -obj$default(Adapter adapter0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        return Adapters.-obj(adapter0, z);
    }

    @a
    public static final PresentAdapter -optional(Adapter adapter0) {
        j.f(adapter0, "<this>");
        return new PresentAdapter(adapter0);
    }

    public static final PresentAdapter -present(Adapter adapter0) {
        j.f(adapter0, "<this>");
        return new PresentAdapter(adapter0);
    }

    public static final String -toJson(Adapter adapter0, Object object0) {
        j.f(adapter0, "<this>");
        return Adapters.-toJson$default(adapter0, object0, null, null, 6, null);
    }

    public static final String -toJson(Adapter adapter0, Object object0, CustomScalarAdapters customScalarAdapters0) {
        j.f(adapter0, "<this>");
        j.f(customScalarAdapters0, "customScalarAdapters");
        return Adapters.-toJson$default(adapter0, object0, customScalarAdapters0, null, 4, null);
    }

    public static final String -toJson(Adapter adapter0, Object object0, CustomScalarAdapters customScalarAdapters0, String s) {
        j.f(adapter0, "<this>");
        j.f(customScalarAdapters0, "customScalarAdapters");
        Ec.j j0 = new Ec.j();  // initializer: Ljava/lang/Object;-><init>()V
        adapter0.toJson(new BufferedSinkJsonWriter(j0, s), customScalarAdapters0, object0);
        return j0.B();
    }

    public static String -toJson$default(Adapter adapter0, Object object0, CustomScalarAdapters customScalarAdapters0, String s, int v, Object object1) {
        if((v & 2) != 0) {
            customScalarAdapters0 = CustomScalarAdapters.Empty;
        }
        if((v & 4) != 0) {
            s = null;
        }
        return Adapters.-toJson(adapter0, object0, customScalarAdapters0, s);
    }

    static {
        Adapters.StringAdapter.1 adapters$StringAdapter$10 = new Adapters.StringAdapter.1();
        Adapters.StringAdapter = adapters$StringAdapter$10;
        Adapters.IntAdapter.1 adapters$IntAdapter$10 = new Adapters.IntAdapter.1();
        Adapters.IntAdapter = adapters$IntAdapter$10;
        Adapters.DoubleAdapter.1 adapters$DoubleAdapter$10 = new Adapters.DoubleAdapter.1();
        Adapters.DoubleAdapter = adapters$DoubleAdapter$10;
        Adapters.FloatAdapter = new Adapters.FloatAdapter.1();
        Adapters.LongAdapter = new Adapters.LongAdapter.1();
        Adapters.BooleanAdapter.1 adapters$BooleanAdapter$10 = new Adapters.BooleanAdapter.1();
        Adapters.BooleanAdapter = adapters$BooleanAdapter$10;
        Adapters.AnyAdapter.1 adapters$AnyAdapter$10 = new Adapters.AnyAdapter.1();
        Adapters.AnyAdapter = adapters$AnyAdapter$10;
        Adapters.UploadAdapter = new Adapters.UploadAdapter.1();
        Adapters.NullableStringAdapter = Adapters.-nullable(adapters$StringAdapter$10);
        Adapters.NullableDoubleAdapter = Adapters.-nullable(adapters$DoubleAdapter$10);
        Adapters.NullableIntAdapter = Adapters.-nullable(adapters$IntAdapter$10);
        Adapters.NullableBooleanAdapter = Adapters.-nullable(adapters$BooleanAdapter$10);
        Adapters.NullableAnyAdapter = Adapters.-nullable(adapters$AnyAdapter$10);
        Adapters.ApolloOptionalStringAdapter = new ApolloOptionalAdapter(adapters$StringAdapter$10);
        Adapters.ApolloOptionalDoubleAdapter = new ApolloOptionalAdapter(adapters$DoubleAdapter$10);
        Adapters.ApolloOptionalIntAdapter = new ApolloOptionalAdapter(adapters$IntAdapter$10);
        Adapters.ApolloOptionalBooleanAdapter = new ApolloOptionalAdapter(adapters$BooleanAdapter$10);
        Adapters.ApolloOptionalAnyAdapter = new ApolloOptionalAdapter(adapters$AnyAdapter$10);
    }

    public static void getAnyAdapter$annotations() {
    }
}


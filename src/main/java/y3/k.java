package Y3;

import Ab.t;
import Bb.p;
import Eb.a;
import Ec.l;
import Nb.w;
import W3.c;
import W5.f;
import ac.i;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Error;
import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.Operations;
import com.apollographql.apollo.api.Subscription;
import com.apollographql.apollo.api.internal.ResponseParserKt;
import com.apollographql.apollo.api.json.-JsonReaders;
import com.apollographql.apollo.api.json.BufferedSourceJsonReader;
import com.apollographql.apollo.api.json.JsonReader.Token;
import com.apollographql.apollo.api.json.JsonReader;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.g;
import m5.b;

public final class k implements i {
    public final i X;
    public final Operation Y;
    public final CustomScalarAdapters Z;
    public final n b0;
    public final w c0;

    public k(i i0, Operation operation0, CustomScalarAdapters customScalarAdapters0, n n0, w w0) {
        this.X = i0;
        this.Y = operation0;
        this.Z = customScalarAdapters0;
        this.b0 = n0;
        this.c0 = w0;
    }

    @Override  // ac.i
    public final Object c(Object object0, g g0) {
        j j0;
        if(g0 instanceof j) {
            j0 = (j)g0;
            int v = j0.c0;
            if((v & 0x80000000) == 0) {
                j0 = new j(this, g0);
            }
            else {
                j0.c0 = v ^ 0x80000000;
            }
        }
        else {
            j0 = new j(this, g0);
        }
        Object object1 = j0.b0;
        Object object2 = a.X;
        switch(j0.c0) {
            case 0: {
                f.b0(object1);
                Operation operation0 = this.Y;
                CustomScalarAdapters customScalarAdapters0 = this.Z;
                ApolloResponse apolloResponse0 = null;
                if(operation0 instanceof Subscription) {
                    JsonReader jsonReader0 = -JsonReaders.jsonReader(((l)object0));
                    jsonReader0.beginObject();
                    List list0 = null;
                    ApolloResponse apolloResponse1 = null;
                    while(jsonReader0.hasNext()) {
                        String s = jsonReader0.nextName();
                        if(Nb.j.a(s, "payload")) {
                            if(jsonReader0.peek() == Token.NULL) {
                                jsonReader0.skipValue();
                            }
                            else {
                                apolloResponse1 = Operations.parseResponse$default(jsonReader0, this.Y, null, customScalarAdapters0, null, 2, null);
                            }
                        }
                        else if(!Nb.j.a(s, "errors")) {
                            jsonReader0.skipValue();
                        }
                        else if(jsonReader0.peek() == Token.NULL) {
                            jsonReader0.skipValue();
                        }
                        else {
                            list0 = ResponseParserKt.readErrors(jsonReader0);
                        }
                    }
                    jsonReader0.endObject();
                    if(list0 != null) {
                        StringBuilder stringBuilder0 = new StringBuilder("Router error(s) (first: \'");
                        Error error0 = (Error)p.q0(list0);
                        this.b0.getClass();
                        apolloResponse0 = n.c(operation0, new U3.g(b.y(stringBuilder0, (error0 == null ? null : error0.getMessage()), "\')"), null));  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
                    }
                    else if(apolloResponse1 != null) {
                        apolloResponse0 = apolloResponse1;
                    }
                }
                else {
                    w w0 = this.c0;
                    if(w0.X == null) {
                        w0.X = new c();
                    }
                    Object object3 = w0.X;
                    Nb.j.c(object3);
                    Nb.j.f(((l)object0), "payload");
                    Object object4 = -JsonReaders.readAny(new BufferedSourceJsonReader(((l)object0)));
                    Nb.j.d(object4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                    LinkedHashMap linkedHashMap0 = ((c)object3).b(((Map)object4));
                    Object object5 = w0.X;
                    Nb.j.c(object5);
                    LinkedHashSet linkedHashSet0 = ((c)object5).d;
                    Object object6 = w0.X;
                    Nb.j.c(object6);
                    int v1 = !((c)object6).e;
                    Object object7 = w0.X;
                    Nb.j.c(object7);
                    if(!((c)object7).f) {
                        apolloResponse0 = Operations.toApolloResponse$default(-JsonReaders.jsonReader(linkedHashMap0), this.Y, null, customScalarAdapters0, linkedHashSet0, 2, null).newBuilder().isLast(((boolean)v1)).build();
                    }
                }
                if(apolloResponse0 != null) {
                    j0.c0 = 1;
                    if(this.X.c(apolloResponse0, j0) == object2) {
                        return object2;
                    }
                }
                return t.a;
            }
            case 1: {
                f.b0(object1);
                return t.a;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
    }
}


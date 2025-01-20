package a9;

import Bb.q;
import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.type.UserKycIdPhotoStatusIcon;
import e9.i;
import java.util.List;

public abstract class n3 implements Adapter {
    public static final List a;

    static {
        n3.a = q.L(new String[]{"text", "icon"});
    }

    public static k3 a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        UserKycIdPhotoStatusIcon userKycIdPhotoStatusIcon0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(n3.a)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    userKycIdPhotoStatusIcon0 = i.a(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(s == null) {
            throw o.q(jsonReader0, "text");
        }
        if(userKycIdPhotoStatusIcon0 == null) {
            throw o.q(jsonReader0, "icon");
        }
        return new k3(s, userKycIdPhotoStatusIcon0);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, k3 k30) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(k30, "value");
        jsonWriter0.name("text");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, k30.a);
        jsonWriter0.name("icon");
        jsonWriter0.value(k30.b.a());
    }
}


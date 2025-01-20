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
import com.sendwave.backend.type.UserKycIdPhotoStatusRectangle.ERROR;
import com.sendwave.backend.type.UserKycIdPhotoStatusRectangle.INFO;
import com.sendwave.backend.type.UserKycIdPhotoStatusRectangle.UNKNOWN__;
import com.sendwave.backend.type.UserKycIdPhotoStatusRectangle.WARNING;
import com.sendwave.backend.type.UserKycIdPhotoStatusRectangle;
import e9.i;
import java.util.List;

public abstract class m3 implements Adapter {
    public static final List a;

    static {
        m3.a = q.L(new String[]{"title", "text", "icon", "rectangle"});
    }

    public static j3 a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        String s1 = null;
        UserKycIdPhotoStatusIcon userKycIdPhotoStatusIcon0 = null;
        UNKNOWN__ userKycIdPhotoStatusRectangle$UNKNOWN__0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(m3.a)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    continue;
                }
                case 1: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    continue;
                }
                case 2: {
                    userKycIdPhotoStatusIcon0 = i.a(jsonReader0, customScalarAdapters0);
                    continue;
                }
                case 3: {
                    break;
                }
                default: {
                    break alab1;
                }
            }
            String s2 = o.x(jsonReader0, "reader", customScalarAdapters0, "customScalarAdapters");
            UserKycIdPhotoStatusRectangle.S.getClass();
            switch(s2) {
                case "ERROR": {
                    userKycIdPhotoStatusRectangle$UNKNOWN__0 = ERROR.X;
                    break;
                }
                case "INFO": {
                    userKycIdPhotoStatusRectangle$UNKNOWN__0 = INFO.X;
                    break;
                }
                case "WARNING": {
                    userKycIdPhotoStatusRectangle$UNKNOWN__0 = WARNING.X;
                    break;
                }
                default: {
                    userKycIdPhotoStatusRectangle$UNKNOWN__0 = new UNKNOWN__(s2);
                }
            }
        }
        if(s == null) {
            throw o.q(jsonReader0, "title");
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "text");
        }
        if(userKycIdPhotoStatusIcon0 == null) {
            throw o.q(jsonReader0, "icon");
        }
        if(userKycIdPhotoStatusRectangle$UNKNOWN__0 == null) {
            throw o.q(jsonReader0, "rectangle");
        }
        return new j3(s, s1, userKycIdPhotoStatusIcon0, userKycIdPhotoStatusRectangle$UNKNOWN__0);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, j3 j30) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(j30, "value");
        jsonWriter0.name("title");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, j30.a);
        jsonWriter0.name("text");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, j30.b);
        jsonWriter0.name("icon");
        jsonWriter0.value(j30.c.a());
        jsonWriter0.name("rectangle");
        jsonWriter0.value(j30.d.a());
    }
}


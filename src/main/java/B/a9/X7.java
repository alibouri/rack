package a9;

import Bb.q;
import Nb.j;
import Y8.o;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.type.SecurityQuestionFieldFormat.DROPDOWN;
import com.sendwave.backend.type.SecurityQuestionFieldFormat.HIDDEN;
import com.sendwave.backend.type.SecurityQuestionFieldFormat.UNKNOWN__;
import com.sendwave.backend.type.SecurityQuestionFieldFormat;
import com.sendwave.backend.type.SecurityQuestionFieldQuery;
import e9.a;
import java.util.List;

public final class x7 implements Adapter {
    public static final x7 a;
    public static final List b;

    static {
        x7.a = new x7();  // initializer: Ljava/lang/Object;-><init>()V
        x7.b = q.L(new String[]{"id", "fieldFormat", "fieldLabel", "fieldQuery", "answerOptions"});
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        DROPDOWN securityQuestionFieldFormat$DROPDOWN0 = null;
        String s1 = null;
        SecurityQuestionFieldQuery securityQuestionFieldQuery0 = null;
        List list0 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(x7.b)) {
                case 0: {
                    s = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    String s2 = jsonReader0.nextString();
                    j.c(s2);
                    SecurityQuestionFieldFormat.I.getClass();
                    if(s2.equals("DROPDOWN")) {
                        securityQuestionFieldFormat$DROPDOWN0 = DROPDOWN.X;
                    }
                    else if(s2.equals("HIDDEN")) {
                        securityQuestionFieldFormat$DROPDOWN0 = HIDDEN.X;
                    }
                    else {
                        securityQuestionFieldFormat$DROPDOWN0 = new UNKNOWN__(s2);
                    }
                    break;
                }
                case 2: {
                    s1 = (String)Adapters.StringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 3: {
                    securityQuestionFieldQuery0 = a.g(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 4: {
                    list0 = Adapters.-list(Adapters.StringAdapter).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(s == null) {
            throw o.q(jsonReader0, "id");
        }
        if(securityQuestionFieldFormat$DROPDOWN0 == null) {
            throw o.q(jsonReader0, "fieldFormat");
        }
        if(s1 == null) {
            throw o.q(jsonReader0, "fieldLabel");
        }
        if(securityQuestionFieldQuery0 == null) {
            throw o.q(jsonReader0, "fieldQuery");
        }
        if(list0 == null) {
            throw o.q(jsonReader0, "answerOptions");
        }
        return new w7(s, securityQuestionFieldFormat$DROPDOWN0, s1, securityQuestionFieldQuery0, list0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(((w7)object0), "value");
        jsonWriter0.name("id");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((w7)object0).a);
        jsonWriter0.name("fieldFormat");
        jsonWriter0.value(((w7)object0).b.a());
        jsonWriter0.name("fieldLabel");
        Adapters.StringAdapter.toJson(jsonWriter0, customScalarAdapters0, ((w7)object0).c);
        jsonWriter0.name("fieldQuery");
        jsonWriter0.value(((w7)object0).d.a());
        jsonWriter0.name("answerOptions");
        Adapters.-list(Adapters.StringAdapter).toJson(jsonWriter0, customScalarAdapters0, ((w7)object0).e);
    }
}


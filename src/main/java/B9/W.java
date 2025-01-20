package b9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import com.sendwave.backend.type.IdPhotoStatus;
import com.sendwave.backend.type.IdPhotoType;
import com.sendwave.backend.type.R0;
import com.sendwave.backend.type.z0;
import d9.D0;
import d9.a1;
import d9.f0;
import d9.g2;
import d9.n1;
import d9.p1;
import d9.q1;
import d9.r1;
import java.util.List;

public abstract class w {
    public static final List a;

    static {
        List list0 = q.K(new Builder("inputType", CompiledGraphQL.-notNull(r1.a)).build());
        List list1 = q.L(new CompiledField[]{new Builder("value", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("displayName", CompiledGraphQL.-notNull(r1.a)).build()});
        List list2 = o.A(new Builder("choices", o.t(g2.a)), list1);
        List list3 = q.L(new CompiledField[]{new Builder("dateFormat", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("maxDate", D0.a).build(), o.s("minDate", D0.a)});
        List list4 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("fieldName", CompiledGraphQL.-notNull(r1.a)).build(), o.s("displayName", r1.a), o.s("defaultValue", r1.a), new Builder("isRequired", CompiledGraphQL.-notNull(n1.a)).build(), new Builder("isReviewable", CompiledGraphQL.-notNull(n1.a)).build(), new Builder("isEditable", CompiledGraphQL.-notNull(n1.a)).build(), new Builder("isVisible", CompiledGraphQL.-notNull(n1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("DocumentTextField", q.K("DocumentTextField")).selections(list0).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("DocumentMultiChoiceField", q.K("DocumentMultiChoiceField")).selections(list2).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("DocumentDateField", q.K("DocumentDateField")).selections(list3).build()});
        List list5 = q.L(new CompiledField[]{new Builder("contractUrl", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("documentFields", CompiledGraphQL.-list(CompiledGraphQL.-notNull(a1.a))).selections(list4).build(), new Builder("minRequiredSignPoints", q1.a).build()});
        List list6 = q.K(new Builder("warningForSkip", r1.a).build());
        List list7 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("ElectronicCapture", q.K("ElectronicCapture")).selections(list5).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("PhotoCapture", q.K("PhotoCapture")).selections(list6).build()});
        CompiledField compiledField0 = new Builder("id", CompiledGraphQL.-notNull(p1.a)).build();
        IdPhotoType.u.getClass();
        CompiledField compiledField1 = new Builder("type", CompiledGraphQL.-notNull(R0.b)).build();
        CompiledField compiledField2 = new Builder("name", CompiledGraphQL.-notNull(r1.a)).build();
        CompiledField compiledField3 = o.s("isRequired", n1.a);
        CompiledField compiledField4 = o.s("warningForSkip", r1.a);
        CompiledField compiledField5 = new Builder("requiredForDeposit", CompiledGraphQL.-notNull(n1.a)).build();
        CompiledField compiledField6 = new Builder("requiredForWithdrawal", CompiledGraphQL.-notNull(n1.a)).build();
        CompiledField compiledField7 = new Builder("requiredForSend", CompiledGraphQL.-notNull(n1.a)).build();
        CompiledField compiledField8 = new Builder("requiredForBillPay", CompiledGraphQL.-notNull(n1.a)).build();
        CompiledField compiledField9 = o.s("url", r1.a);
        CompiledField compiledField10 = new Builder("isOutstanding", CompiledGraphQL.-notNull(n1.a)).build();
        IdPhotoStatus.t.getClass();
        w.a = q.L(new CompiledField[]{compiledField0, compiledField1, compiledField2, compiledField3, compiledField4, compiledField5, compiledField6, compiledField7, compiledField8, compiledField9, compiledField10, new Builder("status", z0.b).build(), o.s("rejectionReason", r1.a), new Builder("walletId", r1.a).build(), new Builder("mimetype", r1.a).build(), o.s("version", q1.a), new Builder("captureMethod", f0.a).selections(list7).build()});
    }
}


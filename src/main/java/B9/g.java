package b9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import d9.d4;
import d9.f2;
import d9.g1;
import d9.g2;
import d9.h0;
import d9.n1;
import d9.q1;
import d9.r1;
import java.util.List;

public abstract class g {
    public static final List a;

    static {
        List list0 = q.L(new CompiledField[]{new Builder("groupSize", CompiledGraphQL.-notNull(q1.a)).build(), new Builder("separator", CompiledGraphQL.-notNull(r1.a)).build()});
        List list1 = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("TextFieldGroupedFormatter", q.K("TextFieldGroupedFormatter")).selections(list0).build()});
        List list2 = q.L(new CompiledField[]{o.s("minLength", q1.a), o.s("maxLength", q1.a), new Builder("formatter", d4.a).selections(list1).build(), new Builder("inputType", CompiledGraphQL.-notNull(r1.a)).build()});
        List list3 = q.L(new CompiledField[]{new Builder("feeFormula", g1.a).build(), new Builder("minimum", f2.a).build(), o.s("maximum", f2.a), new Builder("requiresRounding", n1.a).build()});
        List list4 = q.L(new CompiledField[]{new Builder("value", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("displayName", CompiledGraphQL.-notNull(r1.a)).build()});
        List list5 = o.A(new Builder("choices", o.t(g2.a)), list4);
        List list6 = q.L(new CompiledField[]{new Builder("value", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("displayName", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("price", CompiledGraphQL.-notNull(f2.a)).build()});
        List list7 = q.L(new CompiledField[]{new Builder("choiceValue1", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("choiceValue2", CompiledGraphQL.-notNull(r1.a)).build()});
        List list8 = q.L(new CompiledField[]{new Builder("choices", o.t(d9.g.a)).selections(list6).build(), new Builder("incompatibleChoices", CompiledGraphQL.-list(CompiledGraphQL.-notNull(h0.a))).selections(list7).build(), new Builder("shouldEnableToggle", CompiledGraphQL.-notNull(n1.a)).build(), new Builder("description", CompiledGraphQL.-notNull(r1.a)).build(), o.s("toggleText", r1.a), o.s("descriptionToggleOff", r1.a)});
        g.a = q.L(new CompiledSelection[]{new Builder("__typename", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("name", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("displayName", CompiledGraphQL.-notNull(r1.a)).build(), o.s("defaultValue", r1.a), new Builder("isProvidedByConfirmation", CompiledGraphQL.-notNull(n1.a)).build(), new Builder("isSavedInFavorites", CompiledGraphQL.-notNull(n1.a)).build(), new Builder("isAccountIdentifier", CompiledGraphQL.-notNull(n1.a)).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("TextField", q.K("TextField")).selections(list2).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("AmountField", q.K("AmountField")).selections(list3).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("MultiChoiceField", q.K("MultiChoiceField")).selections(list5).build(), new com.apollographql.apollo.api.CompiledFragment.Builder("AddOnsField", q.K("AddOnsField")).selections(list8).build()});
    }
}


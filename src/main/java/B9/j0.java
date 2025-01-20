package b9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.sendwave.backend.type.Q3;
import com.sendwave.backend.type.SecurityQuestionFieldFormat;
import com.sendwave.backend.type.SecurityQuestionFieldQuery;
import com.sendwave.backend.type.X3;
import d9.E0;
import d9.E3;
import d9.n1;
import d9.p1;
import d9.r1;
import java.util.List;

public abstract class j0 {
    public static final List a;

    static {
        CompiledField compiledField0 = new Builder("id", CompiledGraphQL.-notNull(r1.a)).build();
        SecurityQuestionFieldFormat.I.getClass();
        CompiledField compiledField1 = new Builder("fieldFormat", CompiledGraphQL.-notNull(Q3.b)).build();
        CompiledField compiledField2 = new Builder("fieldLabel", CompiledGraphQL.-notNull(r1.a)).build();
        SecurityQuestionFieldQuery.J.getClass();
        List list0 = q.L(new CompiledField[]{compiledField0, compiledField1, compiledField2, new Builder("fieldQuery", CompiledGraphQL.-notNull(X3.b)).build(), new Builder("answerOptions", CompiledGraphQL.-notNull(CompiledGraphQL.-list(CompiledGraphQL.-notNull(r1.a)))).build()});
        j0.a = q.L(new CompiledField[]{new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new Builder("questionLabel", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("whenExpires", E0.a).build(), new Builder("isCorrectlyAnswered", CompiledGraphQL.-notNull(n1.a)).build(), new Builder("fields", o.t(E3.a)).selections(list0).build()});
    }
}


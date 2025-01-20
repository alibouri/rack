package b9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.sendwave.backend.type.C1;
import com.sendwave.backend.type.KycFineGrainTier;
import d9.A2;
import d9.A4;
import d9.Z0;
import d9.f2;
import d9.p1;
import d9.r1;
import java.util.List;

public abstract class u0 {
    public static final List a;

    static {
        List list0 = q.K(new Builder("id", CompiledGraphQL.-notNull(p1.a)).build());
        List list1 = q.K(new Builder("title", CompiledGraphQL.-notNull(r1.a)).build());
        KycFineGrainTier.w.getClass();
        List list2 = q.K(new Builder("kycTier", CompiledGraphQL.-notNull(C1.b)).build());
        u0.a = q.L(new CompiledField[]{new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new Builder("name", CompiledGraphQL.-notNull(r1.a)).build(), new Builder("paymentCardActivationFee", CompiledGraphQL.-notNull(f2.a)).build(), new Builder("requestedDocuments", o.t(Z0.a)).selections(list0).build(), new Builder("paymentCardActivationMessage", CompiledGraphQL.-notNull(A2.a)).selections(list1).build(), new Builder("kycInfo", CompiledGraphQL.-notNull(A4.b)).selections(list2).build()});
    }
}


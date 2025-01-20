package b9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import d9.E0;
import d9.Y4;
import d9.p1;
import d9.r1;
import d9.z1;
import d9.z2;
import java.util.List;

public abstract class v0 {
    public static final List a;

    static {
        List list0 = q.K(new Builder("dateOfBirth", E0.a).build());
        List list1 = q.K(new Builder("id", CompiledGraphQL.-notNull(p1.a)).build());
        List list2 = q.L(new CompiledField[]{new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), o.s("whenTerminated", E0.a)});
        v0.a = q.L(new CompiledField[]{new Builder("id", CompiledGraphQL.-notNull(p1.a)).build(), new Builder("verifiedMobile", r1.a).build(), new Builder("needsIdPhotoConfirmation", z1.a).selections(list0).build(), new Builder("paymentCards", CompiledGraphQL.-list(CompiledGraphQL.-notNull(z2.a))).selections(list1).build(), new Builder("primaryWallet", Y4.h).selections(list2).build()});
    }
}


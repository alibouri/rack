package b9;

import Bb.q;
import Y8.o;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.sendwave.backend.type.A1;
import com.sendwave.backend.type.InvoiceOrder;
import d9.D0;
import d9.O;
import d9.f2;
import d9.n1;
import d9.p1;
import d9.r1;
import java.util.List;

public abstract class h {
    public static final List a;

    static {
        List list0 = q.L(new CompiledField[]{new Builder("amount", CompiledGraphQL.-notNull(f2.a)).build(), new Builder("dueDate", CompiledGraphQL.-notNull(D0.a)).build(), new Builder("invoiceReference", CompiledGraphQL.-notNull(r1.a)).build(), o.s("customerName", r1.a), o.s("period", D0.a)});
        CompiledField compiledField0 = new Builder("id", CompiledGraphQL.-notNull(p1.a)).build();
        CompiledField compiledField1 = new Builder("bills", o.t(O.a)).selections(list0).build();
        CompiledField compiledField2 = o.s("advanceAmount", f2.a);
        CompiledField compiledField3 = new Builder("multipleInvoicePaymentsSupported", CompiledGraphQL.-notNull(n1.a)).build();
        InvoiceOrder.v.getClass();
        h.a = q.L(new CompiledField[]{compiledField0, compiledField1, compiledField2, compiledField3, new Builder("invoicePaymentOrder", CompiledGraphQL.-notNull(A1.b)).build()});
    }
}


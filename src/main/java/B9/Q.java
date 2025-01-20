package b9;

import Y8.o;
import com.apollographql.apollo.api.CompiledField.Builder;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import com.sendwave.backend.type.ReceiptTemplateId;
import com.sendwave.backend.type.ReceiptTemplateSlot;
import com.sendwave.backend.type.X2;
import com.sendwave.backend.type.a3;
import d9.E0;
import d9.S2;
import d9.f2;
import d9.n0;
import d9.n1;
import d9.p1;
import d9.r1;
import d9.x1;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class q {
    public static final List<CompiledSelection> a;

    static {
        CompiledField labelField = new Builder("label", CompiledGraphQL.notNull(r1.a)).build();
        CompiledField valueField = new Builder("value", CompiledGraphQL.notNull(r1.a)).build();
        CompiledField formatTypeField = o.s("formatType", r1.a);
        CompiledField internalValueField = o.s("internalValue", r1.a);
        ReceiptTemplateSlot.F.getClass();

        List<CompiledField> baseReceiptFields = Stream.of(
                labelField,
                valueField,
                formatTypeField,
                internalValueField,
                new Builder("templateSlot", a3.b).build()
        ).collect(Collectors.toList());

        List<CompiledField> transferReceivedFields = Stream.of(
                new Builder("senderName", CompiledGraphQL.notNull(r1.a)).build(),
                new Builder("senderMobile", CompiledGraphQL.notNull(r1.a)).build(),
                new Builder("isRefunded", CompiledGraphQL.notNull(n1.a)).build()
        ).collect(Collectors.toList());

        List<CompiledField> transferSentFields = Stream.of(
                new Builder("transferId", CompiledGraphQL.notNull(p1.a)).build(),
                new Builder("recipientName", CompiledGraphQL.notNull(r1.a)).build(),
                new Builder("recipientMobile", CompiledGraphQL.notNull(r1.a)).build(),
                new Builder("isUserReversible", CompiledGraphQL.notNull(n1.a)).build(),
                new Builder("isRefunded", CompiledGraphQL.notNull(n1.a)).build()
        ).collect(Collectors.toList());

        List<CompiledField> historyEntryButtonInfoFields = Stream.of(
                new Builder("text", CompiledGraphQL.notNull(r1.a)).build(),
                new Builder("color", CompiledGraphQL.notNull(n0.a)).build(),
                new Builder("colorPressed", CompiledGraphQL.notNull(n0.a)).build()
        ).collect(Collectors.toList());

        List<CompiledField> billPaymentFields = Stream.of(
                new Builder("billId", CompiledGraphQL.notNull(r1.a)).build(),
                o.s("icon", r1.a),
                new Builder("billName", CompiledGraphQL.notNull(r1.a)).build(),
                new Builder("billAccount", CompiledGraphQL.notNull(r1.a)).build(),
                o.s("meterNumber", r1.a),
                new Builder("receiptTemplateId", X2.b).build(),
                new Builder("historyEntryButtonInfo", x1.a).selections(historyEntryButtonInfoFields).build()
        ).collect(Collectors.toList());

        a = Stream.of(
                new Builder("__typename", CompiledGraphQL.notNull(r1.a)).build(),
                new Builder("id", CompiledGraphQL.notNull(p1.a)).build(),
                new Builder("whenEntered", CompiledGraphQL.notNull(E0.a)).build(),
                new Builder("amount", CompiledGraphQL.notNull(f2.a)).build(),
                o.s("summary", r1.a),
                new Builder("isPending", CompiledGraphQL.notNull(n1.a)).build(),
                new Builder("isCancelled", CompiledGraphQL.notNull(n1.a)).build(),
                new Builder("canBeUsedForAppReview", CompiledGraphQL.notNull(n1.a)).build(),
                new Builder("shouldDisplayDate", CompiledGraphQL.notNull(n1.a)).build(),
                o.s("statusDescription", r1.a),
                o.s("userFacingTransactionId", r1.a),
                o.s("walletId", p1.a),
                new Builder("baseReceiptFields", CompiledGraphQL.list(CompiledGraphQL.notNull(S2.a))).selections(baseReceiptFields).build(),
                new com.apollographql.apollo.api.CompiledFragment.Builder("TransferReceivedEntry", Bb.q.K("TransferReceivedEntry")).selections(transferReceivedFields).build(),
                new com.apollographql.apollo.api.CompiledFragment.Builder("TransferSentEntry", Bb.q.K("TransferSentEntry")).selections(transferSentFields).build(),
                new com.apollographql.apollo.api.CompiledFragment.Builder("BillPaymentEntry", Bb.q.K("BillPaymentEntry")).selections(billPaymentFields).build()
        ).collect(Collectors.toList());
    }
}
package ra;

import Aa.t;
import E9.b;
import I5.h;
import Nb.e;
import Nb.j;
import R9.Z0;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import com.wave.customer.CustomerApp;
import com.wave.customer.paymentcards.PaymentCardsActivity;
import com.wave.customer.paymentcards.PaymentCardsParams;
import com.wave.customer.transactions.persistence.TransactionHistoryDatabase;
import ia.o;
import io.sentry.hints.i;
import q9.r1;

public final class f0 implements Factory {
    public final PaymentCardsActivity a;
    public final PaymentCardsParams b;

    public f0(PaymentCardsActivity paymentCardsActivity0, PaymentCardsParams paymentCardsParams0) {
        this.a = paymentCardsActivity0;
        this.b = paymentCardsParams0;
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel a(Class class0) {
        j.f(class0, "modelClass");
        PaymentCardsActivity paymentCardsActivity0 = this.a;
        paymentCardsActivity0.getClass();
        b b0 = new b(r1.b(paymentCardsActivity0).e(), "virtual card", "virtual card");
        t t0 = new t(paymentCardsActivity0, 17, b0);
        String s = r1.b(paymentCardsActivity0).d().h();
        if(s == null) {
            s = "";
        }
        if(s.length() == 0) {
            paymentCardsActivity0.finish();
        }
        CustomerApp customerApp0 = Z0.a(paymentCardsActivity0);
        o o0 = new o(paymentCardsActivity0, 2, this.b);
        Context context0 = paymentCardsActivity0.getApplicationContext();
        j.e(context0, "getApplicationContext(...)");
        h h0 = new h(context0, 19);
        Ma.b b1 = new Ma.b(paymentCardsActivity0);
        Context context1 = paymentCardsActivity0.getApplicationContext();
        j.e(context1, "getApplicationContext(...)");
        TransactionHistoryDatabase transactionHistoryDatabase0 = i.t(context1, s);
        return new L0(this.b, customerApp0.H0, o0, h0, b0, b1, t0, transactionHistoryDatabase0);
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel b(e e0, MutableCreationExtras mutableCreationExtras0) {
        return Y8.o.a(this, e0, mutableCreationExtras0);
    }

    @Override  // androidx.lifecycle.ViewModelProvider$Factory
    public final ViewModel c(Class class0, CreationExtras creationExtras0) {
        return Y8.o.b(this, class0, creationExtras0);
    }
}


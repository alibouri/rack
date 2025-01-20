package Aa;

import Ab.t;
import Ba.e;
import Ba.g;
import Ba.q;
import Da.m;
import Ha.T;
import I2.b;
import J2.j;
import J2.p;
import J2.u;
import J9.l;
import K9.i;
import K9.l0;
import M2.d;
import Ma.w;
import P3.h;
import Qa.Y;
import Qa.k;
import R9.E2;
import R9.K0;
import R9.N;
import R9.P0;
import R9.S;
import R9.U;
import R9.X0;
import R9.X1;
import R9.Z0;
import R9.c0;
import R9.k1;
import R9.p1;
import R9.p2;
import R9.r;
import R9.s;
import R9.u2;
import R9.x2;
import S2.a;
import X8.f;
import Y8.R6;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Parcelable;
import androidx.compose.ui.unit.Density;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.ViewModelProvider;
import androidx.work.impl.WorkDatabase_Impl;
import c2.x;
import com.sendwave.util.Country;
import com.wave.components.sendmoney.SendMoneyDialogActivity;
import com.wave.components.sendmoney.SendMoneyDialogParams;
import com.wave.components.sendmoney.SendMoneyEnterContactActivity;
import com.wave.components.sendmoney.SendMoneyEnterContactParams;
import com.wave.customer.BuyAirtimeDialogActivity;
import com.wave.customer.BuyAirtimeDialogParams;
import com.wave.customer.BuyAirtimeEnterContactActivity;
import com.wave.customer.BuyAirtimeEnterContactParams;
import com.wave.customer.CardFullScreenActivity;
import com.wave.customer.CardFullScreenFragment;
import com.wave.customer.CreatePinActivity;
import com.wave.customer.CustomerApp;
import com.wave.customer.CustomerFCMService;
import com.wave.customer.EnterNameActivity;
import com.wave.customer.PayMerchantActivity;
import com.wave.customer.PayMerchantParams;
import com.wave.customer.PaymentListActivity;
import com.wave.customer.PaymentListParams;
import com.wave.customer.QrScanOrCardActivity;
import com.wave.customer.QrScanOrCardParams;
import com.wave.customer.RecoverPinActivity;
import com.wave.customer.ResetPinActivity;
import com.wave.customer.savings.SavingsActivity;
import com.wave.customer.savings.deposit.DepositSavingsActivity;
import com.wave.customer.savings.withdraw.WithdrawSavingsActivity;
import com.wave.customer.terms.NewTermsAndConditionsActivity;
import com.wave.customer.terms.NewTermsAndConditionsParams;
import com.wave.customer.transactions.persistence.TransactionHistoryDatabase_Impl;
import com.wave.customer.transactions.ui.TransactionsActivity;
import hb.C;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.jvm.functions.Function0;
import q9.C3;
import q9.r1;
import v.H;

public final class n implements Function0 {
    public final int X;
    public final Object Y;

    public n(int v, Object object0) {
        this.X = v;
        this.Y = object0;
        super();
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Class class0 = i.class;
        boolean z = false;
        Object object0 = t.a;
        Object object1 = this.Y;
        switch(this.X) {
            case 0: {
                Object object3 = (u0)new ViewModelProvider(((SavingsActivity)object1), new y(((SavingsActivity)object1))).a(u0.class);
                o o0 = new o(((SavingsActivity)object1));  // initializer: Lq9/j3;-><init>(Lq9/k3;)V
                object3.l0.c(((SavingsActivity)object1), o0);
                return object3;
            }
            case 1: {
                ((u0)object1).o(b0.Y, Boolean.FALSE);
                return object0;
            }
            case 2: {
                Object object4 = (q)new ViewModelProvider(((DepositSavingsActivity)object1), new g(((DepositSavingsActivity)object1))).a(q.class);
                e e0 = new e(((DepositSavingsActivity)object1));  // initializer: Lq9/j3;-><init>(Lq9/k3;)V
                object4.d0.c(((DepositSavingsActivity)object1), e0);
                return object4;
            }
            case 3: {
                Object object5 = (m)new ViewModelProvider(((WithdrawSavingsActivity)object1), new Da.g(((WithdrawSavingsActivity)object1))).a(m.class);
                Da.e e1 = new Da.e(((WithdrawSavingsActivity)object1));  // initializer: Lq9/j3;-><init>(Lq9/k3;)V
                object5.d0.c(((WithdrawSavingsActivity)object1), e1);
                return object5;
            }
            case 4: {
                return ((Number)((H)object1).b0.getValue()).floatValue();
            }
            case 5: {
                return ((Density)object1).w(100.0f);
            }
            case 6: {
                ((T)object1).g();
                return object0;
            }
            case 7: {
                ((p)object1).getClass();
                HashSet hashSet0 = new HashSet();
                hashSet0.addAll(((p)object1).e);
                HashSet hashSet1 = p.W(((p)object1));
                for(Object object6: hashSet0) {
                    if(!hashSet1.contains(((String)object6))) {
                        continue;
                    }
                    z = true;
                    goto label_37;
                }
                hashSet0.removeAll(((p)object1).e);
            label_37:
                if(z) {
                    throw new IllegalStateException("WorkContinuation has cycles (" + ((p)object1) + ")");
                }
                u u0 = ((p)object1).a;
                b b0 = u0.b;
                u0.c.c();
                try {
                    Z6.b.k(u0.c, b0, ((p)object1));
                    boolean z1 = a.a(((p)object1));
                    u0.c.q();
                }
                finally {
                    u0.c.k();
                }
                if(z1) {
                    j.b(b0, u0.c, u0.e);
                }
                return object0;
            }
            case 8: {
                ((u)object1).getClass();
                int v1 = Build.VERSION.SDK_INT;
                Context context0 = ((u)object1).a;
                if(v1 >= 34) {
                    M2.a.b(context0).cancelAll();
                }
                JobScheduler jobScheduler0 = (JobScheduler)context0.getSystemService("jobscheduler");
                ArrayList arrayList0 = d.f(context0, jobScheduler0);
                if(arrayList0 != null && !arrayList0.isEmpty()) {
                    for(Object object7: arrayList0) {
                        d.b(jobScheduler0, ((JobInfo)object7).getId());
                    }
                }
                R2.u u1 = ((u)object1).c.x();
                ((WorkDatabase_Impl)u1.a).b();
                Ma.m m0 = (Ma.m)u1.n;
                x2.g g0 = m0.a();
                try {
                    ((WorkDatabase_Impl)u1.a).c();
                    try {
                        g0.b();
                        ((WorkDatabase_Impl)u1.a).q();
                    }
                    finally {
                        ((WorkDatabase_Impl)u1.a).k();
                    }
                }
                finally {
                    m0.c(g0);
                }
                j.b(((u)object1).b, ((u)object1).c, ((u)object1).e);
                return object0;
            }
            case 9: {
                return new J9.p(((l)object1));
            }
            case 10: {
                ((CustomerFCMService)object1).getClass();
                Nb.j.f(((CustomerFCMService)object1), "context");
                return Z0.a(((CustomerFCMService)object1));
            }
            case 11: {
                CustomerApp customerApp0 = Z0.a(((NewTermsAndConditionsActivity)object1));
                Parcelable parcelable0 = ((NewTermsAndConditionsActivity)object1).getIntent().getParcelableExtra("com.wave.typeSafeExtras");
                if(parcelable0 == null) {
                    throw new Exception(NewTermsAndConditionsActivity.class.getName() + " invoked with no params");
                }
                Object object8 = (Ja.j)new ViewModelProvider(((NewTermsAndConditionsActivity)object1), new Ja.e(customerApp0, ((NewTermsAndConditionsParams)parcelable0))).a(Ja.j.class);
                object8.d0.c(((NewTermsAndConditionsActivity)object1), ((NewTermsAndConditionsActivity)object1).E0);
                return object8;
            }
            case 12: {
                C3 c30 = r1.b(((SendMoneyDialogActivity)object1));
                Country country0 = c30.k();
                Parcelable parcelable1 = ((SendMoneyDialogActivity)object1).getIntent().getParcelableExtra("com.wave.typeSafeExtras");
                if(parcelable1 == null) {
                    throw new Exception(SendMoneyDialogActivity.class.getName() + " invoked with no params");
                }
                Context context1 = c30.getApplicationContext();
                Nb.j.e(context1, "getApplicationContext(...)");
                Object object9 = (com.wave.components.sendmoney.d)new ViewModelProvider(((SendMoneyDialogActivity)object1), new K9.y(c30, ((SendMoneyDialogParams)parcelable1), country0, new f(context1, country0, yc.d.C(country0), false))).a(com.wave.components.sendmoney.d.class);
                object9.i0.c(((SendMoneyDialogActivity)object1), ((SendMoneyDialogActivity)object1).E0);
                return object9;
            }
            case 13: {
                Parcelable parcelable2 = ((SendMoneyEnterContactActivity)object1).getIntent().getParcelableExtra("com.wave.typeSafeExtras");
                if(parcelable2 == null) {
                    throw new Exception(SendMoneyEnterContactActivity.class.getName() + " invoked with no params");
                }
                Object object10 = (i)new ViewModelProvider(((SendMoneyEnterContactActivity)object1), new l0(((SendMoneyEnterContactActivity)object1), ((SendMoneyEnterContactParams)parcelable2))).a(class0);
                object10.f0.c(((SendMoneyEnterContactActivity)object1), ((SendMoneyEnterContactActivity)object1).E0);
                object10.s0 = new com.wave.components.sendmoney.e(((i)object10), ((SendMoneyEnterContactParams)parcelable2), ((SendMoneyEnterContactActivity)object1), null);
                return object10;
            }
            case 14: {
                return new w(((TransactionHistoryDatabase_Impl)object1));
            }
            case 15: {
                return ((Na.p)object1).b;
            }
            case 16: {
                return ((Oa.b)object1).d;
            }
            case 17: {
                ((Q3.q)object1).a().a();
                return object0;
            }
            case 18: {
                Object object11 = new h();
                O3.i i0 = ((C)object1).k();
                Object object12 = object11;
                O3.i i1;
                while((i1 = object12.a) != null) {
                    object12 = i1;
                }
                object12.a = i0;
                return object11;
            }
            case 19: {
                Object object13 = (Y)new ViewModelProvider(((TransactionsActivity)object1), new k(((TransactionsActivity)object1))).a(Y.class);
                object13.f0.c(((TransactionsActivity)object1), ((TransactionsActivity)object1).E0);
                ((TransactionsActivity)object1).X.a(((LifecycleObserver)object13));
                return object13;
            }
            case 20: {
                Parcelable parcelable3 = ((BuyAirtimeDialogActivity)object1).getIntent().getParcelableExtra("com.wave.typeSafeExtras");
                if(parcelable3 == null) {
                    throw new Exception(BuyAirtimeDialogActivity.class.getName() + " invoked with no params");
                }
                Country country1 = r1.b(((BuyAirtimeDialogActivity)object1)).k();
                R6 r60 = r1.b(((BuyAirtimeDialogActivity)object1)).a();
                Context context2 = r1.b(((BuyAirtimeDialogActivity)object1)).getApplicationContext();
                Nb.j.e(context2, "getApplicationContext(...)");
                return (R9.q)new ViewModelProvider(((BuyAirtimeDialogActivity)object1), new R9.f(r60, ((BuyAirtimeDialogParams)parcelable3), new f(context2, country1, yc.d.C(country1), false), ((BuyAirtimeDialogActivity)object1))).a(R9.q.class);
            }
            case 21: {
                Parcelable parcelable4 = ((BuyAirtimeEnterContactActivity)object1).getIntent().getParcelableExtra("com.wave.typeSafeExtras");
                if(parcelable4 == null) {
                    throw new Exception(BuyAirtimeEnterContactActivity.class.getName() + " invoked with no params");
                }
                Object object14 = (i)new ViewModelProvider(((BuyAirtimeEnterContactActivity)object1), new s(((BuyAirtimeEnterContactActivity)object1), Z0.a(((BuyAirtimeEnterContactActivity)object1)).k(), ((BuyAirtimeEnterContactParams)parcelable4))).a(class0);
                object14.f0.c(((BuyAirtimeEnterContactActivity)object1), ((BuyAirtimeEnterContactActivity)object1).E0);
                object14.s0 = new r(((i)object14), ((BuyAirtimeEnterContactParams)parcelable4), null);
                return object14;
            }
            case 22: {
                Parcelable parcelable5 = ((CardFullScreenActivity)object1).getIntent().getParcelableExtra("com.wave.typeSafeExtras");
                if(parcelable5 == null) {
                    throw new Exception(CardFullScreenActivity.class.getName() + " invoked with no params");
                }
                Object object15 = (S)new ViewModelProvider(((CardFullScreenActivity)object1), new N(((CardFullScreenActivity)object1), ((QrScanOrCardParams)parcelable5))).a(S.class);
                object15.Y.c(((CardFullScreenActivity)object1), ((CardFullScreenActivity)object1).E0);
                return object15;
            }
            case 23: {
                x x0 = ((CardFullScreenFragment)object1).j();
                Nb.j.d(x0, "null cannot be cast to non-null type com.wave.customer.QrScanOrCardActivity");
                return (S)((QrScanOrCardActivity)x0).I0.getValue();
            }
            case 24: {
                Object object16 = (c0)new ViewModelProvider(((CreatePinActivity)object1), new U(Z0.a(((CreatePinActivity)object1)), ((CreatePinActivity)object1))).a(c0.class);
                object16.c0.c(((CreatePinActivity)object1), ((CreatePinActivity)object1).I0);
                return object16;
            }
            case 25: {
                Object object17 = (P0)new ViewModelProvider(((EnterNameActivity)object1), new K0(((EnterNameActivity)object1))).a(P0.class);
                object17.c0.c(((EnterNameActivity)object1), ((EnterNameActivity)object1).E0);
                return object17;
            }
            case 26: {
                ((PayMerchantActivity)object1).getClass();
                R6 r61 = r1.b(((PayMerchantActivity)object1)).a();
                Parcelable parcelable6 = ((PayMerchantActivity)object1).getIntent().getParcelableExtra("com.wave.typeSafeExtras");
                if(parcelable6 == null) {
                    throw new Exception(PayMerchantActivity.class.getName() + " invoked with no params");
                }
                Object object18 = (k1)new ViewModelProvider(((PayMerchantActivity)object1), new X0(r61, ((PayMerchantActivity)object1), ((PayMerchantParams)parcelable6))).a(k1.class);
                object18.e0.c(((PayMerchantActivity)object1), ((PayMerchantActivity)object1).E0);
                return object18;
            }
            case 27: {
                CustomerApp customerApp1 = Z0.a(((PaymentListActivity)object1));
                R6 r62 = customerApp1.a();
                Parcelable parcelable7 = ((PaymentListActivity)object1).getIntent().getParcelableExtra("com.wave.typeSafeExtras");
                if(parcelable7 == null) {
                    throw new Exception(PaymentListActivity.class.getName() + " invoked with no params");
                }
                Object object19 = (X1)new ViewModelProvider(((PaymentListActivity)object1), new p1(r62, ((PaymentListParams)parcelable7), customerApp1.j(), customerApp1)).a(X1.class);
                object19.d0.c(((PaymentListActivity)object1), ((PaymentListActivity)object1).G0);
                return object19;
            }
            case 28: {
                Object object20 = (u2)new ViewModelProvider(((RecoverPinActivity)object1), new p2(((RecoverPinActivity)object1))).a(u2.class);
                object20.d0.c(((RecoverPinActivity)object1), ((RecoverPinActivity)object1).E0);
                return object20;
            }
            default: {
                Object object2 = (E2)new ViewModelProvider(((ResetPinActivity)object1), new x2(((ResetPinActivity)object1))).a(E2.class);
                object2.c0.c(((ResetPinActivity)object1), ((ResetPinActivity)object1).E0);
                return object2;
            }
        }
    }
}


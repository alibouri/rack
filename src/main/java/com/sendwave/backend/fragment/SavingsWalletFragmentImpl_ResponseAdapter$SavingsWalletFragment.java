package com.sendwave.backend.fragment;

import Bb.q;
import Nb.j;
import Y8.o;
import Y8.u1;
import a9.D6;
import a9.H6;
import a9.I6;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.sendwave.backend.type.LockUnlockState;
import com.sendwave.models.CurrencyAmount;
import e9.a;
import java.util.Date;
import java.util.List;

public final class SavingsWalletFragmentImpl_ResponseAdapter.SavingsWalletFragment implements Adapter {
    public static final SavingsWalletFragmentImpl_ResponseAdapter.SavingsWalletFragment a;
    public static final List b;

    static {
        SavingsWalletFragmentImpl_ResponseAdapter.SavingsWalletFragment.a = new SavingsWalletFragmentImpl_ResponseAdapter.SavingsWalletFragment();  // initializer: Ljava/lang/Object;-><init>()V
        SavingsWalletFragmentImpl_ResponseAdapter.SavingsWalletFragment.b = q.L(new String[]{"id", "balance", "state", "whenUnlocks", "shouldRestrictFromLocking", "restrictFromLockingBottomSheetMessage", "numRemainingLocksAllowedInMonth", "introScreen", "historyConnection"});
    }

    public static SavingsWalletFragment a(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        j.f(jsonReader0, "reader");
        j.f(customScalarAdapters0, "customScalarAdapters");
        String s = null;
        CurrencyAmount currencyAmount0 = null;
        LockUnlockState lockUnlockState0 = null;
        Date date0 = null;
        Boolean boolean0 = null;
        String s1 = null;
        Integer integer0 = null;
        List list0 = null;
        D6 d60 = null;
    alab1:
        while(true) {
            switch(jsonReader0.selectName(SavingsWalletFragmentImpl_ResponseAdapter.SavingsWalletFragment.b)) {
                case 0: {
                    s = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 1: {
                    currencyAmount0 = o.u(jsonReader0);
                    break;
                }
                case 2: {
                    lockUnlockState0 = (LockUnlockState)Adapters.-nullable(a.n).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 3: {
                    date0 = (Date)Adapters.-nullable(u1.a).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 4: {
                    boolean0 = (Boolean)Adapters.NullableBooleanAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 5: {
                    s1 = (String)Adapters.NullableStringAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 6: {
                    integer0 = (Integer)Adapters.NullableIntAdapter.fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 7: {
                    list0 = (List)Adapters.-nullable(Adapters.-list(Adapters.-obj$default(I6.a, false, 1, null))).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                case 8: {
                    d60 = (D6)Adapters.-nullable(Adapters.-obj$default(H6.a, false, 1, null)).fromJson(jsonReader0, customScalarAdapters0);
                    break;
                }
                default: {
                    break alab1;
                }
            }
        }
        if(currencyAmount0 == null) {
            throw o.q(jsonReader0, "balance");
        }
        return new SavingsWalletFragment(s, currencyAmount0, lockUnlockState0, date0, boolean0, s1, integer0, list0, d60);
    }

    public static void b(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, SavingsWalletFragment savingsWalletFragment0) {
        j.f(jsonWriter0, "writer");
        j.f(customScalarAdapters0, "customScalarAdapters");
        j.f(savingsWalletFragment0, "value");
        jsonWriter0.name("id");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, savingsWalletFragment0.getId());
        jsonWriter0.name("balance");
        String s = savingsWalletFragment0.b.k();
        j.e(s, "toSerialized(...)");
        jsonWriter0.value(s);
        jsonWriter0.name("state");
        Adapters.-nullable(a.n).toJson(jsonWriter0, customScalarAdapters0, savingsWalletFragment0.c);
        jsonWriter0.name("whenUnlocks");
        Adapters.-nullable(u1.a).toJson(jsonWriter0, customScalarAdapters0, savingsWalletFragment0.d);
        jsonWriter0.name("shouldRestrictFromLocking");
        Adapters.NullableBooleanAdapter.toJson(jsonWriter0, customScalarAdapters0, savingsWalletFragment0.e);
        jsonWriter0.name("restrictFromLockingBottomSheetMessage");
        Adapters.NullableStringAdapter.toJson(jsonWriter0, customScalarAdapters0, savingsWalletFragment0.f);
        jsonWriter0.name("numRemainingLocksAllowedInMonth");
        Adapters.NullableIntAdapter.toJson(jsonWriter0, customScalarAdapters0, savingsWalletFragment0.g);
        jsonWriter0.name("introScreen");
        Adapters.-nullable(Adapters.-list(Adapters.-obj$default(I6.a, false, 1, null))).toJson(jsonWriter0, customScalarAdapters0, savingsWalletFragment0.h);
        jsonWriter0.name("historyConnection");
        Adapters.-nullable(Adapters.-obj$default(H6.a, false, 1, null)).toJson(jsonWriter0, customScalarAdapters0, savingsWalletFragment0.i);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final Object fromJson(JsonReader jsonReader0, CustomScalarAdapters customScalarAdapters0) {
        return SavingsWalletFragmentImpl_ResponseAdapter.SavingsWalletFragment.a(jsonReader0, customScalarAdapters0);
    }

    @Override  // com.apollographql.apollo.api.Adapter
    public final void toJson(JsonWriter jsonWriter0, CustomScalarAdapters customScalarAdapters0, Object object0) {
        SavingsWalletFragmentImpl_ResponseAdapter.SavingsWalletFragment.b(jsonWriter0, customScalarAdapters0, ((SavingsWalletFragment)object0));
    }
}


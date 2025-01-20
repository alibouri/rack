package com.sendwave.shared.paybill;

import Bb.r;
import Bb.z;
import R1.d;
import ac.B0;
import ac.o0;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.ViewModelProvider;
import f9.E;
import f9.j;
import i9.f0;
import java.util.ArrayList;
import p9.U;
import p9.v;
import p9.w;
import q9.k3;
import q9.r1;

public final class AddOnsFieldSelectWithToggleActivity extends k3 {
    public E F0;
    public final B0 G0;
    public static final int H0;

    public AddOnsFieldSelectWithToggleActivity() {
        this.G0 = o0.c(z.X);
    }

    // This method was un-flattened
    @Override  // q9.z3
    public final void onCreate(Bundle bundle0) {
        int v4;
        Resources resources0;
        boolean z;
        super.onCreate(bundle0);
        Parcelable parcelable0 = this.getIntent().getParcelableExtra("com.wave.typeSafeExtras");
        Class class0 = AddOnsFieldSelectWithToggleActivity.class;
        if(parcelable0 == null) {
            throw new Exception(class0.getName() + " invoked with no params");
        }
        String[] arr_s = ((AddOnsFieldSelectWithToggleParams)parcelable0).c0;
        ArrayList arrayList0 = new ArrayList(arr_s.length);
        int v = arr_s.length;
        int v1 = 0;
        int v2 = 0;
        while(v1 < v) {
            String s = arr_s[v1];
            ArrayList arrayList1 = new ArrayList();
            conflictingIndices[] arr_conflictingIndices = ((AddOnsFieldSelectWithToggleParams)parcelable0).e0;
            int v3 = 0;
            while(v3 < arr_conflictingIndices.length) {
                conflictingIndices conflictingIndices0 = arr_conflictingIndices[v3];
                if(conflictingIndices0.X == v2 || conflictingIndices0.Y == v2) {
                    arrayList1.add(conflictingIndices0);
                }
                ++v3;
                arr_s = arr_s;
                v = v;
            }
            ArrayList arrayList2 = new ArrayList(r.b0(arrayList1));
            for(Object object0: arrayList1) {
                conflictingIndices conflictingIndices1 = (conflictingIndices)object0;
                arrayList2.add(((int)(conflictingIndices1.X == v2 ? conflictingIndices1.Y : conflictingIndices1.X)));
            }
            boolean[] arr_z = ((AddOnsFieldSelectWithToggleParams)parcelable0).d0;
            if(!arrayList2.isEmpty()) {
                for(Object object1: arrayList2) {
                    if(!arr_z[((Number)object1).intValue()]) {
                        continue;
                    }
                    z = arr_z[v2];
                    resources0 = this.getResources();
                    v4 = 0x7F060016;  // color:Gray400
                    goto label_42;
                }
            }
            z = arr_z[v2];
            resources0 = this.getResources();
            v4 = 0x7F06007B;  // color:black
        label_42:
            arrayList0.add(new j(new p9.z(z, s, v2, resources0.getColor(v4)), String.valueOf(v2), 0x7F0D00C5));  // layout:personal_bill_addons_field_with_toggle_item
            ++v1;
            ++v2;
            arr_s = arr_s;
            v = v;
        }
        B0 b00 = this.G0;
        b00.getClass();
        b00.l(null, arrayList0);
        r1.b(this).e().d("add-ons field selection bill screen", null);
        Parcelable parcelable1 = this.getIntent().getParcelableExtra("com.wave.typeSafeExtras");
        if(parcelable1 == null) {
            throw new Exception(class0.getName() + " invoked with no params");
        }
        U u0 = (U)new ViewModelProvider(this, new w(((AddOnsFieldSelectWithToggleParams)parcelable1), this)).a(U.class);
        v v5 = new v(this);  // initializer: Lq9/j3;-><init>(Lq9/k3;)V
        u0.c0.c(this, v5);
        this.F0 = new E(this, b00, u0);
        f0 f00 = (f0)d.a(this.getLayoutInflater(), 0x7F0D00C4, null);  // layout:personal_bill_addons_field_with_toggle
        f00.v(u0);
        f00.u(this.F0);
        f00.r(this);
        this.setContentView(f00.d);
    }
}


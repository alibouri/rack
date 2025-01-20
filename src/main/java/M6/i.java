package M6;

import N6.k;
import O6.a;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public final class i extends g {
    public final j h;

    public i(j j0, o6.i i0, String s) {
        this.h = j0;
        super(j0, new k("OnRequestInstallCallback"), i0);
    }

    @Override  // M6.g
    public final void i(Bundle bundle0) {
        super.i(bundle0);
        int v = bundle0.getInt("error.code", -2);
        o6.i i0 = this.f;
        if(v != 0) {
            i0.c(new a(bundle0.getInt("error.code", -2)));
            return;
        }
        int v1 = bundle0.getInt("version.code", -1);
        int v2 = bundle0.getInt("update.availability");
        int v3 = bundle0.getInt("install.status", 0);
        if(bundle0.getInt("client.version.staleness", -1) != -1) {
            bundle0.getInt("client.version.staleness");
        }
        bundle0.getInt("in.app.update.priority", 0);
        bundle0.getLong("bytes.downloaded");
        bundle0.getLong("total.bytes.to.download");
        long v4 = bundle0.getLong("additional.size.required");
        this.h.d.getClass();
        long v5 = M6.k.a(new File(this.h.d.a.getFilesDir(), "assetpacks"));
        Parcelable parcelable0 = bundle0.getParcelable("blocking.intent");
        Parcelable parcelable1 = bundle0.getParcelable("nonblocking.intent");
        Parcelable parcelable2 = bundle0.getParcelable("blocking.destructive.intent");
        PendingIntent pendingIntent0 = (PendingIntent)bundle0.getParcelable("nonblocking.destructive.intent");
        HashMap hashMap0 = new HashMap();
        ArrayList arrayList0 = bundle0.getIntegerArrayList("update.precondition.failures:blocking.destructive.intent");
        HashSet hashSet0 = new HashSet();
        if(arrayList0 != null) {
            hashSet0.addAll(arrayList0);
        }
        hashMap0.put("blocking.destructive.intent", hashSet0);
        ArrayList arrayList1 = bundle0.getIntegerArrayList("update.precondition.failures:nonblocking.destructive.intent");
        HashSet hashSet1 = new HashSet();
        if(arrayList1 != null) {
            hashSet1.addAll(arrayList1);
        }
        hashMap0.put("nonblocking.destructive.intent", hashSet1);
        ArrayList arrayList2 = bundle0.getIntegerArrayList("update.precondition.failures:blocking.intent");
        HashSet hashSet2 = new HashSet();
        if(arrayList2 != null) {
            hashSet2.addAll(arrayList2);
        }
        hashMap0.put("blocking.intent", hashSet2);
        ArrayList arrayList3 = bundle0.getIntegerArrayList("update.precondition.failures:nonblocking.intent");
        HashSet hashSet3 = new HashSet();
        if(arrayList3 != null) {
            hashSet3.addAll(arrayList3);
        }
        hashMap0.put("nonblocking.intent", hashSet3);
        i0.d(new M6.a(v1, v2, v3, v4, v5, ((PendingIntent)parcelable0), ((PendingIntent)parcelable1), ((PendingIntent)parcelable2), pendingIntent0));
    }
}


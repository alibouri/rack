package q2;

import I2.k;
import M.J;
import Nb.j;
import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import w2.b;

public final class i {
    public final Context a;
    public final String b;
    public final b c;
    public final k d;
    public final ArrayList e;
    public final boolean f;
    public final int g;
    public final Executor h;
    public final Executor i;
    public final boolean j;
    public final boolean k;
    public final LinkedHashSet l;
    public final ArrayList m;
    public final ArrayList n;

    public i(Context context0, String s, b b0, k k0, ArrayList arrayList0, boolean z, int v, Executor executor0, Executor executor1, boolean z1, boolean z2, LinkedHashSet linkedHashSet0, ArrayList arrayList1, ArrayList arrayList2) {
        j.f(context0, "context");
        j.f(k0, "migrationContainer");
        J.l(v, "journalMode");
        j.f(executor0, "queryExecutor");
        j.f(executor1, "transactionExecutor");
        j.f(arrayList1, "typeConverters");
        j.f(arrayList2, "autoMigrationSpecs");
        super();
        this.a = context0;
        this.b = s;
        this.c = b0;
        this.d = k0;
        this.e = arrayList0;
        this.f = z;
        this.g = v;
        this.h = executor0;
        this.i = executor1;
        this.j = z1;
        this.k = z2;
        this.l = linkedHashSet0;
        this.m = arrayList1;
        this.n = arrayList2;
    }
}


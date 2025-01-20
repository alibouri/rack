package com.google.android.gms.common.api.internal;

import E3.k;
import L5.j;
import L5.l;
import M5.e;
import M5.u;
import N5.r;
import android.os.Looper;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import hb.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
public abstract class BasePendingResult extends h {
    static final ThreadLocal zaa;
    protected final e zab;
    protected final WeakReference zac;
    private final Object zae;
    private final CountDownLatch zaf;
    private final ArrayList zag;
    private final AtomicReference zai;
    private l zaj;
    private Status zak;
    private volatile boolean zal;
    private boolean zam;
    private boolean zan;
    private boolean zaq;

    static {
        BasePendingResult.zaa = new k(5);
    }

    public BasePendingResult(u u0) {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList();
        this.zai = new AtomicReference();
        this.zaq = false;
        this.zab = new e((u0 == null ? Looper.getMainLooper() : u0.b.f), 0);  // initializer: La6/d;-><init>(Landroid/os/Looper;I)V
        this.zac = new WeakReference(u0);
    }

    public final void addStatusListener(j j0) {
        r.a("Callback cannot be null.", j0 != null);
        synchronized(this.zae) {
            if(this.isReady()) {
                j0.a(this.zak);
            }
            else {
                this.zag.add(j0);
            }
        }
    }

    @ResultIgnorabilityUnspecified
    public final l await(long v, TimeUnit timeUnit0) {
        l l0;
        if(v > 0L) {
            r.i("await must not be called on the UI thread when time is greater than zero.");
        }
        r.l("Result has already been consumed.", !this.zal);
        try {
            if(!this.zaf.await(v, timeUnit0)) {
                this.forceFailureUnlessReady(Status.f0);
            }
        }
        catch(InterruptedException unused_ex) {
            this.forceFailureUnlessReady(Status.d0);
        }
        r.l("Result is not ready.", this.isReady());
        synchronized(this.zae) {
            r.l("Result has already been consumed.", !this.zal);
            r.l("Result is not ready.", this.isReady());
            l0 = this.zaj;
            this.zaj = null;
            this.zal = true;
        }
        if(this.zai.getAndSet(null) != null) {
            throw new ClassCastException();
        }
        r.j(l0);
        return l0;
    }

    @Deprecated
    public final void forceFailureUnlessReady(Status status0) {
        synchronized(this.zae) {
            if(!this.isReady()) {
                this.setResult(this.m0(status0));
                this.zan = true;
            }
        }
    }

    public final boolean isReady() {
        return this.zaf.getCount() == 0L;
    }

    public abstract l m0(Status arg1);

    public final void setResult(l l0) {
        synchronized(this.zae) {
            if(!this.zan && !this.zam) {
                this.isReady();
                r.l("Results have already been set", !this.isReady());
                r.l("Result has already been consumed", !this.zal);
                this.zaj = l0;
                this.zak = l0.c();
                this.zaf.countDown();
                ArrayList arrayList0 = this.zag;
                int v1 = arrayList0.size();
                for(int v2 = 0; v2 < v1; ++v2) {
                    ((j)arrayList0.get(v2)).a(this.zak);
                }
                this.zag.clear();
            }
        }
    }

    public final void zak() {
        this.zaq = this.zaq || ((Boolean)BasePendingResult.zaa.get()).booleanValue();
    }

    public static void zal(l l0) {
    }
}


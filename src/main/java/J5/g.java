package J5;

import E7.m;
import E7.o;
import G1.n;
import T5.a;
import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.apollographql.apollo.api.b;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.internal.measurement.U;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.zzo;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import j6.A;
import j6.P0;
import j6.R0;
import j6.W;
import j6.d0;
import j6.d;
import j6.r1;
import j6.s;
import j6.w0;
import java.lang.ref.SoftReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import o6.k;

public final class g implements Runnable {
    public final int X;
    public final boolean Y;
    public final Object Z;
    public final Object b0;
    public final Object c0;
    public final Object d0;

    public g(o o0, boolean z, Uri uri0, String s, String s1) {
        this.X = 3;
        super();
        this.Y = z;
        this.Z = uri0;
        this.b0 = s;
        this.c0 = s1;
        this.d0 = o0;
    }

    public g(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver0, Intent intent0, Context context0, boolean z, BroadcastReceiver.PendingResult broadcastReceiver$PendingResult0) {
        this.X = 0;
        super();
        this.Z = firebaseInstanceIdReceiver0;
        this.b0 = intent0;
        this.c0 = context0;
        this.Y = z;
        this.d0 = broadcastReceiver$PendingResult0;
    }

    public g(Object object0, Object object1, String s, String s1, boolean z, int v) {
        this.X = v;
        this.Z = object1;
        this.b0 = s;
        this.c0 = s1;
        this.Y = z;
        this.d0 = object0;
        super();
    }

    @Override
    public final void run() {
        Bundle bundle0;
        A a0;
        int v2;
        switch(this.X) {
            case 0: {
                Intent intent0 = (Intent)this.b0;
                Context context0 = (Context)this.c0;
                boolean z1 = this.Y;
                BroadcastReceiver.PendingResult broadcastReceiver$PendingResult0 = (BroadcastReceiver.PendingResult)this.d0;
                ((FirebaseInstanceIdReceiver)this.Z).getClass();
                try {
                    Parcelable parcelable0 = intent0.getParcelableExtra("wrapped_intent");
                    Executor executor0 = null;
                    Intent intent1 = parcelable0 instanceof Intent ? ((Intent)parcelable0) : null;
                    int v1 = 500;
                    if(intent1 == null) {
                        if(intent0.getExtras() != null) {
                            CloudMessage cloudMessage0 = new CloudMessage(intent0);
                            CountDownLatch countDownLatch0 = new CountDownLatch(1);
                            Class class0 = FirebaseInstanceIdReceiver.class;
                            synchronized(class0) {
                                SoftReference softReference0 = FirebaseInstanceIdReceiver.b;
                                if(softReference0 != null) {
                                    executor0 = (Executor)softReference0.get();
                                }
                                if(executor0 == null) {
                                    a a1 = new a("pscm-ack-executor");
                                    ThreadPoolExecutor threadPoolExecutor0 = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), a1);
                                    threadPoolExecutor0.allowCoreThreadTimeOut(true);
                                    executor0 = Executors.unconfigurableExecutorService(threadPoolExecutor0);
                                    FirebaseInstanceIdReceiver.b = new SoftReference(executor0);
                                }
                            }
                            executor0.execute(new n(2, context0, cloudMessage0, countDownLatch0, false));
                            try {
                                v1 = (int)(((Integer)k.a(new m(context0).b(cloudMessage0.X))));
                            }
                            catch(ExecutionException | InterruptedException executionException0) {
                                Log.e("FirebaseMessaging", "Failed to send message to service.", executionException0);
                            }
                            try {
                                if(!countDownLatch0.await(TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS)) {
                                    Log.w("CloudMessagingReceiver", "Message ack timed out");
                                }
                            }
                            catch(InterruptedException interruptedException0) {
                                Log.w("CloudMessagingReceiver", "Message ack failed: " + interruptedException0.toString());
                            }
                        }
                        v2 = v1;
                    }
                    else {
                        v2 = FirebaseInstanceIdReceiver.a(intent1);
                    }
                    if(z1 && broadcastReceiver$PendingResult0 != null) {
                        broadcastReceiver$PendingResult0.setResultCode(v2);
                    }
                }
                finally {
                    if(broadcastReceiver$PendingResult0 != null) {
                        broadcastReceiver$PendingResult0.finish();
                    }
                }
                return;
            }
            case 1: {
                P0 p00 = b.n(((AppMeasurementDynamiteService)this.d0).d);
                zzo zzo0 = p00.J(false);
                p00.z(new R0(p00, ((String)this.b0), ((String)this.c0), zzo0, this.Y, ((U)this.Z)));
                return;
            }
            case 2: {
                P0 p01 = b.n(((d0)((w0)this.d0).Y));
                zzo zzo1 = p01.J(false);
                p01.z(new R0(p01, ((AtomicReference)this.Z), ((String)this.b0), ((String)this.c0), zzo1, this.Y));
                return;
            }
            default: {
                Uri uri0 = (Uri)this.Z;
                String s = (String)this.c0;
                w0 w00 = (w0)((o)this.d0).Y;
                d0 d00 = (d0)w00.Y;
                w00.q();
                try {
                    r1 r10 = w00.p();
                    a0 = s.T0;
                    boolean z = d00.e0.B(null, a0);
                    if(TextUtils.isEmpty(s)) {
                        bundle0 = null;
                    }
                    else if(s.contains("gclid") || z && s.contains("gbraid")) {
                        bundle0 = r10.C(z, Uri.parse(("https://google.com/search?" + s)));
                    label_17:
                        if(bundle0 != null) {
                            bundle0.putString("_cis", "referrer");
                        }
                    }
                    else if(!s.contains("utm_campaign") && !s.contains("utm_source") && !s.contains("utm_medium") && !s.contains("utm_id") && !s.contains("dclid") && !s.contains("srsltid") && !s.contains("sfmc_id")) {
                        r10.b().l0.d("Activity created with data \'referrer\' without required params");
                        bundle0 = null;
                    }
                    else {
                        bundle0 = r10.C(z, Uri.parse(("https://google.com/search?" + s)));
                        goto label_17;
                    }
                }
                catch(RuntimeException runtimeException0) {
                    w00.b().e0.b(runtimeException0, "Throwable caught in handleReferrerForOnActivityCreated");
                    return;
                }
                String s1 = (String)this.b0;
                d d0 = d00.e0;
                W w0 = w00.p0;
                try {
                    if(this.Y) {
                        Bundle bundle1 = w00.p().C(d0.B(null, a0), uri0);
                        if(bundle1 != null) {
                            bundle1.putString("_cis", "intent");
                            if(!bundle1.containsKey("gclid") && bundle0 != null && bundle0.containsKey("gclid")) {
                                bundle1.putString("_cer", "gclid=" + bundle0.getString("gclid"));
                            }
                            w00.U(s1, "_cmp", bundle1);
                            w0.a(s1, bundle1);
                        }
                    }
                    if(!TextUtils.isEmpty(s)) {
                        w00.b().l0.b(s, "Activity created with referrer");
                        if(d0.B(null, s.q0)) {
                            if(bundle0 == null) {
                                w00.b().l0.b(s, "Referrer does not contain valid parameters");
                            }
                            else {
                                w00.U(s1, "_cmp", bundle0);
                                w0.a(s1, bundle0);
                            }
                            d00.l0.getClass();
                            w00.K("auto", "_ldl", null, true, System.currentTimeMillis());
                            return;
                        }
                        if(!s.contains("gclid") || !s.contains("utm_campaign") && !s.contains("utm_source") && !s.contains("utm_medium") && !s.contains("utm_term") && !s.contains("utm_content")) {
                            w00.b().l0.d("Activity created with data \'referrer\' without required params");
                            return;
                        }
                        if(!TextUtils.isEmpty(s)) {
                            d00.l0.getClass();
                            w00.K("auto", "_ldl", s, true, System.currentTimeMillis());
                            return;
                        }
                    }
                    return;
                }
                catch(RuntimeException runtimeException0) {
                }
                w00.b().e0.b(runtimeException0, "Throwable caught in handleReferrerForOnActivityCreated");
            }
        }
    }
}


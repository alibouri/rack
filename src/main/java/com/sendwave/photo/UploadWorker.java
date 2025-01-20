package com.sendwave.photo;

import Ea.F0;
import Eb.a;
import Fb.c;
import I2.m;
import I2.u;
import Nb.j;
import W5.f;
import Xb.J;
import Xb.V;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build.VERSION;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.util.LinkedHashMap;
import kotlin.coroutines.g;
import l9.d;
import l9.e;
import q9.r1;
import v1.q;

public final class UploadWorker extends CoroutineWorker {
    public final Context g;

    public UploadWorker(Context context0, WorkerParameters workerParameters0) {
        j.f(context0, "context");
        j.f(workerParameters0, "params");
        super(context0, workerParameters0);
        this.g = context0;
    }

    @Override  // androidx.work.CoroutineWorker
    public final Object c(g g0) {
        d d0;
        if(g0 instanceof d) {
            d0 = (d)g0;
            int v = d0.d0;
            if((v & 0x80000000) == 0) {
                d0 = new d(this, ((c)g0));
            }
            else {
                d0.d0 = v ^ 0x80000000;
            }
        }
        else {
            d0 = new d(this, ((c)g0));
        }
        Object object0 = d0.b0;
        Object object1 = a.X;
        switch(d0.d0) {
            case 0: {
                f.b0(object0);
                e e0 = new e(this, null);
                d0.d0 = 1;
                object0 = J.y(V.c, e0, d0);
                if(object0 == object1) {
                    return object1;
                }
                break;
            }
            case 1: {
                f.b0(object0);
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        j.e(object0, "withContext(...)");
        return object0;
    }

    @Override  // androidx.work.CoroutineWorker
    public final Object d() {
        Context context0 = this.g;
        if(Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel0 = h0.c.e("File Upload");
            Object object0 = context0.getSystemService("notification");
            j.d(object0, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager)object0).createNotificationChannel(notificationChannel0);
        }
        q q0 = new q(context0, "photo-upload");
        r1.b(context0);
        q0.w.icon = 0x7F08025F;  // drawable:ic_mono_penguin
        q0.e = q.b("Uploading file");
        q0.n = true;
        Notification notification0 = q0.a();
        j.e(notification0, "build(...)");
        return new I2.q(0x5FA97, notification0, 0);
    }

    public static final void e(UploadWorker uploadWorker0, yb.d d0, String s, long v) {
        uploadWorker0.getClass();
        while(true) {
            S7.g g0 = d0.b;
            if(d0.i == null) {
                d0.h = d0.g;
                g0.b = g0.a;
                ((InputStream)g0.c).mark(d0.g);
                HttpURLConnection httpURLConnection0 = (HttpURLConnection)d0.a.openConnection();
                d0.i = httpURLConnection0;
                d0.d.m(httpURLConnection0);
                d0.i.setRequestProperty("Upload-Offset", Long.toString(d0.c));
                d0.i.setRequestProperty("Content-Type", "application/offset+octet-stream");
                d0.i.setRequestProperty("Expect", "100-continue");
                try {
                    d0.i.setRequestMethod("PATCH");
                }
                catch(ProtocolException unused_ex) {
                    d0.i.setRequestMethod("POST");
                    d0.i.setRequestProperty("X-HTTP-Method-Override", "PATCH");
                }
                d0.i.setDoOutput(true);
                d0.i.setChunkedStreamingMode(0);
                try {
                    d0.j = d0.i.getOutputStream();
                }
                catch(ProtocolException protocolException0) {
                    if(d0.i.getResponseCode() != -1) {
                        d0.a();
                        if(d0.e.Y == d0.c) {
                            d0.d.getClass();
                        }
                        ((InputStream)d0.b.c).close();
                    }
                    throw protocolException0;
                }
            }
            int v1 = ((InputStream)g0.c).read(d0.f, 0, Math.min(d0.f.length, d0.h));
            long v2 = (long)v1;
            g0.a += v2;
            if(v1 == -1) {
                v1 = -1;
            }
            else {
                d0.j.write(d0.f, 0, v1);
                d0.j.flush();
                d0.c += v2;
                int v3 = d0.h - v1;
                d0.h = v3;
                if(v3 <= 0) {
                    d0.a();
                }
            }
            if(v1 <= -1) {
                break;
            }
            double f = ((double)d0.c) / ((double)v) * 100.0;
            LinkedHashMap linkedHashMap0 = new LinkedHashMap();
            linkedHashMap0.put("PROGRESS", f);
            m m0 = new m(linkedHashMap0);
            yc.d.H(m0);
            u.a(uploadWorker0.b.h.b.a, "updateProgress", new F0(uploadWorker0.b.h, uploadWorker0.b.a, m0, 2));
            hd.c.a.n("PhotoUpload");
            hd.c.a.g(s + ": Upload at " + f + "%", new Object[0]);
        }
        d0.a();
        if(d0.e.Y == d0.c) {
            d0.d.getClass();
        }
        ((InputStream)d0.b.c).close();
    }
}


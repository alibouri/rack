package a5;

import Bb.F;
import C3.i;
import E7.B;
import E7.G;
import Nb.j;
import P2.d;
import Qa.M;
import Qa.Y;
import U8.e;
import Wc.k;
import Wc.p;
import Y8.N;
import android.app.DownloadManager.Query;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.StatFs;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.play.core.install.zza;
import com.google.firebase.messaging.FirebaseMessaging;
import com.sendwave.shared.VerifyAuthCodeActivity;
import com.twilio.voice.Call;
import com.wave.components.PlayStoreUpdaterFragment;
import com.wave.customer.home.PersonalHomeActivity;
import com.wave.customer.paymentcards.PaymentCardsActivity;
import com.wave.customer.risk.magiclinksecuritychallenge.MagicLinkSecurityChallengeActivity;
import com.wave.customer.savings.SavingsActivity;
import com.wave.customer.transactions.ui.TransactionsActivity;
import com.wave.voip.VoipCallActivity;
import com.wave.voip.call.VoipCallService;
import f5.a;
import ha.S2;
import hb.n;
import i2.b;
import io.sentry.i1;
import j6.d0;
import j6.s;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;
import jeb.synthetic.TWR;
import m9.l;
import m9.m;
import q9.C1;
import q9.n3;
import q9.o3;
import q9.p3;
import q9.r1;
import ra.L0;
import ra.L;
import ra.w0;
import rb.u;
import rb.v;
import v8.g;

public final class c extends BroadcastReceiver {
    public final int a;
    public Object b;
    public static c c;

    public c() {
        this.a = 2;
        super();
    }

    public c(int v, Object object0) {
        this.a = v;
        this.b = object0;
        super();
    }

    public c(Context context0) {
        this.a = 0;
        super();
        Context context1 = context0.getApplicationContext();
        j.e(context1, "context.applicationContext");
        this.b = context1;
    }

    public c(d0 d00) {
        this.a = 8;
        super();
        this.b = d00;
    }

    // Deobfuscation rating: LOW(20)
    public static final c a() {
        return a.b(c.class) ? null : c.c;
    }

    private final void b(Context context0, Intent intent0) {
        long v14;
        Throwable throwable5;
        FileInputStream fileInputStream0;
        ParcelFileDescriptor parcelFileDescriptor0;
        File file0;
        int v7;
        m m0;
        int v1;
        int v;
        Cursor cursor0;
        ArrayList arrayList0;
        p3 p30 = (p3)this.b;
        p30.getClass();
        hd.c.a.n("Updater");
        hd.c.a.g("Checking and cleaning up files...", new Object[0]);
        HashSet hashSet0 = new HashSet();
        Object object0 = p30.a;
        __monitor_enter(object0);
        try {
            arrayList0 = new ArrayList();
            try {
                DownloadManager.Query downloadManager$Query0 = new DownloadManager.Query();
                cursor0 = p30.e.query(downloadManager$Query0);
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                goto label_96;
            }
        }
        catch(Throwable throwable0) {
            goto label_107;
        }
        try {
            if(cursor0 != null) {
                v = cursor0.getColumnIndex("_id");
                v1 = cursor0.getColumnIndex("status");
                int v2 = cursor0.getColumnIndex("reason");
                int v3 = cursor0.getColumnIndex("uri");
                while(true) {
                label_15:
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                    long v4 = cursor0.getLong(v);
                    int v5 = cursor0.getInt(v1);
                    int v6 = cursor0.getInt(v2);
                    String s = cursor0.getString(v3);
                    if(s == null) {
                        continue;
                    }
                    Uri uri0 = Uri.parse(s);
                    try {
                        m0 = new m(m.a(s));
                        if((v5 & 4) <= 0 && (v5 & 1) <= 0 && (v5 & 2) <= 0) {
                            goto label_29;
                        }
                        else {
                            goto label_24;
                        }
                        goto label_83;
                    }
                    catch(l unused_ex) {
                        goto label_33;
                    }
                label_24:
                    v7 = v1;
                    hd.c.a.n("Updater");
                    hd.c.a.g("Download in progress: " + s, new Object[0]);
                    hashSet0.add(uri0);
                    goto label_83;
                label_29:
                    if((v5 & 16) > 0 && v6 >= 400 && v6 < 600) {
                        p30.h(m0);
                    }
                    arrayList0.add(v4);
                    if((v5 & 8) <= 0) {
                    label_33:
                        v7 = v1;
                    }
                    else {
                        hd.c.a.n("Updater");
                        hd.c.a.g("Download completed: " + s, new Object[0]);
                        String s1 = uri0.getLastPathSegment();
                        file0 = new File(p30.f, s1);
                        try {
                            parcelFileDescriptor0 = p30.e.openDownloadedFile(v4);
                            goto label_40;
                        }
                        catch(IOException iOException0) {
                            goto label_71;
                        }
                    }
                    goto label_83;
                }
            }
            goto label_86;
        }
        catch(Throwable throwable1) {
            goto label_90;
        }
        try {
        label_40:
            fileInputStream0 = new FileInputStream(parcelFileDescriptor0.getFileDescriptor());
        }
        catch(Throwable throwable2) {
            goto label_61;
        }
        try(FileOutputStream fileOutputStream0 = new FileOutputStream(file0)) {
            byte[] arr_b = new byte[8024];
            while(true) {
                int v8 = fileInputStream0.read(arr_b);
                if(-1 == v8) {
                    goto label_58;
                }
                fileOutputStream0.write(arr_b, 0, v8);
            }
        }
        catch(Throwable throwable3) {
            try {
                throwable5 = throwable3;
                fileInputStream0.close();
                throw throwable5;
            }
            catch(Throwable throwable4) {
                try {
                    throwable5.addSuppressed(throwable4);
                    throw throwable5;
                label_58:
                    fileInputStream0.close();
                    goto label_68;
                }
                catch(Throwable throwable2) {
                }
            }
        }
    label_61:
        Throwable throwable6 = throwable2;
        if(parcelFileDescriptor0 != null) {
            try {
                parcelFileDescriptor0.close();
            }
            catch(Throwable throwable7) {
                try {
                    try {
                        throwable6.addSuppressed(throwable7);
                        throw throwable6;
                    label_68:
                        parcelFileDescriptor0.close();
                    }
                    catch(IOException iOException0) {
                    label_71:
                        hd.c.a.n("Updater");
                        hd.c.a.e(iOException0, "Unable to copy downloaded file:", new Object[0]);
                        p30.h(m0);
                    }
                    try {
                        m m1 = new m(file0);
                        if(file0.isFile()) {
                            v7 = v1;
                            if(file0.length() == m1.g) {
                                goto label_83;
                            }
                        }
                        else {
                            goto label_79;
                        }
                    }
                    catch(l unused_ex) {
                    label_79:
                        v7 = v1;
                    }
                    hd.c.a.n("Updater");
                    hd.c.a.d("Downloaded file doesn\'t look like a complete update file -- size=" + file0.length() + ", expected " + m0.g, new Object[0]);
                    p30.h(m0);
                label_83:
                    v1 = v7;
                    v = v;
                    goto label_15;
                label_86:
                    ob.a a0 = (ob.a)p30.d.X.getValue();
                    a0.a.d().b(a0.b, Boolean.FALSE).commit();
                    goto label_92;
                }
                catch(Throwable throwable1) {
                }
                goto label_90;
            }
        }
        throw throwable6;
        try {
        label_90:
            TWR.safeClose$NT(cursor0, throwable1);
            throw throwable1;
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            goto label_96;
        }
        catch(Throwable throwable0) {
            goto label_107;
        }
    label_92:
        if(cursor0 != null) {
            try {
                try {
                    cursor0.close();
                }
                catch(IllegalArgumentException illegalArgumentException0) {
                label_96:
                    if(illegalArgumentException0.getMessage() == null || !illegalArgumentException0.getMessage().contains("local_filename")) {
                        throw illegalArgumentException0;
                    }
                    ob.a a1 = (ob.a)p30.d.X.getValue();
                    a1.a.d().b(a1.b, Boolean.TRUE).commit();
                    n.b(new B("DownloadManager queried illegal column", illegalArgumentException0), null, null, 14);  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
                }
            label_101:
                Iterator iterator0 = arrayList0.iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        goto label_109;
                    }
                    Object object1 = iterator0.next();
                    p30.e.remove(new long[]{((long)(((Long)object1)))});
                }
            }
            catch(Throwable throwable0) {
                goto label_107;
            }
        }
        goto label_101;
    label_107:
        __monitor_exit(object0);
        throw throwable0;
    label_109:
        __monitor_exit(object0);
        if(p30.i) {
            hd.c.a.n("Updater");
            hd.c.a.g("Not cleaning up files while patches are being processed", new Object[0]);
        }
        else if(p30.f == null || p30.f.listFiles() == null) {
            n.c(i1.ERROR, "Updater: Missing updates directory", null, false);
        }
        else {
            File[] arr_file = p30.f.listFiles();
            int v9 = 0;
            while(v9 < arr_file.length) {
                File file1 = arr_file[v9];
                try {
                    if(!p30.g(new m(file1))) {
                        goto label_120;
                    }
                }
                catch(l unused_ex) {
                label_120:
                    p3.b(file1);
                }
                ++v9;
            }
            if(p30.g != null && p30.g.listFiles() != null) {
                File[] arr_file1 = p30.g.listFiles();
                for(int v10 = 0; v10 < arr_file1.length; ++v10) {
                    File file2 = arr_file1[v10];
                    p p0 = new p(file2.lastModified());
                    p p1 = new p();
                    k k0 = p3.l;
                    if(k0 != null) {
                        long v11 = k0.X;
                        if(Long.compare(v11, 0L) != 0) {
                            Yc.p.K0.getClass();
                            long v12 = U5.a.N(p0.X, U5.a.O(1, v11));
                            if(v12 != p0.X) {
                                p0 = new p(v12);
                            }
                        }
                    }
                    if(p1.d() > p0.d()) {
                        p3.b(file2);
                    }
                }
            }
            ArrayList arrayList1 = new ArrayList();
            if(p30.h == null || p30.h.listFiles() == null) {
                n.c(i1.ERROR, "Updater: Missing APK directory", null, false);
            }
            else {
                File[] arr_file2 = p30.h.listFiles();
                for(int v13 = 0; v13 < arr_file2.length; ++v13) {
                    File file3 = arr_file2[v13];
                    if(file3.getName().endsWith(".apk")) {
                        arrayList1.add(file3);
                    }
                    else {
                        p3.b(file3);
                    }
                }
                Collections.sort(arrayList1, new n3(p30));
                while(!arrayList1.isEmpty()) {
                    if(arrayList1.size() <= 3) {
                        if(p30.j) {
                            v14 = 0L;
                        }
                        else {
                            StatFs statFs0 = new StatFs(p30.f.getAbsolutePath());
                            long v15 = statFs0.getBlockSizeLong();
                            v14 = statFs0.getAvailableBlocksLong() * v15;
                        }
                        if(v14 < 24000000L) {
                            goto label_164;
                        }
                        break;
                    }
                label_164:
                    p3.b(((File)arrayList1.get(0)));
                    arrayList1.remove(0);
                }
            }
        }
        if(p30.f != null && p30.f.listFiles() != null && p30.f.listFiles().length != 0) {
            new o3(p30).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }

    public void c() {
        if(Log.isLoggable("FirebaseMessaging", 3) || Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        IntentFilter intentFilter0 = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        ((G)this.b).Z.b.registerReceiver(this, intentFilter0);
    }

    @Override
    public void finalize() {
        if(this.a != 0) {
            super.finalize();
            return;
        }
        if(!a.b(this)) {
            try {
                if(!a.b(this)) {
                    try {
                        b b0 = b.a(((Context)this.b));
                        j.e(b0, "getInstance(applicationContext)");
                        b0.d(this);
                    }
                    catch(Throwable throwable1) {
                        a.a(throwable1, this);
                    }
                }
            }
            catch(Throwable throwable0) {
                a.a(throwable0, this);
            }
        }
    }

    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        boolean z = true;
        Set set0 = null;
        switch(this.a) {
            case 0: {
                if(!a.b(this)) {
                    try {
                        N4.m m0 = new N4.m(context0, null);
                        String s4 = intent0 == null ? null : intent0.getStringExtra("event_name");
                        Bundle bundle1 = intent0 == null ? null : intent0.getBundleExtra("event_args");
                        Bundle bundle2 = new Bundle();
                        if(bundle1 != null) {
                            set0 = bundle1.keySet();
                        }
                        if(set0 != null) {
                            for(Object object1: set0) {
                                j.e(((String)object1), "key");
                                Pattern pattern0 = Pattern.compile("[^0-9a-zA-Z _-]");
                                j.e(pattern0, "compile(...)");
                                String s5 = pattern0.matcher(((String)object1)).replaceAll("-");
                                j.e(s5, "replaceAll(...)");
                                Pattern pattern1 = Pattern.compile("^[ -]*");
                                j.e(pattern1, "compile(...)");
                                String s6 = pattern1.matcher(s5).replaceAll("");
                                j.e(s6, "replaceAll(...)");
                                Pattern pattern2 = Pattern.compile("[ -]*$");
                                j.e(pattern2, "compile(...)");
                                String s7 = pattern2.matcher(s6).replaceAll("");
                                j.e(s7, "replaceAll(...)");
                                bundle2.putString(s7, ((String)bundle1.get(((String)object1))));
                            }
                        }
                        if(M4.B.c()) {
                            m0.e("bf_" + s4, bundle2);
                            return;
                        }
                        return;
                    }
                    catch(Throwable throwable0) {
                    }
                    a.a(throwable0, this);
                }
                return;
            }
            case 1: {
                if(intent0 != null) {
                    String[] arr_s = intent0.getStringArrayExtra("tags");
                    if(arr_s != null && Bb.n.e0(arr_s, "REFRESH_SAVINGS")) {
                        SavingsActivity.I(((SavingsActivity)this.b)).p();
                    }
                }
                return;
            }
            case 2: {
                G g0 = (G)this.b;
                if(g0 != null && g0.a()) {
                    if(Log.isLoggable("FirebaseMessaging", 3) || Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    G g1 = (G)this.b;
                    g1.Z.getClass();
                    FirebaseMessaging.b(0L, g1);
                    ((G)this.b).Z.b.unregisterReceiver(this);
                    this.b = null;
                }
                return;
            }
            case 3: {
                M6.c c0 = (M6.c)this.b;
                c0.getClass();
                if(!"com.wave.personal".equals(intent0.getStringExtra("package.name"))) {
                    Object[] arr_object = {intent0.getStringExtra("package.name")};
                    c0.a.b("ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", arr_object);
                    return;
                }
                c0.a.b("List of extras in received intent:", new Object[0]);
                for(Object object2: intent0.getExtras().keySet()) {
                    Object[] arr_object1 = {((String)object2), intent0.getExtras().get(((String)object2))};
                    c0.a.b("Key: %s; value: %s", arr_object1);
                }
                c0.a.b("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
                Object[] arr_object2 = {"install.status", intent0.getIntExtra("install.status", 0)};
                c0.a.b("Key: %s; value: %s", arr_object2);
                Object[] arr_object3 = {"error.code", intent0.getIntExtra("error.code", 0)};
                c0.a.b("Key: %s; value: %s", arr_object3);
                zza zza0 = new zza(intent0.getIntExtra("install.status", 0), intent0.getLongExtra("bytes.downloaded", 0L), intent0.getLongExtra("total.bytes.to.download", 0L), intent0.getIntExtra("error.code", 0), intent0.getStringExtra("package.name"));
                c0.a.b("ListenerRegistryBroadcastReceiver.onReceive: %s", new Object[]{zza0});
                synchronized(c0) {
                    for(Object object3: new HashSet(c0.d)) {
                        PlayStoreUpdaterFragment playStoreUpdaterFragment0 = (PlayStoreUpdaterFragment)(((O6.b)object3));
                        playStoreUpdaterFragment0.getClass();
                        if(zza0.a == 11) {
                            playStoreUpdaterFragment0.V();
                        }
                    }
                }
                return;
            }
            case 4: {
                j.f(context0, "context");
                j.f(intent0, "intent");
                ((d)this.b).f(intent0);
                return;
            }
            case 5: {
                j.f(context0, "context");
                j.f(intent0, "intent");
                String[] arr_s1 = intent0.getStringArrayExtra("tags");
                if(arr_s1 != null && Bb.n.e0(arr_s1, "REFETCH_TXS")) {
                    Y y0 = TransactionsActivity.I(((TransactionsActivity)this.b));
                    y0.getClass();
                    M m1 = new M(y0, null);
                    N.k(y0, y0.f0, false, m1);
                }
                return;
            }
            case 6: {
                j.f(context0, "ctx");
                j.f(intent0, "i");
                String[] arr_s2 = intent0.getStringArrayExtra("tags");
                if(arr_s2 == null) {
                    arr_s2 = new String[0];
                }
                boolean z2 = Bb.n.e0(arr_s2, "REFETCH_TXS");
                PersonalHomeActivity personalHomeActivity0 = (PersonalHomeActivity)this.b;
                if(z2) {
                    S2 s20 = personalHomeActivity0.I0;
                    if(s20 != null) {
                        s20.C();
                        goto label_143;
                    }
                    j.p("viewmodel");
                    throw null;
                }
            label_143:
                if(Bb.n.e0(arr_s2, "SPRAY_CONFETTI")) {
                    S2 s21 = personalHomeActivity0.I0;
                    if(s21 != null) {
                        Boolean boolean0 = Boolean.TRUE;
                        s21.D1.getClass();
                        s21.D1.l(null, boolean0);
                        return;
                    }
                    j.p("viewmodel");
                    throw null;
                }
                return;
            }
            case 7: {
                ((G0.a)this.b).m();
                return;
            }
            case 8: {
                d0 d00 = (d0)this.b;
                if(intent0 == null) {
                    d0.h(d00.g0);
                    d00.g0.h0.d("App receiver called with null intent");
                    return;
                }
                String s8 = intent0.getAction();
                if(s8 == null) {
                    d0.h(d00.g0);
                    d00.g0.h0.d("App receiver called with null action");
                    return;
                }
                if(!s8.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
                    d0.h(d00.g0);
                    d00.g0.h0.d("App receiver called with unknown action");
                    return;
                }
                if(d00.e0.B(null, s.I0)) {
                    d0.h(d00.g0);
                    d00.g0.m0.d("App receiver notified triggers are available");
                    d0.h(d00.h0);
                    E5.d d1 = new E5.d(23);
                    d1.Y = d00;
                    d00.h0.z(d1);
                }
                return;
            }
            case 9: {
                hd.c.a.n("OFFSET");
                hd.c.a.l("Received TIME_CHANGED. Clearing any locally stored offset.", new Object[0]);
                ((i)this.b).E(0L);
                return;
            }
            case 10: {
                j.f(intent0, "intent");
                if(j.a(intent0.getAction(), "com.google.android.gms.auth.api.phone.SMS_RETRIEVED")) {
                    Bundle bundle3 = intent0.getExtras();
                    Object object4 = bundle3 == null ? null : bundle3.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
                    j.d(object4, "null cannot be cast to non-null type com.google.android.gms.common.api.Status");
                    VerifyAuthCodeActivity verifyAuthCodeActivity0 = (VerifyAuthCodeActivity)this.b;
                    verifyAuthCodeActivity0.J().u0 = false;
                    switch(((Status)object4).X) {
                        case 0: {
                            if(verifyAuthCodeActivity0.J0) {
                                Intent intent1 = (Intent)bundle3.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_CONSENT_INTENT");
                                j.c(intent1);
                                C1.Z = true;
                                try {
                                    verifyAuthCodeActivity0.H0.a(intent1);
                                }
                                catch(ActivityNotFoundException unused_ex) {
                                    verifyAuthCodeActivity0.J().u0 = true;
                                }
                                return;
                            }
                            String s9 = bundle3.getString("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                            if(s9 != null) {
                                verifyAuthCodeActivity0.I(s9);
                                return;
                            }
                            r1.b(verifyAuthCodeActivity0).e().d("verify auth code: failed to autofill code because message is empty", null);
                            break;
                        }
                        case 15: {
                            verifyAuthCodeActivity0.J().u0 = false;
                            return;
                        }
                        default: {
                            verifyAuthCodeActivity0.J().u0 = true;
                            return;
                        }
                    }
                }
                return;
            }
            case 11: {
                ((VoipCallActivity)this.b).finish();
                return;
            }
            case 12: {
                this.b(context0, intent0);
                return;
            }
            case 13: {
                j.f(context0, "context");
                j.f(intent0, "intent");
                String[] arr_s3 = intent0.getStringArrayExtra("tags");
                if(arr_s3 != null && Bb.n.e0(arr_s3, "REFRESH_CARDS")) {
                    L0 l00 = ((PaymentCardsActivity)this.b).F0;
                    if(l00 != null) {
                        w0 w00 = new w0(l00, null, 4);
                        l00.q(L.b0, w00);
                        return;
                    }
                    j.p("vm");
                    throw null;
                }
                return;
            }
            case 14: {
                v v2 = ((VoipCallService)this.b).b0;
                if(v2 != null) {
                    u u0 = u.Z;
                    Call call0 = ((rb.l)v2).f;
                    if(call0 != null) {
                        ((rb.l)v2).m = u0;
                        call0.disconnect();
                    }
                    return;
                }
                j.p("voipCaller");
                throw null;
            }
            case 15: {
                if("android.intent.action.BATTERY_CHANGED".equals(intent0.getAction())) {
                    if(intent0.getIntExtra("plugged", -1) > 0) {
                        z = false;
                    }
                    ((g)this.b).d.post(new e(3, this, z));
                }
                return;
            }
            default: {
                j.f(intent0, "intent");
                boolean z1 = j.a(intent0.getAction(), "com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
                MagicLinkSecurityChallengeActivity magicLinkSecurityChallengeActivity0 = (MagicLinkSecurityChallengeActivity)this.b;
                if(!z1) {
                    magicLinkSecurityChallengeActivity0.getClass();
                    r1.b(magicLinkSecurityChallengeActivity0).e().d("magic link security challenge: received intent with incorrect action", F.J(new Ab.k("action", intent0.getAction())));
                    return;
                }
                Bundle bundle0 = intent0.getExtras();
                Object object0 = bundle0 == null ? null : bundle0.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
                j.d(object0, "null cannot be cast to non-null type com.google.android.gms.common.api.Status");
                int v = ((Status)object0).X;
                if(v != 0) {
                    magicLinkSecurityChallengeActivity0.getClass();
                    r1.b(magicLinkSecurityChallengeActivity0).e().d("magic link security challenge: sms retriever status code not successful", F.J(new Ab.k("statusCode", v)));
                    return;
                }
                String s = bundle0.getString("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                if(s == null) {
                    magicLinkSecurityChallengeActivity0.getClass();
                    r1.b(magicLinkSecurityChallengeActivity0).e().d("magic link security challenge: no sms content", null);
                    return;
                }
                Vb.d d0 = ya.j.a.a(0, s);
                if(d0 == null) {
                    magicLinkSecurityChallengeActivity0.getClass();
                    r1.b(magicLinkSecurityChallengeActivity0).e().d("magic link security challenge: link not found in sms", F.J(new Ab.k("smsText", s)));
                    return;
                }
                String s1 = d0.a.group();
                j.e(s1, "group(...)");
                String s2 = (String)Bb.p.w0(Vb.j.p0(s1, new String[]{"/"}, 0, 6));
                magicLinkSecurityChallengeActivity0.getClass();
                String s3 = MagicLinkSecurityChallengeActivity.I(intent0);
                magicLinkSecurityChallengeActivity0.J().o(s2, s3, true);
            }
        }
    }
}


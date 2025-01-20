package com.google.android.gms.internal.gtm;

import E5.c;
import E5.f;
import E5.k;
import E5.l;
import N5.r;
import R2.w;
import S5.b;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri.Builder;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.CampaignTrackingReceiver;
import io.sentry.g1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.Map;
import jeb.synthetic.TWR;

final class zzcj extends zzbr {
    private boolean zza;
    private final zzcd zzb;
    private final zzer zzc;
    private final zzep zzd;
    private final zzcb zze;
    private long zzf;
    private final zzcv zzg;
    private final zzcv zzh;
    private final zzfb zzi;
    private long zzj;
    private boolean zzk;

    public zzcj(zzbu zzbu0, zzbv zzbv0) {
        super(zzbu0);
        r.j(zzbv0);
        this.zzf = 0x8000000000000000L;
        this.zzd = new zzep(zzbu0);
        this.zzb = new zzcd(zzbu0);
        this.zzc = new zzer(zzbu0);
        this.zze = new zzcb(zzbu0);
        this.zzi = new zzfb(this.zzC());
        this.zzg = new zzcf(this, zzbu0);
        this.zzh = new zzcg(this, zzbu0);
    }

    public final void zzZ() {
        this.zzV();
        r.l("Analytics backend already started", !this.zza);
        this.zza = true;
        k k0 = this.zzq();
        zzch zzch0 = new zzch(this);
        k0.getClass();
        k0.b.submit(zzch0);
    }

    public final long zza() {
        long v = this.zzf;
        if(v != 0x8000000000000000L) {
            return v;
        }
        long v1 = (long)(((Long)zzeh.zze.zzb()));
        zzfg zzfg0 = this.zzB();
        zzfg0.zzV();
        if(zzfg0.zzc) {
            zzfg zzfg1 = this.zzB();
            zzfg1.zzV();
            return ((long)zzfg1.zzd) * 1000L;
        }
        return v1;
    }

    public final void zzaa() {
        this.zzV();
        k.a();
        Context context0 = this.zzt().zza();
        if(!zzev.zzb(context0)) {
            this.zzQ("AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions.");
        }
        else if(!zzfa.zzh(context0)) {
            this.zzI("AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions.");
        }
        if(!CampaignTrackingReceiver.zzb(context0)) {
            this.zzQ("CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
        }
        this.zzA().zza();
        if(!this.zzaj("android.permission.ACCESS_NETWORK_STATE")) {
            this.zzI("Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            this.zzac();
        }
        if(!this.zzaj("android.permission.INTERNET")) {
            this.zzI("Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
            this.zzac();
        }
        if(zzfa.zzh(this.zzo())) {
            this.zzN("AnalyticsService registered in the app manifest and enabled");
        }
        else {
            this.zzQ("AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions.");
        }
        if(!this.zzk && !this.zzb.zzab()) {
            this.zzi();
        }
        this.zzad();
    }

    public final void zzac() {
        this.zzV();
        k.a();
        this.zzk = true;
        this.zze.zzc();
        this.zzad();
    }

    public final void zzad() {
        long v2;
        k.a();
        this.zzV();
        if(!this.zzk && this.zza() > 0L) {
            if(this.zzb.zzab()) {
                this.zzd.zzc();
                this.zzag();
                this.zzaf();
                return;
            }
            if(!((Boolean)zzeh.zzz.zzb()).booleanValue()) {
                this.zzd.zza();
                if(!this.zzd.zzd()) {
                    this.zzag();
                    this.zzaf();
                    this.zzah();
                    return;
                }
            }
            this.zzah();
            long v = this.zza();
            long v1 = this.zzA().zzb();
            if(v1 == 0L) {
                v2 = Math.min(zzcs.zze(), v);
            }
            else {
                ((b)this.zzC()).getClass();
                v2 = v - Math.abs(System.currentTimeMillis() - v1);
                if(v2 <= 0L) {
                    v2 = Math.min(zzcs.zze(), v);
                }
            }
            this.zzO("Dispatch scheduled (ms)", v2);
            if(this.zzg.zzh()) {
                long v3 = Math.max(1L, v2 + this.zzg.zzb());
                this.zzg.zze(v3);
                return;
            }
            this.zzg.zzg(v2);
            return;
        }
        this.zzd.zzc();
        this.zzag();
        this.zzaf();
    }

    public final boolean zzae() {
        List list0;
        k.a();
        this.zzV();
        this.zzN("Dispatching a batch of local hits");
        if(!this.zze.zzg() && !this.zzc.zze()) {
            this.zzN("No network or service available. Will retry later");
            return false;
        }
        long v = (long)Math.max(zzcs.zzh(), zzcs.zzg());
        ArrayList arrayList0 = new ArrayList();
        long v1 = 0L;
        while(true) {
            try {
            label_9:
                this.zzb.zzm();
                arrayList0.clear();
                try {
                    list0 = this.zzb.zzj(v);
                    if(list0.isEmpty()) {
                        this.zzN("Store is empty, nothing to dispatch");
                        this.zzag();
                        this.zzaf();
                    }
                    else {
                        this.zzO("Hits loaded from store. count", list0.size());
                        goto label_18;
                    }
                }
                catch(SQLiteException sQLiteException0) {
                    this.zzR("Failed to read hits from persisted store", sQLiteException0);
                    this.zzag();
                    this.zzaf();
                }
                goto label_68;
            label_18:
                for(Object object0: list0) {
                    if(((zzek)object0).zzb() != v1) {
                        continue;
                    }
                    this.zzK("Database contains successfully uploaded hit", v1, list0.size());
                    this.zzag();
                    this.zzaf();
                    goto label_68;
                }
                if(this.zze.zzg()) {
                    this.zzN("Service connected, sending hits to the service");
                    while(!list0.isEmpty()) {
                        zzek zzek0 = (zzek)list0.get(0);
                        if(!this.zze.zzh(zzek0)) {
                            break;
                        }
                        v1 = Math.max(v1, zzek0.zzb());
                        list0.remove(zzek0);
                        this.zzF("Hit sent do device AnalyticsService for delivery", zzek0);
                        try {
                            this.zzb.zzn(zzek0.zzb());
                            arrayList0.add(zzek0.zzb());
                        }
                        catch(SQLiteException sQLiteException1) {
                            this.zzJ("Failed to remove hit that was send for delivery", sQLiteException1);
                            this.zzag();
                            this.zzaf();
                            goto label_68;
                        }
                    }
                }
                if(this.zzc.zze()) {
                    List list1 = this.zzc.zzc(list0);
                    for(Object object1: list1) {
                        v1 = Math.max(v1, ((long)(((Long)object1))));
                    }
                    try {
                        this.zzb.zzY(list1);
                        arrayList0.addAll(list1);
                        goto label_67;
                    }
                    catch(SQLiteException sQLiteException2) {
                        this.zzJ("Failed to remove successfully uploaded hits", sQLiteException2);
                        this.zzag();
                        this.zzaf();
                        goto label_68;
                    }
                    try {
                        goto label_64;
                    }
                    catch(SQLiteException sQLiteException0) {
                    }
                    this.zzR("Failed to read hits from persisted store", sQLiteException0);
                    this.zzag();
                    this.zzaf();
                    goto label_68;
                }
                goto label_67;
            }
            catch(Throwable throwable0) {
            }
            try {
            label_64:
                this.zzb.zzaa();
                this.zzb.zzZ();
            }
            catch(SQLiteException sQLiteException3) {
                break;
            }
            throw throwable0;
            try {
            label_67:
                if(arrayList0.isEmpty()) {
                label_68:
                    this.zzb.zzaa();
                    this.zzb.zzZ();
                    return false;
                }
                this.zzb.zzaa();
                this.zzb.zzZ();
                goto label_9;
            }
            catch(SQLiteException sQLiteException3) {
            }
            break;
        }
        this.zzJ("Failed to commit local dispatch transaction", sQLiteException3);
        this.zzag();
        this.zzaf();
        return false;
    }

    private final void zzaf() {
        zzcx zzcx0 = this.zzy();
        if(zzcx0.zze()) {
            zzcx0.zza();
        }
    }

    private final void zzag() {
        if(this.zzg.zzh()) {
            this.zzN("All hits dispatched or no network/service. Going to power save mode");
        }
        this.zzg.zzf();
    }

    private final void zzah() {
        long v;
        zzcx zzcx0 = this.zzy();
        if(zzcx0.zzc() && !zzcx0.zze()) {
            k.a();
            this.zzV();
            try {
                v = this.zzb.zzc();
            }
            catch(SQLiteException sQLiteException0) {
                this.zzJ("Failed to get min/max hit times from local store", sQLiteException0);
                v = 0L;
            }
            if(v != 0L) {
                ((b)this.zzC()).getClass();
                if(Math.abs(System.currentTimeMillis() - v) <= ((long)(((Long)zzeh.zzh.zzb())))) {
                    this.zzO("Dispatch alarm scheduled (ms)", zzcs.zzd());
                    zzcx0.zzb();
                }
            }
        }
    }

    private final void zzai(zzbw zzbw0, zzav zzav0) {
        r.j(zzbw0);
        r.j(zzav0);
        w w0 = new w(this.zzt());
        String s = zzbw0.zzc();
        r.f(s);
        r.f(s);
        Uri.Builder uri$Builder0 = new Uri.Builder();
        uri$Builder0.scheme("uri");
        uri$Builder0.authority("google-analytics.com");
        uri$Builder0.path(s);
        Uri uri0 = uri$Builder0.build();
        g1 g10 = (g1)w0.Y;
        ListIterator listIterator0 = ((ArrayList)g10.Z).listIterator();
        while(listIterator0.hasNext()) {
            if(uri0.equals(((l)listIterator0.next()).f())) {
                listIterator0.remove();
            }
        }
        ArrayList arrayList0 = (ArrayList)g10.Z;
        zzbu zzbu0 = (zzbu)w0.b0;
        arrayList0.add(new c(zzbu0, s));
        new ArrayList(arrayList0);
        HashMap hashMap0 = (HashMap)g10.Y;
        HashMap hashMap1 = new HashMap(hashMap0.size());
        for(Object object0: hashMap0.entrySet()) {
            f f0 = g1.D(((Class)((Map.Entry)object0).getKey()));
            ((f)((Map.Entry)object0).getValue()).zzc(f0);
            hashMap1.put(((Class)((Map.Entry)object0).getKey()), f0);
        }
        zzau zzau0 = zzbu0.zzh().zza();
        r.j(zzau0);
        Class class0 = zzau.class;
        Class class1 = f.class;
        if(class0.getSuperclass() != class1) {
            throw new IllegalArgumentException();
        }
        f f1 = (f)hashMap1.get(class0);
        if(f1 == null) {
            f1 = g1.D(class0);
            hashMap1.put(class0, f1);
        }
        zzau0.zzc(f1);
        zzaz zzaz0 = zzbu0.zzk().zza();
        r.j(zzaz0);
        Class class2 = zzaz.class;
        if(class2.getSuperclass() != class1) {
            throw new IllegalArgumentException();
        }
        f f2 = (f)hashMap1.get(class2);
        if(f2 == null) {
            f2 = g1.D(class2);
            hashMap1.put(class2, f2);
        }
        zzaz0.zzc(f2);
        Iterator iterator1 = ((ArrayList)w0.Z).iterator();
        if(iterator1.hasNext()) {
            throw v1.r.e(iterator1);
        }
        Class class3 = zzbd.class;
        f f3 = (f)hashMap1.get(class3);
        if(f3 == null) {
            f3 = g1.D(class3);
            hashMap1.put(class3, f3);
        }
        f3.getClass();
        throw new ClassCastException();
    }

    private final boolean zzaj(String s) {
        return U5.b.a(this.zzo()).a.checkCallingOrSelfPermission(s) == 0;
    }

    public static void zzc(zzcj zzcj0) {
        try {
            zzcj0.zzb.zza();
            zzcj0.zzad();
        }
        catch(SQLiteException sQLiteException0) {
            zzcj0.zzR("Failed to delete stale hits", sQLiteException0);
        }
        zzcj0.zzh.zzg(86400000L);
    }

    @Override  // com.google.android.gms.internal.gtm.zzbr
    public final void zzd() {
        this.zzb.zzW();
        this.zzc.zzW();
        this.zze.zzW();
    }

    public static void zze(zzcj zzcj0) {
        zzcj0.zzg(new zzci(zzcj0), zzcj0.zzj);
    }

    public final void zzf(zzcy zzcy0) {
        this.zzg(zzcy0, this.zzj);
    }

    public final void zzg(zzcy zzcy0, long v) {
        long v2;
        k.a();
        this.zzV();
        long v1 = this.zzA().zzb();
        if(v1 == 0L) {
            v2 = -1L;
        }
        else {
            ((b)this.zzC()).getClass();
            v2 = Math.abs(System.currentTimeMillis() - v1);
        }
        this.zzF("Dispatching local hits. Elapsed time since last dispatch (ms)", v2);
        this.zzi();
        try {
            this.zzae();
            this.zzA().zzi();
            this.zzad();
            if(zzcy0 != null) {
                zzcy0.zza(null);
            }
            if(this.zzj != v) {
                this.zzd.zzb();
                return;
            }
            return;
        }
        catch(Exception exception0) {
        }
        this.zzJ("Local dispatch failed", exception0);
        this.zzA().zzi();
        this.zzad();
        if(zzcy0 != null) {
            zzcy0.zza(exception0);
        }
    }

    public final void zzi() {
        if(!this.zzk && zzcs.zzl() && !this.zze.zzg()) {
            long v = (long)(((Long)zzeh.zzC.zzb()));
            if(this.zzi.zzc(v)) {
                this.zzi.zzb();
                this.zzN("Connecting to service");
                if(this.zze.zzf()) {
                    this.zzN("Connected to service");
                    this.zzi.zza();
                    this.zzm();
                }
            }
        }
    }

    public final void zzl() {
        k.a();
        ((b)this.zzC()).getClass();
        this.zzj = System.currentTimeMillis();
    }

    public final void zzm() {
        List list0;
        k.a();
        k.a();
        this.zzV();
        if(!zzcs.zzl()) {
            this.zzQ("Service client disabled. Can\'t dispatch local hits to device AnalyticsService");
        }
        if(!this.zze.zzg()) {
            this.zzN("Service not connected");
            return;
        }
        if(this.zzb.zzab()) {
            return;
        }
        this.zzN("Dispatching local hits to device AnalyticsService");
        try {
            do {
                long v = (long)zzcs.zzh();
                list0 = this.zzb.zzj(v);
                if(list0.isEmpty()) {
                    this.zzad();
                    return;
                }
            label_16:
            }
            while(list0.isEmpty());
        }
        catch(SQLiteException sQLiteException0) {
            this.zzJ("Failed to read hits from store", sQLiteException0);
            this.zzag();
            this.zzaf();
            return;
        }
        zzek zzek0 = (zzek)list0.get(0);
        if(!this.zze.zzh(zzek0)) {
            this.zzad();
            return;
        }
        list0.remove(zzek0);
        try {
            this.zzb.zzn(zzek0.zzb());
            goto label_16;
        }
        catch(SQLiteException sQLiteException1) {
            this.zzJ("Failed to remove hit that was send for delivery", sQLiteException1);
            this.zzag();
            this.zzaf();
        }
    }

    public final void zzn(String s) {
        r.f(s);
        k.a();
        zzav zzav0 = zzff.zzb(this.zzz(), s);
        if(zzav0 == null) {
            this.zzR("Parsing failed. Ignoring invalid campaign data", s);
            return;
        }
        String s1 = this.zzA().zzg();
        if(s.equals(s1)) {
            this.zzQ("Ignoring duplicate install campaign");
            return;
        }
        if(!TextUtils.isEmpty(s1)) {
            this.zzK("Ignoring multiple install campaigns. original, new", s1, s);
            return;
        }
        this.zzA().zzh(s);
        if(this.zzA().zzf().zzc(zzcs.zzc())) {
            this.zzR("Campaign received too late, ignoring", zzav0);
            return;
        }
        this.zzF("Received installation campaign", zzav0);
        zzcd zzcd0 = this.zzb;
        zzcd0.zzV();
        k.a();
        SQLiteDatabase sQLiteDatabase0 = zzcd0.zzf();
        Cursor cursor0 = null;
        try {
            int v = (int)(((Integer)zzeh.zzd.zzb()));
            cursor0 = sQLiteDatabase0.query("properties", new String[]{"cid", "tid", "adid", "hits_count", "params"}, "app_uid=?", new String[]{"0"}, null, null, null, String.valueOf(v));
            ArrayList arrayList0 = new ArrayList();
            if(cursor0.moveToFirst()) {
                while(true) {
                    String s2 = cursor0.getString(0);
                    String s3 = cursor0.getString(1);
                    boolean z = cursor0.getInt(2) != 0;
                    long v1 = (long)cursor0.getInt(3);
                    Map map0 = zzcd0.zzl(cursor0.getString(4));
                    if(TextUtils.isEmpty(s2) || TextUtils.isEmpty(s3)) {
                        zzcd0.zzS("Read property with empty client id or tracker id", s2, s3);
                    }
                    else {
                        arrayList0.add(new zzbw(0L, s2, s3, z, v1, map0));
                    }
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                }
            }
        }
        catch(SQLiteException sQLiteException0) {
            goto label_41;
        }
        catch(Throwable throwable0) {
            goto label_44;
        }
        if(arrayList0.size() >= v) {
            try {
                try {
                    zzcd0.zzQ("Sending hits to too many properties. Campaign report might be incorrect");
                    goto label_46;
                }
                catch(SQLiteException sQLiteException0) {
                }
            label_41:
                zzcd0.zzJ("Error loading hits from the database", sQLiteException0);
                throw sQLiteException0;
            }
            catch(Throwable throwable0) {
            label_44:
                TWR.safeClose$NT(cursor0, throwable0);
                throw throwable0;
            }
        }
    label_46:
        cursor0.close();
        for(Object object0: arrayList0) {
            this.zzai(((zzbw)object0), zzav0);
        }
    }
}


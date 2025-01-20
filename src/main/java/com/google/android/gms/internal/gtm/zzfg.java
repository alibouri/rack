package com.google.android.gms.internal.gtm;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import java.util.Locale;

public final class zzfg extends zzbr {
    protected String zza;
    protected String zzb;
    protected boolean zzc;
    protected int zzd;
    protected boolean zze;
    protected boolean zzf;

    public zzfg(zzbu zzbu0) {
        super(zzbu0);
    }

    public final boolean zzc() {
        this.zzV();
        return this.zzf;
    }

    @Override  // com.google.android.gms.internal.gtm.zzbr
    public final void zzd() {
        int v1;
        ApplicationInfo applicationInfo0;
        try {
            applicationInfo0 = this.zzo().getPackageManager().getApplicationInfo("com.wave.personal", 0x80);
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            this.zzR("PackageManager doesn\'t know about the app package", packageManager$NameNotFoundException0);
            applicationInfo0 = null;
        }
        if(applicationInfo0 == null) {
            this.zzQ("Couldn\'t get ApplicationInfo to load global config");
            return;
        }
        Bundle bundle0 = applicationInfo0.metaData;
        if(bundle0 != null) {
            int v = bundle0.getInt("com.google.android.gms.analytics.globalConfigResource");
            if(v > 0) {
                zzbu zzbu0 = this.zzt();
                zzej zzej0 = (zzej)new zzcr(zzbu0, new zzei(zzbu0)).zza(v);
                if(zzej0 != null) {
                    this.zzN("Loading global XML config values");
                    String s = zzej0.zza;
                    if(s != null) {
                        this.zzb = s;
                        this.zzF("XML config - app name", s);
                    }
                    String s1 = zzej0.zzb;
                    if(s1 != null) {
                        this.zza = s1;
                        this.zzF("XML config - app version", s1);
                    }
                    String s2 = zzej0.zzc;
                    boolean z = false;
                    if(s2 != null) {
                        String s3 = s2.toLowerCase(Locale.US);
                        if("verbose".equals(s3)) {
                            v1 = 0;
                        }
                        else if("info".equals(s3)) {
                            v1 = 1;
                        }
                        else if("warning".equals(s3)) {
                            v1 = 2;
                        }
                        else {
                            v1 = "error".equals(s3) ? 3 : -1;
                        }
                        if(v1 >= 0) {
                            this.zzO("XML config - log level", v1);
                        }
                    }
                    int v2 = zzej0.zzd;
                    if(v2 >= 0) {
                        this.zzd = v2;
                        this.zzc = true;
                        this.zzF("XML config - dispatch period (sec)", v2);
                    }
                    int v3 = zzej0.zze;
                    if(v3 != -1) {
                        if(1 == v3) {
                            z = true;
                        }
                        this.zzf = z;
                        this.zze = true;
                        this.zzF("XML config - dry run", Boolean.valueOf(z));
                    }
                }
            }
        }
    }

    public final boolean zze() {
        this.zzV();
        return this.zze;
    }

    public final boolean zzf() {
        this.zzV();
        return false;
    }
}


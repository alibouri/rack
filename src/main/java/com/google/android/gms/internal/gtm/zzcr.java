package com.google.android.gms.internal.gtm;

import android.content.res.Resources.NotFoundException;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

class zzcr extends zzbq {
    final zzcq zza;

    public zzcr(zzbu zzbu0, zzcq zzcq0) {
        super(zzbu0);
        this.zza = zzcq0;
    }

    public final zzcp zza(int v) {
        try {
            return this.zzb(this.zzt().zzb().getResources().getXml(v));
        }
        catch(Resources.NotFoundException resources$NotFoundException0) {
            this.zzR("inflate() called with unknown resourceId", resources$NotFoundException0);
            return null;
        }
    }

    private final zzcp zzb(XmlResourceParser xmlResourceParser0) {
        try {
            xmlResourceParser0.next();
            for(int v = xmlResourceParser0.getEventType(); true; v = xmlResourceParser0.next()) {
                if(v == 1) {
                    return this.zza.zza();
                }
                if(xmlResourceParser0.getEventType() == 2) {
                    String s = xmlResourceParser0.getName().toLowerCase(Locale.US);
                    if(s.equals("screenname")) {
                        String s7 = xmlResourceParser0.getAttributeValue(null, "name");
                        String s8 = xmlResourceParser0.nextText().trim();
                        if(!TextUtils.isEmpty(s7) && !TextUtils.isEmpty(s8)) {
                            this.zza.zzb(s7, s8);
                        }
                    }
                    else if(s.equals("string")) {
                        String s1 = xmlResourceParser0.getAttributeValue(null, "name");
                        String s2 = xmlResourceParser0.nextText().trim();
                        if(!TextUtils.isEmpty(s1) && s2 != null) {
                            this.zza.zze(s1, s2);
                        }
                    }
                    else if(s.equals("bool")) {
                        String s5 = xmlResourceParser0.getAttributeValue(null, "name");
                        String s6 = xmlResourceParser0.nextText().trim();
                        if(!TextUtils.isEmpty(s5) && !TextUtils.isEmpty(s6)) {
                            try {
                                this.zza.zzc(s5, Boolean.parseBoolean(s6));
                            }
                            catch(NumberFormatException numberFormatException1) {
                                this.zzS("Error parsing bool configuration value", s6, numberFormatException1);
                            }
                        }
                    }
                    else if(s.equals("integer")) {
                        String s3 = xmlResourceParser0.getAttributeValue(null, "name");
                        String s4 = xmlResourceParser0.nextText().trim();
                        if(!TextUtils.isEmpty(s3) && !TextUtils.isEmpty(s4)) {
                            try {
                                int v1 = Integer.parseInt(s4);
                                this.zza.zzd(s3, v1);
                            }
                            catch(NumberFormatException numberFormatException0) {
                                this.zzS("Error parsing int configuration value", s4, numberFormatException0);
                            }
                        }
                    }
                }
            }
        }
        catch(XmlPullParserException xmlPullParserException0) {
        }
        catch(IOException iOException0) {
            this.zzJ("Error parsing tracker configuration file", iOException0);
            return this.zza.zza();
        }
        this.zzJ("Error parsing tracker configuration file", xmlPullParserException0);
        return this.zza.zza();
    }
}


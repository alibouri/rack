package com.google.android.gms.internal.gtm;

import E5.k;
import N5.r;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.zip.GZIPOutputStream;
import m5.b;

final class zzer extends zzbr {
    private static final byte[] zza;
    private final String zzb;
    private final zzfb zzc;

    static {
        zzer.zza = "\n".getBytes();
    }

    public zzer(zzbu zzbu0) {
        super(zzbu0);
        String s = Build.VERSION.RELEASE;
        String s1 = zzff.zzd(Locale.getDefault());
        String s2 = Build.MODEL;
        String s3 = Build.ID;
        StringBuilder stringBuilder0 = new StringBuilder("GoogleAnalytics/");
        stringBuilder0.append(zzbs.zza);
        stringBuilder0.append(" (Linux; U; Android ");
        stringBuilder0.append(s);
        stringBuilder0.append("; ");
        stringBuilder0.append(s1);
        stringBuilder0.append("; ");
        stringBuilder0.append(s2);
        stringBuilder0.append(" Build/");
        this.zzb = b.y(stringBuilder0, s3, ")");
        this.zzc = new zzfb(zzbu0.zzr());
    }

    public final String zza(zzek zzek0, boolean z) {
        r.j(zzek0);
        StringBuilder stringBuilder0 = new StringBuilder();
        try {
            for(Object object0: zzek0.zzg().entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                String s = (String)map$Entry0.getKey();
                if(!"ht".equals(s) && !"qt".equals(s) && !"AppUID".equals(s) && !"z".equals(s) && !"_gmsv".equals(s)) {
                    zzer.zzl(stringBuilder0, s, ((String)map$Entry0.getValue()));
                }
            }
            zzer.zzl(stringBuilder0, "ht", String.valueOf(zzek0.zzd()));
            ((S5.b)this.zzC()).getClass();
            zzer.zzl(stringBuilder0, "qt", String.valueOf(System.currentTimeMillis() - zzek0.zzd()));
            if(z) {
                long v = zzek0.zzc();
                zzer.zzl(stringBuilder0, "z", (v == 0L ? String.valueOf(zzek0.zzb()) : String.valueOf(v)));
            }
            return stringBuilder0.toString();
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
        }
        this.zzJ("Failed to encode name or value", unsupportedEncodingException0);
        return null;
    }

    public final HttpURLConnection zzb(URL uRL0) {
        URLConnection uRLConnection0 = uRL0.openConnection();
        if(!(uRLConnection0 instanceof HttpURLConnection)) {
            throw new IOException("Failed to obtain http connection");
        }
        ((HttpURLConnection)uRLConnection0).setDefaultUseCaches(false);
        ((HttpURLConnection)uRLConnection0).setConnectTimeout(((int)(((Integer)zzeh.zzw.zzb()))));
        ((HttpURLConnection)uRLConnection0).setReadTimeout(((int)(((Integer)zzeh.zzx.zzb()))));
        ((HttpURLConnection)uRLConnection0).setInstanceFollowRedirects(false);
        ((HttpURLConnection)uRLConnection0).setRequestProperty("User-Agent", this.zzb);
        ((HttpURLConnection)uRLConnection0).setDoInput(true);
        return (HttpURLConnection)uRLConnection0;
    }

    public final List zzc(List list0) {
        HttpURLConnection httpURLConnection3;
        HttpURLConnection httpURLConnection2;
        int v3;
        int v2;
        OutputStream outputStream1;
        HttpURLConnection httpURLConnection0;
        byte[] arr_b1;
        boolean z1;
        boolean z;
        k.a();
        this.zzV();
        r.j(list0);
        if(this.zzw().zza().isEmpty()) {
            z = false;
            z1 = false;
        }
        else {
            long v = ((long)(((int)(((Integer)zzeh.zzv.zzb()))))) * 1000L;
            if(this.zzc.zzc(v)) {
                String s = (String)zzeh.zzp.zzb();
                if("BATCH_BY_SESSION".equalsIgnoreCase(s)) {
                    z = true;
                }
                else if(!"BATCH_BY_TIME".equalsIgnoreCase(s) && !"BATCH_BY_BRUTE_FORCE".equalsIgnoreCase(s) && !"BATCH_BY_COUNT".equalsIgnoreCase(s) && !"BATCH_BY_SIZE".equalsIgnoreCase(s)) {
                    z = false;
                }
                else {
                    z = true;
                }
                z1 = "GZIP".equalsIgnoreCase(((String)zzeh.zzq.zzb()));
            }
            else {
                z = false;
                z1 = false;
            }
        }
        if(z) {
            r.b(!list0.isEmpty());
            this.zzP("Uploading batched hits. compression, count", Boolean.valueOf(z1), list0.size());
            zzeq zzeq0 = new zzeq(this);
            List list1 = new ArrayList();
            int v1 = 0;
            for(Object object0: list0) {
                zzek zzek0 = (zzek)object0;
                if(!zzeq0.zzb(zzek0)) {
                    break;
                }
                ((ArrayList)list1).add(zzek0.zzb());
                if(v1 <= 0) {
                    v1 = zzek0.zza();
                }
            }
            if(zzeq0.zza() != 0) {
                URL uRL0 = this.zzh();
                if(uRL0 == null) {
                    this.zzI("Failed to build batching endpoint url");
                    return Collections.emptyList();
                }
                if(z1) {
                    byte[] arr_b = zzeq0.zzc();
                    r.j(arr_b);
                    try {
                        ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
                        GZIPOutputStream gZIPOutputStream0 = new GZIPOutputStream(byteArrayOutputStream0);
                        gZIPOutputStream0.write(arr_b);
                        gZIPOutputStream0.close();
                        byteArrayOutputStream0.close();
                        arr_b1 = byteArrayOutputStream0.toByteArray();
                        Integer integer0 = (int)arr_b1.length;
                        this.zzH("POST compressed size, ratio %, url", integer0, ((long)(((long)arr_b1.length) * 100L / ((long)arr_b.length))), uRL0);
                        if(arr_b1.length > arr_b.length) {
                            this.zzS("Compressed payload is larger then uncompressed. compressed, uncompressed", integer0, ((int)arr_b.length));
                        }
                        if(zzbq.zzU()) {
                            this.zzO("Post payload", "\n" + new String(arr_b));
                        }
                        httpURLConnection0 = this.zzb(uRL0);
                        goto label_70;
                    }
                    catch(IOException iOException0) {
                        httpURLConnection0 = null;
                        goto label_95;
                    }
                    catch(Throwable throwable0) {
                    }
                    Throwable throwable1 = throwable0;
                    OutputStream outputStream0 = null;
                    HttpURLConnection httpURLConnection1 = null;
                    goto label_113;
                    try {
                    label_70:
                        httpURLConnection0.setDoOutput(true);
                        httpURLConnection0.addRequestProperty("Content-Encoding", "gzip");
                        httpURLConnection0.setFixedLengthStreamingMode(arr_b1.length);
                        httpURLConnection0.connect();
                        outputStream1 = httpURLConnection0.getOutputStream();
                    }
                    catch(IOException iOException0) {
                        goto label_95;
                    }
                    catch(Throwable throwable2) {
                        goto label_110;
                    }
                    try {
                        outputStream1.write(arr_b1);
                        outputStream1.close();
                    }
                    catch(IOException iOException0) {
                        outputStream0 = outputStream1;
                        goto label_96;
                    }
                    catch(Throwable throwable2) {
                        httpURLConnection1 = httpURLConnection0;
                        outputStream0 = outputStream1;
                        goto label_112;
                    }
                    try {
                        this.zzk(httpURLConnection0);
                        v2 = httpURLConnection0.getResponseCode();
                        if(v2 == 200) {
                            this.zzs().zzi();
                            v2 = 200;
                        }
                        this.zzF("POST status", v2);
                        goto label_121;
                    }
                    catch(IOException iOException0) {
                    }
                    catch(Throwable throwable2) {
                        goto label_110;
                    }
                label_95:
                    outputStream0 = null;
                    try {
                    label_96:
                        this.zzR("Network compressed POST connection error", iOException0);
                    }
                    catch(Throwable throwable2) {
                        httpURLConnection1 = httpURLConnection0;
                        goto label_112;
                    }
                    if(outputStream0 != null) {
                        try {
                            outputStream0.close();
                        }
                        catch(IOException iOException1) {
                            this.zzJ("Error closing http compressed post connection output stream", iOException1);
                        }
                    }
                    if(httpURLConnection0 != null) {
                        httpURLConnection0.disconnect();
                    }
                    v3 = 0;
                    goto label_125;
                label_110:
                    httpURLConnection1 = httpURLConnection0;
                    outputStream0 = null;
                label_112:
                    throwable1 = throwable2;
                label_113:
                    if(outputStream0 != null) {
                        try {
                            outputStream0.close();
                        }
                        catch(IOException iOException2) {
                            this.zzJ("Error closing http compressed post connection output stream", iOException2);
                        }
                    }
                    if(httpURLConnection1 != null) {
                        httpURLConnection1.disconnect();
                    }
                    throw throwable1;
                label_121:
                    httpURLConnection0.disconnect();
                    v3 = v2;
                }
                else {
                    v3 = this.zzg(uRL0, zzeq0.zzc(), v1);
                }
            label_125:
                if(v3 == 200) {
                    this.zzO("Batched upload completed. Hits batched", zzeq0.zza());
                    return list1;
                }
                Integer integer1 = v3;
                this.zzO("Network error uploading hits. status code", integer1);
                if(this.zzw().zza().contains(integer1)) {
                    this.zzQ("Server instructed the client to stop batching");
                    this.zzc.zzb();
                }
                return Collections.emptyList();
            }
            return list1;
        }
        List list2 = new ArrayList(list0.size());
        for(Object object1: list0) {
            zzek zzek1 = (zzek)object1;
            r.j(zzek1);
            String s1 = this.zza(zzek1, !zzek1.zzh());
            if(s1 == null) {
                this.zzz().zzb(zzek1, "Error formatting hit for upload");
            }
            else if(s1.length() <= ((int)(((Integer)zzeh.zzo.zzb())))) {
                URL uRL1 = this.zzj(zzek1, s1);
                if(uRL1 == null) {
                    this.zzI("Failed to build collect GET endpoint url");
                    return list2;
                }
                this.zzF("GET request", uRL1);
                try {
                    httpURLConnection2 = this.zzb(uRL1);
                }
                catch(IOException iOException3) {
                    httpURLConnection3 = null;
                    goto label_171;
                }
                catch(Throwable throwable3) {
                    httpURLConnection3 = null;
                    goto label_179;
                }
                try {
                    httpURLConnection2.connect();
                    this.zzk(httpURLConnection2);
                    int v4 = httpURLConnection2.getResponseCode();
                    if(v4 == 200) {
                        this.zzs().zzi();
                        v4 = 200;
                    }
                    this.zzF("GET status", v4);
                    goto label_182;
                }
                catch(IOException iOException3) {
                    httpURLConnection3 = httpURLConnection2;
                }
                catch(Throwable throwable3) {
                    goto label_178;
                }
                try {
                label_171:
                    this.zzR("Network GET connection error", iOException3);
                }
                catch(Throwable throwable3) {
                    goto label_179;
                }
                if(httpURLConnection3 == null) {
                    break;
                }
                httpURLConnection3.disconnect();
                return list2;
            label_178:
                httpURLConnection3 = httpURLConnection2;
            label_179:
                if(httpURLConnection3 != null) {
                    httpURLConnection3.disconnect();
                }
                throw throwable3;
            label_182:
                httpURLConnection2.disconnect();
                if(v4 != 200) {
                    break;
                }
            }
            else {
                String s2 = this.zza(zzek1, false);
                if(s2 == null) {
                    this.zzz().zzb(zzek1, "Error formatting hit for POST upload");
                }
                else {
                    byte[] arr_b2 = s2.getBytes();
                    int v5 = (int)(((Integer)zzeh.zzs.zzb()));
                    if(arr_b2.length > v5) {
                        this.zzz().zzb(zzek1, "Hit payload exceeds size limit");
                    }
                    else {
                        URL uRL2 = this.zzi(zzek1);
                        if(uRL2 == null) {
                            this.zzI("Failed to build collect POST endpoint url");
                            return list2;
                        }
                        if(this.zzg(uRL2, arr_b2, zzek1.zza()) == 200) {
                            goto label_199;
                        }
                        break;
                    }
                }
            }
        label_199:
            ((ArrayList)list2).add(zzek1.zzb());
            if(((ArrayList)list2).size() >= zzcs.zzh()) {
                break;
            }
        }
        return list2;
    }

    @Override  // com.google.android.gms.internal.gtm.zzbr
    public final void zzd() {
        this.zzO("Network initialized. User agent", this.zzb);
    }

    public final boolean zze() {
        k.a();
        this.zzV();
        ConnectivityManager connectivityManager0 = (ConnectivityManager)this.zzo().getSystemService("connectivity");
        try {
            NetworkInfo networkInfo0 = null;
            networkInfo0 = connectivityManager0.getActiveNetworkInfo();
        }
        catch(SecurityException unused_ex) {
        }
        if(networkInfo0 != null && networkInfo0.isConnected()) {
            return true;
        }
        this.zzN("No network connectivity");
        return false;
    }

    public static byte[] zzf() {
        return zzer.zza;
    }

    private final int zzg(URL uRL0, byte[] arr_b, int v) {
        int v1;
        HttpURLConnection httpURLConnection0;
        OutputStream outputStream0;
        r.j(uRL0);
        r.j(arr_b);
        this.zzG("POST bytes, url", ((int)arr_b.length), uRL0);
        if(zzbq.zzU()) {
            this.zzO("Post payload\n", new String(arr_b));
        }
        try {
            outputStream0 = null;
            httpURLConnection0 = null;
            httpURLConnection0 = this.zzb(uRL0);
            goto label_12;
        }
        catch(IOException iOException0) {
        }
        catch(Throwable throwable0) {
            goto label_40;
        }
        OutputStream outputStream1 = null;
        goto label_30;
        try {
        label_12:
            httpURLConnection0.setDoOutput(true);
            httpURLConnection0.setFixedLengthStreamingMode(arr_b.length);
            httpURLConnection0.connect();
            outputStream0 = httpURLConnection0.getOutputStream();
            outputStream0.write(arr_b);
            this.zzk(httpURLConnection0);
            v1 = httpURLConnection0.getResponseCode();
            if(v1 == 200) {
                this.zzs().zzi();
                v1 = 200;
            }
            this.zzF("POST status", v1);
            goto label_48;
        label_27:
            OutputStream outputStream2 = outputStream0;
            outputStream0 = httpURLConnection0;
            outputStream1 = outputStream2;
        }
        catch(IOException iOException0) {
            goto label_27;
        }
        catch(Throwable throwable0) {
            goto label_40;
        }
        try {
        label_30:
            this.zzR("Network POST connection error", iOException0);
            v1 = 0;
            OutputStream outputStream3 = outputStream0;
            outputStream0 = outputStream1;
            httpURLConnection0 = outputStream3;
            goto label_48;
        }
        catch(Throwable throwable0) {
            OutputStream outputStream4 = outputStream0;
            outputStream0 = outputStream1;
            httpURLConnection0 = outputStream4;
        }
    label_40:
        if(outputStream0 != null) {
            try {
                outputStream0.close();
            }
            catch(IOException iOException1) {
                this.zzJ("Error closing http post connection output stream", iOException1);
            }
        }
        if(httpURLConnection0 != null) {
            httpURLConnection0.disconnect();
        }
        throw throwable0;
    label_48:
        if(outputStream0 != null) {
            try {
                outputStream0.close();
            }
            catch(IOException iOException2) {
                this.zzJ("Error closing http post connection output stream", iOException2);
            }
        }
        if(httpURLConnection0 != null) {
            httpURLConnection0.disconnect();
        }
        return v1;
    }

    private final URL zzh() {
        String s = zzcs.zzi() + ((String)zzeh.zzn.zzb());
        try {
            return new URL(s);
        }
        catch(MalformedURLException malformedURLException0) {
            this.zzJ("Error trying to parse the hardcoded host url", malformedURLException0);
            return null;
        }
    }

    private final URL zzi(zzek zzek0) {
        String s = zzek0.zzh() ? zzcs.zzi() + zzcs.zzj() : zzcs.zzk() + zzcs.zzj();
        try {
            return new URL(s);
        }
        catch(MalformedURLException malformedURLException0) {
            this.zzJ("Error trying to parse the hardcoded host url", malformedURLException0);
            return null;
        }
    }

    private final URL zzj(zzek zzek0, String s) {
        String s1 = zzek0.zzh() ? zzcs.zzi() + zzcs.zzj() + "?" + s : zzcs.zzk() + zzcs.zzj() + "?" + s;
        try {
            return new URL(s1);
        }
        catch(MalformedURLException malformedURLException0) {
            this.zzJ("Error trying to parse the hardcoded host url", malformedURLException0);
            return null;
        }
    }

    private final void zzk(HttpURLConnection httpURLConnection0) {
        InputStream inputStream0 = null;
        try {
            inputStream0 = httpURLConnection0.getInputStream();
            while(inputStream0.read(new byte[0x400]) > 0) {
            }
        }
        catch(Throwable throwable0) {
            if(inputStream0 != null) {
                try {
                    inputStream0.close();
                }
                catch(IOException iOException0) {
                    this.zzJ("Error closing http connection input stream", iOException0);
                }
            }
            throw throwable0;
        }
        try {
            inputStream0.close();
        }
        catch(IOException iOException1) {
            this.zzJ("Error closing http connection input stream", iOException1);
        }
    }

    private static final void zzl(StringBuilder stringBuilder0, String s, String s1) {
        if(stringBuilder0.length() != 0) {
            stringBuilder0.append('&');
        }
        stringBuilder0.append(URLEncoder.encode(s, "UTF-8"));
        stringBuilder0.append('=');
        stringBuilder0.append(URLEncoder.encode(s1, "UTF-8"));
    }
}


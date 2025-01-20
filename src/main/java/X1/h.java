package X1;

import Bb.F;
import G1.a;
import M5.j;
import R2.k;
import R2.w;
import Y1.b;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import s.f;
import v7.d;

public final class h {
    public final ReentrantReadWriteLock a;
    public final f b;
    public volatile int c;
    public final Handler d;
    public final j e;
    public final g f;
    public final d g;
    public final int h;
    public final X1.d i;
    public static final Object j;
    public static volatile h k;

    static {
        h.j = new Object();
    }

    public h(q q0) {
        ReentrantReadWriteLock reentrantReadWriteLock0 = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock0;
        this.c = 3;
        g g0 = q0.a;
        this.f = g0;
        int v = q0.b;
        this.h = v;
        this.i = q0.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new f(0);
        this.g = new d(13);
        j j0 = new j(this);
        this.e = j0;
        reentrantReadWriteLock0.writeLock().lock();
        if(v == 0) {
            this.c = 0;
        }
        reentrantReadWriteLock0.writeLock().unlock();
        if(this.b() == 0) {
            try {
                g0.a(new e(j0));
            }
            catch(Throwable throwable0) {
                this.e(throwable0);
            }
        }
    }

    public static h a() {
        synchronized(h.j) {
            h h0 = h.k;
            if(h0 != null) {
                return h0;
            }
        }
        throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK\'s manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
    }

    public final int b() {
        this.a.readLock().lock();
        int v = this.c;
        this.a.readLock().unlock();
        return v;
    }

    public static boolean c() {
        return h.k != null;
    }

    public final void d() {
        if(this.h != 1) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if(this.b() == 1) {
            return;
        }
        this.a.writeLock().lock();
        if(this.c == 0) {
            this.a.writeLock().unlock();
            return;
        }
        this.c = 0;
        this.a.writeLock().unlock();
        h h0 = (h)this.e.a;
        try {
            e e0 = new e(this.e);
            h0.f.a(e0);
        }
        catch(Throwable throwable0) {
            h0.e(throwable0);
        }
    }

    public final void e(Throwable throwable0) {
        ArrayList arrayList0 = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList0.addAll(this.b);
            this.b.clear();
        }
        finally {
            this.a.writeLock().unlock();
        }
        a a0 = new a(arrayList0, this.c, throwable0);
        this.d.post(a0);
    }

    public final CharSequence f(int v, int v1, int v2, CharSequence charSequence0) {
        x x1;
        if(this.b() != 1) {
            throw new IllegalStateException("Not initialized yet");
        }
        if(v < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if(v1 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        F.l("start should be <= than end", v <= v1);
        x x0 = null;
        if(charSequence0 == null) {
            return null;
        }
        F.l("start should be < than charSequence length", v <= charSequence0.length());
        F.l("end should be < than charSequence length", v1 <= charSequence0.length());
        if(charSequence0.length() != 0 && v != v1) {
            w w0 = (w)this.e.b;
            w0.getClass();
            if(charSequence0 instanceof t) {
                ((t)charSequence0).a();
            }
            try {
                Class class0 = v.class;
                if(charSequence0 instanceof t) {
                    x0 = new x(((Spannable)charSequence0));
                }
                else if(charSequence0 instanceof Spannable) {
                    x0 = new x(((Spannable)charSequence0));
                }
                else if(charSequence0 instanceof Spanned && ((Spanned)charSequence0).nextSpanTransition(v - 1, v1 + 1, class0) <= v1) {
                    x0 = new x();  // initializer: Ljava/lang/Object;-><init>()V
                    x0.X = false;
                    x0.Y = new SpannableString(charSequence0);
                }
                if(x0 != null) {
                    v[] arr_v = (v[])x0.Y.getSpans(v, v1, class0);
                    if(arr_v != null && arr_v.length > 0) {
                        for(int v3 = 0; v3 < arr_v.length; ++v3) {
                            v v4 = arr_v[v3];
                            int v5 = x0.Y.getSpanStart(v4);
                            int v6 = x0.Y.getSpanEnd(v4);
                            if(v5 != v1) {
                                x0.removeSpan(v4);
                            }
                            v = Math.min(v5, v);
                            v1 = Math.max(v6, v1);
                        }
                    }
                }
                if(v == v1 || v >= charSequence0.length()) {
                    goto label_53;
                }
                else {
                    x1 = (x)w0.A(charSequence0, v, v1, 0x7FFFFFFF, v2 == 1, new k(x0, 8, ((d)w0.Y)));
                    if(x1 != null) {
                        goto label_47;
                    label_44:
                        if(!(charSequence0 instanceof t)) {
                            throw throwable0;
                        }
                        goto label_45;
                    }
                    goto label_51;
                }
                goto label_55;
            }
            catch(Throwable throwable0) {
                goto label_44;
            }
        label_45:
            ((t)charSequence0).b();
            throw throwable0;
        label_47:
            Spannable spannable0 = x1.Y;
            if(charSequence0 instanceof t) {
                ((t)charSequence0).b();
            }
            return spannable0;
        label_51:
            if(!(charSequence0 instanceof t)) {
                return charSequence0;
            }
            goto label_55;
        label_53:
            if(!(charSequence0 instanceof t)) {
                return charSequence0;
            }
        label_55:
            ((t)charSequence0).b();
            return charSequence0;
        }
        return charSequence0;
    }

    public final void g(X1.f f0) {
        F.n(f0, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if(this.c == 1 || this.c == 2) {
                int v1 = this.c;
                a a0 = new a(Arrays.asList(new X1.f[]{f0}), v1, null);
                this.d.post(a0);
            }
            else {
                this.b.add(f0);
            }
        }
        finally {
            this.a.writeLock().unlock();
        }
    }

    public final void h(EditorInfo editorInfo0) {
        if(this.b() == 1 && editorInfo0 != null) {
            if(editorInfo0.extras == null) {
                editorInfo0.extras = new Bundle();
            }
            this.e.getClass();
            Bundle bundle0 = editorInfo0.extras;
            b b0 = (b)((R2.h)this.e.c).a;
            int v = b0.a(4);
            bundle0.putInt("android.support.text.emoji.emojiCompat_metadataVersion", (v == 0 ? 0 : ((ByteBuffer)b0.b0).getInt(v + b0.X)));
            Bundle bundle1 = editorInfo0.extras;
            ((h)this.e.a).getClass();
            bundle1.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }
}


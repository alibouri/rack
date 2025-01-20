package i0;

import E7.n;
import G0.J0;
import M0.i;
import M0.o;
import M0.q;
import Nb.j;
import O0.f;
import android.os.Build.VERSION;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest.Builder;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import hb.h;
import java.util.List;
import java.util.function.Consumer;
import kotlin.jvm.functions.Function1;

public final class b {
    public static final b a;

    static {
        b.a = new b();  // initializer: Ljava/lang/Object;-><init>()V
    }

    public static void a(AndroidContentCaptureManager androidContentCaptureManager0, LongSparseArray longSparseArray0) {
        for(int v = 0; v < longSparseArray0.size(); ++v) {
            long v1 = longSparseArray0.keyAt(v);
            ViewTranslationResponse viewTranslationResponse0 = a.c(longSparseArray0.get(v1));
            if(viewTranslationResponse0 != null) {
                TranslationResponseValue translationResponseValue0 = a.b(viewTranslationResponse0);
                if(translationResponseValue0 != null) {
                    CharSequence charSequence0 = translationResponseValue0.getText();
                    if(charSequence0 != null) {
                        J0 j00 = (J0)androidContentCaptureManager0.c().f(((int)v1));
                        if(j00 != null) {
                            o o0 = j00.a;
                            if(o0 != null) {
                                Object object0 = o0.d.X.get(i.j);
                                if(object0 == null) {
                                    object0 = null;
                                }
                                if(((M0.a)object0) != null) {
                                    Function1 function10 = (Function1)((M0.a)object0).b;
                                    if(function10 != null) {
                                        Boolean boolean0 = (Boolean)function10.n(new f(6, charSequence0.toString(), null));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void b(AndroidContentCaptureManager androidContentCaptureManager0, long[] arr_v, int[] arr_v1, Consumer consumer0) {
        for(int v = 0; v < arr_v.length; ++v) {
            long v1 = arr_v[v];
            J0 j00 = (J0)androidContentCaptureManager0.c().f(((int)v1));
            if(j00 != null) {
                o o0 = j00.a;
                if(o0 != null) {
                    ViewTranslationRequest.Builder viewTranslationRequest$Builder0 = E3.i.n(androidContentCaptureManager0.X.getAutofillId(), ((long)o0.g));
                    Object object0 = o0.d.X.get(q.u);
                    if(object0 == null) {
                        object0 = null;
                    }
                    if(((List)object0) != null) {
                        String s = h.O(((List)object0), "\n", null, 62);
                        if(s != null) {
                            E3.i.A(viewTranslationRequest$Builder0, TranslationRequestValue.forText(new f(6, s, null)));
                            consumer0.accept(viewTranslationRequest$Builder0.build());
                        }
                    }
                }
            }
        }
    }

    public final void c(AndroidContentCaptureManager androidContentCaptureManager0, LongSparseArray longSparseArray0) {
        if(Build.VERSION.SDK_INT < 0x1F) {
            return;
        }
        if(j.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            b.a(androidContentCaptureManager0, longSparseArray0);
            return;
        }
        n n0 = new n(androidContentCaptureManager0, 27, longSparseArray0);
        androidContentCaptureManager0.X.post(n0);
    }
}


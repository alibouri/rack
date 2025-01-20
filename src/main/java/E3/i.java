package E3;

import android.app.job.JobInfo.Builder;
import android.content.ClipData;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.ContentInfo.Builder;
import android.view.ContentInfo;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest.Builder;

public abstract class i {
    public static void A(ViewTranslationRequest.Builder viewTranslationRequest$Builder0, TranslationRequestValue translationRequestValue0) {
        viewTranslationRequest$Builder0.setValue("android:text", translationRequestValue0);
    }

    public static ContentInfo.Builder g(ClipData clipData0, int v) {
        return new ContentInfo.Builder(clipData0, v);
    }

    public static ContentInfo i(Object object0) [...] // Inlined contents

    public static ScrollCaptureSession j(Object object0) [...] // Inlined contents

    public static ScrollCaptureTarget k(View view0, Rect rect0, Point point0, ScrollCaptureCallback scrollCaptureCallback0) {
        return new ScrollCaptureTarget(view0, rect0, point0, scrollCaptureCallback0);
    }

    public static ViewTranslationRequest.Builder n(AutofillId autofillId0, long v) {
        return new ViewTranslationRequest.Builder(autofillId0, v);
    }

    public static void p(JobInfo.Builder jobInfo$Builder0) {
        jobInfo$Builder0.setExpedited(true);
    }
}


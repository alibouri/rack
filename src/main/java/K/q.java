package K;

import android.app.job.JobScheduler;
import android.text.GraphemeClusterSegmentFinder;
import android.text.SegmentFinder;
import android.text.TextPaint;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.SelectGesture;

public abstract class q {
    public static JobScheduler c(JobScheduler jobScheduler0) {
        return jobScheduler0.forNamespace("androidx.work.systemjobscheduler");
    }

    public static GraphemeClusterSegmentFinder h(CharSequence charSequence0, TextPaint textPaint0) {
        return new GraphemeClusterSegmentFinder(charSequence0, textPaint0);
    }

    public static SegmentFinder i(Object object0) {
        return (SegmentFinder)object0;
    }

    public static HandwritingGesture j(Object object0) [...] // Inlined contents

    public static SelectGesture k(Object object0) [...] // Inlined contents

    public static void n() {
    }

    public static boolean o(Object object0) {
        return object0 instanceof SelectGesture;
    }
}


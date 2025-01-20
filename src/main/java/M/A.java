package m;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

public final class a implements TransformationMethod {
    public Locale a;

    @Override  // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence0, View view0) {
        return charSequence0 != null ? charSequence0.toString().toUpperCase(this.a) : null;
    }

    @Override  // android.text.method.TransformationMethod
    public final void onFocusChanged(View view0, CharSequence charSequence0, boolean z, int v, Rect rect0) {
    }
}


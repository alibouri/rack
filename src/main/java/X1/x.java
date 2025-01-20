package X1;

import L7.b;
import android.os.Build.VERSION;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

public final class x implements Spannable {
    public boolean X;
    public Spannable Y;

    public x(Spannable spannable0) {
        this.X = false;
        this.Y = spannable0;
    }

    public final void a() {
        Spannable spannable0 = this.Y;
        if(!this.X) {
            b b0 = Build.VERSION.SDK_INT < 28 ? new b(14) : new w(14);  // initializer: LL7/b;-><init>(I)V
            if(b0.q(spannable0)) {
                this.Y = new SpannableString(spannable0);
            }
        }
        this.X = true;
    }

    @Override
    public final char charAt(int v) {
        return this.Y.charAt(v);
    }

    @Override
    public final IntStream chars() {
        return this.Y.chars();
    }

    @Override
    public final IntStream codePoints() {
        return this.Y.codePoints();
    }

    @Override  // android.text.Spanned
    public final int getSpanEnd(Object object0) {
        return this.Y.getSpanEnd(object0);
    }

    @Override  // android.text.Spanned
    public final int getSpanFlags(Object object0) {
        return this.Y.getSpanFlags(object0);
    }

    @Override  // android.text.Spanned
    public final int getSpanStart(Object object0) {
        return this.Y.getSpanStart(object0);
    }

    @Override  // android.text.Spanned
    public final Object[] getSpans(int v, int v1, Class class0) {
        return this.Y.getSpans(v, v1, class0);
    }

    @Override
    public final int length() {
        return this.Y.length();
    }

    @Override  // android.text.Spanned
    public final int nextSpanTransition(int v, int v1, Class class0) {
        return this.Y.nextSpanTransition(v, v1, class0);
    }

    @Override  // android.text.Spannable
    public final void removeSpan(Object object0) {
        this.a();
        this.Y.removeSpan(object0);
    }

    @Override  // android.text.Spannable
    public final void setSpan(Object object0, int v, int v1, int v2) {
        this.a();
        this.Y.setSpan(object0, v, v1, v2);
    }

    @Override
    public final CharSequence subSequence(int v, int v1) {
        return this.Y.subSequence(v, v1);
    }

    @Override
    public final String toString() {
        return this.Y.toString();
    }
}


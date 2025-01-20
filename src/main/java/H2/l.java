package H2;

import android.content.Context;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

public final class l extends RecyclerView {
    public final ViewPager2 K1;

    public l(ViewPager2 viewPager20, Context context0) {
        this.K1 = viewPager20;
        super(context0, null);
    }

    @Override  // androidx.recyclerview.widget.RecyclerView
    public final CharSequence getAccessibilityClassName() {
        this.K1.u0.getClass();
        return super.getAccessibilityClassName();
    }

    @Override  // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent0) {
        super.onInitializeAccessibilityEvent(accessibilityEvent0);
        accessibilityEvent0.setFromIndex(this.K1.e0);
        accessibilityEvent0.setToIndex(this.K1.e0);
        accessibilityEvent0.setSource(this.K1.u0.d);
        accessibilityEvent0.setClassName("androidx.viewpager.widget.ViewPager");
    }

    // Deobfuscation rating: LOW(20)
    @Override  // androidx.recyclerview.widget.RecyclerView
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        return this.K1.s0 && super.onInterceptTouchEvent(motionEvent0);
    }

    // Deobfuscation rating: LOW(20)
    @Override  // androidx.recyclerview.widget.RecyclerView
    public final boolean onTouchEvent(MotionEvent motionEvent0) {
        return this.K1.s0 && super.onTouchEvent(motionEvent0);
    }
}


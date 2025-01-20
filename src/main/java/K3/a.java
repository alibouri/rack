package k3;

import Nb.j;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;

public final class a implements DefaultLifecycleObserver, b {
    public boolean X;
    public final ImageView Y;

    public a(ImageView imageView0) {
        this.Y = imageView0;
    }

    @Override  // k3.b
    public final void a(Drawable drawable0) {
        this.g(drawable0);
    }

    @Override  // k3.b
    public final void c(Drawable drawable0) {
        this.g(drawable0);
    }

    @Override  // k3.b
    public final void d(Drawable drawable0) {
        this.g(drawable0);
    }

    public final void e() {
        Drawable drawable0 = this.Y.getDrawable();
        Animatable animatable0 = drawable0 instanceof Animatable ? ((Animatable)drawable0) : null;
        if(animatable0 == null) {
            return;
        }
        if(this.X) {
            animatable0.start();
            return;
        }
        animatable0.stop();
    }

    // Deobfuscation rating: LOW(30)
    @Override
    public final boolean equals(Object object0) {
        return this == object0 ? true : object0 instanceof a && j.a(this.Y, ((a)object0).Y);
    }

    public final void g(Drawable drawable0) {
        ImageView imageView0 = this.Y;
        Drawable drawable1 = imageView0.getDrawable();
        Animatable animatable0 = drawable1 instanceof Animatable ? ((Animatable)drawable1) : null;
        if(animatable0 != null) {
            animatable0.stop();
        }
        imageView0.setImageDrawable(drawable0);
        this.e();
    }

    @Override
    public final int hashCode() {
        return this.Y.hashCode();
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner0) {
        androidx.lifecycle.a.a(this, lifecycleOwner0);
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner0) {
        androidx.lifecycle.a.b(this, lifecycleOwner0);
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner0) {
        androidx.lifecycle.a.c(this, lifecycleOwner0);
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner0) {
        androidx.lifecycle.a.d(this, lifecycleOwner0);
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner0) {
        this.X = true;
        this.e();
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner0) {
        this.X = false;
        this.e();
    }
}


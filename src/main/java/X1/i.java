package X1;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.a;

public final class i implements DefaultLifecycleObserver {
    public final Lifecycle X;
    public final EmojiCompatInitializer Y;

    public i(EmojiCompatInitializer emojiCompatInitializer0, Lifecycle lifecycle0) {
        this.Y = emojiCompatInitializer0;
        this.X = lifecycle0;
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public final void onCreate(LifecycleOwner lifecycleOwner0) {
        a.a(this, lifecycleOwner0);
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner0) {
        a.b(this, lifecycleOwner0);
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner0) {
        a.c(this, lifecycleOwner0);
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner0) {
        this.Y.getClass();
        (Build.VERSION.SDK_INT < 28 ? new Handler(Looper.getMainLooper()) : b.a(Looper.getMainLooper())).postDelayed(new l(0), 500L);
        this.X.c(this);
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner0) {
        a.e(this, lifecycleOwner0);
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner lifecycleOwner0) {
        a.f(this, lifecycleOwner0);
    }
}


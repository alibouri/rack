package kc;

import android.os.MessageQueue.IdleHandler;
import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalFocusChangeListener;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class f implements MessageQueue.IdleHandler, View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalFocusChangeListener {
    public final InputMethodManager X;
    public final Field Y;
    public final Field Z;
    public final Method b0;

    public f(InputMethodManager inputMethodManager0, Field field0, Field field1, Method method0) {
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view0, View view1) {
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view0) {
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view0) {
    }

    @Override  // android.os.MessageQueue$IdleHandler
    public final boolean queueIdle() {
    }
}


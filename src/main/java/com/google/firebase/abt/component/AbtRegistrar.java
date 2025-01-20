package com.google.firebase.abt.component;

import a5.w;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import m7.a;
import m7.b;
import m7.c;
import m7.i;

@Keep
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    @Override  // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        a a0 = b.a(b7.a.class);
        a0.a = "fire-abt";
        a0.a(i.b(Context.class));
        a0.a(i.a(d7.b.class));
        a0.g = new T9.b(16);
        return Arrays.asList(new b[]{a0.b(), w.x("fire-abt", "21.1.1")});
    }

    private static b7.a lambda$getComponents$0(c c0) {
        return new b7.a(((Context)c0.a(Context.class)), c0.l(d7.b.class));
    }
}


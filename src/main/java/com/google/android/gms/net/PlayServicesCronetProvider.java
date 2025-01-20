package com.google.android.gms.net;

import K5.d;
import N5.r;
import W5.e;
import android.content.Context;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.apps.common.proguard.UsedByReflection;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import k6.a;
import org.chromium.net.CronetEngine.Builder;
import org.chromium.net.CronetProvider;
import org.chromium.net.ICronetEngineBuilder;

@Keep
public class PlayServicesCronetProvider extends CronetProvider {
    private static final String NATIVE_CRONET_ENGINE_BUILDER_IMPL = "org.chromium.net.impl.NativeCronetEngineBuilderImpl";
    private static final String TAG = "PlayServicesCronet";

    @UsedByReflection("CronetAPI")
    public PlayServicesCronetProvider(Context context0) {
        super(context0);
    }

    @Override  // org.chromium.net.CronetProvider
    @Keep
    public Builder createBuilder() {
        e e1;
        Builder cronetEngine$Builder0;
        ClassNotFoundException classNotFoundException0;
        try {
            a.b(this.mContext);
            classNotFoundException0 = null;
        }
        catch(K5.e e0) {
            throw new IllegalStateException("Google Play Services Cronet provider is not enabled. Call com.google.android.gms.net.CronetProviderInstaller.installIfNeeded(Context) to enable it.", e0);
        }
        catch(d d0) {
            throw new IllegalStateException("Google Play Services Cronet provider is unavailable on this device.", d0);
        }
        try {
            synchronized(a.b) {
                e1 = a.c;
            }
            r.j(e1);
            ClassLoader classLoader0 = e1.a.getClassLoader();
            r.j(classLoader0);
            cronetEngine$Builder0 = new org.chromium.net.ExperimentalCronetEngine.Builder(((ICronetEngineBuilder)classLoader0.loadClass("org.chromium.net.impl.NativeCronetEngineBuilderImpl").asSubclass(ICronetEngineBuilder.class).getConstructor(Context.class).newInstance(this.mContext)));
        }
        catch(ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException classNotFoundException1) {
            cronetEngine$Builder0 = null;
            classNotFoundException0 = classNotFoundException1;
        }
        if(classNotFoundException0 != null) {
            throw new RuntimeException("Unable to construct the implementation of the Cronet Engine Builder: org.chromium.net.impl.NativeCronetEngineBuilderImpl", classNotFoundException0);
        }
        r.k(cronetEngine$Builder0, "The value of the constructed builder should never be null");
        return cronetEngine$Builder0;
    }

    // Deobfuscation rating: LOW(20)
    @Override
    public boolean equals(Object object0) {
        return object0 == this || object0 instanceof PlayServicesCronetProvider && this.mContext.equals(((PlayServicesCronetProvider)object0).mContext);
    }

    @Override  // org.chromium.net.CronetProvider
    @Keep
    public String getName() {
        return "Google-Play-Services-Cronet-Provider";
    }

    @Override  // org.chromium.net.CronetProvider
    @Keep
    public String getVersion() {
        this.tryToInstallCronetProvider();
        synchronized(a.b) {
        }
        return a.d;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(new Object[]{PlayServicesCronetProvider.class, this.mContext});
    }

    @Override  // org.chromium.net.CronetProvider
    @Keep
    public boolean isEnabled() {
        this.tryToInstallCronetProvider();
        synchronized(a.b) {
        }
        return a.c != null;
    }

    private void tryToInstallCronetProvider() {
        try {
            a.b(this.mContext);
        }
        catch(K5.e unused_ex) {
            if(Log.isLoggable("PlayServicesCronet", 4)) {
                Log.i("PlayServicesCronet", "Google-Play-Services-Cronet-Provider is not installed yet.");
            }
        }
        catch(d unused_ex) {
            if(Log.isLoggable("PlayServicesCronet", 4)) {
                Log.i("PlayServicesCronet", "Google-Play-Services-Cronet-Provider is unavailable.");
            }
        }
    }
}


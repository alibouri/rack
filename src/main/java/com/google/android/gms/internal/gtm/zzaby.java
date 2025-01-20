package com.google.android.gms.internal.gtm;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzaby {
    public abstract zzabq zza();

    public static zzabq zzb(Class class0) {
        zzaby zzaby0;
        String s;
        Class class1 = zzaby.class;
        ClassLoader classLoader0 = class1.getClassLoader();
        if(class0.equals(zzabq.class)) {
            s = "com.google.android.gms.internal.gtm.zzyn";
            goto label_7;
        }
        if(class0.getPackage().equals(class1.getPackage())) {
            s = class0.getPackage().getName() + ".BlazeGenerated" + class0.getSimpleName() + "Loader";
            try {
            label_7:
                Class class2 = Class.forName(s, true, classLoader0);
                try {
                    zzaby0 = (zzaby)class2.getConstructor(null).newInstance(null);
                }
                catch(NoSuchMethodException noSuchMethodException0) {
                    throw new IllegalStateException(noSuchMethodException0);
                }
                catch(InstantiationException instantiationException0) {
                    throw new IllegalStateException(instantiationException0);
                }
                catch(IllegalAccessException illegalAccessException0) {
                    throw new IllegalStateException(illegalAccessException0);
                }
                catch(InvocationTargetException invocationTargetException0) {
                    throw new IllegalStateException(invocationTargetException0);
                }
                return (zzabq)class0.cast(zzaby0.zza());
            }
            catch(ClassNotFoundException unused_ex) {
                Iterator iterator0 = Collections.singletonList(new zzafb()).iterator();
                ArrayList arrayList0 = new ArrayList();
                while(iterator0.hasNext()) {
                    try {
                        Object object0 = iterator0.next();
                        arrayList0.add(((zzabq)class0.cast(((zzaby)object0).zza())));
                    }
                    catch(ServiceConfigurationError serviceConfigurationError0) {
                        Level level0 = Level.SEVERE;
                        Logger.getLogger(zzzi.class.getName()).logp(level0, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load " + class0.getSimpleName(), serviceConfigurationError0);
                    }
                }
                switch(arrayList0.size()) {
                    case 0: {
                        return null;
                    }
                    case 1: {
                        return (zzabq)arrayList0.get(0);
                    }
                    default: {
                        try {
                            return (zzabq)class0.getMethod("combine", Collection.class).invoke(null, arrayList0);
                        }
                        catch(NoSuchMethodException noSuchMethodException1) {
                            throw new IllegalStateException(noSuchMethodException1);
                        }
                        catch(IllegalAccessException illegalAccessException1) {
                            throw new IllegalStateException(illegalAccessException1);
                        }
                        catch(InvocationTargetException invocationTargetException1) {
                            throw new IllegalStateException(invocationTargetException1);
                        }
                    }
                }
            }
        }
        throw new IllegalArgumentException(class0.getName());
    }
}


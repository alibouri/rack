package m7;

import M.J;
import Z6.g;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.lang.reflect.InvocationTargetException;
import x7.a;
import z7.b;

public final class d implements a {
    public final int a;
    public final Object b;

    public d(int v, Object object0) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // x7.a
    public final Object get() {
        switch(this.a) {
            case 0: {
                String s = (String)this.b;
                try {
                    Class class0 = Class.forName(s);
                    if(!ComponentRegistrar.class.isAssignableFrom(class0)) {
                        throw new l("Class " + s + " is not an instance of com.google.firebase.components.ComponentRegistrar");  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                    }
                    return (ComponentRegistrar)class0.getDeclaredConstructor(null).newInstance(null);
                }
                catch(ClassNotFoundException unused_ex) {
                }
                catch(IllegalAccessException illegalAccessException0) {
                    throw new l(J.e("Could not instantiate ", s, "."), illegalAccessException0);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
                }
                catch(InstantiationException instantiationException0) {
                    throw new l(J.e("Could not instantiate ", s, "."), instantiationException0);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
                }
                catch(NoSuchMethodException noSuchMethodException0) {
                    throw new l("Could not instantiate " + s, noSuchMethodException0);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
                }
                catch(InvocationTargetException invocationTargetException0) {
                    throw new l("Could not instantiate " + s, invocationTargetException0);  // initializer: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
                }
                Log.w("ComponentDiscovery", "Class " + s + " is not an found.");
                return null;
            }
            case 1: {
                return (ComponentRegistrar)this.b;
            }
            default: {
                return new b(((g)this.b));
            }
        }
    }
}


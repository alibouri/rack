package W5;

import dalvik.system.PathClassLoader;

public final class g extends PathClassLoader {
    @Override
    public final Class loadClass(String s, boolean z) {
        if(!s.startsWith("java.") && !s.startsWith("android.")) {
            try {
                return this.findClass(s);
            }
            catch(ClassNotFoundException unused_ex) {
            }
        }
        return super.loadClass(s, z);
    }
}


package j2;

import android.os.Build.VERSION;
import android.util.Log;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public abstract class a {
    public static final HashSet a;
    public static final boolean b;

    static {
        a.a = new HashSet();
        String s = System.getProperty("java.vm.version");
        boolean z = false;
        if(s != null) {
            StringTokenizer stringTokenizer0 = new StringTokenizer(s, ".");
            String s1 = null;
            String s2 = stringTokenizer0.hasMoreTokens() ? stringTokenizer0.nextToken() : null;
            if(stringTokenizer0.hasMoreTokens()) {
                s1 = stringTokenizer0.nextToken();
            }
            if(s2 != null && s1 != null) {
                try {
                    int v = Integer.parseInt(s2);
                    if(v > 2 || v == 2 && Integer.parseInt(s1) >= 1) {
                        z = true;
                    }
                }
                catch(NumberFormatException unused_ex) {
                }
            }
        }
        Log.i("MultiDex", "VM with version " + s + (z ? " has multidex support" : " does not have multidex support"));
        a.b = z;
    }

    public static void a(b b0) {
        File file0 = new File(b0.getFilesDir(), "secondary-dexes");
        if(file0.isDirectory()) {
            Log.i("MultiDex", "Clearing old secondary dex dir (" + file0.getPath() + ").");
            File[] arr_file = file0.listFiles();
            if(arr_file == null) {
                Log.w("MultiDex", "Failed to list secondary dex dir content (" + file0.getPath() + ").");
                return;
            }
            for(int v = 0; v < arr_file.length; ++v) {
                File file1 = arr_file[v];
                Log.i("MultiDex", "Trying to delete old file " + file1.getPath() + " of size " + file1.length());
                if(file1.delete()) {
                    Log.i("MultiDex", "Deleted old file " + file1.getPath());
                }
                else {
                    Log.w("MultiDex", "Failed to delete old file " + file1.getPath());
                }
            }
            if(!file0.delete()) {
                Log.w("MultiDex", "Failed to delete secondary dex dir " + file0.getPath());
                return;
            }
            Log.i("MultiDex", "Deleted old secondary dex dir " + file0.getPath());
        }
    }

    public static void b(b b0, File file0, File file1) {
        IOException iOException0;
        ClassLoader classLoader0;
        HashSet hashSet0 = a.a;
        synchronized(hashSet0) {
            if(hashSet0.contains(file0)) {
                return;
            }
            hashSet0.add(file0);
            Log.w("MultiDex", "MultiDex is not guaranteed to work in SDK version " + Build.VERSION.SDK_INT + ": SDK version higher than 20 should be backed by runtime with built-in multidex capabilty but it\'s not the case here: java.vm.version=\"" + System.getProperty("java.vm.version") + "\"");
            iOException0 = null;
            try {
                classLoader0 = b0.getClassLoader();
            }
            catch(RuntimeException runtimeException0) {
                Log.w("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", runtimeException0);
                classLoader0 = null;
                goto label_20;
            }
            if(!(classLoader0 instanceof BaseDexClassLoader)) {
                Log.e("MultiDex", "Context class loader is null or not dex-capable. Must be running in test mode. Skip patching.");
                classLoader0 = null;
            }
        label_20:
            if(classLoader0 == null) {
                return;
            }
            try {
                a.a(b0);
            }
            catch(Throwable throwable0) {
                Log.w("MultiDex", "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning.", throwable0);
            }
            File file2 = new File(file1, "code_cache");
            try {
                a.e(file2);
            }
            catch(IOException unused_ex) {
                file2 = new File(b0.getFilesDir(), "code_cache");
                a.e(file2);
            }
            File file3 = new File(file2, "secondary-dexes");
            a.e(file3);
            e e0 = new e(file0, file3);
            try {
                ArrayList arrayList0 = e0.h(b0, false);
                try {
                    a.d(((BaseDexClassLoader)classLoader0), file3, arrayList0);
                    goto label_46;
                }
                catch(IOException iOException1) {
                }
                Log.w("MultiDex", "Failed to install extracted secondary dex files, retrying with forced extraction", iOException1);
                a.d(((BaseDexClassLoader)classLoader0), file3, e0.h(b0, true));
            }
            catch(Throwable throwable1) {
                try {
                    e0.close();
                }
                catch(IOException unused_ex) {
                }
                throw throwable1;
            }
            try {
            label_46:
                e0.close();
            }
            catch(IOException iOException0) {
            }
            if(iOException0 == null) {
                return;
            }
        }
        throw iOException0;
    }

    public static Field c(Object object0, String s) {
        Field field0;
        Class class0 = object0.getClass();
        while(class0 != null) {
            try {
                field0 = class0.getDeclaredField(s);
                if(field0.isAccessible()) {
                    return field0;
                }
                field0.setAccessible(true);
                return field0;
            }
            catch(NoSuchFieldException unused_ex) {
                class0 = class0.getSuperclass();
                continue;
            }
            return field0;
        }
        StringBuilder stringBuilder0 = com.apollographql.apollo.api.b.s("Field ", s, " not found in ");
        stringBuilder0.append(object0.getClass());
        throw new NoSuchFieldException(stringBuilder0.toString());
    }

    public static void d(BaseDexClassLoader baseDexClassLoader0, File file0, ArrayList arrayList0) {
        IOException[] arr_iOException1;
        Method method0;
        if(!arrayList0.isEmpty()) {
            Object object0 = a.c(baseDexClassLoader0, "pathList").get(baseDexClassLoader0);
            ArrayList arrayList1 = new ArrayList();
            ArrayList arrayList2 = new ArrayList(arrayList0);
            Class[] arr_class = {ArrayList.class, File.class, ArrayList.class};
            Class class0 = object0.getClass();
            while(class0 != null) {
                try {
                    method0 = class0.getDeclaredMethod("makeDexElements", arr_class);
                    if(method0.isAccessible()) {
                        goto label_13;
                    }
                    method0.setAccessible(true);
                }
                catch(NoSuchMethodException unused_ex) {
                    class0 = class0.getSuperclass();
                    continue;
                }
            label_13:
                Object[] arr_object = (Object[])method0.invoke(object0, arrayList2, file0, arrayList1);
                Field field0 = a.c(object0, "dexElements");
                Object[] arr_object1 = (Object[])field0.get(object0);
                Object[] arr_object2 = (Object[])Array.newInstance(arr_object1.getClass().getComponentType(), arr_object1.length + arr_object.length);
                System.arraycopy(arr_object1, 0, arr_object2, 0, arr_object1.length);
                System.arraycopy(arr_object, 0, arr_object2, arr_object1.length, arr_object.length);
                field0.set(object0, arr_object2);
                if(arrayList1.size() > 0) {
                    for(Object object1: arrayList1) {
                        Log.w("MultiDex", "Exception in makeDexElement", ((IOException)object1));
                    }
                    Field field1 = a.c(object0, "dexElementsSuppressedExceptions");
                    IOException[] arr_iOException = (IOException[])field1.get(object0);
                    if(arr_iOException == null) {
                        arr_iOException1 = (IOException[])arrayList1.toArray(new IOException[arrayList1.size()]);
                    }
                    else {
                        IOException[] arr_iOException2 = new IOException[arrayList1.size() + arr_iOException.length];
                        arrayList1.toArray(arr_iOException2);
                        System.arraycopy(arr_iOException, 0, arr_iOException2, arrayList1.size(), arr_iOException.length);
                        arr_iOException1 = arr_iOException2;
                    }
                    field1.set(object0, arr_iOException1);
                    IOException iOException0 = new IOException("I/O exception during makeDexElement");
                    iOException0.initCause(((Throwable)arrayList1.get(0)));
                    throw iOException0;
                }
                return;
            }
            throw new NoSuchMethodException("Method makeDexElements with parameters " + Arrays.asList(arr_class) + " not found in " + object0.getClass());
        }
    }

    public static void e(File file0) {
        file0.mkdir();
        if(!file0.isDirectory()) {
            File file1 = file0.getParentFile();
            if(file1 == null) {
                Log.e("MultiDex", "Failed to create dir " + file0.getPath() + ". Parent file is null.");
            }
            else {
                Log.e("MultiDex", "Failed to create dir " + file0.getPath() + ". parent file is a dir " + file1.isDirectory() + ", a file " + file1.isFile() + ", exists " + file1.exists() + ", readable " + file1.canRead() + ", writable " + file1.canWrite());
            }
            throw new IOException("Failed to create directory " + file0.getPath());
        }
    }
}


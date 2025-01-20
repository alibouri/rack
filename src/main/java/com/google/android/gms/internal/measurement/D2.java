package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.util.HashMap;

public final class d2 implements t2, x2 {
    public final int X;
    public static final d2 Y;

    static {
        d2.Y = new d2(0);
    }

    public d2(int v) {
        this.X = v;
        super();
    }

    @Override  // com.google.android.gms.internal.measurement.t2
    public B2 a(Class class0) {
        if(this.X != 0) {
            throw new IllegalStateException("This should never be called.");
        }
        Class class1 = c2.class;
        if(class1.isAssignableFrom(class0)) {
            try {
                return (B2)c2.d(class0.asSubclass(class1)).e(3);
            }
            catch(Exception exception0) {
                throw new RuntimeException("Unable to get message info for " + class0.getName(), exception0);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: " + class0.getName());
    }

    @Override  // com.google.android.gms.internal.measurement.t2
    public boolean b(Class class0) {
        return this.X == 0 ? c2.class.isAssignableFrom(class0) : false;
    }

    public static int c(D2 d20) {
        return d20.a();
    }

    public static String d(ContentResolver contentResolver0, String s) {
        Uri uri0 = v1.a;
        ContentProviderClient contentProviderClient0 = contentResolver0.acquireUnstableContentProviderClient(uri0);
        if(contentProviderClient0 != null) {
            try(Cursor cursor0 = contentProviderClient0.query(uri0, null, null, new String[]{s}, null)) {
                if(cursor0 == null) {
                    throw new z1("ContentProvider query returned null cursor");  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
                }
                return cursor0.moveToFirst() ? cursor0.getString(1) : null;
            }
            catch(RemoteException remoteException0) {
                throw new z1("ContentProvider query failed", remoteException0);  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
            }
            finally {
                contentProviderClient0.release();
            }
        }
        throw new z1("Unable to acquire ContentProviderClient");  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
    }

    public static HashMap e(ContentResolver contentResolver0, String[] arr_s, d2 d20) {
        HashMap hashMap0;
        Uri uri0 = v1.b;
        ContentProviderClient contentProviderClient0 = contentResolver0.acquireUnstableContentProviderClient(uri0);
        if(contentProviderClient0 != null) {
            try(Cursor cursor0 = contentProviderClient0.query(uri0, null, null, arr_s, null)) {
                if(cursor0 == null) {
                    throw new z1("ContentProvider query returned null cursor");  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
                }
                hashMap0 = new HashMap(cursor0.getCount(), 1.0f);
                while(true) {
                    if(!cursor0.moveToNext()) {
                        break;
                    }
                    hashMap0.put(cursor0.getString(0), cursor0.getString(1));
                }
                if(!cursor0.isAfterLast()) {
                    throw new z1("Cursor read incomplete (ContentProvider dead?)");  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
                }
                return hashMap0;
            }
            catch(RemoteException remoteException0) {
                throw new z1("ContentProvider query failed", remoteException0);  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
            }
            finally {
                contentProviderClient0.release();
            }
        }
        throw new z1("Unable to acquire ContentProviderClient");  // initializer: Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
    }

    public static D2 f(c2 c20) {
        return c20.zzb;
    }

    public static void g(Object object0) {
        D2 d20 = ((c2)object0).zzb;
        if(d20.e) {
            d20.e = false;
        }
    }
}


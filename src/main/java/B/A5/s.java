package a5;

import Bb.q;
import M4.l;
import Nb.j;
import android.content.ContentResolver;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import f5.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;

public final class s {
    public static final s a;
    public static final ArrayList b;
    public static final AtomicBoolean c;

    static {
        s s0 = new s();  // initializer: Ljava/lang/Object;-><init>()V
        s.a = s0;
        s.b = s0.a();
        ArrayList arrayList0 = null;
        if(!a.b(s0)) {
            try {
                ArrayList arrayList1 = q.g(new r[]{new r(0)});
                arrayList1.addAll(s0.a());
                arrayList0 = arrayList1;
            }
            catch(Throwable throwable0) {
                a.a(throwable0, s0);
            }
        }
        s s1 = s.a;
        if(!a.b(s1)) {
            try {
                HashMap hashMap0 = new HashMap();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new r(2));
                hashMap0.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", s.b);
                hashMap0.put("com.facebook.platform.action.request.FEED_DIALOG", s.b);
                hashMap0.put("com.facebook.platform.action.request.LIKE_DIALOG", s.b);
                hashMap0.put("com.facebook.platform.action.request.APPINVITES_DIALOG", s.b);
                hashMap0.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList2);
                hashMap0.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList2);
                hashMap0.put("com.facebook.platform.action.request.CAMERA_EFFECT", arrayList0);
                hashMap0.put("com.facebook.platform.action.request.SHARE_STORY", s.b);
            }
            catch(Throwable throwable1) {
                a.a(throwable1, s1);
            }
        }
        s.c = new AtomicBoolean(false);
    }

    public final ArrayList a() {
        if(a.b(this)) {
            return null;
        }
        try {
            return q.g(new r[]{new r(1), new r(3)});
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
            return null;
        }
    }

    public final TreeSet b(r r0) {
        Cursor cursor1;
        Cursor cursor0;
        ProviderInfo providerInfo0;
        Uri uri1;
        ContentResolver contentResolver0;
        TreeSet treeSet0;
        if(a.b(this)) {
            return null;
        }
        try {
            treeSet0 = new TreeSet();
            contentResolver0 = l.a().getContentResolver();
            if(a.b(this)) {
                goto label_11;
            }
            else {
                goto label_5;
            }
            goto label_12;
        }
        catch(Throwable throwable0) {
            a.a(throwable0, this);
            return null;
        }
        try {
        label_5:
            Uri uri0 = Uri.parse(("content://" + r0.a() + ".provider.PlatformProvider/versions"));
            j.e(uri0, "parse(CONTENT_SCHEME + appInfo.getPackage() + PLATFORM_PROVIDER_VERSIONS)");
            uri1 = uri0;
            goto label_12;
        }
        catch(Throwable throwable1) {
            try {
                a.a(throwable1, this);
            }
            catch(Throwable throwable0) {
                a.a(throwable0, this);
                return null;
            }
        }
    label_11:
        uri1 = null;
        try {
        label_12:
            PackageManager packageManager0 = l.a().getPackageManager();
            try {
                providerInfo0 = packageManager0.resolveContentProvider(r0.a() + ".provider.PlatformProvider", 0);
            }
            catch(RuntimeException runtimeException0) {
                Log.e("a5.s", "Failed to query content resolver.", runtimeException0);
                providerInfo0 = null;
            }
            if(providerInfo0 == null) {
                goto label_41;
            }
            else {
                try {
                    cursor0 = contentResolver0.query(uri1, new String[]{"version"}, null, null, null);
                    goto label_31;
                }
                catch(NullPointerException unused_ex) {
                    Log.e("a5.s", "Failed to query content resolver.");
                }
                catch(SecurityException unused_ex) {
                    Log.e("a5.s", "Failed to query content resolver.");
                }
                catch(IllegalArgumentException unused_ex) {
                    Log.e("a5.s", "Failed to query content resolver.");
                }
                cursor0 = null;
                goto label_31;
            }
            goto label_42;
        }
        catch(Throwable throwable2) {
            cursor1 = null;
            goto label_38;
        }
    label_31:
        if(cursor0 == null) {
            goto label_42;
        }
        else {
            try {
                while(true) {
                    if(!cursor0.moveToNext()) {
                        goto label_42;
                    }
                    treeSet0.add(cursor0.getInt(cursor0.getColumnIndex("version")));
                }
            }
            catch(Throwable throwable3) {
                cursor1 = cursor0;
                throwable2 = throwable3;
            }
            try {
            label_38:
                if(cursor1 != null) {
                    cursor1.close();
                }
                throw throwable2;
            label_41:
                cursor0 = null;
            label_42:
                if(cursor0 != null) {
                    cursor0.close();
                }
                return treeSet0;
            }
            catch(Throwable throwable0) {
            }
        }
        a.a(throwable0, this);
        return null;
    }
}


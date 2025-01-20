package v1;

import O3.j;
import R2.h;
import android.app.Notification.Action.Builder;
import android.app.Notification.Action;
import android.app.Notification.Builder;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;

public final class q {
    public final Context a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public IconCompat h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public j m;
    public boolean n;
    public String o;
    public boolean p;
    public String q;
    public Bundle r;
    public int s;
    public int t;
    public String u;
    public final boolean v;
    public final Notification w;
    public final ArrayList x;

    public q(Context context0, String s) {
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.k = true;
        this.p = false;
        this.s = 0;
        this.t = 0;
        Notification notification0 = new Notification();
        this.w = notification0;
        this.a = context0;
        this.u = s;
        notification0.when = System.currentTimeMillis();
        notification0.audioStreamType = -1;
        this.j = 0;
        this.x = new ArrayList();
        this.v = true;
    }

    public final Notification a() {
        Notification notification1;
        ArrayList arrayList2;
        h h0 = new h();  // initializer: Ljava/lang/Object;-><init>()V
        new ArrayList();
        h0.d = new Bundle();
        h0.c = this;
        Context context0 = this.a;
        h0.a = context0;
        h0.b = Build.VERSION.SDK_INT >= 26 ? t.a(context0, this.u) : new Notification.Builder(this.a);
        Notification notification0 = this.w;
        boolean z = true;
        Notification.Builder notification$Builder0 = ((Notification.Builder)h0.b).setWhen(notification0.when).setSmallIcon(notification0.icon, notification0.iconLevel).setContent(notification0.contentView).setTicker(notification0.tickerText, null).setVibrate(notification0.vibrate).setLights(notification0.ledARGB, notification0.ledOnMS, notification0.ledOffMS).setOngoing((notification0.flags & 2) != 0).setOnlyAlertOnce((notification0.flags & 8) != 0).setAutoCancel((notification0.flags & 16) != 0).setDefaults(notification0.defaults).setContentTitle(this.e).setContentText(this.f).setContentInfo(null).setContentIntent(this.g).setDeleteIntent(notification0.deleteIntent);
        if((notification0.flags & 0x80) == 0) {
            z = false;
        }
        notification$Builder0.setFullScreenIntent(null, z).setNumber(this.i).setProgress(0, 0, this.n);
        ((Notification.Builder)h0.b).setLargeIcon((this.h == null ? null : this.h.f(context0)));
        ((Notification.Builder)h0.b).setSubText(null).setUsesChronometer(this.l).setPriority(this.j);
        for(Object object0: this.b) {
            k k0 = (k)object0;
            int v = Build.VERSION.SDK_INT;
            if(k0.b == null) {
                int v1 = k0.e;
                if(v1 != 0) {
                    k0.b = IconCompat.b(v1);
                }
            }
            Notification.Action.Builder notification$Action$Builder0 = new Notification.Action.Builder((k0.b == null ? null : k0.b.f(null)), k0.f, k0.g);
            Bundle bundle0 = k0.a == null ? new Bundle() : new Bundle(k0.a);
            boolean z1 = k0.c;
            bundle0.putBoolean("android.support.allowGeneratedReplies", z1);
            if(v >= 24) {
                s.b(notification$Action$Builder0, z1);
            }
            bundle0.putInt("android.support.action.semanticAction", 0);
            if(v >= 28) {
                u.a(notification$Action$Builder0);
            }
            if(v >= 29) {
                f.d(notification$Action$Builder0);
            }
            if(v >= 0x1F) {
                v.a(notification$Action$Builder0);
            }
            bundle0.putBoolean("android.support.action.showsUserInterface", k0.d);
            notification$Action$Builder0.addExtras(bundle0);
            Notification.Action notification$Action0 = notification$Action$Builder0.build();
            ((Notification.Builder)h0.b).addAction(notification$Action0);
        }
        Bundle bundle1 = this.r;
        if(bundle1 != null) {
            ((Bundle)h0.d).putAll(bundle1);
        }
        int v2 = Build.VERSION.SDK_INT;
        ((Notification.Builder)h0.b).setShowWhen(this.k);
        ((Notification.Builder)h0.b).setLocalOnly(this.p);
        ((Notification.Builder)h0.b).setGroup(this.o);
        ((Notification.Builder)h0.b).setSortKey(null);
        ((Notification.Builder)h0.b).setGroupSummary(false);
        ((Notification.Builder)h0.b).setCategory(this.q);
        ((Notification.Builder)h0.b).setColor(this.s);
        ((Notification.Builder)h0.b).setVisibility(this.t);
        ((Notification.Builder)h0.b).setPublicVersion(null);
        ((Notification.Builder)h0.b).setSound(notification0.sound, notification0.audioAttributes);
        ArrayList arrayList0 = this.x;
        ArrayList arrayList1 = this.c;
        if(v2 < 28) {
            if(arrayList1 == null) {
                arrayList2 = null;
            }
            else {
                arrayList2 = new ArrayList(arrayList1.size());
                Iterator iterator1 = arrayList1.iterator();
                if(iterator1.hasNext()) {
                    throw r.e(iterator1);
                }
            }
            if(arrayList2 != null) {
                if(arrayList0 == null) {
                    arrayList0 = arrayList2;
                }
                else {
                    s.f f0 = new s.f(arrayList0.size() + arrayList2.size());
                    f0.addAll(arrayList2);
                    f0.addAll(arrayList0);
                    arrayList0 = new ArrayList(f0);
                }
            }
        }
        if(arrayList0 != null && !arrayList0.isEmpty()) {
            for(Object object1: arrayList0) {
                ((Notification.Builder)h0.b).addPerson(((String)object1));
            }
        }
        ArrayList arrayList3 = this.d;
        if(arrayList3.size() > 0) {
            if(this.r == null) {
                this.r = new Bundle();
            }
            Bundle bundle2 = this.r.getBundle("android.car.EXTENSIONS");
            if(bundle2 == null) {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for(int v3 = 0; v3 < arrayList3.size(); ++v3) {
                String s = Integer.toString(v3);
                k k1 = (k)arrayList3.get(v3);
                Bundle bundle5 = new Bundle();
                if(k1.b == null) {
                    int v4 = k1.e;
                    if(v4 != 0) {
                        k1.b = IconCompat.b(v4);
                    }
                }
                bundle5.putInt("icon", (k1.b == null ? 0 : k1.b.c()));
                bundle5.putCharSequence("title", k1.f);
                bundle5.putParcelable("actionIntent", k1.g);
                Bundle bundle6 = k1.a == null ? new Bundle() : new Bundle(k1.a);
                bundle6.putBoolean("android.support.allowGeneratedReplies", k1.c);
                bundle5.putBundle("extras", bundle6);
                bundle5.putParcelableArray("remoteInputs", null);
                bundle5.putBoolean("showsUserInterface", k1.d);
                bundle5.putInt("semanticAction", 0);
                bundle4.putBundle(s, bundle5);
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            if(this.r == null) {
                this.r = new Bundle();
            }
            this.r.putBundle("android.car.EXTENSIONS", bundle2);
            ((Bundle)h0.d).putBundle("android.car.EXTENSIONS", bundle3);
        }
        int v5 = Build.VERSION.SDK_INT;
        if(v5 >= 24) {
            ((Notification.Builder)h0.b).setExtras(this.r);
            s.c(((Notification.Builder)h0.b));
        }
        if(v5 >= 26) {
            t.c(((Notification.Builder)h0.b));
            t.e(((Notification.Builder)h0.b));
            t.f(((Notification.Builder)h0.b));
            t.g(((Notification.Builder)h0.b));
            t.d(((Notification.Builder)h0.b));
            if(!TextUtils.isEmpty(this.u)) {
                ((Notification.Builder)h0.b).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if(v5 >= 28) {
            Iterator iterator3 = arrayList1.iterator();
            if(iterator3.hasNext()) {
                throw r.e(iterator3);
            }
        }
        if(v5 >= 29) {
            f.b(((Notification.Builder)h0.b), this.v);
            f.c(((Notification.Builder)h0.b));
        }
        q q0 = (q)h0.c;
        j j0 = q0.m;
        if(j0 != null) {
            j0.i(h0);
        }
        int v6 = Build.VERSION.SDK_INT;
        Notification.Builder notification$Builder1 = (Notification.Builder)h0.b;
        if(v6 >= 26) {
        }
        else if(v6 < 24) {
            notification$Builder1.setExtras(((Bundle)h0.d));
        }
        notification1 = notification$Builder1.build();
        if(j0 != null) {
            q0.m.getClass();
        }
        if(j0 != null) {
            Bundle bundle7 = notification1.extras;
            if(bundle7 != null) {
                bundle7.putString("androidx.core.app.extra.COMPAT_TEMPLATE", j0.l());
            }
        }
        return notification1;
    }

    public static CharSequence b(String s) {
        if(s == null) {
            return null;
        }
        return s.length() > 0x1400 ? s.subSequence(0, 0x1400) : s;
    }

    public final void c(int v, boolean z) {
        Notification notification0 = this.w;
        if(z) {
            notification0.flags |= v;
            return;
        }
        notification0.flags &= ~v;
    }

    public final void d(Bitmap bitmap0) {
        IconCompat iconCompat0;
        if(bitmap0 == null) {
            iconCompat0 = null;
        }
        else {
            if(Build.VERSION.SDK_INT < 27) {
                Resources resources0 = this.a.getResources();
                int v = resources0.getDimensionPixelSize(0x7F070074);  // dimen:compat_notification_large_icon_max_width
                int v1 = resources0.getDimensionPixelSize(0x7F070073);  // dimen:compat_notification_large_icon_max_height
                if(bitmap0.getWidth() > v || bitmap0.getHeight() > v1) {
                    double f = Math.min(((double)v) / ((double)Math.max(1, bitmap0.getWidth())), ((double)v1) / ((double)Math.max(1, bitmap0.getHeight())));
                    bitmap0 = Bitmap.createScaledBitmap(bitmap0, ((int)Math.ceil(((double)bitmap0.getWidth()) * f)), ((int)Math.ceil(((double)bitmap0.getHeight()) * f)), true);
                }
            }
            bitmap0.getClass();
            IconCompat iconCompat1 = new IconCompat(1);
            iconCompat1.b = bitmap0;
            iconCompat0 = iconCompat1;
        }
        this.h = iconCompat0;
    }

    public final void e(j j0) {
        if(this.m != j0) {
            this.m = j0;
            if(((q)j0.Y) != this) {
                j0.Y = this;
                this.e(j0);
            }
        }
    }
}


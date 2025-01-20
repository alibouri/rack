package j6;

import N5.r;
import S5.c;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.io.IOException;
import java.util.Map;
import m5.b;

public final class K implements Runnable {
    public final int X;
    public final int Y;
    public final String Z;
    public final Object b0;
    public final Object c0;
    public final Object d0;
    public final Object e0;

    public K(L l0, int v, String s, Object object0, Object object1, Object object2) {
        this.X = 0;
        super();
        this.Y = v;
        this.Z = s;
        this.b0 = object0;
        this.c0 = object1;
        this.d0 = object2;
        this.e0 = l0;
    }

    public K(String s, P p0, int v, IOException iOException0, byte[] arr_b, Map map0) {
        this.X = 1;
        super();
        r.j(p0);
        this.b0 = p0;
        this.Y = v;
        this.c0 = iOException0;
        this.d0 = arr_b;
        this.Z = s;
        this.e0 = map0;
    }

    @Override
    public final void run() {
        if(this.X != 0) {
            ((P)this.b0).d(this.Z, this.Y, ((IOException)this.c0), ((byte[])this.d0), ((Map)this.e0));
            return;
        }
        V v0 = ((d0)((L)this.e0).Y).f0;
        d0.e(v0);
        if(!v0.Z) {
            Log.println(6, ((L)this.e0).E(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        L l0 = (L)this.e0;
        boolean z = false;
        if(l0.b0 == 0) {
            d d0 = ((d0)l0.Y).e0;
            if(d0.d0 == null) {
                synchronized(d0) {
                    if(d0.d0 == null) {
                        ApplicationInfo applicationInfo0 = ((d0)d0.Y).X.getApplicationInfo();
                        String s = c.b();
                        if(applicationInfo0 != null) {
                            d0.d0 = Boolean.valueOf(applicationInfo0.processName != null && applicationInfo0.processName.equals(s));
                        }
                        if(d0.d0 == null) {
                            d0.d0 = Boolean.TRUE;
                            d0.b().e0.d("My process not in the list of running processes");
                        }
                    }
                }
            }
            ((L)this.e0).b0 = d0.d0.booleanValue() ? 'C' : 'c';
        }
        L l1 = (L)this.e0;
        if(l1.c0 < 0L) {
            l1.c0 = 106000L;
        }
        int v1 = ((L)this.e0).b0;
        long v2 = ((L)this.e0).c0;
        String s1 = L.w(true, this.Z, this.b0, this.c0, this.d0);
        StringBuilder stringBuilder0 = new StringBuilder("2");
        stringBuilder0.append("01VDIWEA?".charAt(this.Y));
        stringBuilder0.append(((char)v1));
        stringBuilder0.append(v2);
        String s2 = b.y(stringBuilder0, ":", s1);
        if(s2.length() > 0x400) {
            s2 = this.Z.substring(0, 0x400);
        }
        K2.d d1 = v0.e0;
        if(d1 != null) {
            V v3 = (V)d1.e;
            v3.q();
            if(((V)d1.e).y().getLong(((String)d1.b), 0L) == 0L) {
                d1.f();
            }
            if(s2 == null) {
                s2 = "";
            }
            SharedPreferences sharedPreferences0 = v3.y();
            String s3 = (String)d1.c;
            long v4 = sharedPreferences0.getLong(s3, 0L);
            String s4 = (String)d1.d;
            if(Long.compare(v4, 0L) <= 0) {
                SharedPreferences.Editor sharedPreferences$Editor0 = v3.y().edit();
                sharedPreferences$Editor0.putString(s4, s2);
                sharedPreferences$Editor0.putLong(s3, 1L);
                sharedPreferences$Editor0.apply();
                return;
            }
            if((v3.p().F0().nextLong() & 0x7FFFFFFFFFFFFFFFL) < 0x7FFFFFFFFFFFFFFFL / (v4 + 1L)) {
                z = true;
            }
            SharedPreferences.Editor sharedPreferences$Editor1 = v3.y().edit();
            if(z) {
                sharedPreferences$Editor1.putString(s4, s2);
            }
            sharedPreferences$Editor1.putLong(s3, v4 + 1L);
            sharedPreferences$Editor1.apply();
        }
    }
}


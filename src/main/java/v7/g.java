package v7;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Set;

public final class g {
    public final SharedPreferences a;

    public g(Context context0, String s) {
        this.a = context0.getSharedPreferences("FirebaseHeartBeat" + s, 0);
    }

    public final void a() {
        synchronized(this) {
            long v1 = this.a.getLong("fire-count", 0L);
            String s = "";
            Object object0 = null;
            for(Object object1: this.a.getAll().entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object1;
                if(map$Entry0.getValue() instanceof Set) {
                    for(Object object2: ((Set)map$Entry0.getValue())) {
                        String s1 = (String)object2;
                        if(object0 == null || ((String)object0).compareTo(s1) > 0) {
                            s = (String)map$Entry0.getKey();
                            object0 = s1;
                        }
                    }
                }
            }
            HashSet hashSet0 = new HashSet();
            HashSet hashSet1 = new HashSet(this.a.getStringSet(s, hashSet0));
            hashSet1.remove(object0);
            this.a.edit().putStringSet(s, hashSet1).putLong("fire-count", v1 - 1L).commit();
        }
    }

    public final void b() {
        synchronized(this) {
            SharedPreferences.Editor sharedPreferences$Editor0 = this.a.edit();
            int v1 = 0;
            for(Object object0: this.a.getAll().entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(map$Entry0.getValue() instanceof Set) {
                    Set set0 = (Set)map$Entry0.getValue();
                    String s = this.d(System.currentTimeMillis());
                    String s1 = (String)map$Entry0.getKey();
                    if(set0.contains(s)) {
                        HashSet hashSet0 = new HashSet();
                        hashSet0.add(s);
                        ++v1;
                        sharedPreferences$Editor0.putStringSet(s1, hashSet0);
                    }
                    else {
                        sharedPreferences$Editor0.remove(s1);
                    }
                }
            }
            if(v1 == 0) {
                sharedPreferences$Editor0.remove("fire-count");
            }
            else {
                sharedPreferences$Editor0.putLong("fire-count", ((long)v1));
            }
            sharedPreferences$Editor0.commit();
        }
    }

    public final ArrayList c() {
        synchronized(this) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: this.a.getAll().entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(map$Entry0.getValue() instanceof Set) {
                    HashSet hashSet0 = new HashSet(((Set)map$Entry0.getValue()));
                    hashSet0.remove(this.d(System.currentTimeMillis()));
                    if(!hashSet0.isEmpty()) {
                        arrayList0.add(new a(((String)map$Entry0.getKey()), new ArrayList(hashSet0)));
                    }
                }
            }
            this.l(System.currentTimeMillis());
            return arrayList0;
        }
    }

    public final String d(long v) {
        synchronized(this) {
            return Build.VERSION.SDK_INT >= 26 ? new Date(v).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE) : new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(v));
        }
    }

    public final String e(String s) {
        synchronized(this) {
            for(Object object0: this.a.getAll().entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(map$Entry0.getValue() instanceof Set) {
                    for(Object object1: ((Set)map$Entry0.getValue())) {
                        if(s.equals(((String)object1))) {
                            return (String)map$Entry0.getKey();
                        }
                        if(false) {
                            break;
                        }
                    }
                    if(false) {
                        break;
                    }
                }
            }
            return null;
        }
    }

    public final boolean f(long v, long v1) {
        synchronized(this) {
            return this.d(v).equals(this.d(v1));
        }
    }

    public final void g() {
        synchronized(this) {
            String s = this.d(System.currentTimeMillis());
            this.a.edit().putString("last-used-date", s).commit();
            this.h(s);
        }
    }

    public final void h(String s) {
        synchronized(this) {
            String s1 = this.e(s);
            if(s1 == null) {
                return;
            }
            HashSet hashSet0 = new HashSet();
            HashSet hashSet1 = new HashSet(this.a.getStringSet(s1, hashSet0));
            hashSet1.remove(s);
            if(hashSet1.isEmpty()) {
                this.a.edit().remove(s1).commit();
            }
            else {
                this.a.edit().putStringSet(s1, hashSet1).commit();
            }
        }
    }

    public final boolean i(long v) {
        synchronized(this) {
            return this.j(v);
        }
    }

    public final boolean j(long v) {
        synchronized(this) {
            if(this.a.contains("fire-global")) {
                if(!this.f(this.a.getLong("fire-global", -1L), v)) {
                    this.a.edit().putLong("fire-global", v).commit();
                    return true;
                }
                return false;
            }
            this.a.edit().putLong("fire-global", v).commit();
            return true;
        }
    }

    public final void k(long v, String s) {
        synchronized(this) {
            String s1 = this.d(v);
            if(this.a.getString("last-used-date", "").equals(s1)) {
                String s2 = this.e(s1);
                if(s2 == null) {
                    return;
                }
                if(s2.equals(s)) {
                    return;
                }
                this.m(s, s1);
                return;
            }
            long v2 = this.a.getLong("fire-count", 0L);
            if(v2 + 1L == 30L) {
                this.a();
                v2 = this.a.getLong("fire-count", 0L);
            }
            HashSet hashSet0 = new HashSet();
            HashSet hashSet1 = new HashSet(this.a.getStringSet(s, hashSet0));
            hashSet1.add(s1);
            this.a.edit().putStringSet(s, hashSet1).putLong("fire-count", v2 + 1L).putString("last-used-date", s1).commit();
        }
    }

    public final void l(long v) {
        synchronized(this) {
            this.a.edit().putLong("fire-global", v).commit();
        }
    }

    public final void m(String s, String s1) {
        synchronized(this) {
            this.h(s1);
            HashSet hashSet0 = new HashSet();
            HashSet hashSet1 = new HashSet(this.a.getStringSet(s, hashSet0));
            hashSet1.add(s1);
            this.a.edit().putStringSet(s, hashSet1).commit();
        }
    }
}


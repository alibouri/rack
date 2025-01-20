package N4;

import M4.l;
import android.preference.PreferenceManager;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public abstract class d {
    public static final ReentrantReadWriteLock a;
    public static String b;
    public static volatile boolean c;

    static {
        d.a = new ReentrantReadWriteLock();
    }

    public static void a() {
        if(d.c) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock0 = d.a;
        reentrantReadWriteLock0.writeLock().lock();
        if(d.c) {
            reentrantReadWriteLock0.writeLock().unlock();
            return;
        }
        try {
            d.b = PreferenceManager.getDefaultSharedPreferences(l.a()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
            d.c = true;
        }
        catch(Throwable throwable0) {
            d.a.writeLock().unlock();
            throw throwable0;
        }
        reentrantReadWriteLock0.writeLock().unlock();
    }
}


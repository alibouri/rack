package com.google.firebase.perf.config;

import I7.v;
import I7.w;
import S7.d;
import V7.b;
import V7.g;
import V7.j;
import W7.f;
import W7.h;
import W7.o;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import androidx.annotation.Keep;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n7.i;
import o6.p;
import x7.a;

@Keep
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0L;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_APP_START_CONFIG_FETCH_DELAY_MS = 5000L;
    private static final int RANDOM_APP_START_CONFIG_FETCH_DELAY_MS = 25000;
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS;
    private final ConcurrentHashMap allRcConfigMap;
    private final long appStartConfigFetchDelayInMs;
    private final long appStartTimeInMs;
    private final v cache;
    private final Executor executor;
    private b firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;
    private a firebaseRemoteConfigProvider;
    private static final RemoteConfigManager instance;
    private static final L7.a logger;

    static {
        RemoteConfigManager.logger = L7.a.d();
        RemoteConfigManager.instance = new RemoteConfigManager();
        RemoteConfigManager.TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = TimeUnit.HOURS.toMillis(12L);
    }

    @SuppressLint({"ThreadPoolCreation"})
    private RemoteConfigManager() {
        this(v.b(), new ThreadPoolExecutor(0, 1, 0L, TimeUnit.SECONDS, new LinkedBlockingQueue()), null, 5000L + ((long)new Random().nextInt(25000)), RemoteConfigManager.getInitialStartupMillis());
    }

    public RemoteConfigManager(v v0, Executor executor0, b b0, long v1, long v2) {
        this.firebaseRemoteConfigLastFetchTimestampMs = 0L;
        this.cache = v0;
        this.executor = executor0;
        this.firebaseRemoteConfig = b0;
        this.allRcConfigMap = b0 == null ? new ConcurrentHashMap() : new ConcurrentHashMap(b0.a());
        this.appStartTimeInMs = v2;
        this.appStartConfigFetchDelayInMs = v1;
    }

    public d getBoolean(String s) {
        if(s == null) {
            RemoteConfigManager.logger.a("The key to get Remote Config boolean value is null.");
            return new d();
        }
        g g0 = this.getRemoteConfigValue(s);
        if(g0 != null) {
            try {
                return new d(Boolean.valueOf(((o)g0).a()));
            }
            catch(IllegalArgumentException unused_ex) {
                if(!((o)g0).d().isEmpty()) {
                    RemoteConfigManager.logger.b("Could not parse value: \'%s\' for key: \'%s\'.", new Object[]{((o)g0).d(), s});
                }
            }
        }
        return new d();
    }

    public long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public d getDouble(String s) {
        if(s == null) {
            RemoteConfigManager.logger.a("The key to get Remote Config double value is null.");
            return new d();
        }
        g g0 = this.getRemoteConfigValue(s);
        if(g0 != null) {
            try {
                return new d(((o)g0).b());
            }
            catch(IllegalArgumentException unused_ex) {
                if(!((o)g0).d().isEmpty()) {
                    RemoteConfigManager.logger.b("Could not parse value: \'%s\' for key: \'%s\'.", new Object[]{((o)g0).d(), s});
                }
            }
        }
        return new d();
    }

    public static long getInitialStartupMillis() {
        try {
            Z6.a a0 = (Z6.a)Z6.g.c().b(Z6.a.class);
            return a0 == null ? System.currentTimeMillis() : a0.a;
        }
        catch(IllegalStateException unused_ex) {
            RemoteConfigManager.logger.a("Unable to get StartupTime instance.");
            return System.currentTimeMillis();
        }
    }

    public static RemoteConfigManager getInstance() {
        return RemoteConfigManager.instance;
    }

    public d getLong(String s) {
        if(s == null) {
            RemoteConfigManager.logger.a("The key to get Remote Config long value is null.");
            return new d();
        }
        g g0 = this.getRemoteConfigValue(s);
        if(g0 != null) {
            try {
                return new d(((o)g0).c());
            }
            catch(IllegalArgumentException unused_ex) {
                if(!((o)g0).d().isEmpty()) {
                    RemoteConfigManager.logger.b("Could not parse value: \'%s\' for key: \'%s\'.", new Object[]{((o)g0).d(), s});
                }
            }
        }
        return new d();
    }

    private g getRemoteConfigValue(String s) {
        this.triggerRemoteConfigFetchIfNecessary();
        if(this.isFirebaseRemoteConfigAvailable() && this.allRcConfigMap.containsKey(s)) {
            g g0 = (g)this.allRcConfigMap.get(s);
            if(((o)g0).b == 2) {
                RemoteConfigManager.logger.b("Fetched value: \'%s\' for key: \'%s\' from Firebase Remote Config.", new Object[]{((o)g0).d(), s});
                return g0;
            }
        }
        return null;
    }

    public Object getRemoteConfigValueOrDefault(String s, Object object0) {
        g g0 = this.getRemoteConfigValue(s);
        if(g0 != null) {
            try {
                if(object0 instanceof Boolean) {
                    return Boolean.valueOf(((o)g0).a());
                }
                if(object0 instanceof Double) {
                    return ((o)g0).b();
                }
                if(object0 instanceof Long || object0 instanceof Integer) {
                    return ((o)g0).c();
                }
                if(object0 instanceof String) {
                    return ((o)g0).d();
                }
                String s1 = ((o)g0).d();
                try {
                    RemoteConfigManager.logger.b("No matching type found for the defaultValue: \'%s\', using String.", new Object[]{object0});
                    return s1;
                }
                catch(IllegalArgumentException unused_ex) {
                    object0 = s1;
                }
            }
            catch(IllegalArgumentException unused_ex) {
            }
            if(!((o)g0).d().isEmpty()) {
                RemoteConfigManager.logger.b("Could not parse value: \'%s\' for key: \'%s\'.", new Object[]{((o)g0).d(), s});
            }
        }
        return object0;
    }

    public d getString(String s) {
        if(s == null) {
            RemoteConfigManager.logger.a("The key to get Remote Config String value is null.");
            return new d();
        }
        g g0 = this.getRemoteConfigValue(s);
        return g0 == null ? new d() : new d(((o)g0).d());
    }

    public static int getVersionCode(Context context0) {
        try {
            return context0.getPackageManager().getPackageInfo("com.wave.personal", 0).versionCode;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            return 0;
        }
    }

    private boolean hasAppStartConfigFetchDelayElapsed(long v) {
        return v - this.appStartTimeInMs >= this.appStartConfigFetchDelayInMs;
    }

    private boolean hasLastFetchBecomeStale(long v) {
        return v - this.firebaseRemoteConfigLastFetchTimestampMs > RemoteConfigManager.TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS;
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        if(this.firebaseRemoteConfig == null) {
            a a0 = this.firebaseRemoteConfigProvider;
            if(a0 != null) {
                j j0 = (j)a0.get();
                if(j0 != null) {
                    this.firebaseRemoteConfig = j0.b("fireperf");
                }
            }
        }
        return this.firebaseRemoteConfig != null;
    }

    public boolean isLastFetchFailed() {
        return this.firebaseRemoteConfig == null || this.firebaseRemoteConfig.b().X == 1 || this.firebaseRemoteConfig.b().X == 2;
    }

    private void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0(Boolean boolean0) {
        this.syncConfigValues(this.firebaseRemoteConfig.a());
    }

    private void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(Exception exception0) {
        RemoteConfigManager.logger.g("Call to Remote Config failed: %s. This may cause a degraded experience with Firebase Performance. Please reach out to Firebase Support https://firebase.google.com/support/", new Object[]{exception0});
        this.firebaseRemoteConfigLastFetchTimestampMs = 0L;
    }

    public void setFirebaseRemoteConfigProvider(a a0) {
        this.firebaseRemoteConfigProvider = a0;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        long v = this.getCurrentSystemTimeMillis();
        return this.hasAppStartConfigFetchDelayElapsed(v) && this.hasLastFetchBecomeStale(v);
    }

    public void syncConfigValues(Map map0) {
        this.allRcConfigMap.putAll(map0);
        for(Object object0: this.allRcConfigMap.keySet()) {
            String s = (String)object0;
            if(!map0.containsKey(s)) {
                this.allRcConfigMap.remove(s);
            }
        }
        I7.d.b0().getClass();
        g g0 = (g)this.allRcConfigMap.get("fpr_experiment_app_start_ttid");
        if(g0 != null) {
            try {
                boolean z = ((o)g0).a();
                this.cache.g("com.google.firebase.perf.ExperimentTTID", z);
            }
            catch(Exception unused_ex) {
                RemoteConfigManager.logger.a("ExperimentTTID remote config flag has invalid value, expected boolean.");
            }
            return;
        }
        RemoteConfigManager.logger.a("ExperimentTTID remote config flag does not exist.");
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = this.getCurrentSystemTimeMillis();
        b b0 = this.firebaseRemoteConfig;
        long v = b0.e.g.a.getLong("minimum_fetch_interval_in_seconds", h.i);
        HashMap hashMap0 = new HashMap(b0.e.h);
        hashMap0.put("X-Firebase-RC-Fetch-Type", "BASE/1");
        o6.h h0 = b0.e.e.b();
        f f0 = new f(b0.e, v, hashMap0);
        p p0 = h0.d(b0.e.c, f0);
        T9.b b1 = new T9.b(4);
        p p1 = p0.m(i.X, b1);
        V7.a a0 = new V7.a(b0);
        p p2 = p1.m(b0.b, a0);
        w w0 = new w(this);
        p2.c(this.executor, w0);
        w w1 = new w(this);
        p2.b(this.executor, w1);
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if(!this.isFirebaseRemoteConfigAvailable()) {
            return;
        }
        if(this.allRcConfigMap.isEmpty()) {
            HashMap hashMap0 = this.firebaseRemoteConfig.a();
            this.allRcConfigMap.putAll(hashMap0);
        }
        if(this.shouldFetchAndActivateRemoteConfigValues()) {
            this.triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
        }
    }
}


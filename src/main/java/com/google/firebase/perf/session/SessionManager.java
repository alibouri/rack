package com.google.firebase.perf.session;

import E7.h;
import H7.c;
import H7.d;
import P7.a;
import T7.i;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@Keep
public class SessionManager extends d {
    private final c appStateMonitor;
    private final Set clients;
    private final GaugeManager gaugeManager;
    @SuppressLint({"StaticFieldLeak"})
    private static final SessionManager instance;
    private PerfSession perfSession;
    private Future syncInitFuture;

    static {
        SessionManager.instance = new SessionManager();
    }

    private SessionManager() {
        this(GaugeManager.getInstance(), PerfSession.f(UUID.randomUUID().toString()), c.a());
    }

    public SessionManager(GaugeManager gaugeManager0, PerfSession perfSession0, c c0) {
        super(c.a());
        this.clients = new HashSet();
        this.gaugeManager = gaugeManager0;
        this.perfSession = perfSession0;
        this.appStateMonitor = c0;
        this.registerForAppState();
    }

    public static SessionManager getInstance() {
        return SessionManager.instance;
    }

    public Future getSyncInitFuture() {
        return this.syncInitFuture;
    }

    public void initializeGaugeCollection() {
        this.logGaugeMetadataIfCollectionEnabled(i.Z);
        this.startOrStopCollectingGauges(i.Z);
    }

    private void lambda$setApplicationContext$0(Context context0, PerfSession perfSession0) {
        this.gaugeManager.initializeGaugeMetadataManager(context0);
        if(perfSession0.Z) {
            this.gaugeManager.logGaugeMetadata(perfSession0.X, i.Z);
        }
    }

    private void logGaugeMetadataIfCollectionEnabled(i i0) {
        PerfSession perfSession0 = this.perfSession;
        if(perfSession0.Z) {
            this.gaugeManager.logGaugeMetadata(perfSession0.X, i0);
        }
    }

    @Override  // H7.d
    public void onUpdateAppState(i i0) {
        super.onUpdateAppState(i0);
        if(this.appStateMonitor.o0) {
            return;
        }
        if(i0 == i.Z) {
            this.updatePerfSession(PerfSession.f(UUID.randomUUID().toString()));
            return;
        }
        if(this.perfSession.g()) {
            this.updatePerfSession(PerfSession.f(UUID.randomUUID().toString()));
            return;
        }
        this.startOrStopCollectingGauges(i0);
    }

    public final PerfSession perfSession() {
        return this.perfSession;
    }

    public void registerForSessionUpdates(WeakReference weakReference0) {
        synchronized(this.clients) {
            this.clients.add(weakReference0);
        }
    }

    public void setApplicationContext(Context context0) {
        PerfSession perfSession0 = this.perfSession;
        this.syncInitFuture = Executors.newSingleThreadExecutor().submit(new h(this, context0, perfSession0, 5));
    }

    public void setPerfSession(PerfSession perfSession0) {
        this.perfSession = perfSession0;
    }

    private void startOrStopCollectingGauges(i i0) {
        PerfSession perfSession0 = this.perfSession;
        if(perfSession0.Z) {
            this.gaugeManager.startCollectingGauges(perfSession0, i0);
            return;
        }
        this.gaugeManager.stopCollectingGauges();
    }

    public void stopGaugeCollectionIfSessionRunningTooLong() {
        if(this.perfSession.g()) {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    public void unregisterForSessionUpdates(WeakReference weakReference0) {
        synchronized(this.clients) {
            this.clients.remove(weakReference0);
        }
    }

    public void updatePerfSession(PerfSession perfSession0) {
        if(perfSession0.X == this.perfSession.X) {
            return;
        }
        this.perfSession = perfSession0;
        synchronized(this.clients) {
            Iterator iterator0 = this.clients.iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                a a0 = (a)((WeakReference)object0).get();
                if(a0 == null) {
                    iterator0.remove();
                }
                else {
                    a0.b(perfSession0);
                }
            }
        }
        this.logGaugeMetadataIfCollectionEnabled(this.appStateMonitor.m0);
        this.startOrStopCollectingGauges(this.appStateMonitor.m0);
    }
}


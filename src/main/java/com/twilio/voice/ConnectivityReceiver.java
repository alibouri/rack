package com.twilio.voice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

class ConnectivityReceiver extends BroadcastReceiver {
    private NetworkInfo currentNetworkInfo;
    private static final Logger logger;

    static {
        ConnectivityReceiver.logger = Logger.getLogger(ConnectivityReceiver.class);
    }

    public static void logNetworkChangeEvent(NetworkChangeEvent voice$NetworkChangeEvent0, NetworkInfo networkInfo0, NetworkInfo networkInfo1, boolean z) {
        Logger logger0 = ConnectivityReceiver.logger;
        logger0.d("networkChangeEvent: " + voice$NetworkChangeEvent0.name() + " reportedToSdk: " + Boolean.toString(z));
        String s = "null";
        logger0.d("currentNetworkInfo: " + (networkInfo0 == null ? "null" : networkInfo0.toString()));
        StringBuilder stringBuilder0 = new StringBuilder("newNetworkInfo: ");
        if(networkInfo1 != null) {
            s = networkInfo1.toString();
        }
        stringBuilder0.append(s);
        logger0.d(stringBuilder0.toString());
    }

    @Override  // android.content.BroadcastReceiver
    public void onReceive(Context context0, Intent intent0) {
        Logger logger0 = ConnectivityReceiver.logger;
        logger0.d("Network event received");
        if(intent0.getAction().equalsIgnoreCase("android.net.conn.CONNECTIVITY_CHANGE")) {
            if(this.isInitialStickyBroadcast()) {
                logger0.d("Ignoring network event, sticky broadcast");
                return;
            }
            NetworkInfo networkInfo0 = ((ConnectivityManager)context0.getSystemService("connectivity")).getActiveNetworkInfo();
            NetworkChangeEvent voice$NetworkChangeEvent0 = NetworkChangeEvent.CONNECTION_CHANGED;
            if(networkInfo0 != null && (this.currentNetworkInfo == null || this.currentNetworkInfo.getDetailedState() != networkInfo0.getDetailedState() || this.currentNetworkInfo.getType() != networkInfo0.getType() || this.currentNetworkInfo.getSubtype() != networkInfo0.getSubtype())) {
                if(!networkInfo0.isConnectedOrConnecting()) {
                    voice$NetworkChangeEvent0 = NetworkChangeEvent.CONNECTION_LOST;
                }
                ConnectivityReceiver.logNetworkChangeEvent(voice$NetworkChangeEvent0, this.currentNetworkInfo, networkInfo0, true);
                Voice.onNetworkChanged(voice$NetworkChangeEvent0);
            }
            else if(networkInfo0 == null) {
                ConnectivityReceiver.logNetworkChangeEvent(NetworkChangeEvent.CONNECTION_LOST, this.currentNetworkInfo, null, true);
                Voice.onNetworkChanged(NetworkChangeEvent.CONNECTION_LOST);
            }
            else {
                ConnectivityReceiver.logNetworkChangeEvent(voice$NetworkChangeEvent0, this.currentNetworkInfo, networkInfo0, false);
            }
            this.currentNetworkInfo = networkInfo0;
        }
    }
}


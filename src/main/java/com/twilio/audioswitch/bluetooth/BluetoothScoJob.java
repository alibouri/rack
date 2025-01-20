package com.twilio.audioswitch.bluetooth;

import Nb.j;
import android.os.Handler;
import com.twilio.audioswitch.android.Logger;
import com.twilio.audioswitch.android.SystemClockWrapper;
import java.util.concurrent.TimeoutException;

public abstract class BluetoothScoJob {
    public final class BluetoothScoRunnable implements Runnable {
        private long elapsedTime;
        private final long startTime;

        public BluetoothScoRunnable() {
            this.startTime = bluetoothScoJob0.systemClockWrapper.elapsedRealtime();
        }

        @Override
        public void run() {
            if(this.elapsedTime < 5000L) {
                BluetoothScoJob.this.scoAction();
                this.elapsedTime = BluetoothScoJob.this.systemClockWrapper.elapsedRealtime() - this.startTime;
                BluetoothScoJob.this.bluetoothScoHandler.postDelayed(this, 500L);
                return;
            }
            BluetoothScoJob.this.logger.e("BluetoothScoJob", "Bluetooth sco job timed out", new TimeoutException());
            BluetoothScoJob.this.scoTimeOutAction();
            BluetoothScoJob.this.cancelBluetoothScoJob();
        }
    }

    private final Handler bluetoothScoHandler;
    private BluetoothScoRunnable bluetoothScoRunnable;
    private final Logger logger;
    private final SystemClockWrapper systemClockWrapper;

    public BluetoothScoJob(Logger logger0, Handler handler0, SystemClockWrapper systemClockWrapper0) {
        j.f(logger0, "logger");
        j.f(handler0, "bluetoothScoHandler");
        j.f(systemClockWrapper0, "systemClockWrapper");
        super();
        this.logger = logger0;
        this.bluetoothScoHandler = handler0;
        this.systemClockWrapper = systemClockWrapper0;
    }

    public final void cancelBluetoothScoJob() {
        BluetoothScoRunnable bluetoothScoJob$BluetoothScoRunnable0 = this.bluetoothScoRunnable;
        if(bluetoothScoJob$BluetoothScoRunnable0 != null) {
            this.bluetoothScoHandler.removeCallbacks(bluetoothScoJob$BluetoothScoRunnable0);
            this.bluetoothScoRunnable = null;
            this.logger.d("BluetoothScoJob", "Canceled bluetooth sco job");
        }
    }

    public final void executeBluetoothScoJob() {
        BluetoothScoRunnable bluetoothScoJob$BluetoothScoRunnable0 = this.bluetoothScoRunnable;
        if(bluetoothScoJob$BluetoothScoRunnable0 != null) {
            this.bluetoothScoHandler.removeCallbacks(bluetoothScoJob$BluetoothScoRunnable0);
        }
        BluetoothScoRunnable bluetoothScoJob$BluetoothScoRunnable1 = new BluetoothScoRunnable(this);
        this.bluetoothScoRunnable = bluetoothScoJob$BluetoothScoRunnable1;
        this.bluetoothScoHandler.post(bluetoothScoJob$BluetoothScoRunnable1);
        this.logger.d("BluetoothScoJob", "Scheduled bluetooth sco job");
    }

    public final BluetoothScoRunnable getBluetoothScoRunnable() {
        return this.bluetoothScoRunnable;
    }

    public static void getBluetoothScoRunnable$annotations() {
    }

    public abstract void scoAction();

    public void scoTimeOutAction() {
    }

    public final void setBluetoothScoRunnable(BluetoothScoRunnable bluetoothScoJob$BluetoothScoRunnable0) {
        this.bluetoothScoRunnable = bluetoothScoJob$BluetoothScoRunnable0;
    }
}


package com.twilio.audioswitch;

import Nb.j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioFocusRequest;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.media.AudioManager;
import android.os.Build;
import com.twilio.audioswitch.android.BuildWrapper;
import com.twilio.audioswitch.android.Logger;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class AudioDeviceManager {
    private final AudioManager.OnAudioFocusChangeListener audioFocusChangeListener;
    private final AudioFocusRequestWrapper audioFocusRequest;
    private final AudioManager audioManager;
    private AudioFocusRequest audioRequest;
    private final BuildWrapper build;
    private final Context context;
    private final Logger logger;
    private int savedAudioMode;
    private boolean savedIsMicrophoneMuted;
    private boolean savedSpeakerphoneEnabled;

    public AudioDeviceManager(Context context0, Logger logger0, AudioManager audioManager0, BuildWrapper buildWrapper0, AudioFocusRequestWrapper audioFocusRequestWrapper0, AudioManager.OnAudioFocusChangeListener audioManager$OnAudioFocusChangeListener0) {
        j.f(context0, "context");
        j.f(logger0, "logger");
        j.f(audioManager0, "audioManager");
        j.f(buildWrapper0, "build");
        j.f(audioFocusRequestWrapper0, "audioFocusRequest");
        j.f(audioManager$OnAudioFocusChangeListener0, "audioFocusChangeListener");
        super();
        this.context = context0;
        this.logger = logger0;
        this.audioManager = audioManager0;
        this.build = buildWrapper0;
        this.audioFocusRequest = audioFocusRequestWrapper0;
        this.audioFocusChangeListener = audioManager$OnAudioFocusChangeListener0;
    }

    public AudioDeviceManager(Context context0, Logger logger0, AudioManager audioManager0, BuildWrapper buildWrapper0, AudioFocusRequestWrapper audioFocusRequestWrapper0, AudioManager.OnAudioFocusChangeListener audioManager$OnAudioFocusChangeListener0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 8) != 0) {
            buildWrapper0 = new BuildWrapper();
        }
        if((v & 16) != 0) {
            audioFocusRequestWrapper0 = new AudioFocusRequestWrapper();
        }
        this(context0, logger0, audioManager0, buildWrapper0, audioFocusRequestWrapper0, audioManager$OnAudioFocusChangeListener0);
    }

    public final void cacheAudioState() {
        this.savedAudioMode = this.audioManager.getMode();
        this.savedIsMicrophoneMuted = this.audioManager.isMicrophoneMute();
        this.savedSpeakerphoneEnabled = this.audioManager.isSpeakerphoneOn();
    }

    public final void enableBluetoothSco(boolean z) {
        AudioManager audioManager0 = this.audioManager;
        if(z) {
            audioManager0.startBluetoothSco();
            return;
        }
        audioManager0.stopBluetoothSco();
    }

    @SuppressLint({"NewApi"})
    public final void enableSpeakerphone(boolean z) {
        this.audioManager.setSpeakerphoneOn(z);
        if(!this.audioManager.isSpeakerphoneOn()) {
            Pattern pattern0 = Pattern.compile("^SM-G(960|99)");
            j.e(pattern0, "compile(...)");
            String s = Build.MODEL;
            j.e(s, "Build.MODEL");
            if(pattern0.matcher(s).find()) {
                AudioDeviceInfo[] arr_audioDeviceInfo = this.audioManager.getDevices(2);
                for(int v = 0; v < arr_audioDeviceInfo.length; ++v) {
                    AudioDeviceInfo audioDeviceInfo0 = arr_audioDeviceInfo[v];
                    j.e(audioDeviceInfo0, "device");
                    if(audioDeviceInfo0.getType() == 22) {
                        this.audioManager.setMode(0);
                        return;
                    }
                }
            }
        }
    }

    public final boolean hasEarpiece() {
        boolean z = this.context.getPackageManager().hasSystemFeature("android.hardware.telephony");
        if(z) {
            this.logger.d("AudioDeviceManager", "Earpiece available");
        }
        return z;
    }

    @SuppressLint({"NewApi"})
    public final boolean hasSpeakerphone() {
        if(this.build.getVersion() >= 23 && this.context.getPackageManager().hasSystemFeature("android.hardware.audio.output")) {
            AudioDeviceInfo[] arr_audioDeviceInfo = this.audioManager.getDevices(2);
            for(int v = 0; v < arr_audioDeviceInfo.length; ++v) {
                AudioDeviceInfo audioDeviceInfo0 = arr_audioDeviceInfo[v];
                j.e(audioDeviceInfo0, "device");
                if(audioDeviceInfo0.getType() == 2) {
                    this.logger.d("AudioDeviceManager", "Speakerphone available");
                    return true;
                }
            }
            return false;
        }
        this.logger.d("AudioDeviceManager", "Speakerphone available");
        return true;
    }

    public final void mute(boolean z) {
        this.audioManager.setMicrophoneMute(z);
    }

    @SuppressLint({"NewApi"})
    public final void restoreAudioState() {
        this.audioManager.setMode(this.savedAudioMode);
        this.mute(this.savedIsMicrophoneMuted);
        this.enableSpeakerphone(this.savedSpeakerphoneEnabled);
        if(this.build.getVersion() >= 26) {
            AudioFocusRequest audioFocusRequest0 = this.audioRequest;
            if(audioFocusRequest0 != null) {
                this.audioManager.abandonAudioFocusRequest(audioFocusRequest0);
            }
        }
        else {
            this.audioManager.abandonAudioFocus(this.audioFocusChangeListener);
        }
    }

    @SuppressLint({"NewApi"})
    public final void setAudioFocus() {
        if(this.build.getVersion() >= 26) {
            AudioFocusRequest audioFocusRequest0 = this.audioFocusRequest.buildRequest(this.audioFocusChangeListener);
            this.audioRequest = audioFocusRequest0;
            if(audioFocusRequest0 != null) {
                this.audioManager.requestAudioFocus(audioFocusRequest0);
            }
        }
        else {
            this.audioManager.requestAudioFocus(this.audioFocusChangeListener, 0, 2);
        }
        this.audioManager.setMode(3);
    }
}


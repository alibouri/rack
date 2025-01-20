package com.twilio.audioswitch;

import Nb.j;
import P0.f;
import android.annotation.SuppressLint;
import android.media.AudioAttributes.Builder;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager.OnAudioFocusChangeListener;

public final class AudioFocusRequestWrapper {
    @SuppressLint({"NewApi"})
    public final AudioFocusRequest buildRequest(AudioManager.OnAudioFocusChangeListener audioManager$OnAudioFocusChangeListener0) {
        j.f(audioManager$OnAudioFocusChangeListener0, "audioFocusChangeListener");
        AudioAttributes audioAttributes0 = new AudioAttributes.Builder().setUsage(2).setContentType(1).build();
        AudioFocusRequest audioFocusRequest0 = f.d(f.c().setAudioAttributes(audioAttributes0)).setOnAudioFocusChangeListener(audioManager$OnAudioFocusChangeListener0).build();
        j.e(audioFocusRequest0, "AudioFocusRequest.Builde…\n                .build()");
        return audioFocusRequest0;
    }
}


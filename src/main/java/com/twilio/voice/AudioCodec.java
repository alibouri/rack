package com.twilio.voice;

public abstract class AudioCodec {
    private final String name;

    public AudioCodec(String s) {
        this.name = s;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}


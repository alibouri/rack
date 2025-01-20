package com.twilio.voice;

abstract class AudioTrack implements Track {
    private boolean isEnabled;
    private final String name;

    public AudioTrack(boolean z, String s) {
        this.isEnabled = z;
        this.name = s;
    }

    @Override  // com.twilio.voice.Track
    public String getName() {
        return this.name;
    }

    @Override  // com.twilio.voice.Track
    public boolean isEnabled() {
        return this.isEnabled;
    }

    public void setEnabled(boolean z) {
        this.isEnabled = z;
    }
}


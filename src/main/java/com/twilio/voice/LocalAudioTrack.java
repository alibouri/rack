package com.twilio.voice;

import android.content.Context;

class LocalAudioTrack extends AudioTrack {
    private static final Logger logger;
    private final MediaFactory mediaFactory;
    private long nativeLocalAudioTrackHandle;
    private final String trackId;

    static {
        LocalAudioTrack.logger = Logger.getLogger(LocalAudioTrack.class);
    }

    public LocalAudioTrack(long v, String s, String s1, boolean z, Context context0) {
        super(z, s1);
        this.trackId = s;
        this.nativeLocalAudioTrackHandle = v;
        this.mediaFactory = MediaFactory.instance(this, context0);
    }

    public static LocalAudioTrack create(Context context0, boolean z) {
        return LocalAudioTrack.create(context0, z, null, null);
    }

    public static LocalAudioTrack create(Context context0, boolean z, AudioOptions audioOptions0) {
        return LocalAudioTrack.create(context0, z, audioOptions0, null);
    }

    public static LocalAudioTrack create(Context context0, boolean z, AudioOptions audioOptions0, String s) {
        Preconditions.checkNotNull(context0, "context must not be null");
        Preconditions.checkState(Utils.permissionGranted(context0, "android.permission.RECORD_AUDIO"), "RECORD_AUDIO permission must be granted to create audio track");
        Object object0 = new Object();
        MediaFactory mediaFactory0 = MediaFactory.instance(object0, context0.getApplicationContext());
        LocalAudioTrack localAudioTrack0 = mediaFactory0.createAudioTrack(context0.getApplicationContext(), z, audioOptions0, s);
        if(localAudioTrack0 == null) {
            LocalAudioTrack.logger.e("Failed to create local audio track");
        }
        mediaFactory0.release(object0);
        return localAudioTrack0;
    }

    public static LocalAudioTrack create(Context context0, boolean z, String s) {
        return LocalAudioTrack.create(context0, z, null, s);
    }

    public void enable(boolean z) {
        synchronized(this) {
            if(this.isReleased()) {
                LocalAudioTrack.logger.e("Cannot enable a local audio track that has been removed");
            }
            else {
                this.nativeEnable(this.nativeLocalAudioTrackHandle, z);
            }
        }
    }

    @Override  // com.twilio.voice.AudioTrack
    public String getName() {
        return super.getName();
    }

    public long getNativeHandle() {
        synchronized(this) {
        }
        return this.nativeLocalAudioTrackHandle;
    }

    public String getTrackId() {
        return this.trackId;
    }

    @Override  // com.twilio.voice.AudioTrack
    public boolean isEnabled() {
        synchronized(this) {
            if(!this.isReleased()) {
                return this.nativeIsEnabled(this.nativeLocalAudioTrackHandle);
            }
            LocalAudioTrack.logger.w("Local audio track is not enabled because it has been released");
            return false;
        }
    }

    public boolean isReleased() {
        return this.nativeLocalAudioTrackHandle == 0L;
    }

    private native void nativeEnable(long arg1, boolean arg2) {
    }

    private native boolean nativeIsEnabled(long arg1) {
    }

    private native void nativeRelease(long arg1) {
    }

    public void release() {
        synchronized(this) {
            if(!this.isReleased()) {
                this.nativeRelease(this.nativeLocalAudioTrackHandle);
                this.nativeLocalAudioTrackHandle = 0L;
                this.mediaFactory.release(this);
            }
        }
    }
}


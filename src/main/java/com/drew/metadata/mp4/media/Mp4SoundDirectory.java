package com.drew.metadata.mp4.media;

import com.apollographql.apollo.api.b;
import java.util.HashMap;

public class Mp4SoundDirectory extends Mp4MediaDirectory {
    public static final int TAG_AUDIO_FORMAT = 301;
    public static final int TAG_AUDIO_SAMPLE_RATE = 304;
    public static final int TAG_AUDIO_SAMPLE_SIZE = 303;
    public static final int TAG_NUMBER_OF_CHANNELS = 302;
    public static final int TAG_SOUND_BALANCE = 305;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        Mp4SoundDirectory._tagNameMap = hashMap0;
        Mp4MediaDirectory.addMp4MediaTags(hashMap0);
        hashMap0.put(301, "Format");
        hashMap0.put(302, "Number of Channels");
        b.z(303, hashMap0, "Sample Size", 304, "Sample Rate");
        hashMap0.put(305, "Balance");
    }

    public Mp4SoundDirectory() {
        this.setDescriptor(new A4.b(5, this));
    }

    @Override  // com.drew.metadata.mp4.Mp4Directory
    public String getName() {
        return "MP4 Sound";
    }

    @Override  // com.drew.metadata.mp4.Mp4Directory
    public HashMap getTagNameMap() {
        return Mp4SoundDirectory._tagNameMap;
    }
}


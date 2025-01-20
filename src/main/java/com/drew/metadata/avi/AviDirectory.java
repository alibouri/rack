package com.drew.metadata.avi;

import com.drew.metadata.b;
import java.util.HashMap;

public class AviDirectory extends b {
    public static final String CHUNK_DATETIME_ORIGINAL = "IDIT";
    public static final String CHUNK_MAIN_HEADER = "avih";
    public static final String CHUNK_STREAM_HEADER = "strh";
    public static final String FORMAT = "AVI ";
    public static final String LIST_HEADER = "hdrl";
    public static final String LIST_STREAM_HEADER = "strl";
    public static final int TAG_AUDIO_CODEC = 5;
    public static final int TAG_DATETIME_ORIGINAL = 320;
    public static final int TAG_DURATION = 3;
    public static final int TAG_FRAMES_PER_SECOND = 1;
    public static final int TAG_HEIGHT = 7;
    public static final int TAG_SAMPLES_PER_SECOND = 2;
    public static final int TAG_STREAMS = 8;
    public static final int TAG_VIDEO_CODEC = 4;
    public static final int TAG_WIDTH = 6;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        AviDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(1, hashMap0, "Frames Per Second", 2, "Samples Per Second");
        com.apollographql.apollo.api.b.z(3, hashMap0, "Duration", 4, "Video Codec");
        com.apollographql.apollo.api.b.z(5, hashMap0, "Audio Codec", 6, "Width");
        com.apollographql.apollo.api.b.z(7, hashMap0, "Height", 8, "Stream Count");
        hashMap0.put(320, "Date/Time Original");
    }

    public AviDirectory() {
        this.setDescriptor(new A4.b(21, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "AVI";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return AviDirectory._tagNameMap;
    }
}


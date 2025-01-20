package com.drew.metadata.mp3;

import com.drew.metadata.b;
import java.util.HashMap;

public class Mp3Directory extends b {
    public static final int TAG_BITRATE = 3;
    public static final int TAG_COPYRIGHT = 7;
    public static final int TAG_EMPHASIS = 6;
    public static final int TAG_FRAME_SIZE = 8;
    public static final int TAG_FREQUENCY = 4;
    public static final int TAG_ID = 1;
    public static final int TAG_LAYER = 2;
    public static final int TAG_MODE = 5;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        Mp3Directory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(1, hashMap0, "ID", 2, "Layer");
        com.apollographql.apollo.api.b.z(3, hashMap0, "Bitrate", 4, "Frequency");
        com.apollographql.apollo.api.b.z(5, hashMap0, "Mode", 6, "Emphasis Method");
        com.apollographql.apollo.api.b.z(7, hashMap0, "Copyright", 8, "Frame Size");
    }

    public Mp3Directory() {
        this.setDescriptor(new A4.b(1, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "MP3";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return Mp3Directory._tagNameMap;
    }
}


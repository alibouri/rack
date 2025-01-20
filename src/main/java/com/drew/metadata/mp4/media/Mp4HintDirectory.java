package com.drew.metadata.mp4.media;

import com.apollographql.apollo.api.b;
import java.util.HashMap;

public class Mp4HintDirectory extends Mp4MediaDirectory {
    public static final int TAG_AVERAGE_BITRATE = 104;
    public static final int TAG_AVERAGE_PDU_SIZE = 102;
    public static final int TAG_MAX_BITRATE = 103;
    public static final int TAG_MAX_PDU_SIZE = 101;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        Mp4HintDirectory._tagNameMap = hashMap0;
        Mp4MediaDirectory.addMp4MediaTags(hashMap0);
        hashMap0.put(101, "Max PDU Size");
        hashMap0.put(102, "Average PDU Size");
        b.z(103, hashMap0, "Max Bitrate", 104, "Average Bitrate");
    }

    public Mp4HintDirectory() {
        this.setDescriptor(new A4.b(3, this));
    }

    @Override  // com.drew.metadata.mp4.Mp4Directory
    public String getName() {
        return "MP4 Hint";
    }

    @Override  // com.drew.metadata.mp4.Mp4Directory
    public HashMap getTagNameMap() {
        return Mp4HintDirectory._tagNameMap;
    }
}


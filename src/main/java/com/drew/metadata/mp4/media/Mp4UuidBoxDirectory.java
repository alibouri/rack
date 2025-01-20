package com.drew.metadata.mp4.media;

import A4.b;
import java.util.HashMap;

public class Mp4UuidBoxDirectory extends Mp4MediaDirectory {
    public static final Integer TAG_USER_DATA;
    public static final Integer TAG_UUID;
    private static final HashMap _tagNameMap;

    static {
        Integer integer0 = 901;
        Mp4UuidBoxDirectory.TAG_UUID = integer0;
        Integer integer1 = 902;
        Mp4UuidBoxDirectory.TAG_USER_DATA = integer1;
        HashMap hashMap0 = new HashMap();
        Mp4UuidBoxDirectory._tagNameMap = hashMap0;
        Mp4MediaDirectory.addMp4MediaTags(hashMap0);
        hashMap0.put(integer0, "UUID");
        hashMap0.put(integer1, "Data");
    }

    public Mp4UuidBoxDirectory() {
        this.setDescriptor(new b(7, this));
    }

    @Override  // com.drew.metadata.mp4.Mp4Directory
    public String getName() {
        return "UUID";
    }

    @Override  // com.drew.metadata.mp4.Mp4Directory
    public HashMap getTagNameMap() {
        return Mp4UuidBoxDirectory._tagNameMap;
    }
}


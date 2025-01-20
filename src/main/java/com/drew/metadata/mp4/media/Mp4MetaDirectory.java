package com.drew.metadata.mp4.media;

import A4.b;
import java.util.HashMap;

public class Mp4MetaDirectory extends Mp4MediaDirectory {
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        Mp4MetaDirectory._tagNameMap = hashMap0;
        Mp4MediaDirectory.addMp4MediaTags(hashMap0);
    }

    public Mp4MetaDirectory() {
        this.setDescriptor(new b(4, this));
    }

    @Override  // com.drew.metadata.mp4.Mp4Directory
    public String getName() {
        return "MP4 Metadata";
    }

    @Override  // com.drew.metadata.mp4.Mp4Directory
    public HashMap getTagNameMap() {
        return Mp4MetaDirectory._tagNameMap;
    }
}


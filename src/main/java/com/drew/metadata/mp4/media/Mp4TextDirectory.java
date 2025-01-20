package com.drew.metadata.mp4.media;

import A4.b;
import java.util.HashMap;

public class Mp4TextDirectory extends Mp4MediaDirectory {
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        Mp4TextDirectory._tagNameMap = hashMap0;
        Mp4MediaDirectory.addMp4MediaTags(hashMap0);
    }

    public Mp4TextDirectory() {
        this.setDescriptor(new b(6, this));
    }

    @Override  // com.drew.metadata.mp4.Mp4Directory
    public String getName() {
        return "MP4 Text";
    }

    @Override  // com.drew.metadata.mp4.Mp4Directory
    public HashMap getTagNameMap() {
        return Mp4TextDirectory._tagNameMap;
    }
}


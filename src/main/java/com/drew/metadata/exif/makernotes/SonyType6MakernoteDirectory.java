package com.drew.metadata.exif.makernotes;

import com.drew.metadata.b;
import java.util.HashMap;

public class SonyType6MakernoteDirectory extends b {
    public static final int TAG_MAKERNOTE_THUMB_LENGTH = 1300;
    public static final int TAG_MAKERNOTE_THUMB_OFFSET = 0x513;
    public static final int TAG_MAKERNOTE_THUMB_VERSION = 0x2000;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        SonyType6MakernoteDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(0x513, hashMap0, "Makernote Thumb Offset", 1300, "Makernote Thumb Length");
        hashMap0.put(0x2000, "Makernote Thumb Version");
    }

    public SonyType6MakernoteDirectory() {
        this.setDescriptor(new d(29, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "Sony Makernote";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return SonyType6MakernoteDirectory._tagNameMap;
    }
}


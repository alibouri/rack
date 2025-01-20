package com.drew.metadata.exif.makernotes;

import com.drew.metadata.b;
import java.util.HashMap;

public class KyoceraMakernoteDirectory extends b {
    public static final int TAG_PRINT_IMAGE_MATCHING_INFO = 0xE00;
    public static final int TAG_PROPRIETARY_THUMBNAIL = 1;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        KyoceraMakernoteDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(1, hashMap0, "Proprietary Thumbnail Format Data", 0xE00, "Print Image Matching (PIM) Info");
    }

    public KyoceraMakernoteDirectory() {
        this.setDescriptor(new d(8, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "Kyocera/Contax Makernote";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return KyoceraMakernoteDirectory._tagNameMap;
    }
}


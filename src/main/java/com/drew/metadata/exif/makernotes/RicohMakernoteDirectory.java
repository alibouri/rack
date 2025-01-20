package com.drew.metadata.exif.makernotes;

import com.drew.metadata.b;
import java.util.HashMap;

public class RicohMakernoteDirectory extends b {
    public static final int TAG_MAKERNOTE_DATA_TYPE = 1;
    public static final int TAG_PRINT_IMAGE_MATCHING_INFO = 0xE00;
    public static final int TAG_RICOH_CAMERA_INFO_MAKERNOTE_SUB_IFD_POINTER = 0x2001;
    public static final int TAG_VERSION = 2;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        RicohMakernoteDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(1, hashMap0, "Makernote Data Type", 2, "Version");
        com.apollographql.apollo.api.b.z(0xE00, hashMap0, "Print Image Matching (PIM) Info", 0x2001, "Ricoh Camera Info Makernote Sub-IFD");
    }

    public RicohMakernoteDirectory() {
        this.setDescriptor(new d(23, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "Ricoh Makernote";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return RicohMakernoteDirectory._tagNameMap;
    }
}


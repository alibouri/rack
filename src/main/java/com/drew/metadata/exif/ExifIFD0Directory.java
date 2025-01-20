package com.drew.metadata.exif;

import java.util.HashMap;
import q4.a;

public class ExifIFD0Directory extends ExifDirectoryBase {
    public static final int TAG_EXIF_SUB_IFD_OFFSET = 0x8769;
    public static final int TAG_GPS_INFO_OFFSET = 0x8825;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        ExifIFD0Directory._tagNameMap = hashMap0;
        ExifDirectoryBase.addExifTagNames(hashMap0);
    }

    public ExifIFD0Directory() {
        this.setDescriptor(new a(0, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "Exif IFD0";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return ExifIFD0Directory._tagNameMap;
    }
}


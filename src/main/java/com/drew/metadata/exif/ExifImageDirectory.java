package com.drew.metadata.exif;

import java.util.HashMap;
import q4.a;

public class ExifImageDirectory extends ExifDirectoryBase {
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        ExifImageDirectory._tagNameMap = hashMap0;
        ExifDirectoryBase.addExifTagNames(hashMap0);
    }

    public ExifImageDirectory() {
        this.setDescriptor(new a(1, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "Exif Image";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return ExifImageDirectory._tagNameMap;
    }
}


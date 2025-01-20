package com.drew.metadata.exif;

import java.util.HashMap;
import q4.a;

public class ExifInteropDirectory extends ExifDirectoryBase {
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        ExifInteropDirectory._tagNameMap = hashMap0;
        ExifDirectoryBase.addExifTagNames(hashMap0);
    }

    public ExifInteropDirectory() {
        this.setDescriptor(new a(2, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "Interoperability";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return ExifInteropDirectory._tagNameMap;
    }
}


package com.drew.metadata.exif;

import com.drew.metadata.b;
import java.util.HashMap;

public class PrintIMDirectory extends b {
    public static final int TagPrintImVersion;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        PrintIMDirectory._tagNameMap = hashMap0;
        hashMap0.put(0, "PrintIM Version");
    }

    public PrintIMDirectory() {
        this.setDescriptor(new A4.b(28, this));
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "PrintIM";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return PrintIMDirectory._tagNameMap;
    }
}


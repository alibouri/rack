package com.drew.metadata.jpeg;

import com.drew.metadata.b;
import java.util.HashMap;

public class JpegDirectory extends b {
    public static final int TAG_COMPONENT_DATA_1 = 6;
    public static final int TAG_COMPONENT_DATA_2 = 7;
    public static final int TAG_COMPONENT_DATA_3 = 8;
    public static final int TAG_COMPONENT_DATA_4 = 9;
    public static final int TAG_COMPRESSION_TYPE = -3;
    public static final int TAG_DATA_PRECISION = 0;
    public static final int TAG_IMAGE_HEIGHT = 1;
    public static final int TAG_IMAGE_WIDTH = 3;
    public static final int TAG_NUMBER_OF_COMPONENTS = 5;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        JpegDirectory._tagNameMap = hashMap0;
        com.apollographql.apollo.api.b.z(-3, hashMap0, "Compression Type", 0, "Data Precision");
        com.apollographql.apollo.api.b.z(3, hashMap0, "Image Width", 1, "Image Height");
        com.apollographql.apollo.api.b.z(5, hashMap0, "Number of Components", 6, "Component 1");
        com.apollographql.apollo.api.b.z(7, hashMap0, "Component 2", 8, "Component 3");
        hashMap0.put(9, "Component 4");
    }

    public JpegDirectory() {
        this.setDescriptor(new A4.b(16, this));
    }

    public c getComponent(int v) {
        return (c)this.getObject(v + 6);
    }

    public int getImageHeight() {
        return this.getInt(1);
    }

    public int getImageWidth() {
        return this.getInt(3);
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "JPEG";
    }

    public int getNumberOfComponents() {
        return this.getInt(5);
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return JpegDirectory._tagNameMap;
    }
}


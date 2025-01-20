package com.drew.metadata.exif;

import java.util.HashMap;
import q4.a;

public class ExifThumbnailDirectory extends ExifDirectoryBase {
    @Deprecated
    public static final int TAG_THUMBNAIL_COMPRESSION = 0x103;
    public static final int TAG_THUMBNAIL_LENGTH = 0x202;
    public static final int TAG_THUMBNAIL_OFFSET = 0x201;
    private final int _exifStartOffset;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        ExifThumbnailDirectory._tagNameMap = hashMap0;
        ExifDirectoryBase.addExifTagNames(hashMap0);
        hashMap0.put(0x201, "Thumbnail Offset");
        hashMap0.put(0x202, "Thumbnail Length");
    }

    public ExifThumbnailDirectory(int v) {
        this._exifStartOffset = v;
        this.setDescriptor(new a(4, this));
    }

    public Integer getAdjustedThumbnailOffset() {
        Integer integer0 = this.getInteger(0x201);
        return integer0 == null ? null : ((int)(((int)integer0) + this._exifStartOffset));
    }

    public int getExifStartOffset() {
        return this._exifStartOffset;
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "Exif Thumbnail";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return ExifThumbnailDirectory._tagNameMap;
    }
}


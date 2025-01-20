package com.drew.metadata.exif;

import com.drew.metadata.b;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;
import q4.a;

public class ExifSubIFDDirectory extends ExifDirectoryBase {
    public static final int TAG_INTEROP_OFFSET = 0xA005;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        ExifSubIFDDirectory._tagNameMap = hashMap0;
        ExifDirectoryBase.addExifTagNames(hashMap0);
    }

    public ExifSubIFDDirectory() {
        this.setDescriptor(new a(3, this));
    }

    public Date getDateDigitized() {
        return this.getDateDigitized(null);
    }

    public Date getDateDigitized(TimeZone timeZone0) {
        TimeZone timeZone1 = this.getTimeZone(0x9012);
        String s = this.getString(0x9292);
        if(timeZone1 != null) {
            timeZone0 = timeZone1;
        }
        return this.getDate(0x9004, s, timeZone0);
    }

    public Date getDateModified() {
        return this.getDateModified(null);
    }

    public Date getDateModified(TimeZone timeZone0) {
        b b0 = this.getParent();
        if(b0 instanceof ExifIFD0Directory) {
            TimeZone timeZone1 = this.getTimeZone(0x9010);
            String s = this.getString(0x9290);
            if(timeZone1 != null) {
                timeZone0 = timeZone1;
            }
            return b0.getDate(306, s, timeZone0);
        }
        return null;
    }

    public Date getDateOriginal() {
        return this.getDateOriginal(null);
    }

    public Date getDateOriginal(TimeZone timeZone0) {
        TimeZone timeZone1 = this.getTimeZone(0x9011);
        String s = this.getString(0x9291);
        if(timeZone1 != null) {
            timeZone0 = timeZone1;
        }
        return this.getDate(0x9003, s, timeZone0);
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "Exif SubIFD";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return ExifSubIFDDirectory._tagNameMap;
    }

    private TimeZone getTimeZone(int v) {
        String s = this.getString(v);
        return s == null || !s.matches("[\\+\\-]\\d\\d:\\d\\d") ? null : TimeZone.getTimeZone(("GMT" + s));
    }
}


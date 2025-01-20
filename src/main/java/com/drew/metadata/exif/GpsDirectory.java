package com.drew.metadata.exif;

import com.apollographql.apollo.api.b;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import l4.g;
import l4.k;

public class GpsDirectory extends ExifDirectoryBase {
    public static final int TAG_ALTITUDE = 6;
    public static final int TAG_ALTITUDE_REF = 5;
    public static final int TAG_AREA_INFORMATION = 28;
    public static final int TAG_DATE_STAMP = 29;
    public static final int TAG_DEST_BEARING = 24;
    public static final int TAG_DEST_BEARING_REF = 23;
    public static final int TAG_DEST_DISTANCE = 26;
    public static final int TAG_DEST_DISTANCE_REF = 25;
    public static final int TAG_DEST_LATITUDE = 20;
    public static final int TAG_DEST_LATITUDE_REF = 19;
    public static final int TAG_DEST_LONGITUDE = 22;
    public static final int TAG_DEST_LONGITUDE_REF = 21;
    public static final int TAG_DIFFERENTIAL = 30;
    public static final int TAG_DOP = 11;
    public static final int TAG_H_POSITIONING_ERROR = 0x1F;
    public static final int TAG_IMG_DIRECTION = 17;
    public static final int TAG_IMG_DIRECTION_REF = 16;
    public static final int TAG_LATITUDE = 2;
    public static final int TAG_LATITUDE_REF = 1;
    public static final int TAG_LONGITUDE = 4;
    public static final int TAG_LONGITUDE_REF = 3;
    public static final int TAG_MAP_DATUM = 18;
    public static final int TAG_MEASURE_MODE = 10;
    public static final int TAG_PROCESSING_METHOD = 27;
    public static final int TAG_SATELLITES = 8;
    public static final int TAG_SPEED = 13;
    public static final int TAG_SPEED_REF = 12;
    public static final int TAG_STATUS = 9;
    public static final int TAG_TIME_STAMP = 7;
    public static final int TAG_TRACK = 15;
    public static final int TAG_TRACK_REF = 14;
    public static final int TAG_VERSION_ID;
    private static final HashMap _tagNameMap;

    static {
        HashMap hashMap0 = new HashMap();
        GpsDirectory._tagNameMap = hashMap0;
        ExifDirectoryBase.addExifTagNames(hashMap0);
        hashMap0.put(0, "GPS Version ID");
        hashMap0.put(1, "GPS Latitude Ref");
        b.z(2, hashMap0, "GPS Latitude", 3, "GPS Longitude Ref");
        b.z(4, hashMap0, "GPS Longitude", 5, "GPS Altitude Ref");
        b.z(6, hashMap0, "GPS Altitude", 7, "GPS Time-Stamp");
        b.z(8, hashMap0, "GPS Satellites", 9, "GPS Status");
        b.z(10, hashMap0, "GPS Measure Mode", 11, "GPS DOP");
        b.z(12, hashMap0, "GPS Speed Ref", 13, "GPS Speed");
        b.z(14, hashMap0, "GPS Track Ref", 15, "GPS Track");
        b.z(16, hashMap0, "GPS Img Direction Ref", 17, "GPS Img Direction");
        b.z(18, hashMap0, "GPS Map Datum", 19, "GPS Dest Latitude Ref");
        b.z(20, hashMap0, "GPS Dest Latitude", 21, "GPS Dest Longitude Ref");
        b.z(22, hashMap0, "GPS Dest Longitude", 23, "GPS Dest Bearing Ref");
        b.z(24, hashMap0, "GPS Dest Bearing", 25, "GPS Dest Distance Ref");
        b.z(26, hashMap0, "GPS Dest Distance", 27, "GPS Processing Method");
        b.z(28, hashMap0, "GPS Area Information", 29, "GPS Date Stamp");
        b.z(30, hashMap0, "GPS Differential", 0x1F, "GPS Horizontal Positioning Error");
    }

    public GpsDirectory() {
        this.setDescriptor(new A4.b(23, this));
    }

    public g getGeoLocation() {
        k[] arr_k = this.getRationalArray(2);
        k[] arr_k1 = this.getRationalArray(4);
        String s = this.getString(1);
        String s1 = this.getString(3);
        if(arr_k != null && arr_k.length == 3 && arr_k1 != null && arr_k1.length == 3 && s != null && s1 != null) {
            Double double0 = g.b(arr_k[0], arr_k[1], arr_k[2], s.equalsIgnoreCase("S"));
            Double double1 = g.b(arr_k1[0], arr_k1[1], arr_k1[2], s1.equalsIgnoreCase("W"));
            return double0 == null || double1 == null ? null : new g(((double)double0), ((double)double1));
        }
        return null;
    }

    public Date getGpsDate() {
        String s = this.getString(29);
        k[] arr_k = this.getRationalArray(7);
        if(s == null) {
            return null;
        }
        if(arr_k != null && arr_k.length == 3) {
            Locale locale0 = Locale.US;
            Object[] arr_object = {s, ((int)arr_k[0].doubleValue()), ((int)arr_k[1].doubleValue()), arr_k[2].doubleValue()};
            try {
                return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss.S z").parse(String.format(locale0, "%s %02d:%02d:%02.3f UTC", arr_object));
            }
            catch(ParseException unused_ex) {
            }
        }
        return null;
    }

    @Override  // com.drew.metadata.b
    public String getName() {
        return "GPS";
    }

    @Override  // com.drew.metadata.b
    public HashMap getTagNameMap() {
        return GpsDirectory._tagNameMap;
    }
}


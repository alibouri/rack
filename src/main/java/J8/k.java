package J8;

import r8.i;

public abstract class k {
    public static final Object a;
    public static final Object[][] b;
    public static final Object[][] c;
    public static final Object[][] d;
    public static final Object[][] e;

    static {
        Object object0 = new Object();
        k.a = object0;
        Integer integer0 = 18;
        Integer integer1 = 14;
        Integer integer2 = 20;
        Integer integer3 = 6;
        Integer integer4 = 2;
        Integer integer5 = 8;
        Integer integer6 = 30;
        k.b = new Object[][]{new Object[]{"00", integer0}, new Object[]{"01", integer1}, new Object[]{"02", integer1}, new Object[]{"10", object0, integer2}, new Object[]{"11", integer3}, new Object[]{"12", integer3}, new Object[]{"13", integer3}, new Object[]{"15", integer3}, new Object[]{"17", integer3}, new Object[]{"20", integer4}, new Object[]{"21", object0, integer2}, new Object[]{"22", object0, 29}, new Object[]{"30", object0, integer5}, new Object[]{"37", object0, integer5}, new Object[]{"90", object0, integer6}, new Object[]{"91", object0, integer6}, new Object[]{"92", object0, integer6}, new Object[]{"93", object0, integer6}, new Object[]{"94", object0, integer6}, new Object[]{"95", object0, integer6}, new Object[]{"96", object0, integer6}, new Object[]{"97", object0, integer6}, new Object[]{"98", object0, integer6}, new Object[]{"99", object0, integer6}};
        Integer integer7 = 17;
        Integer integer8 = 13;
        Integer integer9 = 15;
        Integer integer10 = 3;
        k.c = new Object[][]{new Object[]{"240", object0, integer6}, new Object[]{"241", object0, integer6}, new Object[]{"242", object0, integer3}, new Object[]{"250", object0, integer6}, new Object[]{"251", object0, integer6}, new Object[]{"253", object0, integer7}, new Object[]{"254", object0, integer2}, new Object[]{"400", object0, integer6}, new Object[]{"401", object0, integer6}, new Object[]{"402", integer7}, new Object[]{"403", object0, integer6}, new Object[]{"410", integer8}, new Object[]{"411", integer8}, new Object[]{"412", integer8}, new Object[]{"413", integer8}, new Object[]{"414", integer8}, new Object[]{"420", object0, integer2}, new Object[]{"421", object0, integer9}, new Object[]{"422", integer10}, new Object[]{"423", object0, integer9}, new Object[]{"424", integer10}, new Object[]{"425", integer10}, new Object[]{"426", integer10}};
        k.d = new Object[][]{new Object[]{"310", integer3}, new Object[]{"311", integer3}, new Object[]{"312", integer3}, new Object[]{"313", integer3}, new Object[]{"314", integer3}, new Object[]{"315", integer3}, new Object[]{"316", integer3}, new Object[]{"320", integer3}, new Object[]{"321", integer3}, new Object[]{"322", integer3}, new Object[]{"323", integer3}, new Object[]{"324", integer3}, new Object[]{"325", integer3}, new Object[]{"326", integer3}, new Object[]{"327", integer3}, new Object[]{"328", integer3}, new Object[]{"329", integer3}, new Object[]{"330", integer3}, new Object[]{"331", integer3}, new Object[]{"332", integer3}, new Object[]{"333", integer3}, new Object[]{"334", integer3}, new Object[]{"335", integer3}, new Object[]{"336", integer3}, new Object[]{"340", integer3}, new Object[]{"341", integer3}, new Object[]{"342", integer3}, new Object[]{"343", integer3}, new Object[]{"344", integer3}, new Object[]{"345", integer3}, new Object[]{"346", integer3}, new Object[]{"347", integer3}, new Object[]{"348", integer3}, new Object[]{"349", integer3}, new Object[]{"350", integer3}, new Object[]{"351", integer3}, new Object[]{"352", integer3}, new Object[]{"353", integer3}, new Object[]{"354", integer3}, new Object[]{"355", integer3}, new Object[]{"356", integer3}, new Object[]{"357", integer3}, new Object[]{"360", integer3}, new Object[]{"361", integer3}, new Object[]{"362", integer3}, new Object[]{"363", integer3}, new Object[]{"364", integer3}, new Object[]{"365", integer3}, new Object[]{"366", integer3}, new Object[]{"367", integer3}, new Object[]{"368", integer3}, new Object[]{"369", integer3}, new Object[]{"390", object0, integer9}, new Object[]{"391", object0, integer0}, new Object[]{"392", object0, integer9}, new Object[]{"393", object0, integer0}, new Object[]{"703", object0, integer6}};
        Integer integer11 = 10;
        Integer integer12 = 70;
        k.e = new Object[][]{new Object[]{"7001", integer8}, new Object[]{"7002", object0, integer6}, new Object[]{"7003", integer11}, new Object[]{"8001", integer1}, new Object[]{"8002", object0, integer2}, new Object[]{"8003", object0, integer6}, new Object[]{"8004", object0, integer6}, new Object[]{"8005", integer3}, new Object[]{"8006", integer0}, new Object[]{"8007", object0, integer6}, new Object[]{"8008", object0, 12}, new Object[]{"8018", integer0}, new Object[]{"8020", object0, 25}, new Object[]{"8100", integer3}, new Object[]{"8101", integer11}, new Object[]{"8102", integer4}, new Object[]{"8110", object0, integer12}, new Object[]{"8200", object0, integer12}};
    }

    public static String a(String s) {
        Object object0;
        if(s.isEmpty()) {
            return null;
        }
        if(s.length() < 2) {
            throw i.Z;
        }
        String s1 = s.substring(0, 2);
        Object[][] arr2_object = k.b;
        for(int v = 0; true; ++v) {
            object0 = k.a;
            if(v >= 24) {
                break;
            }
            Object[] arr_object = arr2_object[v];
            if(arr_object[0].equals(s1)) {
                Object object1 = arr_object[1];
                return object1 == object0 ? k.c(2, ((int)(((Integer)arr_object[2]))), s) : k.b(2, ((int)(((Integer)object1))), s);
            }
        }
        if(s.length() < 3) {
            throw i.Z;
        }
        String s2 = s.substring(0, 3);
        Object[][] arr2_object1 = k.c;
        for(int v1 = 0; v1 < 23; ++v1) {
            Object[] arr_object1 = arr2_object1[v1];
            if(arr_object1[0].equals(s2)) {
                Object object2 = arr_object1[1];
                return object2 == object0 ? k.c(3, ((int)(((Integer)arr_object1[2]))), s) : k.b(3, ((int)(((Integer)object2))), s);
            }
        }
        Object[][] arr2_object2 = k.d;
        for(int v2 = 0; v2 < 57; ++v2) {
            Object[] arr_object2 = arr2_object2[v2];
            if(arr_object2[0].equals(s2)) {
                Object object3 = arr_object2[1];
                return object3 == object0 ? k.c(4, ((int)(((Integer)arr_object2[2]))), s) : k.b(4, ((int)(((Integer)object3))), s);
            }
        }
        if(s.length() < 4) {
            throw i.Z;
        }
        String s3 = s.substring(0, 4);
        Object[][] arr2_object3 = k.e;
        for(int v3 = 0; v3 < 18; ++v3) {
            Object[] arr_object3 = arr2_object3[v3];
            if(arr_object3[0].equals(s3)) {
                Object object4 = arr_object3[1];
                return object4 == object0 ? k.c(4, ((int)(((Integer)arr_object3[2]))), s) : k.b(4, ((int)(((Integer)object4))), s);
            }
        }
        throw i.Z;
    }

    public static String b(int v, int v1, String s) {
        if(s.length() < v) {
            throw i.Z;
        }
        String s1 = s.substring(0, v);
        int v2 = v1 + v;
        if(s.length() < v2) {
            throw i.Z;
        }
        String s2 = "(" + s1 + ')' + s.substring(v, v2);
        String s3 = k.a(s.substring(v2));
        return s3 == null ? s2 : s2 + s3;
    }

    public static String c(int v, int v1, String s) {
        int v2 = s.length() >= v1 + v ? v1 + v : s.length();
        String s1 = "(" + s.substring(0, v) + ')' + s.substring(v, v2);
        String s2 = k.a(s.substring(v2));
        return s2 == null ? s1 : s1 + s2;
    }
}


package J1;

public abstract class q0 {
    public static int a(int v) {
        int v1 = 0;
        for(int v2 = 1; v2 <= 0x100; v2 <<= 1) {
            if((v & v2) != 0) {
                switch(v2) {
                    case 1: {
                        v1 |= 1;
                        break;
                    }
                    case 2: {
                        v1 |= 2;
                        break;
                    }
                    case 4: {
                        v1 |= 4;
                        break;
                    }
                    case 8: {
                        v1 |= 8;
                        break;
                    }
                    case 16: {
                        v1 |= 16;
                        break;
                    }
                    case 0x20: {
                        v1 |= 0x20;
                        break;
                    }
                    case 0x40: {
                        v1 |= 0x40;
                        break;
                    }
                    case 0x80: {
                        v1 |= 0x80;
                    }
                }
            }
        }
        return v1;
    }
}


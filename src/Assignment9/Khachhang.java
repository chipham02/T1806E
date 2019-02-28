package Assignment9;

import java.time.LocalDate;

public abstract class Khachhang {
    int MKH;
    String name;
    LocalDate ex_date;
    int soluong;

    public static final int M1 = 1000;
    public static final int M2 = 1200;
    public static final int M3 = 1500;
    public static final int M4 = 2000;

    public static final int DM1 = 50;
    public static final int DM2 = 100;
    public static final int DM3 = 200;

    public abstract int tinhtien();
}

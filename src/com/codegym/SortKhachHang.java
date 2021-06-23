package com.codegym;

import java.util.Comparator;

public class SortKhachHang implements Comparator<KhachHang> {

    @Override
    public int compare(KhachHang o1, KhachHang o2) {
        return o1.maKhachHang.compareTo(o2.maKhachHang);
    }
}

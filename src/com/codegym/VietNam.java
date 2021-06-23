package com.codegym;

public class VietNam extends KhachHang {
    int dinhMuc;


    public VietNam() {

    }
    public VietNam(int dinhMuc) {
        this.dinhMuc = dinhMuc;
    }

    public VietNam(String maKhachHang, String hoTen, String ngayRaHoaDon, int soLuong, int donGia, int dinhMuc) {
        super(maKhachHang, hoTen, ngayRaHoaDon, soLuong, donGia);
        this.dinhMuc = dinhMuc;
    }

    @Override
    public String toString() {
        return "VietNam{" +
                "maKhachHang='" + maKhachHang + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", ngayRaHoaDon='" + ngayRaHoaDon + '\'' +
                ", soLuong='" + soLuong + '\'' +
                ", donGia=" + donGia +
                ", dinhMuc=" + dinhMuc +
                '}';
    }

    public void soLuong(int soLuong) {
    }
}

package com.codegym;

public class VietNam extends KhachHang{


    public VietNam() {
    }


    public VietNam(String maKhachHang, String hoTen, String ngayRaHoaDon, String soLuong, String donGia) {
        super(maKhachHang, maKhachHang, hoTen, ngayRaHoaDon, soLuong, donGia);
    }


    @Override
    public String toString() {
        return "VietNam{" +
                "maKhachHang='" + maKhachHang + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", ngayRaHoaDon='" + ngayRaHoaDon + '\'' +
                ", soLuong='" + soLuong + '\'' +
                ", donGia='" + donGia + '\'' + '\'' +
                '}';
    }
}

package com.codegym;

public class NuocNgoai extends KhachHang {
    String quocGia;

    public NuocNgoai() {
    }

    public NuocNgoai(String quocGia) {
        this.quocGia = quocGia;
    }

    public NuocNgoai(String maKhachHang, String hoTen, String ngayRaHoaDon, int soLuong, int donGia, String quocGia) {
        super(maKhachHang, hoTen, ngayRaHoaDon, soLuong, donGia);
        this.quocGia = quocGia;
    }


    @Override
    public String toString() {
        return "NuocNgoai{" +
                "maKhachHang='" + maKhachHang + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", ngayRaHoaDon='" + ngayRaHoaDon + '\'' +
                ", soLuong='" + soLuong + '\'' +
                ", donGia='" + donGia + '\'' +
                ", quocGia='" + quocGia + '\'' +
                '}';
    }
}

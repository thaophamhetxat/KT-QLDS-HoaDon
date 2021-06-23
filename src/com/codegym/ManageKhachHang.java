package com.codegym;

import java.util.*;

class ManagerKhachHang {
    List<KhachHang> khachHang = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static SortKhachHang sortKhachHang = new SortKhachHang();

    public void addKhachHang(String quocGiaKhachHang) {
        KhachHang khachHangs = create(quocGiaKhachHang);
        khachHang.add(khachHangs);
    }

    public KhachHang create(String quocGiaKhachHang) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ma khach hang");
        String maKhachHang = scanner.nextLine();
        System.out.println("Ho ten");
        String hoTen = scanner.nextLine();
        System.out.println("Ngay ra hoa don");
        String ngayRaHoaDon = scanner.nextLine();
        System.out.println("So luong");
        int soLuong = Integer.parseInt(scanner.nextLine());
        System.out.println("Don gia");
        int donGia = Integer.parseInt(scanner.nextLine());


        if (quocGiaKhachHang == "VietNam") {
            int thanhTien = 0;
            System.out.println("dinh muc");
            int dinhMuc = Integer.parseInt(scanner.nextLine());
            return new VietNam(maKhachHang, hoTen, ngayRaHoaDon, soLuong, donGia, dinhMuc);
        }
        if (quocGiaKhachHang == "NuocNgoai") {
            System.out.println("Quoc gia");
            String quocGia = scanner.nextLine();
            return new NuocNgoai(maKhachHang, hoTen, ngayRaHoaDon, soLuong, donGia, quocGia);
        }
        return null;
    }

    public void show() {
        for (KhachHang k : khachHang) {
            System.out.println(k);
        }
    }

    public void delete() {
        String indexdel = scanner.nextLine();
        khachHang.removeIf(x -> x.getHoTen().equals(indexdel));
    }

    public void searchName() {
        String index = scanner.nextLine();
        for (KhachHang c : khachHang) {
            if (c.getHoTen().equals(index)) {
                System.out.println(c);
            }
        }
    }

    public void sortMaKhachHang() {
        Collections.sort(khachHang, sortKhachHang);
    }




    public  void edit(String index) {
        for (KhachHang s : khachHang) {
            if (s.getMaKhachHang().equals(index)) {
                if (s instanceof VietNam) {
                    System.out.println("ma khach hang");
                    String maKhachHang = scanner.nextLine();
                    System.out.println("Ho ten");
                    String hoTen = scanner.nextLine();
                    System.out.println("Ngay ra hoa don");
                    String ngayRaHoaDon = scanner.nextLine();
                    System.out.println("So luong");
                    int soLuong = Integer.parseInt(scanner.nextLine());
                    System.out.println("Don gia");
                    int donGia = Integer.parseInt(scanner.nextLine());
                    ((VietNam) s).setMaKhachHang(maKhachHang);
                    ((VietNam) s).setHoTen(hoTen);
                    ((VietNam) s).setNgayRaHoaDon(ngayRaHoaDon);
                    ((VietNam) s).setDonGia(donGia);
                    ((VietNam) s).soLuong(soLuong);
                }
            }
        }
    }

}

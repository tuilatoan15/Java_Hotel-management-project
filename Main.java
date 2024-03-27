import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
        static Scanner scanner = new Scanner(System.in);
    public static class KhachHang {
        String maKhach;
        String tenKhach;
        int tuoi;
        String soDT;
        String CCCD;
        String diaChi;
        int taiKhoan;

        // Constructor không tham số
        public KhachHang() {
            // Khởi tạo các thuộc tính mặc định (có thể rỗng hoặc có giá trị mặc định)
            this.maKhach = "";
            this.tenKhach = "";
            this.tuoi = 0;
            this.soDT = "";
            this.CCCD = "";
            this.diaChi = "";
            this.taiKhoan = 0;
        }

        // Constructor với tham số
        public KhachHang(String maKhach, String tenKhach, int tuoi, String soDT, String CCCD, String diaChi, int taiKhoan) {
            this.maKhach = maKhach;
            this.tenKhach = tenKhach;
            this.tuoi = tuoi;
            this.soDT = soDT;
            this.CCCD = CCCD;
            this.diaChi = diaChi;
            this.taiKhoan = taiKhoan;
        }

        // Phương thức getter cho maKhach
        public String getMaKhach() {
            return maKhach;
        }

        // Phương thức setter cho maKhach
        public void setMaKhach(String maKhach) {
            this.maKhach = maKhach;
        }

        // Phương thức getter cho tenKhach
        public String getTenKhach() {
            return tenKhach;
        }

        // Phương thức setter cho tenKhach
        public void setTenKhach(String tenKhach) {
            this.tenKhach = tenKhach;
        }

        // Phương thức getter cho tuoi
        public int getTuoi() {
            return tuoi;
        }

        // Phương thức setter cho tuoi
        public void setTuoi(int tuoi) {
            this.tuoi = tuoi;
        }

        // Phương thức getter cho soDT
        public String getSoDT() {
            return soDT;
        }

        // Phương thức setter cho soDT
        public void setSoDT(String soDT) {
            this.soDT = soDT;
        }

        // Phương thức getter cho CCCD
        public String getCCCD() {
            return CCCD;
        }

        // Phương thức setter cho CCCD
        public void setCCCD(String CCCD) {
            this.CCCD = CCCD;
        }

        // Phương thức getter cho diaChi
        public String getDiaChi() {
            return diaChi;
        }

        // Phương thức setter cho diaChi
        public void setDiaChi(String diaChi) {
            this.diaChi = diaChi;
        }

        // Phương thức getter cho taiKhoan
        public int getTaiKhoan() {
            return taiKhoan;
        }

        // Phương thức setter cho taiKhoan
        public void setTaiKhoan(int taiKhoan) {
            this.taiKhoan = taiKhoan;
        }

        // Phương thức thêm khách hàng mới
        public static void themKhachHang(DanhSachKhachHang danhSachKhachHang) {
            Scanner scanner = new Scanner(System.in);
            NodeKH nutMoi = new NodeKH();
            nutMoi.next = null;
            // Nhập mã khách hàng và kiểm tra tính hợp lệ
            do {
                System.out.print("Nhap ma khach hang: ");
                 nutMoi.getData().maKhach = scanner.nextLine();
                // Kiểm tra tính hợp lệ của mã khách hàng
                if (!Utils.isCode(nutMoi.getData().maKhach)) {
                    System.out.println("Ma khach hang khong hop le!");
                }
            } while (!Utils.isCode(nutMoi.getData().maKhach));

            // Nhập tên khách hàng và kiểm tra tính hợp lệ
            do {
                System.out.print("Nhap ten khach hang: ");
                nutMoi.getData().tenKhach = scanner.nextLine();
                // Kiểm tra tính hợp lệ của tên khách hàng
                if (!Utils.isName(nutMoi.getData().tenKhach)) {
                    System.out.println("Ten khach hang khong hop le!");
                }
            } while (!Utils.isName(nutMoi.getData().tenKhach));

            // Nhập tuổi và kiểm tra tính hợp lệ
            do {
                System.out.print("Nhap tuoi: ");
                nutMoi.getData().tuoi = scanner.nextInt();
                scanner.nextLine(); // Đọc bỏ dòng trống
                // Kiểm tra tính hợp lệ của tuổi
                if (!Utils.isAge(nutMoi.getData().tuoi)) {
                    System.out.println("Tuoi khong hop le!");
                }
            } while (!Utils.isAge(nutMoi.getData().tuoi));

            // Nhập số điện thoại và kiểm tra tính hợp lệ
            do {
                System.out.print("Nhap so dien thoai: ");
                nutMoi.getData().soDT = scanner.nextLine();
                // Kiểm tra tính hợp lệ của số điện thoại
                if (!Utils.isSDT(nutMoi.getData().soDT)) {
                    System.out.println("So dien thoai khong hop le!");
                }
            } while (!Utils.isSDT(nutMoi.getData().soDT));

            // Nhập CCCD và kiểm tra tính hợp lệ
            do {
                System.out.print("Nhap CCCD: ");
                nutMoi.getData().CCCD = scanner.nextLine();
                // Kiểm tra tính hợp lệ của CCCD
                if (!Utils.isCCCD(nutMoi.getData().CCCD)) {
                    System.out.println("CCCD khong hop le!");
                }
            } while (!Utils.isCCCD(nutMoi.getData().CCCD));

            // Nhập địa chỉ và kiểm tra tính hợp lệ
            do {
                System.out.print("Nhap dia chi: ");
                nutMoi.getData().diaChi = scanner.nextLine();
                // Kiểm tra tính hợp lệ của địa chỉ
                if (!Utils.isName(nutMoi.getData().diaChi)) {
                    System.out.println("Dia chi khong hop le!");
                }
            } while (!Utils.isName(nutMoi.getData().diaChi));

            // Nhập số dư tài khoản và kiểm tra tính hợp lệ
            do {
                System.out.print("Nhap so du tai khoan (VND): ");
                nutMoi.getData().taiKhoan = scanner.nextInt();
                scanner.nextLine(); // Đọc bỏ dòng trống
                // Kiểm tra tính hợp lệ của số dư tài khoản
                if (!Utils.isTaiKhoan(nutMoi.getData().taiKhoan)) {
                    System.out.println("So du tai khoan khong hop le!");
                }
            } while (!Utils.isTaiKhoan(nutMoi.getData().taiKhoan));

            // In thông báo khi thêm khách hàng thành công
            System.out.println("Khach hang da duoc them thanh cong!");
        }

        public static void suaKhachHang(DanhSachKhachHang danhSachKhachHang) {
            Scanner scanner = new Scanner(System.in);
            if (danhSachKhachHang.getDauKH() == null) {
                System.out.println("Danh sach khach hang rong.");
                return;
            }

            System.out.print("Nhap ma khach hang can sua: ");
            String maKhachCanSua = scanner.nextLine();

            NodeKH hienTai = danhSachKhachHang.getDauKH();
            while (hienTai != null) {
                if (hienTai.data.maKhach.equals(maKhachCanSua)) {
                    System.out.println("Thong tin cu cua khach hang:");
                    System.out.println("+---------------+--------------------+------+---------------+--------------------+--------------------+---------------+");
                    System.out.println("|   Ma khach    |     Ten khach      | Tuoi | So dien thoai |       CCCD         |      Dia chi       |   Tai khoan   |");
                    System.out.println("+---------------+--------------------+------+---------------+--------------------+--------------------+---------------+");
                    // Gọi phương thức in thông tin của một khách hàng ở đây

                    do {
                        System.out.print("Nhap ten khach hang: ");
                        hienTai.data.tenKhach = scanner.nextLine();
                        if (!Utils.isName(hienTai.data.tenKhach)) {
                            System.out.println("Ten khach hang khong hop le!\n(Ten hop le: VD: Nguyen Huu Toan)\nVui long nhap lai ten khach hang khac!\n");
                        }
                    } while (!Utils.isName(hienTai.data.tenKhach));

                    do {
                        System.out.print("Nhap tuoi moi: ");
                        hienTai.data.tuoi = scanner.nextInt();
                        scanner.nextLine();
                        if (!Utils.isAge(hienTai.data.tuoi)) {
                            System.out.println("Tuoi khong hop le!\nVui long nhap tuoi khac!\n");
                        }
                    } while (!Utils.isAge(hienTai.data.tuoi));

                    do {
                        System.out.print("Nhap so dien thoai moi: ");
                        hienTai.data.soDT = scanner.nextLine();
                        if (!Utils.isSDT(hienTai.data.soDT)) {
                            System.out.println("So dien thoai khong hop le!\nVui long nhap lai so dien thoai khac!\n");
                        }
                    } while (!Utils.isSDT(hienTai.data.soDT));

                    do {
                        System.out.print("Nhap CCCD moi: ");
                        hienTai.data.CCCD = scanner.nextLine();
                        if (!Utils.isCCCD(hienTai.data.CCCD)) {
                            System.out.println("CCCD khong hop le!\nVui long nhap lai so CCCD khac!\n");
                        }
                    } while (!Utils.isCCCD(hienTai.data.CCCD));

                    do {
                        System.out.print("Nhap dia chi moi: ");
                        hienTai.data.diaChi = scanner.nextLine();
                        if (!Utils.isName(hienTai.data.diaChi)) {
                            System.out.println("Dia chi khong hop le!\n(Dia chi hop le: VD: Binh Dinh, Tp Ho Chi Minh)\nVui long nhap lai 1 dia chi khac!\n");
                        }
                    } while (!Utils.isName(hienTai.data.diaChi));

                    do {
                        System.out.print("Nhap tai khoan moi: ");
                        hienTai.data.taiKhoan = scanner.nextInt();
                        scanner.nextLine();
                        if (!Utils.isTaiKhoan(hienTai.data.taiKhoan)) {
                            System.out.println("So du tai khoan khong hop le!\n(So du tai khoan hop le: VD: 100 000(tro len))\nVui long nhap lai 1 so du tai khoan khac!\n");
                        }
                    } while (!Utils.isTaiKhoan(hienTai.data.taiKhoan));

                    System.out.println("Thong tin khach hang da duoc cap nhat!");
                    return;
                }
                hienTai = hienTai.next;
            }

            System.out.println("Khong tim thay khach hang co ma " + maKhachCanSua + " trong danh sach.");
        }

        public static void xoaKhachHang(DanhSachKhachHang danhSachKhachHang) {
            Scanner scanner = new Scanner(System.in);
            if (danhSachKhachHang.getDauKH() == null) {
                System.out.println("Danh sach khach hang rong.");
                return;
            }

            System.out.print("Nhap ma khach hang can xoa: ");
            String maKhachCanXoa = scanner.nextLine();

            NodeKH hienTai = danhSachKhachHang.getDauKH();
            NodeKH truocNo = null;

            while (hienTai != null) {
                if (hienTai.data.maKhach.equals(maKhachCanXoa)) {
                    if (hienTai == danhSachKhachHang.getDauKH()) {
                        danhSachKhachHang.setDauKH(hienTai.next);
                    }

                    if (hienTai == danhSachKhachHang.getCuoiKH()) {
                        danhSachKhachHang.setCuoiKH(truocNo);
                        if (truocNo != null) {
                            truocNo.next = null;
                        }
                    }

                    if (truocNo != null && hienTai.next != null) {
                        truocNo.next = hienTai.next;
                    }

                    System.out.println("Khach hang da duoc xoa thanh cong!");
                    return;
                }

                truocNo = hienTai;
                hienTai = hienTai.next;
            }

            System.out.println("Khong tim thay khach hang co ma " + maKhachCanXoa + " trong danh sach.");
        }
    }

    static class NodeKH {
        KhachHang data;
        NodeKH next;

        // Constructor không tham số
        public NodeKH() {
            this.data = null;
            this.next = null;
        }

        public NodeKH(KhachHang data, NodeKH next) {
            this.data = data;
            this.next = next;
        }

        // Phương thức getter cho data
        public KhachHang getData() {
            return data;
        }

        // Phương thức setter cho data
        public void setData(KhachHang data) {
            this.data = data;
        }

        // Phương thức getter cho next
        public NodeKH getNext() {
            return next;
        }

        // Phương thức setter cho next
        public void setNext(NodeKH next) {
            this.next = next;
        }
    }

    class DanhSachKhachHang {
        private NodeKH dauKH;
        private NodeKH cuoiKH;
        public DanhSachKhachHang() {
            this.dauKH = new NodeKH();
            this.cuoiKH = null;
        }
        public NodeKH getDauKH() {
            return dauKH;
        }
        public void setDauKH(NodeKH newDauKH) {
            dauKH = newDauKH;
        }
        public NodeKH getCuoiKH() {
            return cuoiKH;
        }
        public void setCuoiKH(NodeKH newCuoiKH) {
            cuoiKH = newCuoiKH;
        }

        public void inDSKhachHang() {
            NodeKH current = dauKH;
            System.out.println("Danh sách khách hàng:");
            while (current != null) {
                KhachHang khachHang = current.data;
                System.out.println("Mã khách hàng: " + khachHang.maKhach);
                System.out.println("Tên khách hàng: " + khachHang.tenKhach);
                System.out.println("Tuổi: " + khachHang.tuoi);
                System.out.println("Số điện thoại: " + khachHang.soDT);
                System.out.println("CCCD: " + khachHang.CCCD);
                System.out.println("Địa chỉ: " + khachHang.diaChi);
                System.out.println("Tài khoản: " + khachHang.taiKhoan);
                System.out.println("-----------------------------");
                current = current.next;
            }
        }

        public void timKiemKHTheoMaKhach() {
            System.out.print("\nNhập mã khách hàng cần tìm: ");
            String maKhach = scanner.nextLine();
            NodeKH current = dauKH;
            boolean found = false;
            while (current != null) {
                if (current.data.maKhach.equals(maKhach)) {
                    KhachHang khachHang = current.data;
                    System.out.println("Thông tin khách hàng:");
                    System.out.println("Mã khách hàng: " + khachHang.maKhach);
                    System.out.println("Tên khách hàng: " + khachHang.tenKhach);
                    System.out.println("Tuổi: " + khachHang.tuoi);
                    System.out.println("Số điện thoại: " + khachHang.soDT);
                    System.out.println("CCCD: " + khachHang.CCCD);
                    System.out.println("Địa chỉ: " + khachHang.diaChi);
                    System.out.println("Tài khoản: " + khachHang.taiKhoan);
                    found = true;
                    break;
                }
                current = current.next;
            }
            if (!found) {
                System.out.println("Không tìm thấy khách hàng có mã: " + maKhach);
            }
        }

        public void timKiemKHTheoTen() {
            System.out.print("\nNhập tên khách hàng cần tìm: ");
            String tenKhach = scanner.nextLine();
            NodeKH current = dauKH;
            boolean found = false;
            while (current != null) {
                if (current.data.tenKhach.equals(tenKhach)) {
                    KhachHang khachHang = current.data;
                    System.out.println("Thông tin khách hàng:");
                    System.out.println("Mã khách hàng: " + khachHang.maKhach);
                    System.out.println("Tên khách hàng: " + khachHang.tenKhach);
                    System.out.println("Tuổi: " + khachHang.tuoi);
                    System.out.println("Số điện thoại: " + khachHang.soDT);
                    System.out.println("CCCD: " + khachHang.CCCD);
                    System.out.println("Địa chỉ: " + khachHang.diaChi);
                    System.out.println("Tài khoản: " + khachHang.taiKhoan);
                    System.out.println("-----------------------------");
                    found = true;
                }
                current = current.next;
            }
            if (!found) {
                System.out.println("Không tìm thấy khách hàng có tên: " + tenKhach);
            }
        }

        public void sapXepKHTangDanTheoTen() {
            // Sử dụng cơ chế sắp xếp của Collection
            List<KhachHang> listKhachHang = new ArrayList<>();
            NodeKH current = dauKH;
            while (current != null) {
                listKhachHang.add(current.data);
                current = current.next;
            }
            Collections.sort(listKhachHang, new Comparator<KhachHang>() {
                @Override
                public int compare(KhachHang kh1, KhachHang kh2) {
                    return kh1.tenKhach.compareTo(kh2.tenKhach);
                }
            });

            // In danh sách đã sắp xếp
            System.out.println("Danh sách khách hàng sau khi sắp xếp tăng dần theo tên:");
            for (KhachHang khachHang : listKhachHang) {
                System.out.println("Tên khách hàng: " + khachHang.tenKhach);
            }
        }

        public void sapXepKHGiamDanTheoTen() {
            // Sử dụng cơ chế sắp xếp của Collection
            List<KhachHang> listKhachHang = new ArrayList<>();
            NodeKH current = dauKH;
            while (current != null) {
                listKhachHang.add(current.data);
                current = current.next;
            }
            Collections.sort(listKhachHang, new Comparator<KhachHang>() {
                @Override
                public int compare(KhachHang kh1, KhachHang kh2) {
                    return kh2.tenKhach.compareTo(kh1.tenKhach);
                }
            });

            // In danh sách đã sắp xếp
            System.out.println("Danh sách khách hàng sau khi sắp xếp giảm dần theo tên:");
            for (KhachHang khachHang : listKhachHang) {
                System.out.println("Tên khách hàng: " + khachHang.tenKhach);
            }
        }

    }

    static class Phong {
        String maPhong;
        boolean loaiPhong;
        int giaPhong;
        boolean trangThai;

        public Phong() {
            this.maPhong = "";
            this.loaiPhong = false;
            this.giaPhong = 0;
            this.trangThai = false;
        }
        // Constructor
        public Phong(String maPhong, boolean loaiPhong, int giaPhong, boolean trangThai) {
            this.maPhong = maPhong;
            this.loaiPhong = loaiPhong;
            this.giaPhong = giaPhong;
            this.trangThai = trangThai;
        }

        // Getter và Setter cho maPhong
        public String getMaPhong() {
            return maPhong;
        }

        public void setMaPhong(String maPhong) {
            this.maPhong = maPhong;
        }

        // Getter và Setter cho loaiPhong
        public boolean isLoaiPhong() {
            return loaiPhong;
        }

        public void setLoaiPhong(boolean loaiPhong) {
            this.loaiPhong = loaiPhong;
        }

        // Getter và Setter cho giaPhong
        public int getGiaPhong() {
            return giaPhong;
        }

        public void setGiaPhong(int giaPhong) {
            this.giaPhong = giaPhong;
        }

        // Getter và Setter cho trangThai
        public boolean isTrangThai() {
            return trangThai;
        }

        public void setTrangThai(boolean trangThai) {
            this.trangThai = trangThai;
        }

        private static boolean kiemTraPhongTonTai(DanhSachPhong danhSachPhong, String maPhong) {
            Node hienTai = danhSachPhong.getDau();
            while (hienTai != null) {
                if (hienTai.data.maPhong.equals(maPhong)) {
                    // Phong ton tai trong danh sach
                    return true;
                }
                hienTai = hienTai.next;
            }
            // Phong khong ton tai trong danh sach
            return false;
        }

        public static void themPhong(DanhSachPhong danhSachPhong) {
            Scanner scanner = new Scanner(System.in);
            Node nutMoi = new Node();
            nutMoi.next = null;

            do {
                System.out.print("Nhap ma phong: ");
                nutMoi.data.maPhong = scanner.nextLine();
                if (!Utils.isCode(nutMoi.data.maPhong)) {
                    System.out.println("Ma phong khong hop le!\n(Ma phong hop le: VD: PH001)\nVui long nhap ma phong khac!\n");
                }

                if (kiemTraPhongTonTai(danhSachPhong, nutMoi.data.maPhong)) {
                    System.out.println("Ma phong nay da ton tai!\nVui long nhap ma phong khac!");
                }
            } while (!Utils.isCode(nutMoi.data.maPhong) || kiemTraPhongTonTai(danhSachPhong, nutMoi.data.maPhong));

            do {
                System.out.print("Nhap loai phong (1: VIP, 0: Thuong): ");
                nutMoi.data.loaiPhong = scanner.nextBoolean();
                scanner.nextLine();
                if (!Utils.isLoaiPhong(nutMoi.data.loaiPhong)) {
                    System.out.println("Loai phong khong hop le!\nVui long nhap loai phong khac!\n");
                }
            } while (!Utils.isLoaiPhong(nutMoi.data.loaiPhong));

            do {
                System.out.print("Nhap gia phong (VND): ");
                nutMoi.data.giaPhong = scanner.nextInt();
                if (!Utils.isTaiKhoan(nutMoi.data.giaPhong)) {
                    System.out.println("Gia phong khong hop le!\n(Gia phong hop le: VD: 100 000(tro len))\nVui long nhap 1 gia phong khac!\n");
                }
            } while (!Utils.isTaiKhoan(nutMoi.data.giaPhong));

            do {
                System.out.print("Nhap trang thai phong (1: Trong, 0: Da dat): ");
                nutMoi.data.trangThai = scanner.nextBoolean();
                scanner.nextLine();
                if (!Utils.isTrangThai(nutMoi.data.trangThai)) {
                    System.out.println("Trang thai khong hop le!\nVui long nhap lai trang thai khac!\n");
                }
            } while (!Utils.isTrangThai(nutMoi.data.trangThai));

            if (danhSachPhong.getDau() == null) {
                danhSachPhong.setDau(nutMoi);
                danhSachPhong.setCuoi(nutMoi);
            } else {
                danhSachPhong.getCuoi().next = nutMoi;
                danhSachPhong.setCuoi(nutMoi);
            }

            System.out.println("Phong da duoc them thanh cong!");
        }

        // Phương thức sửa thông tin của một phòng
        public static void suaPhong(DanhSachPhong danhSachPhong) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap ma phong can sua: ");
            String maPhongCanSua = scanner.nextLine();

            // Tìm phòng trong danh sách
            Node hienTai = danhSachPhong.getDau();
            while (hienTai != null) {
                if (hienTai.data.maPhong.equals(maPhongCanSua)) {
                    // Hiển thị thông tin cũ của phòng
                    System.out.println("Thong tin cu cua phong:");
                    System.out.println("+---------------+---------------+---------------+---------------+");
                    System.out.println("|   Ma phong    |  Loai phong   |   Gia phong   |  Trang thai   |");
                    System.out.println("+---------------+---------------+---------------+---------------+");
                    DatPhong.inThongTin1Phong(hienTai.data);
                    System.out.println("+---------------+---------------+---------------+---------------+");

                    // Nhập thông tin mới
                    do {
                        System.out.print("Nhap loai phong moi (1: VIP, 0: Thuong): ");
                        hienTai.data.loaiPhong = scanner.nextBoolean();
                        if (!Utils.isLoaiPhong(hienTai.data.loaiPhong)) {
                            System.out.println("Loai phong khong hop le!\nVui long nhap loai phong khac!");
                        }
                    } while (!Utils.isLoaiPhong(hienTai.data.loaiPhong));

                    do {
                        System.out.print("Nhap gia phong moi: ");
                        hienTai.data.giaPhong = scanner.nextInt();
                        if (!Utils.isTaiKhoan(hienTai.data.giaPhong)) {
                            System.out.println("Gia phong khong hop le!\n(Gia phong hop le: VD: 100 000(tro len))\nVui long nhap 1 gia phong khac!");
                        }
                    } while (!Utils.isTaiKhoan(hienTai.data.giaPhong));

                    do {
                        System.out.print("Nhap trang thai phong moi (1: Trong, 0: Da dat): ");
                        hienTai.data.trangThai = scanner.nextBoolean();
                        if (!Utils.isTrangThai(hienTai.data.trangThai)) {
                            System.out.println("Trang thai khong hop le!\nVui long nhap lai trang thai khac!");
                        }
                    } while (!Utils.isTrangThai(hienTai.data.trangThai));

                    System.out.println("Thong tin phong da duoc cap nhat!");
                    return;
                }
                hienTai = hienTai.next;
            }

            System.out.println("Khong tim thay phong co ma " + maPhongCanSua + " trong danh sach.");
        }

        // Phương thức xóa một phòng khỏi danh sách
        public static void xoaPhong(DanhSachPhong danhSachPhong) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap ma phong can xoa: ");
            String maPhongCanXoa = scanner.nextLine();

            // Tìm phòng trong danh sách
            Node hienTai = danhSachPhong.getDau();
            Node truocNo = null;

            while (hienTai != null) {
                if (hienTai.data.maPhong.equals(maPhongCanXoa)) {
                    // Nếu phòng cần xóa là phòng đầu danh sách
                    if (hienTai == danhSachPhong.getDau()) {
                        danhSachPhong.setDau(hienTai.next);
                    }

                    // Nếu phòng cần xóa là phòng cuối danh sách
                    if (hienTai == danhSachPhong.getCuoi()) {
                        danhSachPhong.setCuoi(truocNo);
                        if (truocNo != null) {
                            truocNo.next = null;
                        }
                    }

                    // Nếu phòng cần xóa ở giữa danh sách
                    if (truocNo != null && hienTai.next != null) {
                        truocNo.next = hienTai.next;
                    }

                    // Giải phóng bộ nhớ của nút cần xóa
                    hienTai = null;

                    System.out.println("Phong da duoc xoa thanh cong!");
                    return;
                }

                truocNo = hienTai;
                hienTai = hienTai.next;
            }

            System.out.println("Khong tim thay phong co ma " + maPhongCanXoa + " trong danh sach.");
        }

    }

    public static class Node {
        private Phong data;
        private Node next;

        // Constructor không đối số
        public Node() {
            this.data = new Phong(); // Khởi tạo đối tượng data
            this.next = null;
        }

        // Constructor có đối số
        public Node(Phong data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Phong getData() {
            return data;
        }

        public void setData(Phong data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    class DanhSachPhong {
        private Node dau;
        private Node cuoi;
        public DanhSachPhong() {
            this.dau = null;
            this.cuoi = null;
        }
        public Node getDau() {
            return dau;
        }
        public void setDau(Node newDau) {
            dau = newDau;
        }
        public Node getCuoi() {
            return cuoi;
        }
        public void setCuoi(Node newCuoi) {
            cuoi = newCuoi;
        }

        public void inDanhSachPhong() {
            Node current = dau;
            System.out.println("Danh sách phòng:");
            while (current != null) {
                Phong phong = current.data;
                System.out.println("Mã phòng: " + phong.maPhong);
                System.out.println("Loại phòng: " + (phong.loaiPhong ? "VIP" : "Thường"));
                System.out.println("Giá phòng: " + phong.giaPhong);
                System.out.println("Trạng thái: " + (phong.trangThai ? "Đã đặt" : "Trống"));
                System.out.println("-----------------------------");
                current = current.next;
            }
        }

        public void timKiemPhongTheoMaPhong() {
            System.out.print("\nNhập mã phòng cần tìm: ");
            String maPhong = scanner.nextLine();
            Node current = dau;
            boolean found = false;
            while (current != null) {
                if (current.data.maPhong.equals(maPhong)) {
                    Phong phong = current.data;
                    System.out.println("Thông tin phòng:");
                    System.out.println("Mã phòng: " + phong.maPhong);
                    System.out.println("Loại phòng: " + (phong.loaiPhong ? "VIP" : "Thường"));
                    System.out.println("Giá phòng: " + phong.giaPhong);
                    System.out.println("Trạng thái: " + (phong.trangThai ? "Đã đặt" : "Trống"));
                    found = true;
                    break;
                }
                current = current.next;
            }
            if (!found) {
                System.out.println("Không tìm thấy phòng có mã: " + maPhong);
            }
        }

        public void timKiemPhongTheoTrangThai() {
            System.out.print("Nhập trạng thái phòng cần tìm: ");
            boolean trangThai = scanner.nextBoolean();
            Node current = dau;
            System.out.println("Danh sách phòng có trạng thái " + (trangThai ? "đã đặt:" : "trống:"));
            boolean found = false;
            while (current != null) {
                if (current.data.trangThai == trangThai) {
                    Phong phong = current.data;
                    System.out.println("Mã phòng: " + phong.maPhong);
                    System.out.println("Loại phòng: " + (phong.loaiPhong ? "VIP" : "Thường"));
                    System.out.println("Giá phòng: " + phong.giaPhong);
                    System.out.println("Trạng thái: " + (phong.trangThai ? "Đã đặt" : "Trống"));
                    System.out.println("-----------------------------");
                    found = true;
                }
                current = current.next;
            }
            if (!found) {
                System.out.println("Không có phòng nào có trạng thái " + (trangThai ? "đã đặt." : "trống."));
            }
        }

        public void sapXepPhongTheoMaPhong() {
            List<Phong> listPhong = new ArrayList<>();
            Node current = dau;
            while (current != null) {
                listPhong.add(current.data);
                current = current.next;
            }
            Collections.sort(listPhong, new Comparator<Phong>() {
                @Override
                public int compare(Phong p1, Phong p2) {
                    return p1.maPhong.compareTo(p2.maPhong);
                }
            });

            System.out.println("Danh sách phòng sau khi sắp xếp theo mã phòng:");
            for (Phong phong : listPhong) {
                System.out.println("Mã phòng: " + phong.maPhong);
                System.out.println("Loại phòng: " + (phong.loaiPhong ? "VIP" : "Thường"));
                System.out.println("Giá phòng: " + phong.giaPhong);
                System.out.println("Trạng thái: " + (phong.trangThai ? "Đã đặt" : "Trống"));
                System.out.println("-----------------------------");
            }
        }

        public void sapXepPhongTheoTrangThai() {
            List<Phong> listPhong = new ArrayList<>();
            Node current = dau;
            while (current != null) {
                listPhong.add(current.data);
                current = current.next;
            }
            Collections.sort(listPhong, new Comparator<Phong>() {
                @Override
                public int compare(Phong p1, Phong p2) {
                    return Boolean.compare(p1.trangThai, p2.trangThai);
                }
            });

            System.out.println("Danh sách phòng sau khi sắp xếp theo trạng thái:");
            for (Phong phong : listPhong) {
                System.out.println("Mã phòng: " + phong.maPhong);
                System.out.println("Loại phòng: " + (phong.loaiPhong ? "VIP" : "Thường"));
                System.out.println("Giá phòng: " + phong.giaPhong);
                System.out.println("Trạng thái: " + (phong.trangThai ? "Đã đặt" : "Trống"));
                System.out.println("-----------------------------");
            }
        }
    }

    public class DatPhong {
        String maKhach;
        String maPhong;

        // Hàm in thông tin của một phòng
        public static void inThongTin1Phong(Phong phong) {
            System.out.printf("|%-15s|%-15s|%-15d|%-15s|\n", phong.maPhong,
                    (phong.loaiPhong ? "VIP" : "Thuong"),
                    phong.giaPhong,
                    (phong.trangThai ? "Trong" : "Da dat"));
        }

        // Hiển thị thông tin các phòng còn trống
        void hienThiPhongConTrong() {
            if (danhSachPhong.getDau() == null) {
                System.out.println("Danh sach phong rong.");
                return;
            }

            System.out.println("+---------------+---------------+---------------+---------------+");
            System.out.println("|   Ma phong    |  Loai phong   |   Gia phong   |  Trang thai   |");
            System.out.println("+---------------+---------------+---------------+---------------+");

            Node hienTai = danhSachPhong.getDau();
            while (hienTai != null) {
                if (hienTai.data.trangThai) {  // Phong con trong (trang thai = true)
                    inThongTin1Phong(hienTai.data);
                }
                hienTai = hienTai.next;
            }

            System.out.println("+---------------+---------------+---------------+---------------+");
        }

        void truTienKhachHang(String maKhach, int soTienCanTru, DanhSachKhachHang danhSachKhachHang) {
            NodeKH hienTai = danhSachKhachHang.getDauKH();

            while (hienTai != null) {
                if (hienTai.data.maKhach.equals(maKhach)) {
                    if (hienTai.data.taiKhoan >= soTienCanTru) {
                        hienTai.data.taiKhoan -= soTienCanTru;
                        System.out.println("Da tru " + soTienCanTru + " VND tu tai khoan cua khach hang " + maKhach + " (Ten khach: " + hienTai.data.tenKhach + ")");
                    } else {
                        System.out.println("Tai khoan khong du de thanh toan!");
                    }
                    return;
                }
                hienTai = hienTai.next;
            }

            System.out.println("Khong tim thay khach hang co ma " + maKhach + " trong danh sach.");
        }

        // Hàm kiểm tra khách hàng tồn tại
        boolean kiemTraKhachHangTonTai(String maKhach) {
            NodeKH hienTai = danhSachKhachHang.getDauKH();
            while (hienTai != null) {
                if (hienTai.data.maKhach.equals(maKhach)) {
                    // Khach hang ton tai trong danh sach
                    return true;
                }
                hienTai = hienTai.next;
            }
            // Khach hang khong ton tai trong danh sach
            return false;
        }
        // Ham dat phong theo Ma phong
        void datPhongTheoMaPhong(DanhSachPhong danhSachPhong, DanhSachKhachHang danhSachKhachHang) {
            if (danhSachPhong.getDau() == null) {
                System.out.println("Danh sach phong rong.");
                return;
            }

            Scanner scanner = new Scanner(System.in);

            String maPhongDat;
            System.out.print("Nhap ma phong muon dat: ");
            maPhongDat = scanner.nextLine();

            Node hienTai = danhSachPhong.getDau();
            while (hienTai != null) {
                if (hienTai.data.maPhong.equals(maPhongDat)) {
                    if (hienTai.data.trangThai == false) {
                        System.out.println("Phong co ma " + maPhongDat + " hien dang trong trang thai da dat.");
                        return;
                    }

                    System.out.println("+---------------+---------------+---------------+---------------+");
                    System.out.println("|   Ma phong    |  Loai phong   |   Gia phong   |  Trang thai   |");
                    System.out.println("+---------------+---------------+---------------+---------------+");
                    inThongTin1Phong(hienTai.data);
                    System.out.println("+---------------+---------------+---------------+---------------+");

                    char luaChon;
                    System.out.print("Ban co muon dat phong nay khong? (1: Yes, 0: No): ");
                    luaChon = scanner.next().charAt(0);

                    if (luaChon == '1') {
                        // Nhap ma khach muon dat
                        String maKhachDat;
                        scanner.nextLine(); // Clear the newline character in the buffer
                        System.out.print("Nhap ma khach muon dat: ");
                        maKhachDat = scanner.nextLine();

                        if (kiemTraKhachHangTonTai(maKhachDat)) {
                            // Tru tien tu tai khoan khach hang
                            truTienKhachHang(maKhachDat, hienTai.data.giaPhong, danhSachKhachHang);
                            System.out.println("Tru tien khach hang thanh cong!");

                            // Cap nhat trang thai phong
                            hienTai.data.trangThai = false;
                            System.out.println("Dat phong thanh cong!");
                        } else {
                            System.out.println("Dat phong khong thanh cong!");
                        }
                    } else {
                        System.out.println("Huy dat phong!");
                    }

                    return;
                }
                hienTai = hienTai.next;
            }

            System.out.println("Khong tim thay phong co ma " + maPhongDat + " trong danh sach.");
        }

        // Ham tra phong theo ma phong
        void traPhongTheoMaPhong() {
            if (danhSachPhong.getDau() == null) {
                System.out.println("Danh sach phong rong.");
                return;
            }

            Scanner scanner = new Scanner(System.in);

            String maPhongTra;
            System.out.print("Nhap ma phong muon tra: ");
            maPhongTra = scanner.nextLine();

            Node hienTai = danhSachPhong.getDau();
            while (hienTai != null) {
                if (hienTai.data.maPhong.equals(maPhongTra)) {
                    if (hienTai.data.trangThai == false) {
                        // Phong da dat, thuc hien tra phong
                        hienTai.data.trangThai = true;
                        System.out.println("Tra phong thanh cong!");
                    } else {
                        System.out.println("Phong co ma " + maPhongTra + " hien dang trong trang thai chua dat.");
                    }
                    return;
                }
                hienTai = hienTai.next;
            }

            System.out.println("Khong tim thay phong co ma " + maPhongTra + " trong danh sach.");
        }
    }


    // Khai báo biến toàn cục danhSachPhong và danhSachKhachHang
    static DanhSachPhong danhSachPhong;
    static DanhSachKhachHang danhSachKhachHang;

    // Khai báo các biến toàn cục khác
    static int SLPhong = 0;
    static int SLKhach = 0;
    static int SLDatPhong = 0;
    static double doanhThu = 0;
    //Main---------------------------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        menuDangNhap();
    }

    static void menuPhong() {
        while (true) {
            clearScreen();
            System.out.println("+----------------------------------------+");
            System.out.println("|           MENU QUẢN LÝ PHÒNG           |");
            System.out.println("+----------------------------------------+");
            System.out.println("| 1. Thêm thông tin phòng                |");
            System.out.println("| 2. Sửa thông tin phòng                 |");
            System.out.println("| 3. Xóa thông tin phòng                 |");
            System.out.println("| 4. In danh sách phòng                  |");
            System.out.println("| 5. Tìm kiếm phòng theo Mã phòng        |");
            System.out.println("| 6. Tìm kiếm phòng theo trạng thái      |");
            System.out.println("| 7. Sắp xếp phòng theo Mã phòng         |");
            System.out.println("| 8. Sắp xếp phòng theo trạng thái       |");
            System.out.println("+----------------------------------------+");
            System.out.println("| 0. Quay lại                            |");
            System.out.println("+----------------------------------------+\n");

            System.out.print("Nhap lua chon: ");
            int chon = scanner.nextInt();

            switch (chon) {
                case 1:
                    Phong.themPhong(danhSachPhong);
                    pause();
                    break;
                case 2:
                    Phong.suaPhong(danhSachPhong);
                    pause();
                    break;
                case 3:
                   Phong.xoaPhong(danhSachPhong);
                    pause();
                    break;
                case 4:
                    danhSachPhong.inDanhSachPhong();
                    pause();
                    break;
                case 5:
                    danhSachPhong.timKiemPhongTheoMaPhong();
                    pause();
                    break;
                case 6:
                    danhSachPhong.timKiemPhongTheoTrangThai();
                    pause();
                    break;
                case 7:
                    danhSachPhong.sapXepPhongTheoMaPhong();
                    pause();
                    break;
                case 8:
                    danhSachPhong.sapXepPhongTheoTrangThai();
                    pause();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Lua chon ko hop le!\nVui long nhap lua chon khac!\n");
                    pause();
            }
        }
    }

    public static void menuKhach() {
        while (true) {
            System.out.println("+----------------------------------------+");
            System.out.println("|        MENU QUAN LY KHACH HANG         |");
            System.out.println("+----------------------------------------+");
            System.out.println("| 1. Thêm thông tin khách hàng           |");
            System.out.println("| 2. Sửa thông tin khách hàng            |");
            System.out.println("| 3. Xóa thông tin khách hàng            |");
            System.out.println("| 4. In danh sách khách hàng             |");
            System.out.println("| 5. Tìm kiếm khách hàng theo Mã khách   |");
            System.out.println("| 6. Tìm kiếm khách hàng theo Tên        |");
            System.out.println("| 7. Sắp xếp khách hàng tăng dần theo Tên|");
            System.out.println("| 8. Sắp xếp khách hàng giảm dần theo Tên|");
            System.out.println("+----------------------------------------+");
            System.out.println("| 0. Quay lại                            |");
            System.out.println("+----------------------------------------+");
            System.out.println();

            System.out.print("Nhap lua chon: ");
            int chon = scanner.nextInt();
            scanner.nextLine();

            switch (chon) {
                case 1:
                    KhachHang.themKhachHang(danhSachKhachHang);
                    break;
                case 2:
                    KhachHang.suaKhachHang(danhSachKhachHang);
                    break;
                case 3:
                    KhachHang.xoaKhachHang(danhSachKhachHang);
                    break;
                case 4:
                    danhSachKhachHang.inDSKhachHang();
                    break;
                case 5:
                    danhSachKhachHang.timKiemKHTheoMaKhach();
                    break;
                case 6:
                    danhSachKhachHang.timKiemKHTheoTen();
                    break;
                case 7:
                    danhSachKhachHang.sapXepKHTangDanTheoTen();
                    break;
                case 8:
                    danhSachKhachHang.sapXepKHGiamDanTheoTen();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Lua chon khong hop le!\nVui long nhap lua chon khac!");
            }

            System.out.println();
            System.out.println("Nhan Enter de tiep tuc...");
            scanner.nextLine();
        }
    }

    public static void menuAdmin() {
        clearScreen();
        while (true) {
            clearScreen();
            System.out.println("+----------------------------------------+");
            System.out.println("|               MENU ADMIN               |");
            System.out.println("+----------------------------------------+");
            System.out.println("| 1. Quản lí phòng                       |");
            System.out.println("| 2. Quản lí khách hàng                  |");
            System.out.println("| 3. Doc/Ghi du lieu vao File            |");
            System.out.println("+----------------------------------------+");
            System.out.println("| 0. Quay lại                            |");
            System.out.println("+----------------------------------------+\n");

            System.out.print("Nhap lua chon: ");
            int chon = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            switch (chon) {
                case 1:
                    pause();
                    menuPhong();
                    break;
                case 2:
                    pause();
                    menuKhach();
                    break;
                case 3:
                    pause();
                    System.out.println("Đây là Menu Đọc/Ghi File!\nTính năng này hiện chưa được hoàn thiện!\n");
                    //menuDocGhiFile();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Lua chon ko hop le!\nVui long nhap lua chon khac!\n");
                    pause();
            }
        }
    }

    public static void menuUser() {
        //menuDatPhong();
    }

    public static void menuDangNhap() {
        while (true) {
            clearScreen();
            System.out.println("  CHƯƠNG TRÌNH QUẢN LÍ KHÁCH SẠN - UTC2  ");
            System.out.println("+----------------------------------------+");
            System.out.println("|               MENU CHÍNH               |");
            System.out.println("+----------------------------------------+");
            System.out.println("| 1. Đăng nhập với tư cách Admin         |");
            System.out.println("| 2. Đăng nhập với tư cách Người dùng    |");
            System.out.println("+----------------------------------------+");
            System.out.println("| 0. Thoát chương trình                  |");
            System.out.println("+----------------------------------------+\n");

            System.out.print("Nhap lua chon: ");
            int chon = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            switch (chon) {
                case 1:
                    dangNhapAdmin();
                    pause();
                    menuAdmin();
                    break;
                case 2:
                    dangNhapUser();
                    pause();
                    menuUser();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Lua chon ko hop le!\nVui long nhap lua chon khac!\n");
                    pause();
            }
        }
    }

    public static void clearScreen() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                // Không khuyến khích sử dụng vì không di động, hãy xem phần dành riêng cho từng nền tảng bên dưới
                Runtime.getRuntime().exec("cls");
            } else {
                // Mã xóa màn hình ANSI
                System.out.print("\033[H\033[2J");
            }
        } catch (final Exception e) {
            // Xử lý các trường hợp ngoại lệ tiềm ẩn
        }
    }

    public static void pause() {
        System.out.println("Nhan Enter de tiep tuc...");
        scanner.nextLine();
    }

    public class Utils{
        static boolean isName(String name) {
            if (name.length() < 5 || name.length() > 20 || Character.isWhitespace(name.charAt(0)) || Character.isWhitespace(name.charAt(name.length() - 1))) {
                return false;
            }

            boolean isFirstChar = true; // Đánh dấu ký tự đầu tiên của từ
            for (char c : name.toCharArray()) {
                if (!Character.isLetter(c) && c != ' ') {
                    return false;
                }

                if (Character.isLetter(c)) {
                    if (isFirstChar && !Character.isUpperCase(c)) {
                        return false; // Ký tự đầu tiên của từ không phải là in hoa
                    }

                    isFirstChar = false; // Đánh dấu là đã đi qua ký tự đầu tiên
                }
            }
            return true;
        }

        // Kiểm tra mã
        static boolean isCode(String code) {
            if (code.length() != 5) {
                return false;
            }

            if (!Character.isUpperCase(code.charAt(0)) || !Character.isUpperCase(code.charAt(1))) {
                return false;
            }

            for (char c : code.substring(2).toCharArray()) {
                if (!Character.isDigit(c)) {
                    return false;
                }
            }

            return true;
        }

        // Kiểm tra tuổi
        static boolean isAge(int age) {
            return age >= 18 && age <= 100;
        }

        // Kiểm tra số điện thoại
        static boolean isSDT(String sdt) {
            if (sdt.length() != 10 || sdt.charAt(0) != '0') {
                return false;
            }

            for (char c : sdt.substring(1).toCharArray()) {
                if (!Character.isDigit(c)) {
                    return false;
                }
            }

            return true;
        }

        // Kiểm tra CCCD
        static boolean isCCCD(String cccd) {
            return cccd.length() == 12 && Character.isDigit(cccd.charAt(0));
        }

        // Kiểm tra tài khoản
        static boolean isTaiKhoan(int taiKhoan) {
            return taiKhoan > 100000;
        }

        static boolean isLoaiPhong(boolean loaiPhong) {
            return loaiPhong == false || loaiPhong == true;
        }

        // Kiểm tra trạng thái phòng (0 hoặc 1)
        static boolean isTrangThai(boolean trangThai) {
            return trangThai == false || trangThai == true;
        }
    }

    public class DocGhiFile {
        // Ghi khách hàng vào file
        public static void ghiVaoFileKhachHang(DanhSachKhachHang danhSachKhachHang) {
            final String tenFile = "DanhSachKhachHang.txt";
            try (BufferedWriter outFile = new BufferedWriter(new FileWriter(tenFile))) {
                NodeKH currentKhachHang = danhSachKhachHang.getDauKH();
                while (currentKhachHang != null) {
                    outFile.write("Ma khach: " + currentKhachHang.getData().getMaKhach() + "\n");
                    outFile.write("Ten khach: " + currentKhachHang.getData().getTenKhach() + "\n");
                    outFile.write("Tuoi: " + currentKhachHang.getData().getTuoi() + "\n");
                    outFile.write("So dien thoai: " + currentKhachHang.getData().getSoDT() + "\n");
                    outFile.write("CCCD: " + currentKhachHang.getData().getCCCD() + "\n");
                    outFile.write("Dia chi: " + currentKhachHang.getData().getDiaChi() + "\n");
                    outFile.write("Tai khoan: " + currentKhachHang.getData().getTaiKhoan() + "\n\n");
                    currentKhachHang = currentKhachHang.getNext();
                }
                System.out.println("Danh sach khach hang da duoc ghi vao file.");
            } catch (IOException e) {
                System.err.println("Khong the mo file de ghi.");
                e.printStackTrace();
            }
        }

        // Đọc khách hàng từ file
        public static void docTuFileKhachHang(DanhSachKhachHang danhSachKhachHang) {
            final String tenFile = "DanhSachKhachHang.txt";
            try (BufferedReader inFile = new BufferedReader(new FileReader(tenFile))) {
                String line;
                boolean loi = false;
                while ((line = inFile.readLine()) != null) {
                    if (line.isEmpty()) continue;
                    KhachHang khachHang = new KhachHang();
                    if (line.contains("Ma khach:")) {
                        khachHang.setMaKhach(line.substring(line.indexOf(":") + 2));
                        line = inFile.readLine();
                        if (line.contains("Ten khach:")) {
                            khachHang.setTenKhach(line.substring(line.indexOf(":") + 2));
                            line = inFile.readLine();
                            if (line.contains("Tuoi:")) {
                                try {
                                    khachHang.setTuoi(Integer.parseInt(line.substring(line.indexOf(":") + 2)));
                                } catch (NumberFormatException e) {
                                    System.err.println("Loi: " + e.getMessage());
                                    loi = true;
                                    break;
                                }
                                line = inFile.readLine();
                                if (line.contains("So dien thoai:")) {
                                    khachHang.setSoDT(line.substring(line.indexOf(":") + 2));
                                    line = inFile.readLine();
                                    if (line.contains("CCCD:")) {
                                        khachHang.setCCCD(line.substring(line.indexOf(":") + 2));
                                        line = inFile.readLine();
                                        if (line.contains("Dia chi:")) {
                                            khachHang.setDiaChi(line.substring(line.indexOf(":") + 2));
                                            line = inFile.readLine();
                                            if (line.contains("Tai khoan:")) {
                                                try {
                                                    khachHang.setTaiKhoan(Integer.parseInt(line.substring(line.indexOf(":") + 2)));
                                                } catch (NumberFormatException e) {
                                                    System.err.println("Loi: " + e.getMessage());
                                                    loi = true;
                                                    break;
                                                }
                                                // Thêm khách hàng vào danh sách
                                                NodeKH newNode = new NodeKH(khachHang, null);
                                                if (danhSachKhachHang.getDauKH() == null) {
                                                    danhSachKhachHang.setDauKH(newNode);
                                                    danhSachKhachHang.setCuoiKH(newNode);
                                                } else {
                                                    danhSachKhachHang.getCuoiKH().setNext(newNode);
                                                    danhSachKhachHang.setCuoiKH(newNode);
                                                }
                                            } else {
                                                System.err.println("Loi: Du lieu tai khoan khong hop le.");
                                                loi = true;
                                                break;
                                            }
                                        } else {
                                            System.err.println("Loi: Du lieu dia chi khong hop le.");
                                            loi = true;
                                            break;
                                        }
                                    } else {
                                        System.err.println("Loi: Du lieu CCCD khong hop le.");
                                        loi = true;
                                        break;
                                    }
                                } else {
                                    System.err.println("Loi: Du lieu so dien thoai khong hop le.");
                                    loi = true;
                                    break;
                                }
                            } else {
                                System.err.println("Loi: Du lieu tuoi khong hop le.");
                                loi = true;
                                break;
                            }
                        } else {
                            System.err.println("Loi: Du lieu ten khach khong hop le.");
                            loi = true;
                            break;
                        }
                    } else {
                        System.err.println("Loi: Du lieu ma khach khong hop le.");
                        loi = true;
                        break;
                    }
                }
                if (!loi) {
                    System.out.println("Danh sach khach hang da duoc doc tu file.");
                }
            } catch (IOException e) {
                System.err.println("Khong the mo file de doc.");
                e.printStackTrace();
            }
        }

        // Ghi phòng vào file
        public static void ghiVaoFilePhong(DanhSachPhong danhSachPhong) {
            String tenFile = "DanhSachPhong.txt";
            try (BufferedWriter outFile = new BufferedWriter(new FileWriter(tenFile))) {
                Node currentPhong = danhSachPhong.getDau();
                while (currentPhong != null) {
                    outFile.write("Ma phong: " + currentPhong.getData().getMaPhong() + "\n");
                    outFile.write("Loai phong: " + (currentPhong.getData().isLoaiPhong() ? "VIP" : "Thuong") + "\n");
                    outFile.write("Gia phong: " + currentPhong.getData().getGiaPhong() + "\n");
                    outFile.write("Trang thai: " + (currentPhong.getData().isTrangThai() ? "Da dat" : "Chua dat") + "\n\n");
                    currentPhong = currentPhong.getNext();
                }
                System.out.println("Danh sach phong da duoc ghi vao file.");
            } catch (IOException e) {
                System.err.println("Khong the mo file de ghi.");
            }
        }

        // Đọc phòng từ file
        public static void docTuFilePhong(DanhSachPhong danhSachPhong) {
            String tenFile = "DanhSachPhong.txt";
            try (BufferedReader inFile = new BufferedReader(new FileReader(tenFile))) {
                String line;
                boolean loi = false;
                while ((line = inFile.readLine()) != null) {
                    if (line.isEmpty())
                        continue;
                    Phong phong = new Phong();
                    if (line.contains("Ma phong:")) {
                        phong.setMaPhong(line.substring(line.indexOf(":") + 2));
                        line = inFile.readLine();
                        if (line.contains("Loai phong:")) {
                            phong.setLoaiPhong(line.substring(line.indexOf(":") + 2).equals("VIP"));
                            line = inFile.readLine();
                            if (line.contains("Gia phong:")) {
                                try {
                                    phong.setGiaPhong(Integer.parseInt(line.substring(line.indexOf(":") + 2)));
                                } catch (NumberFormatException e) {
                                    System.err.println("Loi: " + e.getMessage());
                                    loi = true;
                                    break;
                                }
                                line = inFile.readLine();
                                if (line.contains("Trang thai:")) {
                                    phong.setTrangThai(line.substring(line.indexOf(":") + 2).equals("Da dat"));
                                    // Thêm phòng vào danh sách
                                    Node newNode = new Node(phong, null);
                                    if (danhSachPhong.getDau() == null) {
                                        danhSachPhong.setDau(newNode);
                                        danhSachPhong.setCuoi(newNode);
                                    } else {
                                        danhSachPhong.getCuoi().setNext(newNode);
                                        danhSachPhong.setCuoi(newNode);
                                    }
                                } else {
                                    System.err.println("Loi: Du lieu trang thai phong khong hop le.");
                                    loi = true;
                                    break;
                                }
                            } else {
                                System.err.println("Loi: Du lieu gia phong khong hop le.");
                                loi = true;
                                break;
                            }
                        } else {
                            System.err.println("Loi: Du lieu loai phong khong hop le.");
                            loi = true;
                            break;
                        }
                    } else {
                        System.err.println("Loi: Du lieu ma phong khong hop le.");
                        loi = true;
                        break;
                    }
                }
                if (!loi) {
                    System.out.println("Danh sach phong da duoc doc tu file.");
                }
            } catch (IOException e) {
                System.err.println("Khong the mo file de doc.");
            }
        }
    }

    // Đăng nhập với vai trò quản lí
        static int dangNhapAdmin() {
            String username, password;

            do {
                System.out.print("Tên đăng nhập: ");
                username = scanner.nextLine();
                System.out.print("Mật khẩu: ");
                password = scanner.nextLine();

                if (username.equals("admin1") && password.equals("12345")) {
                    System.out.println("Đăng nhập thành công với tư cách Quản lí!");
                    return 1;
                } else {
                    System.out.println("Vui lòng kiểm tra lại tài khoản, mật khẩu!");
                }
            } while (true);
        }

        // Đăng nhập với vai trò người dùng
        static int dangNhapUser() {
            String username, password;

            do {
                System.out.print("Tên đăng nhập: ");
                username = scanner.nextLine();
                System.out.print("Mật khẩu: ");
                password = scanner.nextLine();

                if (username.equals("user1") && password.equals("12345")) {
                    System.out.println("Đăng nhập thành công với tư cách Người dùng!");
                    return 1;
                } else {
                    System.out.println("Vui lòng kiểm tra lại tài khoản, mật khẩu!");
                }
            } while (true);
        }
    }

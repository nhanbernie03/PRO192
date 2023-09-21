package SimpleEX;
    import java.util.ArrayList;
    import java.util.Scanner;
public class test {



    public static void main(String[] args) {
        // Khởi tạo danh sách họ và tên
        ArrayList<String> danhSachHoTen = new ArrayList<>();
        danhSachHoTen.add("Nguyen Van A");
        danhSachHoTen.add("Tran Thi B");
        danhSachHoTen.add("Le Van C");

        Scanner scanner = new Scanner(System.in);

        // Nhập họ và tên cần kiểm tra
        System.out.print("Nhập họ và tên cần kiểm tra: ");
        String hoTenCanKiemTra = scanner.nextLine();

        // Kiểm tra xem họ và tên có tồn tại trong danh sách hay không
        if (danhSachHoTen.contains(hoTenCanKiemTra)) {
            System.out.println("Họ và tên tồn tại trong danh sách.");
        } else {
            System.out.println("Họ và tên không tồn tại trong danh sách.");
        }
    }
}



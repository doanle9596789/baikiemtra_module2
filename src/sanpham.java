import java.util.Scanner;

public class sanpham {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        testsanpham sanPham1 = new testsanpham(12, "áo", 50, 4, 20);
         System.out.println(" tổng sô tiên phai trả là" + sanPham1.tiensaukhuyenmai());
    }

}


public class Exercise04 {
    public static void main(String[] args) {
        // Gán giá trị chính xác theo kết quả mẫu
        int a = 10;
        int b = 5;

        // Tính toán các phép toán số học
        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;
        int thuong = a / b;
        int du = a % b;

        // In kết quả chính xác 100% từng dấu cách theo hình ảnh mẫu
        System.out.printf("a = %d và b = %d\n", a, b);
        System.out.printf("Tổng 2 số a+b = %d\n", tong);
        System.out.printf("Hiệu 2 số a-b = %d\n", hieu);
        System.out.printf("Tích 2 số a*b = %d\n", tich);
        System.out.printf("Thương 2 số a/b = %d\n", thuong);
        System.out.printf("Số dư khi chia số a cho b = %d\n", du);
    }
}

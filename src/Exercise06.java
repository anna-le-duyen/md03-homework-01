import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        // Khởi tạo Scanner để đọc dữ liệu nhập vào từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Khai báo các biến kiểu float theo đúng yêu cầu đề bài
        float width;
        float height;
        float area;
        float circumference;

        // Kiểm tra dữ liệu đầu vào trước khi đọc
        if (scanner.hasNextFloat()) {
            width = scanner.nextFloat();
            height = scanner.nextFloat();

            // Tính toán diện tích và chu vi
            area = width * height;
            circumference = 2 * (width + height);

            // In kết quả chính xác tuyệt đối định dạng chữ và khoảng trắng
            System.out.printf("Diện tích : %.2f\n", area);
            System.out.printf("Chu vi : %.2f\n", circumference);
        }

        scanner.close();
    }
}
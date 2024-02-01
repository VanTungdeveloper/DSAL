package array;

public class Main {
    public static void main(String[] args) {
        // Nhập câu lệnh từ đây
        int python_score = 90;
        int java_score = 78;
        int c_score = 96;

        int total_score = python_score + java_score + c_score;
        double average_score = (double) total_score /3;

        // câu lệnh dưới đây dùng để kiểm tra kết quả.
        System.out.println("Total: " + total_score);
        System.out.println("Average: " + average_score);
    }
}

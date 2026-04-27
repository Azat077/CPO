import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LogService logService = new LogService();

        System.out.println("=== Лог жүйесі ===");
        System.out.print("Лог хабарламасын енгізіңіз: ");

        String message = scanner.nextLine();

        LogResult result = logService.createLog(message);

        System.out.println(result.getMessage());
    }
}
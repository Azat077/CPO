import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogService {

    public LogResult createLog(String text) {

        if (text.isEmpty()) {
            return new LogResult(false, "❌ Лог хабарламасы бос болмауы керек");
        }

        if (text.length() < 3) {
            return new LogResult(false, "❌ Лог хабарламасы тым қысқа");
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String time = LocalDateTime.now().format(formatter);

        String log = "[" + time + "] [INFO] " + text;

        return new LogResult(true, "✅ Лог сәтті құрылды:\n" + log);
    }
}
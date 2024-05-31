package control;

public class InputSanitizer {
    public static String sanitize(String input) {
        if (input == null) {
            return null;
        }
        // Codifica dei caratteri speciali in entità HTML
        return input.replaceAll("&", "&amp;")
                    .replaceAll("<", "&lt;")
                    .replaceAll(">", "&gt;")
                    .replaceAll("\"", "&quot;")
                    .replaceAll("'", "&#x27;")
                    .replaceAll("/", "&#x2F;");
    }
}
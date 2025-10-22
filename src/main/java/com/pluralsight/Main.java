import com.pluralsight.nameFormatter;

public class Main {
    public static void main(String[] args) {
        System.out.println(nameFormatter.format("Mel", "Johnson"));
        System.out.println(nameFormatter.format("Dr.", "Mel", "B", "Johnson", "PhD"));
        System.out.println(nameFormatter.format("Mel B Johnson, PhD"));
        System.out.println(nameFormatter.format("Mel Johnson"));
    }
}
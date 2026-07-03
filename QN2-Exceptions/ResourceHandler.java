import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ResourceHandler {
    public void readFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {
            String line = br.readLine();
            System.out.println(line);
        } catch (IOException e) {
            System.err.println("File error: " + e.getMessage());
        }
        // br is automatically and safely closed here, even if exceptions occur
    }
}
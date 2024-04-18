import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RemoveLineFromFile {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java RemoveLineFromFile <input_file> <line_number>");
            return;
        }

        String fileName = args[0];
        int lineNumberToRemove = Integer.parseInt(args[1]);

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            StringBuilder content = new StringBuilder();
            String line;
            int lineNumber = 1;
            while ((line = reader.readLine()) != null) {
                if (lineNumber != lineNumberToRemove) {
                    content.append(line).append("\n");
                }
                lineNumber++;
            }

            if (lineNumberToRemove > lineNumber - 1) {
                System.out.println("Line not found");
                return;
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                writer.write(content.toString());
            }

            System.out.println("Line removed successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}

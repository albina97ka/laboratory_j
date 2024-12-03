import java.io.*;
public class Main {
    public static void main(String[] args) {
        String inputFileName = "input.txt";
        String outputFileName = "output.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {

            String line;
            boolean inMultiLineComment = false;

            while ((line = reader.readLine()) != null) {
                line = line.replaceAll("//.*", "");

                if (!inMultiLineComment) {
                    if (line.contains("/*")) {
                        inMultiLineComment = true;
                        line = line.replaceAll("/\\*.*", "");
                    }
                } else {

                    if (line.contains("*/")) {
                        inMultiLineComment = false;
                        line = line.replaceAll(".*\\*/", "");
                    } else {
                        line = "";
                    }
                }

                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

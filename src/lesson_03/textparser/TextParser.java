package lesson_03.textparser;

import java.io.File;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Map;
import java.util.TreeMap;

public class TextParser {

    public Map<String, Integer> parseText(String inputPath) {
        Map<String, Integer> counts = new TreeMap<>();
        try {
            String text = Files.readString(new File(inputPath).toPath(), StandardCharsets.UTF_8);
            for (String word : text.toLowerCase().split("[^a-zA-Z']+")) {
                if (word != null && !word.isEmpty()) {
                    counts.merge(word, 1, Integer::sum);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return counts;
    }

    public void saveResult(Map<String, Integer> counts, String outputPath) {
        StringBuilder sb = new StringBuilder();
        counts.forEach((word, count) -> sb.append(word).append(" : ").append(count).append("\n"));
        try (FileWriter writer = new FileWriter(outputPath, StandardCharsets.UTF_8)) {
            writer.write(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

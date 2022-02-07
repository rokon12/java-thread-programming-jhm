package ca.bazlur;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class UrlUtils {

  public static List<String> readAllUrls() throws IOException {
    return Files.readAllLines(Path.of("links.txt"));
  }

  private static final MostFrequentWordService wordService = new MostFrequentWordService();

  public static void main(String[] args) throws IOException {
    for (String url : readAllUrls()) {

      System.out.println("Fetching: " + url);
      System.out.println(wordService.mostFrequentWord(url));
    }
  }
}

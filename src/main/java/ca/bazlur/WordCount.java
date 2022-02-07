package ca.bazlur;

public class WordCount {

  private String word;
  private long count;

  public WordCount(String word, long count) {
    this.word = word;
    this.count = count;
  }

  @Override
  public String toString() {
    return "word= " + word + ", count=" + count;
  }
}

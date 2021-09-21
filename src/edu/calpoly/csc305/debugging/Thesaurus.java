package edu.calpoly.csc305.debugging;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Thesaurus {
  private Map<String, List<String>> synonyms;

  public Thesaurus() {
    synonyms = new HashMap<>();
  }

  /** this method will add a key value pair to a map of alternative words.
   *
   * @param word the key to put or replace into the map
   * @param alternatives the values to place or add to the key in the map
   */
  public void addAlternatives(String word, String ... alternatives) {
    if (synonyms.containsKey(word)) {
      List<String> alt = new ArrayList<>();
      alt.addAll(List.of(alternatives));
      alt.addAll(synonyms.get(word));
      synonyms.replace(word, alt);
    } else {
      synonyms.put(word, Arrays.asList(alternatives));
    }
  }

  public List<String> alternatives(String word) {
    return synonyms.get(word);
  }
}
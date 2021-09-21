package edu.calpoly.csc305.debugging;

public class DebuggerMain {
  /** This will check that Thesaurus works.
   *
   * @param args the program args usually passed in
   */
  public static void main(String[] args) {
    Thesaurus thesaurus = new Thesaurus();

    thesaurus.addAlternatives("interesting",
         "absorbing", "consuming", "engaging", "fascinating");

    System.out.println(thesaurus.alternatives("interesting"));
  }
}

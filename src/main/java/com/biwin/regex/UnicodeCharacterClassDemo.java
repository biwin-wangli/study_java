package com.biwin.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: wangli
 * @date: 2022/3/3 11:44
 */
public class UnicodeCharacterClassDemo {

  private static final String REGEX = "\\p{L}";
  private static final String INPUT = "[Bb12 \tc!\u03B1";

  public static void main(String[] args) {
    // create a pattern
    Pattern pattern = Pattern.compile(REGEX);

    // get a matcher object
    Matcher matcher = pattern.matcher(INPUT);

    while (matcher.find()) {
      //Prints the start index of the match.
      System.out.println("Match String start(): " + matcher.start());
    }
  }
}

package pkg202401;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Expression {
  private final List<Character> openingBrackets = Arrays.asList('(', '[', '{', '<');
  private final List<Character> closingBrackets = Arrays.asList(')', ']', '}', '>');

  public boolean isBalanced(String input) {
    Stack<Character> stack = new Stack<>();

    for (char ch : input.toCharArray()) {
      if (isOpeningBracket(ch))
        stack.push(ch);
      else if (isClosingBracket(ch)) {
        if (stack.empty() || !areBracketsMatching(stack.pop(), ch)) {
          return false;
        }
      }
    }

    return stack.empty();
  }

  private boolean isOpeningBracket(char ch) {
    return openingBrackets.contains(ch);
  }

  private boolean isClosingBracket(char ch) {
    return closingBrackets.contains(ch);
  }

  private boolean areBracketsMatching(char openingBracket, char closingBracket) {
    return openingBrackets.indexOf(openingBracket) == closingBrackets.indexOf(closingBracket);
  }
}

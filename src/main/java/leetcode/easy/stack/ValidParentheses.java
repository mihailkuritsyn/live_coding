package leetcode.easy.stack;

import java.util.Stack;

public class ValidParentheses {

  public boolean isValid(String s) {
    if (s.length() % 2 != 0) {
      return false;
    }
    Stack<Character> stack = new Stack<>();
    for (char c : s.toCharArray()) {
      if ('(' == c || '[' == c || '{' == c) {
        stack.add(c);
      } else {
        if (stack.size() == 0) {
          return false;
        }
        Character lastOpenBrace = stack.pop();
        if (lastOpenBrace == '(' && c != ')') {
          return false;
        }
        if (lastOpenBrace == '[' && c != ']') {
          return false;
        }
        if (lastOpenBrace == '{' && c != '}') {
          return false;
        }
      }
    }
    return stack.size() == 0;
  }
}

package org.xedox.Parser;

import java.util.ArrayList;
import java.util.List;
import org.xedox.Parser.token.Token;

public final class Lexer {
  private String text;
  private char current;
  private int pos;
  private List<Token> tokens;
  
  public Lexer(String text) {
	  this.text = text;
	  this.pos = 0;
	  this.current = text.charAt(pos);
	  tokens = new ArrayList<Token>();
  }
  
  public void tokenize() {
	  
  }
}

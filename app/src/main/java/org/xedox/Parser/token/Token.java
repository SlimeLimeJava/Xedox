package org.xedox.Parser.token;

public final class Token {
  private String value;
  private TokenType type;

  public Token(String value, TokenType type) {
    this.value = value;
    this.type = type;
  }

  public Token(TokenType type) {
    this.value = null;
    this.type = type;
  }

  public String getVal() {
    return value;
  }

  public TokenType getType() {
    return type;
  }
}

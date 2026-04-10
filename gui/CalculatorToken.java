package gui;

public class CalculatorToken {
   String token;
   TokenType tokenType;

   public CalculatorToken(String token, TokenType tokenType) {
    this.token = token;
    this.tokenType = tokenType;

   }
    
}
enum TokenType {
    DIGIT,OPERATOR,RESULT,EQUALS,CLEAR
}

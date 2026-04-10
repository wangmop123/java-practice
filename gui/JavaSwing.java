package gui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class JavaSwing {

    private static String firstHalf  = "";
    private static String secondHalf = "";
    private static String pressedOp  = "";
    private static boolean opPressed = false;

    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculator");
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // ── display label ───────────────────────────────
        JLabel display = new JLabel("0", SwingConstants.RIGHT);
        display.setBounds(20, 10, 240, 40);
        display.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.BLACK));
        display.setFont(display.getFont().deriveFont(Font.BOLD, 24f));
        frame.add(display);

        //Token
        ArrayList<CalculatorToken> tokens = new ArrayList<>();

        tokens.add(new CalculatorToken("1", TokenType.DIGIT));
        tokens.add(new CalculatorToken("2", TokenType.DIGIT));
        tokens.add(new CalculatorToken("3", TokenType.DIGIT));
        tokens.add(new CalculatorToken("4", TokenType.DIGIT));
        tokens.add(new CalculatorToken("5", TokenType.DIGIT));
        tokens.add(new CalculatorToken("6", TokenType.DIGIT));
        tokens.add(new CalculatorToken("7", TokenType.DIGIT));
        tokens.add(new CalculatorToken("8", TokenType.DIGIT));
        tokens.add(new CalculatorToken("9", TokenType.DIGIT));
        tokens.add(new CalculatorToken("0", TokenType.DIGIT));
        tokens.add(new CalculatorToken("+", TokenType.OPERATOR));
        tokens.add(new CalculatorToken("-", TokenType.OPERATOR));
        tokens.add(new CalculatorToken("*", TokenType.OPERATOR));
        tokens.add(new CalculatorToken("/", TokenType.OPERATOR));

 // for (String d : "1234567890".split("")) tokens.add(new CalculatorToken(d, TokenType.DIGIT));
 //for (String op : new String[]{"+", "-", "*", "/"}) tokens.add(new CalculatorToken(op, TokenType.OPERATOR));
        tokens.add(new CalculatorToken("=", TokenType.EQUALS));   
        tokens.add(new CalculatorToken("C", TokenType.CLEAR));    

        int x = 20, y = 70, w = 50, h = 50, count = 0;

        for (CalculatorToken token : tokens) {

            JButton btn = new JButton(token.token);
            btn.setBackground(Color.LIGHT_GRAY);

            if (count % 3 == 0) { y += h + 10; x = 20; count = 0; }
            else                 { x += w + 10; }

            count++;
            btn.setBounds(x, y, w, h);

            // ── action listener ─────────────────────────
            btn.addActionListener((ActionEvent e) -> {

                switch (token.tokenType) {

                    case DIGIT -> {
                        if (!opPressed) firstHalf  += token.token;
                        else            secondHalf += token.token;
                        display.setText(firstHalf + pressedOp + secondHalf);
                    }

                    case OPERATOR -> {
                        // ignore starting with operator
                        if (firstHalf.isEmpty()) return;

                        if (opPressed && !secondHalf.isEmpty()) {
                            firstHalf = doCalc();
                            secondHalf = "";
                        }
                        pressedOp  = token.token;
                        opPressed  = true;
                        display.setText(firstHalf + pressedOp);
                    }

                    case EQUALS -> {
                        if (opPressed && !secondHalf.isEmpty()) {
                            firstHalf = doCalc();
                            pressedOp = "";
                            opPressed = false;
                            secondHalf = "";
                            display.setText(firstHalf);
                        }
                    }

                    case CLEAR -> {
                        firstHalf = secondHalf = pressedOp = "";
                        opPressed = false;
                        display.setText("0");
                    }
                }
            });

            frame.add(btn);
        }

        frame.setVisible(true);
    } // main

    // ── helpers ────────────────────────────────────────
    private static String doCalc() {
        int a = Integer.parseInt(firstHalf);
        int b = Integer.parseInt(secondHalf);
        int res = switch (pressedOp) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> b == 0 ? 0 : a / b;
            default  -> 0;
        };
        return String.valueOf(res);
    }

    // tiny record & enum
//     record CalculatorToken(String token, TokenType tokenType) { }
//     enum TokenType { DIGIT, OPERATOR, EQUALS, CLEAR }
}

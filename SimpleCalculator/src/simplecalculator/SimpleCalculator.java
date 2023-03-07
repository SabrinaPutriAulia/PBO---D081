/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simplecalculator;
import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author DELL
 */
public class SimpleCalculator {
    private Stack<Character> operator;
    private Stack<Double> nilai;
    private boolean error;

    public SimpleCalculator() {
        operator = new Stack<Character>();
        nilai = new Stack<Double>();
        error = false;
    }

    private boolean jenisOperator(char op) {
        return op == '+' || op == '-' || op == '*' || op == '/';
    }

    private int prioritas(char op) {
        if (op == '+' || op == '-') {
            return 1;
        }
        if (op == '*' || op == '/' || op == '%') {
            return 2;
        }
        return 0;
    }

    private void operatorProses(char t) {
        double a, b;
        if (nilai.empty()) {
            System.out.println("(!) Error.");
            error = true;
            return;
        } else {
            b = nilai.peek();
            nilai.pop();
        }
        if (nilai.empty()) {
            System.out.println("(!) Error.");
            error = true;
            return;
        } else {
            a = nilai.peek();
            nilai.pop();
        }
        double r = 0;
        if (t == '+') {
            r = a + b;
        } else if (t == '-') {
            r = a - b;
        } else if (t == '*') {
            r = a * b;
        } else if(t == '/') {
            r = a / b;
        } else {
            System.out.println("(!) Error.");
            error = true;
        }
        nilai.push(r);
    }

    public void inputProses(String input) {
        String[] tokens = input.split(" ");

        for (int n = 0; n < tokens.length; n++) {
            String nextToken = tokens[n];
            char ch = nextToken.charAt(0);
            if (ch >= '0' && ch <= '9') {
                double value = Double.parseDouble(nextToken);
                nilai.push(value);
            } else if (jenisOperator(ch)) {
                if (operator.empty() || prioritas(ch) > prioritas(operator.peek())) {
                    operator.push(ch);
                } else {
                    while (!operator.empty() && prioritas(ch) <= prioritas(operator.peek())) {
                        char proses = operator.peek();
                        operator.pop();
                        operatorProses(proses);
                    }
                    operator.push(ch);
                }
            } else if (ch == '(') {
                operator.push(ch);
            } else if (ch == ')') {
                while (!operator.empty() && jenisOperator(operator.peek())) {
                    char proses = operator.peek();
                    operator.pop();
                    operatorProses(proses);
                }
                if (!operator.empty() && operator.peek() == '(') {
                    operator.pop();
                } else {
                    System.out.println("(!) Error.");
                    error = true;
                }
            }
        }
        while (!operator.empty() && jenisOperator(operator.peek())) {
            char proses = operator.peek();
            operator.pop();
            operatorProses(proses);
        }
        if (error == false) {
            double result = nilai.peek();
            nilai.pop();
            if (!operator.empty() || !nilai.empty()) {
                System.out.println("(!) Error.");
            } else {
                System.out.println("Hasil perhitungan " + result);
            }
        }
    }
}

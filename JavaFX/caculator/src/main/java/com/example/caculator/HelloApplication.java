package com.example.caculator;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.script.ScriptException;
import java.io.IOException;
import java.util.Stack;


public class HelloApplication extends Application {
//    private static int evaluateExpression(String expression) throws ScriptException {
//        ScriptEngineManager manager = new ScriptEngineManager();
//        ScriptEngine engine = manager.getEngineByName("nashorn");
//        return (int) engine.eval(expression);
//    }

    private static double evaluateExpression(String expression) {
        // Replace x with * for multiplication
        expression = expression.replace("x", "*");

        // Evaluate the expression
        Stack<Double> numbers = new Stack<>();
        Stack<Character> operations = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char currentChar = expression.charAt(i);

            if (Character.isDigit(currentChar)) {
                // Read a number
                StringBuilder number = new StringBuilder();
                while (i < expression.length() && (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
                    number.append(expression.charAt(i++));
                }
                i--;
                numbers.push(Double.parseDouble(number.toString()));
            } else if (currentChar == '(') {
                operations.push(currentChar);
            } else if (currentChar == ')') {
                while (operations.peek() != '(') {
                    numbers.push(applyOperation(operations.pop(), numbers.pop(), numbers.pop()));
                }
                operations.pop();
            } else if (isOperator(currentChar)) {
                while (!operations.isEmpty() && precedence(currentChar) <= precedence(operations.peek())) {
                    numbers.push(applyOperation(operations.pop(), numbers.pop(), numbers.pop()));
                }
                operations.push(currentChar);
            }
        }

        while (!operations.isEmpty()) {
            numbers.push(applyOperation(operations.pop(), numbers.pop(), numbers.pop()));
        }

        return numbers.pop();
    }

    private static boolean isOperator(char op) {
        return op == '+' || op == '-' || op == '*' || op == '/';
    }

    private static int precedence(char op) {
        if (op == '+' || op == '-') {
            return 1;
        } else if (op == '*' || op == '/') {
            return 2;
        }
        return -1;
    }

    private static double applyOperation(char op, double b, double a) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    throw new UnsupportedOperationException("Cannot divide by zero");
                }
                return a / b;
        }
        return 0;
    }

    @Override
    public void start(Stage stage) throws IOException {
        Button num1 = new Button("1 ");
        Button num2 = new Button("2 ");
        Button num3 = new Button("3 ");
        Button num4 = new Button("4 ");
        Button num5 = new Button("5 ");
        Button num6 = new Button("6 ");
        Button num7 = new Button("7 ");
        Button num8 = new Button("8 ");
        Button num9 = new Button("9 ");
        Button num0 = new Button("0 ");
        Button point = new Button(".");
        Button ans = new Button("Ans");
        Button sum = new Button("+");
        sum.setPrefSize(30, 20);
        Button minus = new Button("-");
        minus.setPrefSize(30, 20);
        Button multi = new Button("x");
        multi.setPrefSize(30, 20);
        Button divide = new Button("/");  // divide mới là chia chứ
        divide.setPrefSize(30, 20);
        Button ac = new Button("AC");
        Button clear = new Button("C ");
        clear.setPrefSize(30, 20);
        Button xten = new Button("x10");
        Button equal = new Button("=");
        equal.setPrefSize(30, 20);
        TextArea screen = new TextArea();
        screen.setPrefSize(220, 100);

        final EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                StringBuilder currentOperand = new StringBuilder("");
                if (!screen.getText().isEmpty()) {
                    currentOperand = new StringBuilder(screen.getText());
                }
                Object source = event.getSource();
                if (source.equals(num1)) {
                    currentOperand.append("1");
                    screen.setText(String.valueOf(currentOperand));
                }
                if (source.equals(num2)) {
                    currentOperand.append("2");
                    screen.setText(String.valueOf(currentOperand));
                }
                if (source.equals(num3)) {
                    currentOperand.append("3");
                    screen.setText(String.valueOf(currentOperand));
                }
                if (source.equals(num4)) {
                    currentOperand.append("4");
                    screen.setText(String.valueOf(currentOperand));
                }
                if (source.equals(num5)) {
                    currentOperand.append("5");
                    screen.setText(String.valueOf(currentOperand));
                }
                if (source.equals(num6)) {
                    currentOperand.append("6");
                    screen.setText(String.valueOf(currentOperand));
                }
                if (source.equals(num7)) {
                    currentOperand.append("7");
                    screen.setText(String.valueOf(currentOperand));
                }
                if (source.equals(num8)) {
                    currentOperand.append("8");
                    screen.setText(String.valueOf(currentOperand));
                }
                if (source.equals(num9)) {
                    currentOperand.append("9");
                    screen.setText(String.valueOf(currentOperand));
                }
                if (source.equals(num0)) {
                    currentOperand.append("0");
                    screen.setText(String.valueOf(currentOperand));
                }
                if (source.equals(sum)) {
                    currentOperand.append("+");
                    screen.setText(String.valueOf(currentOperand));
                }
                if (source.equals(minus)) {
                    currentOperand.append("-");
                    screen.setText(String.valueOf(currentOperand));
                }
                if (source.equals(multi)) {
                    currentOperand.append("x");
                    screen.setText(String.valueOf(currentOperand));
                }
                if (source.equals(divide)) {
                    currentOperand.append("/");
                    screen.setText(String.valueOf(currentOperand));
                }
                if (source.equals(xten)) {
                    currentOperand.append("x10");
                    screen.setText(String.valueOf(currentOperand));
                }
                if (source.equals(ac)) {
                    screen.setText("");
                }
                if (source.equals(clear)) {
                    if (!currentOperand.isEmpty()) {
                        currentOperand.deleteCharAt(currentOperand.length() - 1);
                        screen.setText(String.valueOf(currentOperand));
                    }
                }
                if (source.equals(equal)) {
                    double value = evaluateExpression(screen.getText());
                    screen.setText(String.valueOf(value));

                }
            }
        };
        num0.setOnAction(handler);
        num1.setOnAction(handler);
        num2.setOnAction(handler);
        num3.setOnAction(handler);
        num4.setOnAction(handler);
        num5.setOnAction(handler);
        num6.setOnAction(handler);
        num7.setOnAction(handler);
        num8.setOnAction(handler);
        num9.setOnAction(handler);
        sum.setOnAction(handler);
        minus.setOnAction(handler);
        multi.setOnAction(handler);
        divide.setOnAction(handler);
        xten.setOnAction(handler);
        clear.setOnAction(handler);
        ac.setOnAction(handler);
        equal.setOnAction(handler);

        GridPane layout = new GridPane();
        layout.setVgap(5);
        layout.setHgap(5);
        layout.add(num1, 2, 5);
        layout.add(num2, 4, 5);
        layout.add(num3, 6, 5);
        layout.add(num4, 2, 6);
        layout.add(num5, 4, 6);
        layout.add(num6, 6, 6);
        layout.add(num7, 2, 7);
        layout.add(num8, 4, 7);
        layout.add(num9, 6, 7);

        layout.add(clear, 8, 5);
        layout.add(ac, 10, 5);
        layout.add(multi, 8, 6);
        layout.add(divide, 10, 6);
        layout.add(sum, 8, 7);
        layout.add(minus, 10, 7);
        layout.add(num0, 2, 8);
        layout.add(point, 4, 8);
        layout.add(ans, 6, 8);
        layout.add(xten, 8, 8);
        layout.add(equal, 10, 8);


        VBox layout2 = new VBox();
        layout2.getChildren().addAll(screen, layout);
        Group group = new Group(layout2);
        Scene scene = new Scene(group, 230, 250);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
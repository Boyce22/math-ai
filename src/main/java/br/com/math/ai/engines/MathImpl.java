package br.com.math.ai.engines;

import java.util.Map;

public class MathImpl implements Math {

    @Override
    public String calculate(Map<String, String> components) {
        String operation = components.get("operation");
        int num1 = Integer.parseInt(components.getOrDefault("num1", "0"));
        int num2 = Integer.parseInt(components.getOrDefault("num2", "0"));

        switch (operation) {
            case "add":
                return "O resultado é: " + (num1 + num2);
            case "subtract":
                return "O resultado é: " + (num1 - num2);
            case "multiply":
                return "O resultado é: " + (num1 * num2);
            case "divide":
                if (num2 == 0) {
                    return "Não é possível dividir por zero.";
                }
                return "O resultado é: " + (num1 / (double) num2);
            case "factorial":
                return "O resultado é: " + factorial(num1);
            case "power":
                return "O resultado é: " + java.lang.Math.pow(num1, num2);
            default:
                return "Operação não reconhecida.";
        }
    }

    @Override
    public int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}

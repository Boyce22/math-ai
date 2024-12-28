package br.com.math.ai.processors;

import java.util.HashMap;
import java.util.Map;

public class NaturalLanguageImpl implements NaturalLanguage {

    @Override
    public Map<String, String> parseQuestion(String inputValue) {
        String input = inputValue.toLowerCase();

        Map<String, String> components = new HashMap<String, String>();

        if (input.contains("mais") || input.contains("somar") || input.contains("+")) {
            components.put("operation", "add");
        } else if (input.contains("menos") || input.contains("subtrair") || input.contains("-")) {
            components.put("operation", "subtract");
        } else if (input.contains("vezes") || input.contains("multiplicar") || input.contains("*")) {
            components.put("operation", "multiply");
        } else if (input.contains("dividido") || input.contains("dividir") || input.contains("/")) {
            components.put("operation", "divide");
        } else if (input.contains("fatorial")) {
            components.put("operation", "factorial");
        } else if (input.contains("elevado") || input.contains("^")) {
            components.put("operation", "power");
        }

        String[] words = input.split("\\s+");
        for (String word : words) {
            try {
                int number = Integer.parseInt(word);
                components.put(components.containsKey("num1") ? "num2" : "num1", String.valueOf(number));
            } catch (NumberFormatException ignored) {
            }
        }

        return components;
    }
}

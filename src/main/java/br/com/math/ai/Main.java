package br.com.math.ai;

import br.com.math.ai.engines.MathImpl;
import br.com.math.ai.processors.NaturalLanguageImpl;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MathImpl math = new MathImpl();
        NaturalLanguageImpl naturalLanguage = new NaturalLanguageImpl();

        System.out.println("Olá! Pergunte algo matemático:");
        String input = scanner.nextLine();

        Map<String, String> parsedQuestion = naturalLanguage.parseQuestion(input);
        String response = math.calculate(parsedQuestion);

        System.out.println(response);
    }
}
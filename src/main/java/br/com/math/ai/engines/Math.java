package br.com.math.ai.engines;

import java.util.Map;

public interface Math {
    String calculate(Map<String, String> components);

    int factorial(int n);
}

package br.com.math.ai.processors;

import java.util.Map;

public interface NaturalLanguage {
    Map<String, String> parseQuestion(String inputValue);
}

package com.example.marciano;

interface MarcianoInterface {
    String agir();
}

public class Marciano {
    private final String pergunta = "Certamente";
    private final String grito = "Opa! Calma aí!";
    private final String perguntaGrito = "Relaxa, eu sei o que estou fazendo!";
    private final String eu = "A responsabilidade é sua";
    private final String vazio = "Não me incomode";
    private final String outro = "Tudo bem, como quiser";

    public String responda(String comando) {
        if (comando == null || comando.trim().isEmpty()) {
            return vazio;
        } else if (comando.toLowerCase().contains("eu")) {
            return eu;
        } else if (comando.contains("?") && anyUpperCase(comando.split(" "))) {
            return perguntaGrito;
        } else if (anyUpperCase(comando.split(" "))) {
            return grito;
        } else if (comando.contains("?")) {
            return pergunta;
        } else {
            return outro;
        }
    }

    private boolean anyUpperCase(String[] words) {
        for (String word : words) {
            if (word.equals(word.toUpperCase())) {
                return true;
            }
        }
        return false;
    }
}


package com.example.marciano;

public class MarcianoAvancado extends Marciano {
    public Object responda(String comando, Double oper1, Double oper2) {
        if (oper1 != null && oper2 != null) {
            switch (comando.toLowerCase()) {
                case "some":
                    return oper1 + oper2;
                case "subtraia":
                    return oper1 - oper2;
                case "multiplique":
                    return oper1 * oper2;
                case "divida":
                    return oper1 / oper2;
                default:
                    return "Ou não";
            }
        } else {
            return super.responda(comando);
        }
    }
}

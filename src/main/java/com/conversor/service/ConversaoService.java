package com.conversor.service;

import com.conversor.util.ApiClient;
import org.json.JSONObject;

public class ConversaoService {
    private final String[] moedas = {"USD", "ARS", "BOB", "CLP", "COP"};

    public String converter(int opcao, double valor) {
        if (opcao < 1 || opcao > moedas.length) {
            return "Opção inválida.";
        }

        String moeda = moedas[opcao - 1];
        double taxa = buscarTaxaCambio(moeda);

        if (taxa == -1) {
            return "Erro ao buscar taxa de câmbio.";
        }

        double resultado = valor * taxa;
        return String.format("R$ %.2f é equivalente a %.2f %s", valor, resultado, moeda);
    }

    private double buscarTaxaCambio(String moeda) {
        try {
            String response = ApiClient.get("https://api.exchangerate-api.com/v4/latest/BRL");
            JSONObject json = new JSONObject(response);
            return json.getJSONObject("rates").getDouble(moeda);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}

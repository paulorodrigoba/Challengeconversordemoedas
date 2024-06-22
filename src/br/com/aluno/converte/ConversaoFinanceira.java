package br.com.aluno.converte;

public interface ConversaoFinanceira {
    static void imprimirTabelaDeMoedas() {
        System.out.println("Tabela de Siglas das Moedas:");
        System.out.println("---------------------------");
        System.out.println("| Sigla | Moeda           |");
        System.out.println("---------------------------");
        System.out.println("| USD   | Dólar Americano |");
        System.out.println("| EUR   | Euro            |");
        System.out.println("| GBP   | Libra Esterlina |");
        System.out.println("| JPY   | Iene Japonês    |");
        System.out.println("| BRL   | Real Brasileiro |");
        System.out.println("| CAD   | Dólar Canadense |");
        System.out.println("| AUD   | Dólar Australiano|");
        System.out.println("| CHF   | Franco Suíço    |");
        System.out.println("| CNY   | Yuan Chinês     |");
        System.out.println("| INR   | Rupia Indiana   |");
        System.out.println("---------------------------");
    }
}

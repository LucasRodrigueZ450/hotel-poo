public class Main {
    public static void main(String[] args) {
        Pessoa tobias = new Pessoa("Tobias", 23, "288.324.890-74");
        Pessoa lucas = new Pessoa("Lucas", 28, "158.060.760-83");
        Funcionario ana = new Funcionario("Ana", 31, "318.491.520-47", "1241873");

        System.out.println(tobias);
        System.out.println(lucas);
        System.out.println(ana);

        String[] itensFrigobar = {"Água Mineral Límpida", "Coca-Cola", "Heineken", "Serenata de Amor"};
        Frigobar frigobar = new Frigobar(itensFrigobar);

        Quarto quarto1 = new Quarto("simples", 32, 200.0, true, frigobar);
        Quarto quarto2 = new Quarto("simples", 56, 200.0, false, frigobar);

        Hotel hotel = new Hotel("Pousada Azul do Mar", 12);
        System.out.println(hotel);

        System.out.println(quarto1);
        System.out.println("Valor diária do quarto: " + quarto1.getValorDiaria());
        quarto1.alugar(tobias);

        System.out.println(quarto2);
        quarto2.alugar(lucas);

        tobias.solicitarServico("limpeza");
        quarto1.consumirItemFrigobar("Coca-Cola");
        tobias.pagarDiaria(quarto1.getValorDiaria());
    }
}

class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Pessoa nome='" + nome + "', idade=" + idade + ", cpf='" + cpf + "'";
    }

    public void solicitarServico(String servico) {
        System.out.println(nome + " solicitou o serviço de " + servico);
    }

    public void pagarDiaria(double valorDiaria) {
        System.out.println(nome + " pagou sua diária (R$" + valorDiaria + ")");
    }
}
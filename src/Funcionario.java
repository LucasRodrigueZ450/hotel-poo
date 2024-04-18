class Funcionario extends Pessoa {
    private String matricula;

    public Funcionario(String nome, int idade, String cpf, String matricula) {
        super(nome, idade, cpf);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public String toString() {
        return "Funcionario matricula='" + matricula + "' " + super.toString();
    }

    public void realizarServico(String servico) {
        System.out.println(getNome() + " realizou seu serviço de " + servico); 
    }
}
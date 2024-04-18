class Hotel {
    private String nome;
    private int numeroDeQuartos;

    public Hotel(String nome, int numeroDeQuartos) {
        this.nome = nome;
        this.numeroDeQuartos = numeroDeQuartos;
    }

    @Override
    public String toString() {
        return "Hotel{nome='" + nome + "', numeroDeQuartos=" + numeroDeQuartos + '}';
    }
}
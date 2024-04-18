import java.time.LocalDate;

class Quarto {
    private String categoria;
    private int numero;
    private double valorDiaria; 
    private boolean disponivel;
    private Pessoa hospede;
    private Frigobar frigobar;
    private boolean reservado;
    private Pessoa hospedeReserva;
    private LocalDate dataReserva;
    private LocalDate dataDesocupacaoPrevista;
    private Funcionario funcionarioResponsavel;


    public Quarto(String categoria, int numero, double valorDiaria, boolean disponivel, Frigobar frigobar) {
        this.categoria = categoria;
        this.numero = numero;
        this.valorDiaria = valorDiaria; 
        this.disponivel = disponivel;
        this.frigobar = frigobar;
        this.reservado = false;
        this.hospedeReserva = null;
        this.dataReserva = null;
        this.dataDesocupacaoPrevista = null;
    }

    public boolean verificarDisponibilidade() {
        return disponivel && !reservado;
    }

    public boolean reservar(Pessoa hospede, LocalDate dataReserva, LocalDate dataDesocupacaoPrevista) {
        if (verificarDisponibilidade()) {
            this.reservado = true;
            this.hospedeReserva = hospede;
            this.dataReserva = dataReserva;
            this.dataDesocupacaoPrevista = dataDesocupacaoPrevista;
            return true;
        } else {
            System.out.println("Quarto não disponível para reserva.");
            return false;
        }
    }


    public void registrarFuncionarioResponsavel(Funcionario funcionario) {
        this.funcionarioResponsavel = funcionario;
    }

    public int getNumero() {
        return numero;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    @Override
    public String toString() {
        return "Quarto{" +
                "categoria='" + categoria + '\'' +
                ", numero=" + numero +
                ", valorDiaria=" + valorDiaria +
                ", disponivel=" + disponivel +
                ", frigobar=" + frigobar +
                ", hospede=" + hospede +
                '}';
    }

    public void consumirItemFrigobar(String item) {
        if (hospede != null) {
            System.out.println(hospede.getNome() + " consumiu o item " + item + " do frigobar");
           
        } else {
            System.out.println("Nenhum hóspede no quarto para consumir o item do frigobar.");
        }
    }

    public void ocupar(Pessoa hospede) {
        if (disponivel) {
            this.hospede = hospede;
            this.disponivel = false;
            System.out.println(hospede.getNome() + " ocupou o quarto " + numero);
        } else {
            System.out.println("O quarto " + numero + " já está ocupado.");
        }
    }

    public void alugar(Pessoa hospede) {
        if (disponivel) {
            this.hospede = hospede;
            disponivel = false;
            System.out.println(hospede.getNome() + " alugou o quarto " + numero);
        } else {
            System.out.println("Quarto " + numero + " já está ocupado");
        }
    }

    public Funcionario getFuncionarioResponsavel() {
        return funcionarioResponsavel;
    }
}

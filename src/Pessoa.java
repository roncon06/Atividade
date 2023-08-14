import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

    private String nome;
    private LocalDate dataNascimento;
    private int idade;

    public Pessoa() {
    }

    public Pessoa(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.idade = calcularIdade();
    }

    public Pessoa(String nome, LocalDate dataNascimento, int idade) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.idade = idade;
    }

    // Métodos getters e setters para nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Métodos getters e setters para data de nascimento
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
        this.idade = calcularIdade();
    }

    // Métodos getters e setters para idade
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método para calcular a idade baseada na data de nascimento
    private int calcularIdade() {
        LocalDate hoje = LocalDate.now();
        Period periodo = Period.between(dataNascimento, hoje);
        return periodo.getYears();
    }



}
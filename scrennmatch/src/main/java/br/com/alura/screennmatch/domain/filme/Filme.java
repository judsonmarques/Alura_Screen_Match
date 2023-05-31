package br.com.alura.screennmatch.domain.filme;

public class Filme {
    private String nome;
    private Integer duracaoMinutos;
    private Integer anoLancamento;
    private String genero;

    public Filme(DadosCadastroFilmes dados){
        this.nome = dados.nome();
        this.duracaoMinutos = dados.duracao();
        this.anoLancamento = dados.ano();
        this.genero = dados.genero();
    }

    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", duracaoMinutos=" + duracaoMinutos +
                ", anoLancamento=" + anoLancamento +
                ", genero='" + genero + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public Integer getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public String getGenero() {
        return genero;
    }
}

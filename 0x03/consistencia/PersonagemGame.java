public class PersonagemGame {
    private int saudeAtual;
    private String nome;
    private String status;

    public PersonagemGame(int saudeAtual, String nome) {
        this.saudeAtual = saudeAtual;
        this.nome = nome;
        setSaudeAtual(saudeAtual);
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
        if (saudeAtual > 0){
            status = "vivo";
        }else{
            status = "morto";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome == ""){

        }else{
            this.nome = nome;
        }
    }

    public void tomarDano(int quantidadeDeDano){
        if ((saudeAtual - quantidadeDeDano) < 0){
            setSaudeAtual(0);
        }else {
            setSaudeAtual((saudeAtual - quantidadeDeDano));
        }
    }

    public void receberCura(int quantidadeDeCura){
        if (saudeAtual + quantidadeDeCura > 100){
            setSaudeAtual(100);
        }else {
            setSaudeAtual((saudeAtual + quantidadeDeCura));
        }
    }

    public String getStatus() {
        return status;
    }
}

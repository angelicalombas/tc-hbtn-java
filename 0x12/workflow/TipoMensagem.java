public enum TipoMensagem {
    AVISO("AVISO"), ERRO("ERRO"), LOG("LOG");

    private String tipoMensagem;

    TipoMensagem(String tipoNumero){
        this.tipoMensagem = tipoNumero;
    }
}

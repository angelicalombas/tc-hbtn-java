public enum TipoNumero {
    CELULAR("CELULAR"), COMERCIAL("COMERCIAL"), CASA("CASA");

    private String tipoNumero;

    TipoNumero(String tipoNumero){
        this.tipoNumero = tipoNumero;
    }

    public String getTipoNumero(){
        return tipoNumero;
    }

}

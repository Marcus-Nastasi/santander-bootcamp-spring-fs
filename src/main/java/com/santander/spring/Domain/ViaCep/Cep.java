package com.santander.spring.Domain.ViaCep;

public class Cep {

    private String cep;
    private String log;
    private String local;

    public String getCep() {
        return cep;
    }

    public Cep(String cep, String log, String local) {
        this.cep = cep;
        this.log = log;
        this.local = local;
    }

    @Override
    public String toString() {
        return("Cep{" + "cep='" + cep + '\'' + ", log='" + log + '\'' + ", local='" + local + '\'' + '}');
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}



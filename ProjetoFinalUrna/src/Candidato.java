/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author David
 */
public class Candidato {
    private String nome;
    private String partido;
    private String vice;
    private int numero;
    private int votos;

    public Candidato() {
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getVice() {
        return vice;
    }

    public void setVice(String vice) {
        this.vice = vice;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
        public int getVotos() {
        return votos;
    }

    public void setVotos() {
        this.votos += 1;
    }
    
    public void setVotos1(int votos){
        this.votos = votos;
    }
    
    public void zerarVotos(Candidato candidato){
        candidato.setVotos1(0);
    }
    
    public Candidato(String nome, String partido, String vice, int numero) {
        this.nome = nome;
        this.partido = partido;
        this.vice = vice;
        this.numero = numero;
    }

    public Candidato(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

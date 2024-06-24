package main.java.set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    //Atributo
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exbirConvidados(){

        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de convidados!");

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 2);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 3);
        conjuntoConvidados.adicionarConvidado("Convidado 5", 4);
        conjuntoConvidados.adicionarConvidado("Convidado 6", 5);
        conjuntoConvidados.adicionarConvidado("Convidado 7", 6);

        conjuntoConvidados.removerConvidadoPorCodigoConvite(5);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de convidados!");

        conjuntoConvidados.exbirConvidados();
    }
}



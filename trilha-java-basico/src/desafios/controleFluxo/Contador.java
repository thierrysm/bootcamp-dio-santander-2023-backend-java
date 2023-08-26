package desafios.controleFluxo;

import java.util.Scanner;

public class Contador {

    private Integer parametroUm;
    private Integer parametroDois;

    ParametrosInvalidosException parametrosInvalidosException;

    public Contador(Integer parametroUm, Integer parametroDois) {
        this.parametroUm = parametroUm;
        this.parametroDois = parametroDois;
    }

    public Integer getParametroUm() {
        return parametroUm;
    }

    public void setParametroUm(Integer parametroUm) {
        this.parametroUm = parametroUm;
    }

    public Integer getParametroDois() {
        return parametroDois;
    }

    public void setParametroDois(Integer parametroDois) {
        this.parametroDois = parametroDois;
    }

    static void contar(int parametroUm, int parametroDois) {

        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }
        else {
            int aux = parametroDois - parametroUm;
            for (int i=1; i<=aux; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        }
    }


}

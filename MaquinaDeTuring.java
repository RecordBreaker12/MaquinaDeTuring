package maquina.de.turing;

import java.io.IOException;

public class MaquinaDeTuring {

    public static void main(String[] args) throws IOException {
        String funcao = "C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Maquina de Turing\\src\\maquina\\de\\turing\\funcao.txt";
        String entrada = "C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Maquina de Turing\\src\\maquina\\de\\turing\\entrada.txt";
        String saida = "C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Maquina de Turing\\src\\maquina\\de\\turing\\saída.txt";
        Leitor l = new Leitor(funcao, entrada, saida);
        System.out.println(l.verificar());
    }
    
}

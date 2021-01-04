package maquina.de.turing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Leitor {
    
    String funcao, entrada, saida;
    static BufferedReader func;
    static BufferedReader ent;
    static BufferedWriter ext;
    static String linha[];
    static String posicaoAtual = "q0";
    public Leitor(String funcao, String entrada, String saida) throws FileNotFoundException, IOException{
        this.funcao = funcao;
        this.entrada = entrada;
        this.saida = saida;
        Leitor.func = new BufferedReader(new FileReader(funcao));
        Leitor.ent = new BufferedReader(new FileReader(entrada));
        Leitor.ext = new BufferedWriter(new FileWriter(saida));
    }
    
    public static String lerEntrada() throws IOException{
        String leitor;
        leitor = ent.readLine();
        return leitor;
    }
 
    public int verificar() throws IOException{
        String input[];
        int i = 0;
        input = lerEntrada().split("");
        String leitor = "";
        while (leitor != null) {
            func.mark(0);
            if(i>=input.length&&posicaoAtual.contains("qf")){
                for (String input1 : input) {
                    ext.append(input1);
                }
                func.close();
                ent.close();
                ext.close();
                return 1;
            }
            else if(i>=input.length){
                return 0;
            }
            linha = leitor.split(" ");
            if(linha[0].equals(posicaoAtual) && linha[1].equals(input[i])){
                posicaoAtual=linha[4];
                input[i]=linha[2];
                if(linha[3].equals("R")){
                    i++;
                }
                else{
                    i--;
                }
                func.reset();
            }
            else{
                leitor = func.readLine();
            }
        }
        return 0;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.GeradordeTabuadas;

import java.awt.HeadlessException;
import javax.swing.JOptionPane; 

/**
 *
 * @author islya
 */
public class GeradordeTabuadas {

    public static void main(String[] args) {
        
        int flag =1;
        
        while (flag == 1) {
            
        int a, res;
        
        String saida = "";
        
        //Solicita a entrada para o usuário
        try {String text = JOptionPane.showInputDialog (null, "Digite um número inteiro para obter sua tabuada: ", "Pergunta",
                JOptionPane.PLAIN_MESSAGE);
        a = Integer.parseInt(text);
        } 
        
        //Tratamento de erro, caso o usuário não insira um valor numérico
        catch(HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog (null, "Não é possível gerar a tabuada de um valor não numérico.", "Erro",
                JOptionPane.ERROR_MESSAGE);       
            
            String text = JOptionPane.showInputDialog (null, "Por favor, Digite um número inteiro.", "Pergunta",
                JOptionPane.PLAIN_MESSAGE);
            a = Integer.parseInt(text);
        }

        //Gerando a tabuada
        for (int i=1; i<11; i++) {
           res = (a * i);
           saida += (a) + " x " + (i) + " = " + (res) + "\n";
        }
        
        JOptionPane.showMessageDialog(null, (saida) , "Tabuada",
        JOptionPane.INFORMATION_MESSAGE);
        
        
        flag = JOptionPane.showConfirmDialog (null, "Deseja sair do programa?", "Selecione uma opção",
                JOptionPane.YES_NO_OPTION);    
        
        }        
    }
}


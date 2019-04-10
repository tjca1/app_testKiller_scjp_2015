/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.testkiller.util;
import br.com.testkiller.view.TelaPrincipal;
import java.awt.Color;

/**
 *
 * @author Thiago Araujo
 */
public class VariaveisConstantes
{
    private  static String SEL_OPCAO = "Selecione a Opção(S) !";
    private  static String SEL_OPCAOS = "Selecione as Opções !";
    private  static String SEL_MAIS_UMA_OPCAO = "Selecione mais UMA Opção !";
    private  static String SEL_MAIS_DUAS_OPCAO = "Selecione mais DUAS Opções !";
    private  static String SEL_MAIS_TRÊS_OPCAO = "Selecione mais TRÊS Opções !";
    private  static String SEL_MAIS_QUATRO_OPCAO = "Selecione mais QUATRO Opções !";
    private  static String S_UMA_OPCAO = "Só UMA Opção Esta Correta !";
    private  static String S_DUAS_OPCAO = "Só DUAS Opções Estão Corretas !";
    private  static String S_TRES_OPCAO = "Só TRÊS Opções Estão Corretas !";
    private  static String S_QUATRO_OPCAO = "Só QUATRO Opções Estão Corretas !";
    private  static String S_CINCO_OPCAO = "Só CINCO Opções Estão Corretas !";
    private  static String STATUS_QUESTOES = "CORRETA !";
    //private  static String URL_ARQUIVO_PROPRIEDADES_INTER = "src/br/com/testkiller/internacionalizacao/padrao.properties";
    private  static String URL_ARQUIVO_PROPRIEDADES_INTER = "padrao.dll";
    public   static String TITULO_TIMER_CRONOMETRO = "Cronometro";
    
    /* CONSTANTES PARA O GRAFICO */
     public static String R_ERRADAS_DISPLAY_GRAFICO_US = "Questions: Wrong";
     public static String R_CORREATAS_DISPLAY_GRAFICO_US = "Questions: Hits";
     public static String R_NAOFEITAS_DISPLAY_GRAFICO_US = "Questions: Not Made";
     public static String R_ERRADAS_DISPLAY_GRAFICO_BR = "Questões: Erradas";
     public static String R_CORREATAS_DISPLAY_GRAFICO_BR = "Questões: Acertos";
     public static String  R_NAOFEITAS_DISPLAY_GRAFICO_BR = "Questões: Não Feitas";
     
     public static String R_ERRADAS_DISPLAY_US = "Wrong:";
     public static String R_CORREATAS_DISPLAY_US = "Hits:";
     public static String R_NAOFEITAS_DISPLAY_US = "Not Made:";
     public static String R_ERRADAS_DISPLAY_BR = "Erros:";
     public static String R_CORREATAS_DISPLAY_BR = "Acertos:";
     public static String R_NAOFEITAS_DISPLAY_BR = "Não Feitas:";
     public static Color corBlue =  new Color(0,51,255);
     public static Color corRed =   new Color(255,51,51);
     public static Color corGrenn = new Color(51,102,0);
     
    /* CONSTANTES PARA O GRAFICO */
    
    private static void PadraoInicioConsPT_BR()
    {
         SEL_OPCAO = "Selecione a Opção !";
         SEL_OPCAOS = "Selecione as Opções !";
         SEL_MAIS_UMA_OPCAO = "Selecione mais UMA Opção !";
         SEL_MAIS_DUAS_OPCAO = "Selecione mais DUAS Opções !";
         SEL_MAIS_TRÊS_OPCAO = "Selecione mais TRÊS Opções !";
         SEL_MAIS_QUATRO_OPCAO = "Selecione mais QUATRO Opções !";
         S_UMA_OPCAO = "Só UMA Opção Esta Correta !";
         S_DUAS_OPCAO = "Só DUAS Opções Estão Corretas !";
         S_TRES_OPCAO = "Só TRÊS Opções Estão Corretas !";
         S_QUATRO_OPCAO = "Só QUATRO Opções Estão Corretas !";
         S_CINCO_OPCAO = "Só CINCO Opções Estão Corretas !";
         STATUS_QUESTOES = "CORRETA !";
         TITULO_TIMER_CRONOMETRO = "Cronometro";
        
         
    }

    private static void PadraoInicioConsEN_USA()
    {
          SEL_OPCAO = "Select Option";
          SEL_OPCAOS = "Select Options";
          SEL_MAIS_UMA_OPCAO = "Select  ONE more option";
          SEL_MAIS_DUAS_OPCAO = "select TWO  more options";
          SEL_MAIS_TRÊS_OPCAO = "Select THREE more options ";
          SEL_MAIS_QUATRO_OPCAO = "Select FOUR more options ";
          S_UMA_OPCAO = "This option only ONE Correct!";
          S_DUAS_OPCAO = "Only TWO Options Are Correct!";
          S_TRES_OPCAO = "Only Three Options Are Correct!";
          S_QUATRO_OPCAO = "Only FOUR Options Are Correct!";
          S_CINCO_OPCAO = "Only FIVE Options Are Correct!";
          STATUS_QUESTOES = "WRONG !";
          TITULO_TIMER_CRONOMETRO = "Timer";

    }



    public static String getURL_ARQUIVO_PROPRIEDADES_INTER() {
        return URL_ARQUIVO_PROPRIEDADES_INTER;
    }
    public static String getSTATUS_QUESTOES() {
        
        if(TelaPrincipal.DeterminaInternacionalizacaoPopUp == 1)
           PadraoInicioConsEN_USA();
        else
         PadraoInicioConsPT_BR();
        
        return STATUS_QUESTOES;
    }
    public static String getSEL_MAIS_DUAS_OPCAO() {
        if(TelaPrincipal.DeterminaInternacionalizacaoPopUp == 1)
           PadraoInicioConsEN_USA();
        else
         PadraoInicioConsPT_BR();

        return SEL_MAIS_DUAS_OPCAO;
    }

    public static String getSEL_MAIS_TRÊS_OPCAO() {
        if(TelaPrincipal.DeterminaInternacionalizacaoPopUp == 1)
           PadraoInicioConsEN_USA();
        else
         PadraoInicioConsPT_BR();

        return SEL_MAIS_TRÊS_OPCAO;
    }
    public static String getSEL_MAIS_QUATRO_OPCAO() {
        if(TelaPrincipal.DeterminaInternacionalizacaoPopUp == 1)
           PadraoInicioConsEN_USA();
        else
         PadraoInicioConsPT_BR();

        return SEL_MAIS_QUATRO_OPCAO;
    }
    public static String getSEL_MAIS_UMA_OPCAO() {
        if(TelaPrincipal.DeterminaInternacionalizacaoPopUp == 1)
           PadraoInicioConsEN_USA();
        else
         PadraoInicioConsPT_BR();

        return SEL_MAIS_UMA_OPCAO;
    }
    public static String getSEL_OPCAO() {
        if(TelaPrincipal.DeterminaInternacionalizacaoPopUp == 1)
           PadraoInicioConsEN_USA();
        else
         PadraoInicioConsPT_BR();

        return SEL_OPCAO;
    }

    public static String getSEL_OPCAOS() {
        if(TelaPrincipal.DeterminaInternacionalizacaoPopUp == 1)
           PadraoInicioConsEN_USA();
        else
         PadraoInicioConsPT_BR();

        return SEL_OPCAOS;
    }

    public static String getS_DUAS_OPCAO() {
        if(TelaPrincipal.DeterminaInternacionalizacaoPopUp == 1)
           PadraoInicioConsEN_USA();
        else
         PadraoInicioConsPT_BR();

        return S_DUAS_OPCAO;
    }

    public static String getS_TRES_OPCAO() {
        if(TelaPrincipal.DeterminaInternacionalizacaoPopUp == 1)
           PadraoInicioConsEN_USA();
        else
         PadraoInicioConsPT_BR();

        return S_TRES_OPCAO;
    }

    public static String getS_UMA_OPCAO() {
        if(TelaPrincipal.DeterminaInternacionalizacaoPopUp == 1)
           PadraoInicioConsEN_USA();
        else
         PadraoInicioConsPT_BR();

        return S_UMA_OPCAO;
    }
    public static String getS_QUATRO_OPCAO() {
        if(TelaPrincipal.DeterminaInternacionalizacaoPopUp == 1)
           PadraoInicioConsEN_USA();
        else
         PadraoInicioConsPT_BR();

        return S_QUATRO_OPCAO;
    }

    public static String getS_CINCO_OPCAO() {
        if(TelaPrincipal.DeterminaInternacionalizacaoPopUp == 1)
           PadraoInicioConsEN_USA();
        else
         PadraoInicioConsPT_BR();

        return S_CINCO_OPCAO;
    }




}

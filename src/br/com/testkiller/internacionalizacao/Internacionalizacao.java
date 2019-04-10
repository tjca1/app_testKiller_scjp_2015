/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.testkiller.internacionalizacao;

import br.com.testkiller.util.VariaveisConstantes;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Thiago Araujo.
 */
public class Internacionalizacao
{

    private String conteudoTextArea1;

    public String getConteudoTextArea1()
    {
        return conteudoTextArea1;
    }

    public void setConteudoTextArea1(String conteudoTextArea1)
    {
        this.conteudoTextArea1 = conteudoTextArea1;
    }

       


    public void determinaPropriedadeTextArea1(String nome_propreties) throws FileNotFoundException, IOException
    {
        Properties defaultProps = new Properties();
        FileInputStream in = new FileInputStream(VariaveisConstantes.getURL_ARQUIVO_PROPRIEDADES_INTER());
        defaultProps.load(in);
        in.close();
        Properties applicationProps = new Properties(defaultProps);
        setConteudoTextArea1(applicationProps.getProperty(nome_propreties));
    }


}

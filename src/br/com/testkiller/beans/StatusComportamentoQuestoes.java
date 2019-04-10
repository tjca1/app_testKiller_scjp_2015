/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.testkiller.beans;

/**
 *
 * @author Thiago Araujo
 */
public class StatusComportamentoQuestoes
{
        private  boolean status_classe = false;
        private  boolean status_label_questao_classe = false;
        private  String status_questao = "";

    public StatusComportamentoQuestoes()
    {
        status_classe = false;
        status_label_questao_classe = false;
        String status_questao = "";
    }


    public boolean isStatus_classe() {
        return status_classe;
    }

    public void setStatus_classe(boolean status_classe) {
        this.status_classe = status_classe;
    }

    public boolean isStatus_label_questao_classe() {
        return status_label_questao_classe;
    }

    public void setStatus_label_questao_classe(boolean status_label_questao_classe) {
        this.status_label_questao_classe = status_label_questao_classe;
    }

    public String getStatus_questao() {
        return status_questao;
    }

    public void setStatus_questao(String status_questao) {
        this.status_questao = status_questao;
    }

}

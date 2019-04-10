package br.com.testkiller.util;

import javax.swing.JOptionPane;

/**
 *
 * @author Thiago araujo
 */
public class QuantidadeRespostas {
    
    public static void VerificaResp(int verificaOpcaoQestoes, int qtd)
    {

       if(qtd == 1)
       {  
           switch(verificaOpcaoQestoes)
            {
                
                case 2:
                        JOptionPane.showMessageDialog(null,VariaveisConstantes.getS_UMA_OPCAO());
                break; 
                case 3:
                        JOptionPane.showMessageDialog(null,VariaveisConstantes.getS_UMA_OPCAO());
                break;        
                case 4:
                        JOptionPane.showMessageDialog(null, VariaveisConstantes.getS_UMA_OPCAO());
                break;            
                case 5:  
                        JOptionPane.showMessageDialog(null, VariaveisConstantes.getS_UMA_OPCAO());
                break;
                case 6:
                        JOptionPane.showMessageDialog(null,  VariaveisConstantes.getS_UMA_OPCAO());
                break;
                case 7: 
                        JOptionPane.showMessageDialog(null,  VariaveisConstantes.getS_UMA_OPCAO());
                break;
                case 8: 
                        JOptionPane.showMessageDialog(null,  VariaveisConstantes.getS_UMA_OPCAO());
                break;
                case 9: 
                        JOptionPane.showMessageDialog(null,  VariaveisConstantes.getS_UMA_OPCAO());
                break;
                default:
                        JOptionPane.showMessageDialog(null,VariaveisConstantes.getSEL_OPCAO());
                break;
            }
       }
        else if(qtd == 2)
        {
            switch(verificaOpcaoQestoes)
            {
                case 1:
                       JOptionPane.showMessageDialog(null,VariaveisConstantes.getSEL_MAIS_UMA_OPCAO());
                break;

                case 3:
                       JOptionPane.showMessageDialog(null,VariaveisConstantes.getS_DUAS_OPCAO());
                break;        
                case 4:
                        JOptionPane.showMessageDialog(null, VariaveisConstantes.getS_DUAS_OPCAO());
                break;            
                case 5:  
                        JOptionPane.showMessageDialog(null, VariaveisConstantes.getS_DUAS_OPCAO());
                break;
                case 6:
                        JOptionPane.showMessageDialog(null,  VariaveisConstantes.getS_DUAS_OPCAO());
                break;
                case 7: 
                        JOptionPane.showMessageDialog(null,  VariaveisConstantes.getS_DUAS_OPCAO());
                break;
                case 8: 
                        JOptionPane.showMessageDialog(null,  VariaveisConstantes.getS_DUAS_OPCAO());
                break;
                case 9: 
                        JOptionPane.showMessageDialog(null,  VariaveisConstantes.getS_DUAS_OPCAO());
                break;
                default:
                        JOptionPane.showMessageDialog(null,VariaveisConstantes.getSEL_OPCAOS());
                break;

            }
        }
        
         else  if(qtd == 3)
         {
            switch(verificaOpcaoQestoes)
            {
                case 1:
                        JOptionPane.showMessageDialog(null,VariaveisConstantes.getSEL_MAIS_DUAS_OPCAO());
                break;
                case 2:
                       JOptionPane.showMessageDialog(null,VariaveisConstantes.getSEL_MAIS_UMA_OPCAO());
                break;        
                case 4:
                        JOptionPane.showMessageDialog(null, VariaveisConstantes.getS_TRES_OPCAO());
                break;            
                case 5:  
                        JOptionPane.showMessageDialog(null, VariaveisConstantes.getS_TRES_OPCAO());
                 break;
                case 6:
                        JOptionPane.showMessageDialog(null,  VariaveisConstantes.getS_TRES_OPCAO());
                break;
                case 7: 
                        JOptionPane.showMessageDialog(null,  VariaveisConstantes.getS_TRES_OPCAO());
                break;
                case 8: 
                        JOptionPane.showMessageDialog(null,  VariaveisConstantes.getS_TRES_OPCAO());
                break;
                case 9: 
                        JOptionPane.showMessageDialog(null,  VariaveisConstantes.getS_TRES_OPCAO());
                break;
                default:
                        JOptionPane.showMessageDialog(null,VariaveisConstantes.getSEL_OPCAOS());
                break;

            }
         
        
         }else  if(qtd == 4)
          {
            switch(verificaOpcaoQestoes)
            {
                case 1:
                        JOptionPane.showMessageDialog(null,  VariaveisConstantes.getSEL_MAIS_TRÊS_OPCAO());
                break;
                case 2:
                       JOptionPane.showMessageDialog(null,   VariaveisConstantes.getSEL_MAIS_DUAS_OPCAO());
                break;
                case 3:
                        JOptionPane.showMessageDialog(null,  VariaveisConstantes.getSEL_MAIS_UMA_OPCAO());
                break;
                case 5:
                        JOptionPane.showMessageDialog(null,  VariaveisConstantes.getS_QUATRO_OPCAO());
                break;
                case 6:
                        JOptionPane.showMessageDialog(null,  VariaveisConstantes.getS_QUATRO_OPCAO());
                break;
                case 7:
                        JOptionPane.showMessageDialog(null,  VariaveisConstantes.getS_QUATRO_OPCAO());
                break;
                case 8:
                        JOptionPane.showMessageDialog(null,  VariaveisConstantes.getS_QUATRO_OPCAO());
                break;
                case 9:
                        JOptionPane.showMessageDialog(null,  VariaveisConstantes.getS_QUATRO_OPCAO());
                break;
                default:
                        JOptionPane.showMessageDialog(null,VariaveisConstantes.getSEL_OPCAOS());
                break;

            }


         }else  if(qtd == 5)
          {
            switch(verificaOpcaoQestoes)
            {
                case 1:
                        JOptionPane.showMessageDialog(null,  VariaveisConstantes.getSEL_MAIS_QUATRO_OPCAO());
                break;
                case 2:
                       JOptionPane.showMessageDialog(null,   VariaveisConstantes.getSEL_MAIS_TRÊS_OPCAO()    );
                break;
                case 3:
                        JOptionPane.showMessageDialog(null,  VariaveisConstantes.getSEL_MAIS_DUAS_OPCAO()    );
                break;
                case 4:
                        JOptionPane.showMessageDialog(null,  VariaveisConstantes.getSEL_MAIS_UMA_OPCAO()     );
                break;
                case 6:
                        JOptionPane.showMessageDialog(null,  VariaveisConstantes.getS_CINCO_OPCAO()          );
                break;
                case 7:
                        JOptionPane.showMessageDialog(null,  VariaveisConstantes.getS_CINCO_OPCAO()          );
                break;
                case 8:
                        JOptionPane.showMessageDialog(null,  VariaveisConstantes.getS_CINCO_OPCAO()          );
                break;
                case 9:
                        JOptionPane.showMessageDialog(null,  VariaveisConstantes.getS_CINCO_OPCAO()          );
                break;
                default:
                        JOptionPane.showMessageDialog(null,  VariaveisConstantes.getSEL_OPCAOS()             );
                break;

            }


         }

    }
}
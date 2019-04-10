/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TelaPrincipal.java
 *
 * Created on 06/04/2011, 09:44:50
 */

package br.com.testkiller.view;

import br.com.testkiller.cronometro.Cronometro;
import br.com.testkiller.internacionalizacao.Internacionalizacao;
import br.com.testkiller.sobre.Respostas;
import br.com.testkiller.sobre.TelaSobre;
import br.com.testkiller.util.VariaveisConstantes;
import java.awt.Color;
import java.awt.Dimension;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
/**
 *
 * @author Thiago Araujo, tjca1@hotmail.com
 */
public class TelaPrincipal extends javax.swing.JFrame implements Observer{

    private int QuestaoSelecionata = 0;
    private Internacionalizacao internacionalizacao;
    private Double certos = 0.0 , n_feita = 224.0, erradas = 0.0;

   
    /* GRAFICO PARA INICIALIZAÇÃO */
    
    
    /*Paineis instanciados*/
   
    q_01 cl_questao_1 = new q_01();
    q_02 cl_questao_2 = new q_02();
    q_03 cl_questao_3 = new q_03();
    q_04 cl_questao_4 = new q_04();
    q_05 cl_questao_5 = new q_05();
    q_06 cl_questao_6 = new q_06();
    q_07 cl_questao_7 = new q_07();
    q_08 cl_questao_8 = new q_08();
    q_09 cl_questao_9 = new q_09();
    q_10 cl_questao_10 = new q_10();
    q_11 cl_questao_11 = new q_11();
    q_12 cl_questao_12 = new q_12();
    q_13 cl_questao_13 = new q_13();
    q_14 cl_questao_14 = new q_14();
    q_15 cl_questao_15 = new q_15();
    q_16 cl_questao_16 = new q_16();
    q_17 cl_questao_17 = new q_17();
    q_18 cl_questao_18 = new q_18();
    q_19 cl_questao_19 = new q_19();
    q_20 cl_questao_20 = new q_20();
    q_21 cl_questao_21 = new q_21();
    q_22 cl_questao_22 = new q_22();
    q_23 cl_questao_23 = new q_23();
    q_24 cl_questao_24 = new q_24();
    q_25 cl_questao_25 = new q_25();
    q_26 cl_questao_26 = new q_26();
    q_27 cl_questao_27 = new q_27();
    q_28 cl_questao_28 = new q_28();
    q_29 cl_questao_29 = new q_29();
    q_30 cl_questao_30 = new q_30();
    q_31 cl_questao_31 = new q_31();
    q_32 cl_questao_32 = new q_32();
    q_33 cl_questao_33 = new q_33();
    q_34 cl_questao_34 = new q_34();
    q_35 cl_questao_35 = new q_35();
    q_36 cl_questao_36 = new q_36();
    q_37 cl_questao_37 = new q_37();
    q_38 cl_questao_38 = new q_38();
    q_39 cl_questao_39 = new q_39();
    q_40 cl_questao_40 = new q_40();
    q_41 cl_questao_41 = new q_41();
    q_42 cl_questao_42 = new q_42();
    q_43 cl_questao_43 = new q_43();
    q_44 cl_questao_44 = new q_44();
    q_45 cl_questao_45 = new q_45();
    q_46 cl_questao_46 = new q_46();
    q_47 cl_questao_47 = new q_47();
    q_48 cl_questao_48 = new q_48();
    q_49 cl_questao_49 = new q_49();
    q_50 cl_questao_50 = new q_50();
    q_51 cl_questao_51 = new q_51();
    q_52 cl_questao_52 = new q_52();
    q_53 cl_questao_53 = new q_53();
    q_54 cl_questao_54 = new q_54();
    q_55 cl_questao_55 = new q_55();
    q_56 cl_questao_56 = new q_56();
    q_57 cl_questao_57 = new q_57();
    q_58 cl_questao_58 = new q_58();
    q_59 cl_questao_59 = new q_59();
    q_60 cl_questao_60 = new q_60();
    q_61 cl_questao_61 = new q_61();
    q_62 cl_questao_62 = new q_62();
    q_63 cl_questao_63 = new q_63();
    q_64 cl_questao_64 = new q_64();
    q_65 cl_questao_65 = new q_65();
    q_66 cl_questao_66 = new q_66();
    q_67 cl_questao_67 = new q_67();
    q_68 cl_questao_68 = new q_68();
    q_69 cl_questao_69 = new q_69(); 
    q_70 cl_questao_70 = new q_70();
    q_71 cl_questao_71 = new q_71();
    q_72 cl_questao_72 = new q_72();
    q_73 cl_questao_73 = new q_73(); 
    q_74 cl_questao_74 = new q_74();
    q_75 cl_questao_75 = new q_75();
    q_76 cl_questao_76 = new q_76();
    q_77 cl_questao_77 = new q_77();
    q_78 cl_questao_78 = new q_78();
    q_79 cl_questao_79 = new q_79();
    q_80 cl_questao_80 = new q_80();
    q_81 cl_questao_81 = new q_81();
    q_82 cl_questao_82 = new q_82();
    q_83 cl_questao_83 = new q_83();
    q_84 cl_questao_84 = new q_84();
    q_85 cl_questao_85 = new q_85();
    q_86 cl_questao_86 = new q_86();
    q_87 cl_questao_87 = new q_87();
    q_88 cl_questao_88 = new q_88();
    q_89 cl_questao_89 = new q_89();
    q_90 cl_questao_90 = new q_90();
    q_91 cl_questao_91 = new q_91();
    q_92 cl_questao_92 = new q_92();
    q_93 cl_questao_93 = new q_93();
    q_94 cl_questao_94 = new q_94();
    q_95 cl_questao_95 = new q_95();
    q_96 cl_questao_96 = new q_96();
    q_97 cl_questao_97 = new q_97();
    q_98 cl_questao_98 = new q_98();
    q_99 cl_questao_99 = new q_99();
    q_100 cl_questao_100= new q_100();
    q_101 cl_questao_101= new q_101();
    q_102 cl_questao_102= new q_102();
    q_103 cl_questao_103= new q_103();
    q_104 cl_questao_104= new q_104();
    q_105 cl_questao_105= new q_105();
    q_106 cl_questao_106= new q_106();
    q_107 cl_questao_107= new q_107();
    q_108 cl_questao_108= new q_108();
    q_109 cl_questao_109= new q_109();
    q_110 cl_questao_110= new q_110();
    q_111 cl_questao_111= new q_111();
    q_112 cl_questao_112= new q_112(); 
    q_113 cl_questao_113= new q_113();
    q_114 cl_questao_114= new q_114();
    q_115 cl_questao_115= new q_115();
    q_116 cl_questao_116= new q_116();
    q_117 cl_questao_117= new q_117();
    q_118 cl_questao_118= new q_118();
    q_119 cl_questao_119= new q_119();
    q_120 cl_questao_120= new q_120();
    q_121 cl_questao_121= new q_121();
    q_122 cl_questao_122= new q_122();
    q_123 cl_questao_123= new q_123();
    q_124 cl_questao_124= new q_124();
    q_125 cl_questao_125= new q_125();
    q_126 cl_questao_126= new q_126();
    q_127 cl_questao_127= new q_127();
    q_128 cl_questao_128= new q_128();
    q_129 cl_questao_129= new q_129();
    q_130 cl_questao_130= new q_130();
    q_131 cl_questao_131= new q_131();
    q_132 cl_questao_132= new q_132();
    q_133 cl_questao_133= new q_133();
    q_134 cl_questao_134= new q_134();
    q_135 cl_questao_135= new q_135();
    q_136 cl_questao_136= new q_136();
    q_137 cl_questao_137= new q_137();
    q_138 cl_questao_138= new q_138();
    q_139 cl_questao_139= new q_139();
    q_140 cl_questao_140= new q_140();
    q_141 cl_questao_141= new q_141();
    q_142 cl_questao_142= new q_142();
    q_143 cl_questao_143= new q_143();
    q_144 cl_questao_144= new q_144();
    q_145 cl_questao_145= new q_145();
    q_146 cl_questao_146= new q_146();
    q_147 cl_questao_147= new q_147();
    q_148 cl_questao_148= new q_148();
    q_149 cl_questao_149= new q_149();
    q_150 cl_questao_150= new q_150();
    q_151 cl_questao_151= new q_151();
    q_152 cl_questao_152= new q_152();
    q_153 cl_questao_153= new q_153(); 
    q_154 cl_questao_154= new q_154(); 
    q_155 cl_questao_155= new q_155();
    q_156 cl_questao_156= new q_156();
    q_157 cl_questao_157= new q_157();
    q_158 cl_questao_158= new q_158();
    q_159 cl_questao_159= new q_159();
    q_160 cl_questao_160= new q_160();
    q_161 cl_questao_161= new q_161();
    q_162 cl_questao_162= new q_162();
    q_163 cl_questao_163= new q_163();
    q_164 cl_questao_164= new q_164();
    q_165 cl_questao_165= new q_165();
    q_166 cl_questao_166= new q_166();
    q_167 cl_questao_167= new q_167();
    q_168 cl_questao_168= new q_168();
    q_169 cl_questao_169= new q_169();
    q_170 cl_questao_170= new q_170();
    q_171 cl_questao_171= new q_171();
    q_172 cl_questao_172= new q_172();
    q_173 cl_questao_173= new q_173();
    q_174 cl_questao_174= new q_174();
    q_175 cl_questao_175= new q_175();
    q_176 cl_questao_176= new q_176();
    q_177 cl_questao_177= new q_177();
    q_178 cl_questao_178= new q_178();
    q_179 cl_questao_179= new q_179();
    q_180 cl_questao_180= new q_180();
    q_181 cl_questao_181= new q_181();
    q_182 cl_questao_182= new q_182();
    q_183 cl_questao_183= new q_183();
    q_184 cl_questao_184= new q_184();
    q_185 cl_questao_185= new q_185();
    q_186 cl_questao_186= new q_186();
    q_187 cl_questao_187= new q_187();
    q_188 cl_questao_188= new q_188();
    q_189 cl_questao_189= new q_189();
    q_190 cl_questao_190= new q_190();
    q_191 cl_questao_191= new q_191();
    q_192 cl_questao_192= new q_192();
    q_193 cl_questao_193= new q_193();
    q_194 cl_questao_194= new q_194();
    q_195 cl_questao_195= new q_195();
    q_196 cl_questao_196= new q_196();
    q_197 cl_questao_197= new q_197();
    q_198 cl_questao_198= new q_198();
    q_199 cl_questao_199= new q_199();
    q_200 cl_questao_200= new q_200();
    q_201 cl_questao_201= new q_201();
    q_202 cl_questao_202= new q_202();
    q_203 cl_questao_203= new q_203();
    q_204 cl_questao_204= new q_204();
    q_205 cl_questao_205= new q_205();
    q_206 cl_questao_206= new q_206();
    q_207 cl_questao_207= new q_207();
    q_208 cl_questao_208= new q_208();
    q_209 cl_questao_209= new q_209();
    q_210 cl_questao_210= new q_210();
    q_211 cl_questao_211= new q_211();
    q_212 cl_questao_212= new q_212();
    q_213 cl_questao_213= new q_213();
    q_214 cl_questao_214= new q_214();
    q_215 cl_questao_215= new q_215();
    q_216 cl_questao_216= new q_216();
    q_217 cl_questao_217= new q_217();
    q_218 cl_questao_218= new q_218();
    q_219 cl_questao_219= new q_219();
    q_220 cl_questao_220= new q_220();
    q_221 cl_questao_221= new q_221();
    q_222 cl_questao_222= new q_222();
    q_223 cl_questao_223= new q_223();
    q_224 cl_questao_224= new q_224();
    q_225 cl_questao_225= new q_225();
    q_226 cl_questao_226= new q_226();


    /** Creates new form TelaPrincipal */
    public TelaPrincipal() {
        
        internacionalizacao = new Internacionalizacao();

          initComponents();/*Principais componentes*/
          graficoBR.setVisible(true);// pt
          graficoUS.setVisible(false);// pt*/
          Dimension tamanho = new Dimension(850, 630);
          jInternalFrame.setPreferredSize(tamanho);
          //jScrollPane2.setH
          this.setExtendedState(MAXIMIZED_BOTH);
          startRelogio();
                
    }
    
    private void GraficosUsBr(String status)
    {
        if(status.equalsIgnoreCase("Br"))
        {
            graficoBR.setVisible(true);// pt
            graficoUS.setVisible(false);// pt*/
        }else if(status.equalsIgnoreCase("Us"))
        {
            graficoUS.setVisible(true);// pt*/
            graficoBR.setVisible(false);// pt
        }
    }
    
    private void setLabelsStatus(String qual)
    {
            if(qual.equalsIgnoreCase("Us"))
            {     
                if(jLabelDisplayN_Feitas == null)
                    jLabelDisplayN_Feitas = new JLabel();
                    jLabelDisplayN_Feitas.setText(VariaveisConstantes.R_NAOFEITAS_DISPLAY_US);
                if(jLabelDisplayAcertos == null)
                    jLabelDisplayAcertos = new JLabel();
                    jLabelDisplayAcertos.setText(VariaveisConstantes.R_CORREATAS_DISPLAY_US);
                if(jLabelDisplayN_Erros == null)
                    jLabelDisplayN_Erros = new JLabel();
                    jLabelDisplayN_Erros.setText(VariaveisConstantes.R_ERRADAS_DISPLAY_US); 
            }else if(qual.equalsIgnoreCase("Br"))
            { 
                if(jLabelDisplayN_Feitas == null)
                    jLabelDisplayN_Feitas = new JLabel();
                    jLabelDisplayN_Feitas.setText(VariaveisConstantes.R_NAOFEITAS_DISPLAY_BR);
                if(jLabelDisplayAcertos == null)
                    jLabelDisplayAcertos = new JLabel();
                    jLabelDisplayAcertos.setText(VariaveisConstantes.R_CORREATAS_DISPLAY_BR);
                if(jLabelDisplayN_Erros == null)
                    jLabelDisplayN_Erros = new JLabel();
                    jLabelDisplayN_Erros.setText(VariaveisConstantes.R_ERRADAS_DISPLAY_BR);  
            }
        
    }
    
            
    
             public static void setjLabel_Azul(String valor)
             {
                
                if(jLabel_nao_feitas == null)
                    jLabel_nao_feitas = new JLabel();
                    jLabel_nao_feitas.setText(valor);                 
             }
             
             public static void setjLabel_Verde(String valor)
             {
                    if(jLabel_acertos == null)
                    jLabel_acertos = new JLabel();
                    jLabel_acertos.setText(valor);                 
             }
             public static void setjLabel_corVermelho(String valor)
             {
                    if(jLabel_erros == null)
                    jLabel_erros = new JLabel();
                    jLabel_erros.setText(valor);                  
             }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jButton_q1 = new javax.swing.JButton();
        jButton_q2 = new javax.swing.JButton();
        jButton_q3 = new javax.swing.JButton();
        jButton_q4 = new javax.swing.JButton();
        jButton_q5 = new javax.swing.JButton();
        jButton_q6 = new javax.swing.JButton();
        jButton_q7 = new javax.swing.JButton();
        jButton_q8 = new javax.swing.JButton();
        jButton_q9 = new javax.swing.JButton();
        jButton_q10 = new javax.swing.JButton();
        jButton_q11 = new javax.swing.JButton();
        jButton_q12 = new javax.swing.JButton();
        jButton_q13 = new javax.swing.JButton();
        jButton_q14 = new javax.swing.JButton();
        jButton_q15 = new javax.swing.JButton();
        jButton_q16 = new javax.swing.JButton();
        jButton_Principal = new javax.swing.JButton();
        jButton_q17 = new javax.swing.JButton();
        jButton_q18 = new javax.swing.JButton();
        jButton_q226 = new javax.swing.JButton();
        jButton_q227 = new javax.swing.JButton();
        jButton_q19 = new javax.swing.JButton();
        jButton_q20 = new javax.swing.JButton();
        jButton_q21 = new javax.swing.JButton();
        jButton_q22 = new javax.swing.JButton();
        jButton_q23 = new javax.swing.JButton();
        jButton_q24 = new javax.swing.JButton();
        jButton_q225 = new javax.swing.JButton();
        jButton_q26 = new javax.swing.JButton();
        jButton_q27 = new javax.swing.JButton();
        jButton_q28 = new javax.swing.JButton();
        jButton_q29 = new javax.swing.JButton();
        jButton_q30 = new javax.swing.JButton();
        jButton_q31 = new javax.swing.JButton();
        jButton_q32 = new javax.swing.JButton();
        jButton_q33 = new javax.swing.JButton();
        jButton_q34 = new javax.swing.JButton();
        jButton_q254 = new javax.swing.JButton();
        jButton_Q36 = new javax.swing.JButton();
        jButton_Q37 = new javax.swing.JButton();
        jButton_Q38 = new javax.swing.JButton();
        jButton_Q39 = new javax.swing.JButton();
        jButton_Q40 = new javax.swing.JButton();
        jButton_Q41 = new javax.swing.JButton();
        jButton_Q42 = new javax.swing.JButton();
        jButton_Q43 = new javax.swing.JButton();
        jButton_Q44 = new javax.swing.JButton();
        jButton_Q45 = new javax.swing.JButton();
        jButton_Q46 = new javax.swing.JButton();
        jButton_Q47 = new javax.swing.JButton();
        jButton_Q48 = new javax.swing.JButton();
        jButton_Q49 = new javax.swing.JButton();
        jButton_Q50 = new javax.swing.JButton();
        jButton_Q51 = new javax.swing.JButton();
        jButton_Q52 = new javax.swing.JButton();
        jButton_Q53 = new javax.swing.JButton();
        jButton_Q54 = new javax.swing.JButton();
        jButton_Q55 = new javax.swing.JButton();
        jButton_Q56 = new javax.swing.JButton();
        jButton_Q57 = new javax.swing.JButton();
        jButton_Q58 = new javax.swing.JButton();
        jButton_Q59 = new javax.swing.JButton();
        jButton_Q60 = new javax.swing.JButton();
        jButton_Q61 = new javax.swing.JButton();
        jButton_Q62 = new javax.swing.JButton();
        jButton_Q63 = new javax.swing.JButton();
        jButton_Q64 = new javax.swing.JButton();
        jButton_65 = new javax.swing.JButton();
        jButton_Q66 = new javax.swing.JButton();
        jButton_Q67 = new javax.swing.JButton();
        jButton_Q68 = new javax.swing.JButton();
        jButton_Q69 = new javax.swing.JButton();
        jButton_Q70 = new javax.swing.JButton();
        jButton_Q71 = new javax.swing.JButton();
        jButton_Q72 = new javax.swing.JButton();
        jButton_Q73 = new javax.swing.JButton();
        jButton_Q74 = new javax.swing.JButton();
        jButton_Q75 = new javax.swing.JButton();
        jButton_Q76 = new javax.swing.JButton();
        jButton_Q77 = new javax.swing.JButton();
        jButton_Q78 = new javax.swing.JButton();
        jButton_Q79 = new javax.swing.JButton();
        jButton_Q80 = new javax.swing.JButton();
        jButton_Q81 = new javax.swing.JButton();
        jButton_Q82 = new javax.swing.JButton();
        jButton_Q83 = new javax.swing.JButton();
        jButton_Q84 = new javax.swing.JButton();
        jButton_Q85 = new javax.swing.JButton();
        jButton_Q86 = new javax.swing.JButton();
        jButton_Q87 = new javax.swing.JButton();
        jButton_Q88 = new javax.swing.JButton();
        jButton_Q89 = new javax.swing.JButton();
        jButton_Q90 = new javax.swing.JButton();
        jButton_Q91 = new javax.swing.JButton();
        jButton_Q92 = new javax.swing.JButton();
        jButton_Q93 = new javax.swing.JButton();
        jButton_Q94 = new javax.swing.JButton();
        jButton_Q95 = new javax.swing.JButton();
        jButton_Q96 = new javax.swing.JButton();
        jButton_Q97 = new javax.swing.JButton();
        jButton_Q98 = new javax.swing.JButton();
        jButton_Q99 = new javax.swing.JButton();
        jButton_Q100 = new javax.swing.JButton();
        jButton_Q101 = new javax.swing.JButton();
        jButton_Q102 = new javax.swing.JButton();
        jButton_Q103 = new javax.swing.JButton();
        jButton_Q104 = new javax.swing.JButton();
        jButton_Q105 = new javax.swing.JButton();
        jButton_Q106 = new javax.swing.JButton();
        jButton_Q107 = new javax.swing.JButton();
        jButton_Q108 = new javax.swing.JButton();
        jButton_Q109 = new javax.swing.JButton();
        jButton_Q110 = new javax.swing.JButton();
        jButton_Q111 = new javax.swing.JButton();
        jButton_Q112 = new javax.swing.JButton();
        jButton_Q113 = new javax.swing.JButton();
        jButton_Q114 = new javax.swing.JButton();
        jButton_Q115 = new javax.swing.JButton();
        jButton_Q116 = new javax.swing.JButton();
        jButton_Q117 = new javax.swing.JButton();
        jButton_Q118 = new javax.swing.JButton();
        jButton_Q119 = new javax.swing.JButton();
        jButton_Q120 = new javax.swing.JButton();
        jButton_Q121 = new javax.swing.JButton();
        jButton_Q122 = new javax.swing.JButton();
        jButton_Q123 = new javax.swing.JButton();
        jButton_Q124 = new javax.swing.JButton();
        jButton_Q125 = new javax.swing.JButton();
        jButton_Q126 = new javax.swing.JButton();
        jButton_Q127 = new javax.swing.JButton();
        jButton_Q128 = new javax.swing.JButton();
        jButton_Q129 = new javax.swing.JButton();
        jButton_Q130 = new javax.swing.JButton();
        jButton_Q131 = new javax.swing.JButton();
        jButton_Q132 = new javax.swing.JButton();
        jButton_Q133 = new javax.swing.JButton();
        jButton_Q134 = new javax.swing.JButton();
        jButton_Q135 = new javax.swing.JButton();
        jButton_Q136 = new javax.swing.JButton();
        jButton_Q137 = new javax.swing.JButton();
        jButton_Q138 = new javax.swing.JButton();
        jButton_Q139 = new javax.swing.JButton();
        jButton_Q140 = new javax.swing.JButton();
        jButton_Q141 = new javax.swing.JButton();
        jButton_Q142 = new javax.swing.JButton();
        jButton_Q143 = new javax.swing.JButton();
        jButton_Q144 = new javax.swing.JButton();
        jButton_Q145 = new javax.swing.JButton();
        jButton_Q146 = new javax.swing.JButton();
        jButton_Q147 = new javax.swing.JButton();
        jButton_Q148 = new javax.swing.JButton();
        jButton_Q149 = new javax.swing.JButton();
        jButton_Q150 = new javax.swing.JButton();
        jButton_Q151 = new javax.swing.JButton();
        jButton_Q152 = new javax.swing.JButton();
        jButton_Q153 = new javax.swing.JButton();
        jButton_Q154 = new javax.swing.JButton();
        jButton_Q155 = new javax.swing.JButton();
        jButton_Q156 = new javax.swing.JButton();
        jButton_Q157 = new javax.swing.JButton();
        jButton_Q158 = new javax.swing.JButton();
        jButton_Q159 = new javax.swing.JButton();
        jButton_Q160 = new javax.swing.JButton();
        jButton_Q161 = new javax.swing.JButton();
        jButton_Q162 = new javax.swing.JButton();
        jButton_Q163 = new javax.swing.JButton();
        jButton_Q164 = new javax.swing.JButton();
        jButton_Q165 = new javax.swing.JButton();
        jButton_Q166 = new javax.swing.JButton();
        jButton_Q167 = new javax.swing.JButton();
        jButton_Q168 = new javax.swing.JButton();
        jButton_Q169 = new javax.swing.JButton();
        jButton_Q170 = new javax.swing.JButton();
        jButton_Q171 = new javax.swing.JButton();
        jButton_Q172 = new javax.swing.JButton();
        jButton_Q173 = new javax.swing.JButton();
        jButton_Q174 = new javax.swing.JButton();
        jButton_Q175 = new javax.swing.JButton();
        jButton_Q176 = new javax.swing.JButton();
        jButton_Q177 = new javax.swing.JButton();
        jButton_Q178 = new javax.swing.JButton();
        jButton_Q179 = new javax.swing.JButton();
        jButton_Q180 = new javax.swing.JButton();
        jButton_Q181 = new javax.swing.JButton();
        jButton_Q182 = new javax.swing.JButton();
        jButton_Q183 = new javax.swing.JButton();
        jButton_Q184 = new javax.swing.JButton();
        jButton_Q185 = new javax.swing.JButton();
        jButton_Q186 = new javax.swing.JButton();
        jButton_Q187 = new javax.swing.JButton();
        jButton_Q188 = new javax.swing.JButton();
        jButton_Q189 = new javax.swing.JButton();
        jButton_Q190 = new javax.swing.JButton();
        jButton_Q191 = new javax.swing.JButton();
        jButton_Q192 = new javax.swing.JButton();
        jButton_Q193 = new javax.swing.JButton();
        jButton_Q194 = new javax.swing.JButton();
        jButton_Q195 = new javax.swing.JButton();
        jButton_Q196 = new javax.swing.JButton();
        jButton_Q197 = new javax.swing.JButton();
        jButton_Q198 = new javax.swing.JButton();
        jButton_Q199 = new javax.swing.JButton();
        jButton_Q200 = new javax.swing.JButton();
        jButton_Q201 = new javax.swing.JButton();
        jButton_Q202 = new javax.swing.JButton();
        jButton_Q203 = new javax.swing.JButton();
        jButton_Q204 = new javax.swing.JButton();
        jButton_Q205 = new javax.swing.JButton();
        jButton_Q206 = new javax.swing.JButton();
        jButton_Q207 = new javax.swing.JButton();
        jButton_Q208 = new javax.swing.JButton();
        jButton_Q209 = new javax.swing.JButton();
        jButton_Q210 = new javax.swing.JButton();
        jButton_Q211 = new javax.swing.JButton();
        jButton_Q212 = new javax.swing.JButton();
        jButton_Q213 = new javax.swing.JButton();
        jButton_Q214 = new javax.swing.JButton();
        jButton_Q215 = new javax.swing.JButton();
        jButton_Q216 = new javax.swing.JButton();
        jButton_Q217 = new javax.swing.JButton();
        jButton_Q218 = new javax.swing.JButton();
        jButton_Q219 = new javax.swing.JButton();
        jButton_Q220 = new javax.swing.JButton();
        jButton_Q221 = new javax.swing.JButton();
        jButton_Q222 = new javax.swing.JButton();
        jButton_Q223 = new javax.swing.JButton();
        jButton_Q224 = new javax.swing.JButton();
        jComboBox_internacionalizacao = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel_acertos = new javax.swing.JLabel();
        jLabel_nao_feitas = new javax.swing.JLabel();
        jLabel_erros = new javax.swing.JLabel();
        jLabelDisplayN_Feitas = new javax.swing.JLabel();
        jLabelDisplayAcertos = new javax.swing.JLabel();
        jLabelDisplayN_Erros = new javax.swing.JLabel();
        jLabel_qustoesTitulo = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabelRelogio = new javax.swing.JLabel();
        jB_cronometro = new javax.swing.JButton();
        jLabel_hora = new javax.swing.JLabel();
        jProgressBarLinguage = new javax.swing.JProgressBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabbedQuestoes2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jInternalFrame = new javax.swing.JInternalFrame();
        graficoUS = new br.com.testkiller.graficos.GraficoUS();
        graficoBR = new br.com.testkiller.graficos.GraficoBR();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_arquivo = new javax.swing.JMenu();
        jMenuItemRespostas = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem_sair = new javax.swing.JMenuItem();
        jMenu_ajuda = new javax.swing.JMenu();
        jMenuItem_sobre = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Desenvolvido por Thiago Araujo. - tjca1@hotmail.com");

        jScrollPane1.setMaximumSize(new java.awt.Dimension(82767, 32767));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(102, 8002));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setEnabled(false);
        jPanel2.setInheritsPopupMenu(true);
        jPanel2.setPreferredSize(new java.awt.Dimension(100, 6200));
        jPanel2.setRequestFocusEnabled(false);

        jButton_q1.setText("Questão 01");
        jButton_q1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_q1ActionPerformed(evt);
            }
        });

        jButton_q2.setText("Questão 02");
        jButton_q2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_q2ActionPerformed(evt);
            }
        });

        jButton_q3.setText("Questão 03");
        jButton_q3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_q3ActionPerformed(evt);
            }
        });

        jButton_q4.setText("Questão 04");
        jButton_q4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_q4ActionPerformed(evt);
            }
        });

        jButton_q5.setText("Questão 05");
        jButton_q5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_q5ActionPerformed(evt);
            }
        });

        jButton_q6.setText("Questão 06");
        jButton_q6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_q6ActionPerformed(evt);
            }
        });

        jButton_q7.setText("Questão 07");
        jButton_q7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_q7ActionPerformed(evt);
            }
        });

        jButton_q8.setText("Questão 08");
        jButton_q8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_q8ActionPerformed(evt);
            }
        });

        jButton_q9.setText("Questão 09");
        jButton_q9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_q9ActionPerformed(evt);
            }
        });

        jButton_q10.setText("Questão 10");
        jButton_q10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_q10ActionPerformed(evt);
            }
        });

        jButton_q11.setText("Questão 11");
        jButton_q11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_q11ActionPerformed(evt);
            }
        });

        jButton_q12.setText("Questão 12");
        jButton_q12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_q12ActionPerformed(evt);
            }
        });

        jButton_q13.setText("Questão 13");
        jButton_q13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_q13ActionPerformed(evt);
            }
        });

        jButton_q14.setText("Questão 14");
        jButton_q14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_q14ActionPerformed(evt);
            }
        });

        jButton_q15.setText("Questão 15");
        jButton_q15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_q15ActionPerformed(evt);
            }
        });

        jButton_q16.setText("Questão 16");
        jButton_q16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_q16ActionPerformed(evt);
            }
        });

        jButton_Principal.setText("Principal");
        jButton_Principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PrincipalActionPerformed(evt);
            }
        });

        jButton_q17.setText("Questão 17");
        jButton_q17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_q17ActionPerformed(evt);
            }
        });

        jButton_q18.setText("Questão 18");
        jButton_q18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_q18ActionPerformed(evt);
            }
        });

        jButton_q226.setText("Questão 225");
        jButton_q226.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_q226ActionPerformed(evt);
            }
        });

        jButton_q227.setText("Questão 226");
        jButton_q227.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_q227ActionPerformed(evt);
            }
        });

        jButton_q19.setText("Questão 19");
        jButton_q19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_q19ActionPerformed(evt);
            }
        });

        jButton_q20.setText("Questão 20");
        jButton_q20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_q20ActionPerformed(evt);
            }
        });

        jButton_q21.setText("Questão 21");
        jButton_q21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_q21ActionPerformed(evt);
            }
        });

        jButton_q22.setText("Questão 22");
        jButton_q22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_q22ActionPerformed(evt);
            }
        });

        jButton_q23.setText("Questão 23");
        jButton_q23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_q23ActionPerformed(evt);
            }
        });

        jButton_q24.setText("Questão 24");
        jButton_q24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_q24ActionPerformed(evt);
            }
        });

        jButton_q225.setText("Questão 25");
        jButton_q225.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_q225ActionPerformed(evt);
            }
        });

        jButton_q26.setText("Questão 26");
        jButton_q26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_q26ActionPerformed(evt);
            }
        });

        jButton_q27.setText("Questão 27");
        jButton_q27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_q27ActionPerformed(evt);
            }
        });

        jButton_q28.setText("Questão 28");
        jButton_q28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_q28ActionPerformed(evt);
            }
        });

        jButton_q29.setText("Questão 29");
        jButton_q29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_q29ActionPerformed(evt);
            }
        });

        jButton_q30.setText("Questão 30");
        jButton_q30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_q30ActionPerformed(evt);
            }
        });

        jButton_q31.setText("Questão 31");
        jButton_q31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_q31ActionPerformed(evt);
            }
        });

        jButton_q32.setText("Questão 32");
        jButton_q32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_q32ActionPerformed(evt);
            }
        });

        jButton_q33.setText("Questão 33");
        jButton_q33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_q33ActionPerformed(evt);
            }
        });

        jButton_q34.setText("Questão 34");
        jButton_q34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_q34ActionPerformed(evt);
            }
        });

        jButton_q254.setText("Questão 35");
        jButton_q254.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_q254ActionPerformed(evt);
            }
        });

        jButton_Q36.setText("Questão 36");
        jButton_Q36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q36ActionPerformed(evt);
            }
        });

        jButton_Q37.setText("Questão 37");
        jButton_Q37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q37ActionPerformed(evt);
            }
        });

        jButton_Q38.setText("Questão 38");
        jButton_Q38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q38ActionPerformed(evt);
            }
        });

        jButton_Q39.setText("Questão 39");
        jButton_Q39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q39ActionPerformed(evt);
            }
        });

        jButton_Q40.setText("Questão 40");
        jButton_Q40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q40ActionPerformed(evt);
            }
        });

        jButton_Q41.setText("Questão 41");
        jButton_Q41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q41ActionPerformed(evt);
            }
        });

        jButton_Q42.setText("Questão 42");
        jButton_Q42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q42ActionPerformed(evt);
            }
        });

        jButton_Q43.setText("Questão 43");
        jButton_Q43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q43ActionPerformed(evt);
            }
        });

        jButton_Q44.setText("Questão 44");
        jButton_Q44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q44ActionPerformed(evt);
            }
        });

        jButton_Q45.setText("Questão 45");
        jButton_Q45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q45ActionPerformed(evt);
            }
        });

        jButton_Q46.setText("Questão 46");
        jButton_Q46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q46ActionPerformed(evt);
            }
        });

        jButton_Q47.setText("Questão 47");
        jButton_Q47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q47ActionPerformed(evt);
            }
        });

        jButton_Q48.setText("Questão 48");
        jButton_Q48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q48ActionPerformed(evt);
            }
        });

        jButton_Q49.setText("Questão 49");
        jButton_Q49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q49ActionPerformed(evt);
            }
        });

        jButton_Q50.setText("Questão 50");
        jButton_Q50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q50ActionPerformed(evt);
            }
        });

        jButton_Q51.setText("Questão 51");
        jButton_Q51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q51ActionPerformed(evt);
            }
        });

        jButton_Q52.setText("Questão 52");
        jButton_Q52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q52ActionPerformed(evt);
            }
        });

        jButton_Q53.setText("Questão 53");
        jButton_Q53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q53ActionPerformed(evt);
            }
        });

        jButton_Q54.setText("Questão 54");
        jButton_Q54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q54ActionPerformed(evt);
            }
        });

        jButton_Q55.setText("Questão 55");
        jButton_Q55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q55ActionPerformed(evt);
            }
        });

        jButton_Q56.setText("Questão 56");
        jButton_Q56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q56ActionPerformed(evt);
            }
        });

        jButton_Q57.setText("Questão 57");
        jButton_Q57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q57ActionPerformed(evt);
            }
        });

        jButton_Q58.setText("Questão 58");
        jButton_Q58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q58ActionPerformed(evt);
            }
        });

        jButton_Q59.setText("Questão 59");
        jButton_Q59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q59ActionPerformed(evt);
            }
        });

        jButton_Q60.setText("Questão 60");
        jButton_Q60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q60ActionPerformed(evt);
            }
        });

        jButton_Q61.setText("Questão 61");
        jButton_Q61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q61ActionPerformed(evt);
            }
        });

        jButton_Q62.setText("Questão 62");
        jButton_Q62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q62ActionPerformed(evt);
            }
        });

        jButton_Q63.setText("Questão 63");
        jButton_Q63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q63ActionPerformed(evt);
            }
        });

        jButton_Q64.setText("Questão 64");
        jButton_Q64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q64ActionPerformed(evt);
            }
        });

        jButton_65.setText("Questão 65");
        jButton_65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_65ActionPerformed(evt);
            }
        });

        jButton_Q66.setText("Questão 66");
        jButton_Q66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q66ActionPerformed(evt);
            }
        });

        jButton_Q67.setText("Questão 67");
        jButton_Q67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q67ActionPerformed(evt);
            }
        });

        jButton_Q68.setText("Questão 68");
        jButton_Q68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q68ActionPerformed(evt);
            }
        });

        jButton_Q69.setText("Questão 69");
        jButton_Q69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q69ActionPerformed(evt);
            }
        });

        jButton_Q70.setText("Questão 70");
        jButton_Q70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q70ActionPerformed(evt);
            }
        });

        jButton_Q71.setText("Questão 71");
        jButton_Q71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q71ActionPerformed(evt);
            }
        });

        jButton_Q72.setText("Questão 72");
        jButton_Q72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q72ActionPerformed(evt);
            }
        });

        jButton_Q73.setText("Questão 73");
        jButton_Q73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q73ActionPerformed(evt);
            }
        });

        jButton_Q74.setText("Questão 74");
        jButton_Q74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q74ActionPerformed(evt);
            }
        });

        jButton_Q75.setText("Questão 75");
        jButton_Q75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q75ActionPerformed(evt);
            }
        });

        jButton_Q76.setText("Questão 76");
        jButton_Q76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q76ActionPerformed(evt);
            }
        });

        jButton_Q77.setText("Questão 77");
        jButton_Q77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q77ActionPerformed(evt);
            }
        });

        jButton_Q78.setText("Questão 78");
        jButton_Q78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q78ActionPerformed(evt);
            }
        });

        jButton_Q79.setText("Questão 79");
        jButton_Q79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q79ActionPerformed(evt);
            }
        });

        jButton_Q80.setText("Questão 80");
        jButton_Q80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q80ActionPerformed(evt);
            }
        });

        jButton_Q81.setText("Questão 81");
        jButton_Q81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q81ActionPerformed(evt);
            }
        });

        jButton_Q82.setText("Questão 82");
        jButton_Q82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q82ActionPerformed(evt);
            }
        });

        jButton_Q83.setText("Questão 83");
        jButton_Q83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q83ActionPerformed(evt);
            }
        });

        jButton_Q84.setText("Questão 84");
        jButton_Q84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q84ActionPerformed(evt);
            }
        });

        jButton_Q85.setText("Questão 85");
        jButton_Q85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q85ActionPerformed(evt);
            }
        });

        jButton_Q86.setText("Questão 86");
        jButton_Q86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q86ActionPerformed(evt);
            }
        });

        jButton_Q87.setText("Questão 87");
        jButton_Q87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q87ActionPerformed(evt);
            }
        });

        jButton_Q88.setText("Questão 88");
        jButton_Q88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q88ActionPerformed(evt);
            }
        });

        jButton_Q89.setText("Questão 89");
        jButton_Q89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q89ActionPerformed(evt);
            }
        });

        jButton_Q90.setText("Questão 90");
        jButton_Q90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q90ActionPerformed(evt);
            }
        });

        jButton_Q91.setText("Questão 91");
        jButton_Q91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q91ActionPerformed(evt);
            }
        });

        jButton_Q92.setText("Questão 92");
        jButton_Q92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q92ActionPerformed(evt);
            }
        });

        jButton_Q93.setText("Questão 93");
        jButton_Q93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q93ActionPerformed(evt);
            }
        });

        jButton_Q94.setText("Questão 94");
        jButton_Q94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q94ActionPerformed(evt);
            }
        });

        jButton_Q95.setText("Questão 95");
        jButton_Q95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q95ActionPerformed(evt);
            }
        });

        jButton_Q96.setText("Questão 96");
        jButton_Q96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q96ActionPerformed(evt);
            }
        });

        jButton_Q97.setText("Questão 97");
        jButton_Q97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q97ActionPerformed(evt);
            }
        });

        jButton_Q98.setText("Questão 98");
        jButton_Q98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q98ActionPerformed(evt);
            }
        });

        jButton_Q99.setText("Questão 99");
        jButton_Q99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q99ActionPerformed(evt);
            }
        });

        jButton_Q100.setText("Questão 100");
        jButton_Q100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q100ActionPerformed(evt);
            }
        });

        jButton_Q101.setText("Questão 101");
        jButton_Q101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q101ActionPerformed(evt);
            }
        });

        jButton_Q102.setText("Questão 102");
        jButton_Q102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q102ActionPerformed(evt);
            }
        });

        jButton_Q103.setText("Questão 103");
        jButton_Q103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q103ActionPerformed(evt);
            }
        });

        jButton_Q104.setText("Questão 104");
        jButton_Q104.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q104ActionPerformed(evt);
            }
        });

        jButton_Q105.setText("Questão 105");
        jButton_Q105.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q105ActionPerformed(evt);
            }
        });

        jButton_Q106.setText("Questão 106");
        jButton_Q106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q106ActionPerformed(evt);
            }
        });

        jButton_Q107.setText("Questão 107");
        jButton_Q107.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q107ActionPerformed(evt);
            }
        });

        jButton_Q108.setText("Questão 108");
        jButton_Q108.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q108ActionPerformed(evt);
            }
        });

        jButton_Q109.setText("Questão 109");
        jButton_Q109.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q109ActionPerformed(evt);
            }
        });

        jButton_Q110.setText("Questão 110");
        jButton_Q110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q110ActionPerformed(evt);
            }
        });

        jButton_Q111.setText("Questão 111");
        jButton_Q111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q111ActionPerformed(evt);
            }
        });

        jButton_Q112.setText("Questão 112");
        jButton_Q112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q112ActionPerformed(evt);
            }
        });

        jButton_Q113.setText("Questão 113");
        jButton_Q113.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q113ActionPerformed(evt);
            }
        });

        jButton_Q114.setText("Questão 114");
        jButton_Q114.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q114ActionPerformed(evt);
            }
        });

        jButton_Q115.setText("Questão 115");
        jButton_Q115.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q115ActionPerformed(evt);
            }
        });

        jButton_Q116.setText("Questão 116");
        jButton_Q116.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q116ActionPerformed(evt);
            }
        });

        jButton_Q117.setText("Questão 117");
        jButton_Q117.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q117ActionPerformed(evt);
            }
        });

        jButton_Q118.setText("Questão 118");
        jButton_Q118.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q118ActionPerformed(evt);
            }
        });

        jButton_Q119.setText("Questão 119");
        jButton_Q119.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q119ActionPerformed(evt);
            }
        });

        jButton_Q120.setText("Questão 120");
        jButton_Q120.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q120ActionPerformed(evt);
            }
        });

        jButton_Q121.setText("Questão 121");
        jButton_Q121.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q121ActionPerformed(evt);
            }
        });

        jButton_Q122.setText("Questão 122");
        jButton_Q122.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q122ActionPerformed(evt);
            }
        });

        jButton_Q123.setText("Questão 123");
        jButton_Q123.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q123ActionPerformed(evt);
            }
        });

        jButton_Q124.setText("Questão 124");
        jButton_Q124.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q124ActionPerformed(evt);
            }
        });

        jButton_Q125.setText("Questão 125");
        jButton_Q125.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q125ActionPerformed(evt);
            }
        });

        jButton_Q126.setText("Questão 126");
        jButton_Q126.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q126ActionPerformed(evt);
            }
        });

        jButton_Q127.setText("Questão 127");
        jButton_Q127.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q127ActionPerformed(evt);
            }
        });

        jButton_Q128.setText("Questão 128");
        jButton_Q128.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q128ActionPerformed(evt);
            }
        });

        jButton_Q129.setText("Questão 129");
        jButton_Q129.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q129ActionPerformed(evt);
            }
        });

        jButton_Q130.setText("Questão 130");
        jButton_Q130.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q130ActionPerformed(evt);
            }
        });

        jButton_Q131.setText("Questão 131");
        jButton_Q131.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q131ActionPerformed(evt);
            }
        });

        jButton_Q132.setText("Questão 132");
        jButton_Q132.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q132ActionPerformed(evt);
            }
        });

        jButton_Q133.setText("Questão 133");
        jButton_Q133.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q133ActionPerformed(evt);
            }
        });

        jButton_Q134.setText("Questão 134");
        jButton_Q134.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q134ActionPerformed(evt);
            }
        });

        jButton_Q135.setText("Questão 135");
        jButton_Q135.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q135ActionPerformed(evt);
            }
        });

        jButton_Q136.setText("Questão 136");
        jButton_Q136.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q136ActionPerformed(evt);
            }
        });

        jButton_Q137.setText("Questão 137");
        jButton_Q137.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q137ActionPerformed(evt);
            }
        });

        jButton_Q138.setText("Questão 138");
        jButton_Q138.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q138ActionPerformed(evt);
            }
        });

        jButton_Q139.setText("Questão 139");
        jButton_Q139.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q139ActionPerformed(evt);
            }
        });

        jButton_Q140.setText("Questão 140");
        jButton_Q140.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q140ActionPerformed(evt);
            }
        });

        jButton_Q141.setText("Questão 141");
        jButton_Q141.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q141ActionPerformed(evt);
            }
        });

        jButton_Q142.setText("Questão 142");
        jButton_Q142.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q142ActionPerformed(evt);
            }
        });

        jButton_Q143.setText("Questão 143");
        jButton_Q143.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q143ActionPerformed(evt);
            }
        });

        jButton_Q144.setText("Questão 144");
        jButton_Q144.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q144ActionPerformed(evt);
            }
        });

        jButton_Q145.setText("Questão 145");
        jButton_Q145.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q145ActionPerformed(evt);
            }
        });

        jButton_Q146.setText("Questão 146");
        jButton_Q146.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q146ActionPerformed(evt);
            }
        });

        jButton_Q147.setText("Questão 147");
        jButton_Q147.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q147ActionPerformed(evt);
            }
        });

        jButton_Q148.setText("Questão 148");
        jButton_Q148.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q148ActionPerformed(evt);
            }
        });

        jButton_Q149.setText("Questão 149");
        jButton_Q149.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q149ActionPerformed(evt);
            }
        });

        jButton_Q150.setText("Questão 150");
        jButton_Q150.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q150ActionPerformed(evt);
            }
        });

        jButton_Q151.setText("Questão 151");
        jButton_Q151.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q151ActionPerformed(evt);
            }
        });

        jButton_Q152.setText("Questão 152");
        jButton_Q152.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q152ActionPerformed(evt);
            }
        });

        jButton_Q153.setText("Questão 153");
        jButton_Q153.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q153ActionPerformed(evt);
            }
        });

        jButton_Q154.setText("Questão 154");
        jButton_Q154.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q154ActionPerformed(evt);
            }
        });

        jButton_Q155.setText("Questão 155");
        jButton_Q155.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q155ActionPerformed(evt);
            }
        });

        jButton_Q156.setText("Questão 156");
        jButton_Q156.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q156ActionPerformed(evt);
            }
        });

        jButton_Q157.setText("Questão 157");
        jButton_Q157.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q157ActionPerformed(evt);
            }
        });

        jButton_Q158.setText("Questão 158");
        jButton_Q158.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q158ActionPerformed(evt);
            }
        });

        jButton_Q159.setText("Questão 159");
        jButton_Q159.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q159ActionPerformed(evt);
            }
        });

        jButton_Q160.setText("Questão 160");
        jButton_Q160.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q160ActionPerformed(evt);
            }
        });

        jButton_Q161.setText("Questão 161");
        jButton_Q161.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q161ActionPerformed(evt);
            }
        });

        jButton_Q162.setText("Questão 162");
        jButton_Q162.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q162ActionPerformed(evt);
            }
        });

        jButton_Q163.setText("Questão 163");
        jButton_Q163.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q163ActionPerformed(evt);
            }
        });

        jButton_Q164.setText("Questão 164");
        jButton_Q164.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q164ActionPerformed(evt);
            }
        });

        jButton_Q165.setText("Questão 165");
        jButton_Q165.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q165ActionPerformed(evt);
            }
        });

        jButton_Q166.setText("Questão 166");
        jButton_Q166.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q166ActionPerformed(evt);
            }
        });

        jButton_Q167.setText("Questão 167");
        jButton_Q167.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q167ActionPerformed(evt);
            }
        });

        jButton_Q168.setText("Questão 168");
        jButton_Q168.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q168ActionPerformed(evt);
            }
        });

        jButton_Q169.setText("Questão 169");
        jButton_Q169.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q169ActionPerformed(evt);
            }
        });

        jButton_Q170.setText("Questão 170");
        jButton_Q170.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q170ActionPerformed(evt);
            }
        });

        jButton_Q171.setText("Questão 171");
        jButton_Q171.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q171ActionPerformed(evt);
            }
        });

        jButton_Q172.setText("Questão 172");
        jButton_Q172.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q172ActionPerformed(evt);
            }
        });

        jButton_Q173.setText("Questão 173");
        jButton_Q173.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q173ActionPerformed(evt);
            }
        });

        jButton_Q174.setText("Questão 174");
        jButton_Q174.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q174ActionPerformed(evt);
            }
        });

        jButton_Q175.setText("Questão 175");
        jButton_Q175.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q175ActionPerformed(evt);
            }
        });

        jButton_Q176.setText("Questão 176");
        jButton_Q176.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q176ActionPerformed(evt);
            }
        });

        jButton_Q177.setText("Questão 177");
        jButton_Q177.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q177ActionPerformed(evt);
            }
        });

        jButton_Q178.setText("Questão 178");
        jButton_Q178.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q178ActionPerformed(evt);
            }
        });

        jButton_Q179.setText("Questão 179");
        jButton_Q179.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q179ActionPerformed(evt);
            }
        });

        jButton_Q180.setText("Questão 180");
        jButton_Q180.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q180ActionPerformed(evt);
            }
        });

        jButton_Q181.setText("Questão 181");
        jButton_Q181.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q181ActionPerformed(evt);
            }
        });

        jButton_Q182.setText("Questão 182");
        jButton_Q182.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q182ActionPerformed(evt);
            }
        });

        jButton_Q183.setText("Questão 183");
        jButton_Q183.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q183ActionPerformed(evt);
            }
        });

        jButton_Q184.setText("Questão 184");
        jButton_Q184.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q184ActionPerformed(evt);
            }
        });

        jButton_Q185.setText("Questão 185");
        jButton_Q185.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q185ActionPerformed(evt);
            }
        });

        jButton_Q186.setText("Questão 186");
        jButton_Q186.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q186ActionPerformed(evt);
            }
        });

        jButton_Q187.setText("Questão 187");
        jButton_Q187.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q187ActionPerformed(evt);
            }
        });

        jButton_Q188.setText("Questão 188");
        jButton_Q188.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q188ActionPerformed(evt);
            }
        });

        jButton_Q189.setText("Questão 189");
        jButton_Q189.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q189ActionPerformed(evt);
            }
        });

        jButton_Q190.setText("Questão 190");
        jButton_Q190.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q190ActionPerformed(evt);
            }
        });

        jButton_Q191.setText("Questão 191");
        jButton_Q191.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q191ActionPerformed(evt);
            }
        });

        jButton_Q192.setText("Questão 192");
        jButton_Q192.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q192ActionPerformed(evt);
            }
        });

        jButton_Q193.setText("Questão 193");
        jButton_Q193.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q193ActionPerformed(evt);
            }
        });

        jButton_Q194.setText("Questão 194");
        jButton_Q194.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q194ActionPerformed(evt);
            }
        });

        jButton_Q195.setText("Questão 195");
        jButton_Q195.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q195ActionPerformed(evt);
            }
        });

        jButton_Q196.setText("Questão 196");
        jButton_Q196.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q196ActionPerformed(evt);
            }
        });

        jButton_Q197.setText("Questão 197");
        jButton_Q197.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q197ActionPerformed(evt);
            }
        });

        jButton_Q198.setText("Questão 198");
        jButton_Q198.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q198ActionPerformed(evt);
            }
        });

        jButton_Q199.setText("Questão 199");
        jButton_Q199.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q199ActionPerformed(evt);
            }
        });

        jButton_Q200.setText("Questão 200");
        jButton_Q200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q200ActionPerformed(evt);
            }
        });

        jButton_Q201.setText("Questão 201");
        jButton_Q201.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q201ActionPerformed(evt);
            }
        });

        jButton_Q202.setText("Questão 202");
        jButton_Q202.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q202ActionPerformed(evt);
            }
        });

        jButton_Q203.setText("Questão 203");
        jButton_Q203.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q203ActionPerformed(evt);
            }
        });

        jButton_Q204.setText("Questão 204");
        jButton_Q204.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q204ActionPerformed(evt);
            }
        });

        jButton_Q205.setText("Questão 205");
        jButton_Q205.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q205ActionPerformed(evt);
            }
        });

        jButton_Q206.setText("Questão 206");
        jButton_Q206.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q206ActionPerformed(evt);
            }
        });

        jButton_Q207.setText("Questão 207");
        jButton_Q207.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q207ActionPerformed(evt);
            }
        });

        jButton_Q208.setText("Questão 208");
        jButton_Q208.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q208ActionPerformed(evt);
            }
        });

        jButton_Q209.setText("Questão 209");
        jButton_Q209.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q209ActionPerformed(evt);
            }
        });

        jButton_Q210.setText("Questão 210");
        jButton_Q210.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q210ActionPerformed(evt);
            }
        });

        jButton_Q211.setText("Questão 211");
        jButton_Q211.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q211ActionPerformed(evt);
            }
        });

        jButton_Q212.setText("Questão 212");
        jButton_Q212.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q212ActionPerformed(evt);
            }
        });

        jButton_Q213.setText("Questão 213");
        jButton_Q213.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q213ActionPerformed(evt);
            }
        });

        jButton_Q214.setText("Questão 214");
        jButton_Q214.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q214ActionPerformed(evt);
            }
        });

        jButton_Q215.setText("Questão 215");
        jButton_Q215.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q215ActionPerformed(evt);
            }
        });

        jButton_Q216.setText("Questão 216");
        jButton_Q216.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q216ActionPerformed(evt);
            }
        });

        jButton_Q217.setText("Questão 217");
        jButton_Q217.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q217ActionPerformed(evt);
            }
        });

        jButton_Q218.setText("Questão 218");
        jButton_Q218.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q218ActionPerformed(evt);
            }
        });

        jButton_Q219.setText("Questão 219");
        jButton_Q219.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q219ActionPerformed(evt);
            }
        });

        jButton_Q220.setText("Questão 220");
        jButton_Q220.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q220ActionPerformed(evt);
            }
        });

        jButton_Q221.setText("Questão 221");
        jButton_Q221.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q221ActionPerformed(evt);
            }
        });

        jButton_Q222.setText("Questão 222");
        jButton_Q222.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q222ActionPerformed(evt);
            }
        });

        jButton_Q223.setText("Questão 223");
        jButton_Q223.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q223ActionPerformed(evt);
            }
        });

        jButton_Q224.setText("Questão 224");
        jButton_Q224.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Q224ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton_q1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_q2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_q3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_q4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_q5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_q6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_q7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_q8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_q9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_q10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_q11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_q12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_q13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_q14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_q15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_q16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Principal, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_q17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_q18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_q19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_q20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_q21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_q22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_q23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_q24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_q225, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_q26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_q27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_q28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_q29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_q30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_q31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_q32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_q33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_q34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_q254, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q40, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q41, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q42, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q43, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q44, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q45, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q46, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q47, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q48, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q49, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q50, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q51, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q52, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q53, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q54, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q55, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q56, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q57, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q58, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q59, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q60, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q61, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q62, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q63, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q64, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_65, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q66, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q67, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q68, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q69, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q70, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q71, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q72, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q73, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q74, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q75, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q76, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q77, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q78, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q79, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q80, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q81, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q82, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q83, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q84, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q85, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q86, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q87, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q88, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q89, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q90, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q91, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q92, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q93, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q94, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q95, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q96, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q97, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q98, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q99, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q100, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q101, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q102, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q103, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q104, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q105, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q106, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q107, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q108, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q109, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q110, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q111, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q112, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q113, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q114, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q115, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q116, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q117, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q118, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q119, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q120, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q121, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q122, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q123, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q124, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q125, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q126, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q127, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q128, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q129, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q130, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q131, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q132, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q133, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q134, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q135, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q136, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q137, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q138, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q139, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q140, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q141, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q142, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q143, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q144, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q145, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q146, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q147, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q148, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q149, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q150, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q151, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q152, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q153, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q154, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q155, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q156, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q157, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q158, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q159, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q160, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q161, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q162, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q163, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q164, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q165, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q166, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q167, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q168, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q169, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q170, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q171, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q172, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q173, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q174, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q175, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q176, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q177, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q178, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q179, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q180, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q181, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q182, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q183, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q184, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q185, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q186, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q187, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q188, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q189, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q190, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q191, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q192, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q193, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q194, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q195, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q196, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q197, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q198, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q199, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q200, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q201, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q202, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q203, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q204, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q205, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q206, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q207, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q208, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q209, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q210, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q211, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q212, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q213, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q214, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q215, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q216, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q217, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q218, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q219, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q220, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q221, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q222, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q223, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_Q224, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_q226, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addComponent(jButton_q227, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton_Principal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_q1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_q2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_q3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_q4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_q5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_q6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_q7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_q8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_q9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_q10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_q11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_q12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_q13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_q14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_q15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_q16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_q17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_q18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_q19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_q20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_q21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_q22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_q23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_q24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_q225)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_q26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_q27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_q28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_q29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_q30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_q31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_q32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_q33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_q34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_q254)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q55)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q56)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q58)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q59)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q60)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q61)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q62)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q63)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q64)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_65)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q66)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q67)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q68)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q69)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q70)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q71)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q72)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q73)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q74)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q75)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q76)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q77)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q78)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q79)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q80)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q81)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q82)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q83)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q84)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q85)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q86)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q87)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q88)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q89)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q90)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q91)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q92)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q93)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q94)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q95)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q96)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q97)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q98)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q99)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q100)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q101)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q102)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q103)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q104)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q105)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q106)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q107)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q108)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q109)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q110)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q111)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q112)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q113)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q114)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q115)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q116)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q117)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q118)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q119)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q120)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q121)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q122)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q123)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q124)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q125)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q126)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q127)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q128)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q129)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q130)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q131)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q132)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q133)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q134)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q135)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q136)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q137)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q138)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q139)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q140)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q141)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q142)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q143)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q144)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q145)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q146)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q147)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q148)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q149)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q150)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q151)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q152)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q153)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q154)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q155)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q156)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q157)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q158)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q159)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q160)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q161)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q162)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q163)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q164)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q165)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q166)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q167)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q168)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q169)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q170)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q171)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q172)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q173)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q174)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q175)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q176)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q177)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q178)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q179)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q180)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q181)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q182)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q183)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q184)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q185)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q186)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q187)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q188)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q189)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q190)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q191)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q192)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q193)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q194)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q195)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q196)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q197)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q198)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q199)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q200)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q201)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q202)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q203)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q204)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q205)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q206)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q207)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q208)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q209)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q210)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q211)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q212)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q213)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q214)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q215)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q216)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q217)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q218)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q219)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q220)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q221)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q222)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q223)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Q224)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_q226)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_q227)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

        jComboBox_internacionalizacao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Portugês", "Inglês" }));
        jComboBox_internacionalizacao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_internacionalizacaoItemStateChanged(evt);
            }
        });

        jLabel_acertos.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel_acertos.setForeground(new java.awt.Color(0, 204, 102));
        jLabel_acertos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_acertos.setText("___");

        jLabel_nao_feitas.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel_nao_feitas.setForeground(new java.awt.Color(0, 0, 255));
        jLabel_nao_feitas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_nao_feitas.setText("240");

        jLabel_erros.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel_erros.setForeground(new java.awt.Color(255, 0, 51));
        jLabel_erros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_erros.setText("___");

        jLabelDisplayN_Feitas.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabelDisplayN_Feitas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDisplayN_Feitas.setText("Nao Feitas:");

        jLabelDisplayAcertos.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabelDisplayAcertos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDisplayAcertos.setText("Acertos:");

        jLabelDisplayN_Erros.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabelDisplayN_Erros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDisplayN_Erros.setText("Erros:");

        jLabel_qustoesTitulo.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel_qustoesTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_qustoesTitulo.setText("Questões");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabelRelogio.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabelRelogio.setForeground(new java.awt.Color(0, 51, 204));

        jB_cronometro.setText("Cronometro");
        jB_cronometro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_cronometroActionPerformed(evt);
            }
        });

        jLabel_hora.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel_hora.setText("Hora:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_qustoesTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(jLabelDisplayAcertos, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel_acertos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabelDisplayN_Feitas, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_nao_feitas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDisplayN_Erros, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_erros, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_cronometro)
                .addGap(27, 27, 27)
                .addComponent(jLabel_hora, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelRelogio, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabelDisplayAcertos)
                    .addComponent(jLabel_acertos)
                    .addComponent(jLabelDisplayN_Feitas, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                    .addComponent(jLabel_nao_feitas)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDisplayN_Erros)
                    .addComponent(jLabel_erros)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel_qustoesTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_cronometro)
                    .addComponent(jLabel_hora, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabelRelogio, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane2.setAutoscrolls(true);

        jTabbedQuestoes2.setBackground(new java.awt.Color(0, 153, 153));
        jTabbedQuestoes2.setPreferredSize(new java.awt.Dimension(1000, 900));

        jPanel1.setAutoscrolls(true);
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 1500));

        jInternalFrame.setMaximumSize(new java.awt.Dimension(2147483647, 510));
        jInternalFrame.setOpaque(true);
        jInternalFrame.setPreferredSize(new java.awt.Dimension(1616, 510));
        jInternalFrame.setVisible(true);

        graficoUS.setMaximumSize(new java.awt.Dimension(800, 500));
        graficoUS.setPreferredSize(new java.awt.Dimension(800, 500));

        graficoBR.setPreferredSize(new java.awt.Dimension(800, 500));

        javax.swing.GroupLayout jInternalFrameLayout = new javax.swing.GroupLayout(jInternalFrame.getContentPane());
        jInternalFrame.getContentPane().setLayout(jInternalFrameLayout);
        jInternalFrameLayout.setHorizontalGroup(
            jInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameLayout.createSequentialGroup()
                .addComponent(graficoUS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(graficoBR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jInternalFrameLayout.setVerticalGroup(
            jInternalFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(graficoBR, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
            .addComponent(graficoUS, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jInternalFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(183, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jInternalFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(232, Short.MAX_VALUE))
        );

        jTabbedQuestoes2.addTab("Principal", jPanel1);

        jScrollPane2.setViewportView(jTabbedQuestoes2);

        jMenu_arquivo.setBackground(new java.awt.Color(0, 153, 153));
        jMenu_arquivo.setText("Arquivo");

        jMenuItemRespostas.setText("Respostas");
        jMenuItemRespostas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRespostasActionPerformed(evt);
            }
        });
        jMenu_arquivo.add(jMenuItemRespostas);
        jMenu_arquivo.add(jSeparator1);
        jMenu_arquivo.add(jSeparator2);

        jMenuItem_sair.setText("Sair");
        jMenuItem_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_sairActionPerformed(evt);
            }
        });
        jMenu_arquivo.add(jMenuItem_sair);

        jMenuBar1.add(jMenu_arquivo);

        jMenu_ajuda.setText("Ajuda");

        jMenuItem_sobre.setText("Sobre");
        jMenuItem_sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_sobreActionPerformed(evt);
            }
        });
        jMenu_ajuda.add(jMenuItem_sobre);

        jMenuBar1.add(jMenu_ajuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox_internacionalizacao, 0, 135, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jProgressBarLinguage, javax.swing.GroupLayout.DEFAULT_SIZE, 1151, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jProgressBarLinguage, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox_internacionalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, 0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jProgressBarLinguage.setVisible(false);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_sairActionPerformed
        graficoBR.setStartStopRotator(false);
        graficoUS.setStartStopRotator(false);
        System.exit(0);
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //dispose();
}//GEN-LAST:event_jMenuItem_sairActionPerformed

    private void jButton_q1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_q1ActionPerformed
        mtpVerificaOpcao(1);
    }//GEN-LAST:event_jButton_q1ActionPerformed

    private void jButton_q2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_q2ActionPerformed
        mtpVerificaOpcao(2);
    }//GEN-LAST:event_jButton_q2ActionPerformed

    private void jButton_q3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_q3ActionPerformed
        mtpVerificaOpcao(3);
    }//GEN-LAST:event_jButton_q3ActionPerformed

    private void jButton_q4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_q4ActionPerformed
        mtpVerificaOpcao(4);
    }//GEN-LAST:event_jButton_q4ActionPerformed

    private void jButton_q5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_q5ActionPerformed
        mtpVerificaOpcao(5);
    }//GEN-LAST:event_jButton_q5ActionPerformed

    private void jButton_q6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_q6ActionPerformed
        mtpVerificaOpcao(6);
    }//GEN-LAST:event_jButton_q6ActionPerformed

    private void jButton_q7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_q7ActionPerformed
        mtpVerificaOpcao(7);
    }//GEN-LAST:event_jButton_q7ActionPerformed

    private void jButton_q8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_q8ActionPerformed
        mtpVerificaOpcao(8);
    }//GEN-LAST:event_jButton_q8ActionPerformed

    private void jButton_q9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_q9ActionPerformed
        mtpVerificaOpcao(9);
    }//GEN-LAST:event_jButton_q9ActionPerformed

    private void jButton_q10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_q10ActionPerformed
        mtpVerificaOpcao(10);
    }//GEN-LAST:event_jButton_q10ActionPerformed

    private void jButton_q11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_q11ActionPerformed
        mtpVerificaOpcao(11);
    }//GEN-LAST:event_jButton_q11ActionPerformed

    private void jButton_q12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_q12ActionPerformed
       mtpVerificaOpcao(12);
    }//GEN-LAST:event_jButton_q12ActionPerformed

    private void jButton_q13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_q13ActionPerformed
        mtpVerificaOpcao(13);
    }//GEN-LAST:event_jButton_q13ActionPerformed

    private void jButton_q14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_q14ActionPerformed
       mtpVerificaOpcao(14);
    }//GEN-LAST:event_jButton_q14ActionPerformed

    private void jButton_q15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_q15ActionPerformed
      mtpVerificaOpcao(15);
    }//GEN-LAST:event_jButton_q15ActionPerformed


    public static byte DeterminaInternacionalizacaoPopUp;
    private void jComboBox_internacionalizacaoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_internacionalizacaoItemStateChanged
        
        Thread t = new Thread(new RunLinguagem());
        t.start();
        this.repaint();
    }//GEN-LAST:event_jComboBox_internacionalizacaoItemStateChanged
/////////////////////////////
     public class RunLinguagem extends Thread {
            @Override
            public void run() {
                HabilitaDesBrUSALinguagem();
            }
        }
     private void HabilitaDesBrUSALinguagem(){
        jProgressBarLinguage.setVisible(true);
        int count = 0;
        jProgressBarLinguage.setMaximum(225);
        jComboBox_internacionalizacao.setEnabled(false);
        try
        {

            /*(0 Protuguês) - (1 Inglês) - jComboBox_internacionalizacao.getSelectedIndex()*/
            if(jComboBox_internacionalizacao.getSelectedIndex() == 0)
            {
                GraficosUsBr("Br");
                setLabelsStatus("Br");
                renomeiaButoes("Br");
                DeterminaInternacionalizacaoPopUp = (byte)jComboBox_internacionalizacao.getSelectedIndex();

               /*********************Q_1*********************************/
                     internacionalizacao.determinaPropriedadeTextArea1("q_1.textPTA1");
                     cl_questao_1.setjTextArea1(internacionalizacao.getConteudoTextArea1());
                     internacionalizacao.determinaPropriedadeTextArea1("q_1.textPTA2");
                     cl_questao_1.setjTextArea2(internacionalizacao.getConteudoTextArea1());
                     cl_questao_1.jLabel_status.setText(VariaveisConstantes.getSTATUS_QUESTOES());
                     jProgressBarLinguage.setValue(count+=1);
               /*********************Q_2*********************************/
                     internacionalizacao.determinaPropriedadeTextArea1("q_2.textPTA1");
                     cl_questao_2.setjTextArea1(internacionalizacao.getConteudoTextArea1());
                     internacionalizacao.determinaPropriedadeTextArea1("q_2.textPTA2");
                     cl_questao_2.setjTextArea2(internacionalizacao.getConteudoTextArea1());
                     cl_questao_2.jLabel_status.setText(VariaveisConstantes.getSTATUS_QUESTOES());
                     jProgressBarLinguage.setValue(count+=1);
               /*********************Q_3*********************************/
                     cl_questao_3.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
               /*********************Q_4*********************************/
                     cl_questao_4.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
               /*********************Q_5*********************************/
                     cl_questao_5.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
               /*********************Q_6*********************************/
                     cl_questao_6.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
               /*********************Q_7*********************************/
                     cl_questao_7.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
               /*********************Q_8*********************************/
                     cl_questao_8.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
              /*********************Q_9*********************************/
                     cl_questao_9.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
              /*********************Q_10*********************************/
                     cl_questao_10.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
              /*********************Q_11*********************************/
                     cl_questao_11.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
              /*********************Q_12*********************************/
                     cl_questao_12.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
              /*********************Q_13*********************************/
                     cl_questao_13.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
              /*********************Q_14*********************************/
                     cl_questao_14.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
              /*********************Q_15*********************************/
                     cl_questao_15.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
              /*********************Q_16*********************************/
                     cl_questao_16.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
             /*********************Q_17*********************************/
                     cl_questao_17.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
             /*********************Q_18*********************************/
                     cl_questao_18.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
             /*********************Q_19 *********************************/
                     cl_questao_19.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
             /*********************Q_20 *********************************/
                     cl_questao_20.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
             /*********************Q_21 *********************************/
                     cl_questao_21.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
             /*********************Q_22 *********************************/
                     cl_questao_22.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
             /*********************Q_23 *********************************/
                     cl_questao_23.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
           /*********************Q_24 *********************************/
                     cl_questao_24.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
           /*********************Q_25 *********************************/
                     cl_questao_25.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
           /*********************Q_26 *********************************/
                     cl_questao_26.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
           /*********************Q_27 *********************************/
                     cl_questao_27.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
           /*********************Q_28 *********************************/
                     cl_questao_28.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
           /*********************Q_29 *********************************/
                     cl_questao_29.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
           /*********************Q_30 *********************************/
                     cl_questao_30.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
           /*********************Q_31 *********************************/
                     cl_questao_31.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
         /*********************Q_32 *********************************/
                     cl_questao_32.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
         /*********************Q_33 *********************************/
                     cl_questao_33.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
        /*********************Q_34 *********************************/
                     cl_questao_34.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
         /*********************Q_35 *********************************/
                     cl_questao_35.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
        /*********************Q_36 *********************************/
                        cl_questao_36.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
        /*********************Q_37 *********************************/
                        cl_questao_37.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
        /*********************Q_38 *********************************/
                     cl_questao_38.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
         /*********************Q_39 *********************************/
                     cl_questao_39.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
         /*********************Q_40 *********************************/
                     cl_questao_40.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
         /*********************Q_41 *********************************/
                     cl_questao_41.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
         /*********************Q_42 *********************************/
                     cl_questao_42.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
         /*********************Q_43 *********************************/
                     cl_questao_43.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
         /*********************Q_44 *********************************/
                     cl_questao_44.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
         /*********************Q_45 *********************************/
                     cl_questao_45.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
         /*********************Q_46 *********************************/
                     cl_questao_46.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
         /*********************Q_47 *********************************/
                     cl_questao_47.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
         /*********************Q_48 *********************************/
                     cl_questao_48.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
         /*********************Q_49 *********************************/
                     cl_questao_49.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
         /*********************Q_50 *********************************/
                     cl_questao_50.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
         /*********************Q_51 *********************************/
                     cl_questao_51.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
         /*********************Q_52 *********************************/
                     cl_questao_52.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
         /*********************Q_53 *********************************/
                     cl_questao_53.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
         /*********************Q_54 *********************************/
                     cl_questao_54.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
         /*********************Q_55 *********************************/
                     cl_questao_56.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
         /*********************Q_56 *********************************/
                     cl_questao_56.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
        /*********************Q_57 *********************************/
                     cl_questao_57.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
         /*********************Q_58 *********************************/
                     cl_questao_58.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
        /*********************Q_59 *********************************/
                     cl_questao_59.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
        /*********************Q_60 *********************************/
                     cl_questao_60.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
        /*********************Q_61 *********************************/
                     cl_questao_61.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
         /*********************Q_62 *********************************/
                     cl_questao_62.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
         /*********************Q_63 *********************************/
                     cl_questao_63.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
         /*********************Q_64 *********************************/
                     cl_questao_64.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
         /*********************Q_65 *********************************/
                     cl_questao_65.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
        /*********************Q_66 *********************************/
                     cl_questao_66.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
        /*********************Q_67 *********************************/
                     cl_questao_67.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
          /*********************Q_68 *********************************/
                     cl_questao_68.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
          /**************************************************************/
                    cl_questao_69 .injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_70 .injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_71 .injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_72 .injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_73 .injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_74 .injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_75 .injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_76 .injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_77 .injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_78 .injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_79 .injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_80 .injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_81 .injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_82 .injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_83 .injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_84 .injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_85 .injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_86 .injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_87 .injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_88 .injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_89 .injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_90 .injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_91 .injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_92 .injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_93 .injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_94 .injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_95 .injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_96 .injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_97 .injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_98 .injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_99 .injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_100.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_101.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_102.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_103.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_104.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_105.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_106.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_107.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_108.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_109.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_110.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_111.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_112.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_113.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_114.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_115.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_116.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_117.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_118.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_119.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_120.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_121.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_122.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_123.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_124.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_125.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_126.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_127.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_128.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_129.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_130.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_131.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_132.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_133.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_134.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_135.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_136.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_137.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_138.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_139.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_140.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_141.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_142.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_143.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_144.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_145.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_146.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_147.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_148.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_149.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_150.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_151.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_152.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_153.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_154.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_155.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_156.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_157.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_158.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_159.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_160.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_161.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_162.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_163.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_164.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_165.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_166.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_167.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_168.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_169.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_170.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_171.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_172.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_173.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_174.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_175.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_176.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_177.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_178.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_179.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_180.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_181.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_182.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_183.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_184.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_185.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_186.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_187.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_188.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_189.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_190.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_191.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_192.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_193.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_194.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_195.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_196.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_197.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_198.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_199.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_200.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_201.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_202.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_203.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_204.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_205.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_206.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_207.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_208.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_209.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_210.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_211.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_212.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_213.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_214.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_215.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_216.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_217.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_218.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_219.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_220.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_221.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_222.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_223.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_224.injetaInternacionalizacao();  jProgressBarLinguage.setValue(count+=1);

           }
            else
            {

                  GraficosUsBr("Us");
                  setLabelsStatus("Us");
                  renomeiaButoes("Us");

                DeterminaInternacionalizacaoPopUp = (byte)jComboBox_internacionalizacao.getSelectedIndex();

                /*********************Q_1*********************************/
                    internacionalizacao.determinaPropriedadeTextArea1("q_1.textENA1");
                    cl_questao_1.setjTextArea1(internacionalizacao.getConteudoTextArea1());
                    internacionalizacao.determinaPropriedadeTextArea1("q_1.textENA2");
                    cl_questao_1.setjTextArea2(internacionalizacao.getConteudoTextArea1());
                    cl_questao_1.jLabel_status.setText(VariaveisConstantes.getSTATUS_QUESTOES());
                    jProgressBarLinguage.setValue(count+=1);
                /*********************Q_2*********************************/
                    internacionalizacao.determinaPropriedadeTextArea1("q_2.textENA1");
                    cl_questao_2.setjTextArea1(internacionalizacao.getConteudoTextArea1());
                    internacionalizacao.determinaPropriedadeTextArea1("q_2.textENA2");
                    cl_questao_2.setjTextArea2(internacionalizacao.getConteudoTextArea1());
                    cl_questao_2.jLabel_status.setText(VariaveisConstantes.getSTATUS_QUESTOES());
                    jProgressBarLinguage.setValue(count+=1);
                /*********************Q_3*********************************/
                    cl_questao_3.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                /*********************Q_4*********************************/
                    cl_questao_4.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                /*********************Q_5*********************************/
                    cl_questao_5.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                /*********************Q_6*********************************/
                    cl_questao_6.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                /*********************Q_7*********************************/
                    cl_questao_7.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                /*********************Q_8*********************************/
                    cl_questao_8.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                /*********************Q_9*********************************/
                    cl_questao_9.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                /*********************Q_10*********************************/
                    cl_questao_10.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                /*********************Q_11*********************************/
                    cl_questao_11.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                /*********************Q_12*********************************/
                    cl_questao_12.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                /********************* Q_13 *********************************/
                    cl_questao_13.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                /********************* Q_14 *********************************/
                    cl_questao_14.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                /********************* Q_15 *********************************/
                    cl_questao_15.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
               /********************* Q_16 *********************************/
                    cl_questao_16.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
               /********************* Q_17 *********************************/
                    cl_questao_16.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
              /********************* Q_17 *********************************/
                    cl_questao_17.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
             /********************* Q_18 *********************************/
                    cl_questao_18.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
             /********************* Q_19 *********************************/
                    cl_questao_19.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
             /********************* Q_20 *********************************/
                    cl_questao_20.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
             /********************* Q_21 *********************************/
                    cl_questao_21.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
              /********************* Q_22 *********************************/
                    cl_questao_22.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
             /********************* Q_23 *********************************/
                    cl_questao_23.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
            /********************* Q_24 *********************************/
                    cl_questao_24.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
           /********************* Q_25 *********************************/
                    cl_questao_25.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
           /********************* Q_26 *********************************/
                    cl_questao_26.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
           /********************* Q_27 *********************************/
                    cl_questao_27.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
           /********************* Q_28 *********************************/
                    cl_questao_28.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
          /********************* Q_29 *********************************/
                    cl_questao_29.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
          /********************* Q_30 *********************************/
                    cl_questao_30.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
          /********************* Q_31 *********************************/
                    cl_questao_31.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
        /********************* Q_32 *********************************/
                    cl_questao_32.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
        /********************* Q_33 *********************************/
                    cl_questao_33.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
        /********************* Q_34 *********************************/
                    cl_questao_34.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
        /********************* Q_35 *********************************/
                    cl_questao_35.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
       /********************* Q_36 *********************************/
                    cl_questao_36.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
       /********************* Q_37 *********************************/
                    cl_questao_37.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
       /********************* Q_38 *********************************/
                    cl_questao_38.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
       /********************* Q_39 *********************************/
                    cl_questao_39.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
        /********************* Q_40 *********************************/
                    cl_questao_40.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
        /********************* Q_41 *********************************/
                    cl_questao_41.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
        /********************* Q_42 *********************************/
                    cl_questao_42.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
        /********************* Q_43 *********************************/
                    cl_questao_43.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
        /********************* Q_44 *********************************/
                    cl_questao_44.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
        /********************* Q_45 *********************************/
                    cl_questao_45.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
        /********************* Q_46 *********************************/
                    cl_questao_46.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
        /********************* Q_47 *********************************/
                    cl_questao_47.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
        /********************* Q_48 *********************************/
                    cl_questao_48.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
        /********************* Q_49 *********************************/
                    cl_questao_49.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
        /********************* Q_50 *********************************/
                    cl_questao_50.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
        /********************* Q_51 *********************************/
                    cl_questao_51.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
        /********************* Q_52 *********************************/
                    cl_questao_52.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
        /********************* Q_53 *********************************/
                    cl_questao_53.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
        /********************* Q_54 *********************************/
                    cl_questao_54.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
        /********************* Q_55 *********************************/
                    cl_questao_55.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
        /********************* Q_56 *********************************/
                    cl_questao_56.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
        /********************* Q_57 *********************************/
                    cl_questao_57.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
        /********************* Q_58 *********************************/
                    cl_questao_58.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
        /********************* Q_59 *********************************/
                    cl_questao_59.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
        /********************* Q_60 *********************************/
                    cl_questao_60.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
       /********************* Q_61 *********************************/
                    cl_questao_61.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
       /*********************Q_62 *********************************/
                     cl_questao_62.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
       /*********************Q_63 *********************************/
                     cl_questao_63.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
       /*********************Q_64 *********************************/
                     cl_questao_64.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
        /*********************Q_65 *********************************/
                     cl_questao_65.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
        /*********************Q_66 *********************************/
                     cl_questao_66.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
      /*********************Q_67 *********************************/
                     cl_questao_67.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
    /*********************Q_68 *********************************/
                     cl_questao_68.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
     /*************************************************************/
                    cl_questao_69 .injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_70 .injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_71 .injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_72 .injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_73 .injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_74 .injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_75 .injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_76 .injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_77 .injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_78 .injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_79 .injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_80 .injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_81 .injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_82 .injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_83 .injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_84 .injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_85 .injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_86 .injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_87 .injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_88 .injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_89 .injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_90 .injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_91 .injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_92 .injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_93 .injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_94 .injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_95 .injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_96 .injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_97 .injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_98 .injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_99 .injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_100.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_101.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_102.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_103.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_104.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_105.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_106.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_107.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_108.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_109.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_110.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_111.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_112.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_113.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_114.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_115.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_116.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_117.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_118.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_119.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_120.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_121.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_122.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_123.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_124.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_125.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_126.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_127.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_129.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_128.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_130.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_131.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_132.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_133.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_134.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_135.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_136.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_137.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_138.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_139.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_140.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_141.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_142.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_143.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_144.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_145.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_146.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_147.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_148.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_149.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_150.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_151.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_152.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_153.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_154.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_155.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_156.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_157.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_158.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_159.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_160.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_161.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_162.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_163.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_164.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_165.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_166.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_167.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_168.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_169.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_170.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_171.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_172.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_173.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_174.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_175.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_176.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_177.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_178.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_179.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_180.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_181.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_182.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_183.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_184.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_185.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_186.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_187.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_188.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_189.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_190.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_191.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_192.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_193.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_194.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_195.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_196.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_197.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_198.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_199.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_200.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_201.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_202.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_203.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_204.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_205.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_206.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_207.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_208.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_209.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_210.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_211.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_212.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_213.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_214.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_215.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_216.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_217.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_218.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_219.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_220.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_221.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_222.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_223.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);
                    cl_questao_224.injetaInternacionalizacaoUSA();  jProgressBarLinguage.setValue(count+=1);

         }
      } catch (FileNotFoundException ex) {
         Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
     } catch (IOException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);

    }finally{
        jComboBox_internacionalizacao.setEnabled(true);
        jProgressBarLinguage.setValue(258);
         jProgressBarLinguage.setVisible(false);
    }
}


    private void jButton_q16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_q16ActionPerformed
        mtpVerificaOpcao(16);
    }//GEN-LAST:event_jButton_q16ActionPerformed

    private void jButton_PrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PrincipalActionPerformed
        mtpVerificaOpcao(0);
    }//GEN-LAST:event_jButton_PrincipalActionPerformed

    private void jMenuItem_sobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_sobreActionPerformed

        final String titulo[] = {"",""};
        TelaSobre.main(titulo);
    }//GEN-LAST:event_jMenuItem_sobreActionPerformed

    private void jMenuItemRespostasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRespostasActionPerformed
         final String titulo[] = {"",""};
         Respostas.main(titulo);
    }//GEN-LAST:event_jMenuItemRespostasActionPerformed

    private void jButton_q17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_q17ActionPerformed
            mtpVerificaOpcao(17);    
    }//GEN-LAST:event_jButton_q17ActionPerformed

    private void jButton_q18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_q18ActionPerformed
            mtpVerificaOpcao(18);    
    }//GEN-LAST:event_jButton_q18ActionPerformed

    private void jButton_q226ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_q226ActionPerformed
            mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_q226ActionPerformed
    private void jButton_q227ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_q227ActionPerformed
            mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_q227ActionPerformed

    private void jButton_q19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_q19ActionPerformed
             mtpVerificaOpcao(19);
    }//GEN-LAST:event_jButton_q19ActionPerformed

    private void jButton_q20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_q20ActionPerformed
                mtpVerificaOpcao(20);
    }//GEN-LAST:event_jButton_q20ActionPerformed

    private void jButton_q21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_q21ActionPerformed
                mtpVerificaOpcao(21);
    }//GEN-LAST:event_jButton_q21ActionPerformed

    private void jButton_q22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_q22ActionPerformed
                 mtpVerificaOpcao(22);
    }//GEN-LAST:event_jButton_q22ActionPerformed

    private void jButton_q23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_q23ActionPerformed
                 mtpVerificaOpcao(23);
    }//GEN-LAST:event_jButton_q23ActionPerformed

    private void jButton_q24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_q24ActionPerformed
                   mtpVerificaOpcao(24);
    }//GEN-LAST:event_jButton_q24ActionPerformed

    private void jButton_q225ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_q225ActionPerformed
             mtpVerificaOpcao(25);
    }//GEN-LAST:event_jButton_q225ActionPerformed

    private void jButton_q26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_q26ActionPerformed
         mtpVerificaOpcao(26);
    }//GEN-LAST:event_jButton_q26ActionPerformed

    private void jButton_q27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_q27ActionPerformed
          mtpVerificaOpcao(27);
    }//GEN-LAST:event_jButton_q27ActionPerformed

    private void jButton_q28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_q28ActionPerformed
          mtpVerificaOpcao(28);
    }//GEN-LAST:event_jButton_q28ActionPerformed

    private void jButton_q29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_q29ActionPerformed
          mtpVerificaOpcao(29);
    }//GEN-LAST:event_jButton_q29ActionPerformed

    private void jButton_q30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_q30ActionPerformed
           mtpVerificaOpcao(30);
    }//GEN-LAST:event_jButton_q30ActionPerformed

    private void jButton_q31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_q31ActionPerformed
            mtpVerificaOpcao(31);
    }//GEN-LAST:event_jButton_q31ActionPerformed

    private void jButton_q32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_q32ActionPerformed
            mtpVerificaOpcao(32);
    }//GEN-LAST:event_jButton_q32ActionPerformed

    private void jButton_q33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_q33ActionPerformed
            mtpVerificaOpcao(33);
    }//GEN-LAST:event_jButton_q33ActionPerformed

    private void jButton_q34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_q34ActionPerformed
            mtpVerificaOpcao(34);
    }//GEN-LAST:event_jButton_q34ActionPerformed

    private void jButton_q254ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_q254ActionPerformed
             mtpVerificaOpcao(35); 
    }//GEN-LAST:event_jButton_q254ActionPerformed

    private void jButton_Q36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q36ActionPerformed
             mtpVerificaOpcao(36);
    }//GEN-LAST:event_jButton_Q36ActionPerformed

    private void jButton_Q37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q37ActionPerformed
             mtpVerificaOpcao(37);
    }//GEN-LAST:event_jButton_Q37ActionPerformed

    private void jButton_Q38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q38ActionPerformed
            mtpVerificaOpcao(38);
    }//GEN-LAST:event_jButton_Q38ActionPerformed

    private void jButton_Q39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q39ActionPerformed
            mtpVerificaOpcao(39);
    }//GEN-LAST:event_jButton_Q39ActionPerformed

    private void jButton_Q40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q40ActionPerformed
           mtpVerificaOpcao(40);
    }//GEN-LAST:event_jButton_Q40ActionPerformed

    private void jButton_Q41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q41ActionPerformed
            mtpVerificaOpcao(41);
    }//GEN-LAST:event_jButton_Q41ActionPerformed

    private void jButton_Q42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q42ActionPerformed
            mtpVerificaOpcao(42);
    }//GEN-LAST:event_jButton_Q42ActionPerformed

    private void jButton_Q43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q43ActionPerformed
              mtpVerificaOpcao(43);
    }//GEN-LAST:event_jButton_Q43ActionPerformed

    private void jButton_Q44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q44ActionPerformed
              mtpVerificaOpcao(44);
    }//GEN-LAST:event_jButton_Q44ActionPerformed

    private void jButton_Q45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q45ActionPerformed
             mtpVerificaOpcao(45);
    }//GEN-LAST:event_jButton_Q45ActionPerformed

    private void jButton_Q46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q46ActionPerformed
               mtpVerificaOpcao(46);
    }//GEN-LAST:event_jButton_Q46ActionPerformed

    private void jButton_Q47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q47ActionPerformed
              mtpVerificaOpcao(47);
    }//GEN-LAST:event_jButton_Q47ActionPerformed

    private void jButton_Q48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q48ActionPerformed
            mtpVerificaOpcao(48);
    }//GEN-LAST:event_jButton_Q48ActionPerformed

    private void jButton_Q49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q49ActionPerformed
            mtpVerificaOpcao(49);
    }//GEN-LAST:event_jButton_Q49ActionPerformed

    private void jButton_Q50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q50ActionPerformed
           mtpVerificaOpcao(50);
    }//GEN-LAST:event_jButton_Q50ActionPerformed

    private void jButton_Q51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q51ActionPerformed
            mtpVerificaOpcao(51);
    }//GEN-LAST:event_jButton_Q51ActionPerformed

    private void jButton_Q52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q52ActionPerformed
            mtpVerificaOpcao(52);
    }//GEN-LAST:event_jButton_Q52ActionPerformed

    private void jButton_Q53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q53ActionPerformed
             mtpVerificaOpcao(53);
    }//GEN-LAST:event_jButton_Q53ActionPerformed

    private void jButton_Q54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q54ActionPerformed
              mtpVerificaOpcao(54);
    }//GEN-LAST:event_jButton_Q54ActionPerformed

    private void jButton_Q55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q55ActionPerformed
             mtpVerificaOpcao(55);
    }//GEN-LAST:event_jButton_Q55ActionPerformed

    private void jButton_Q56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q56ActionPerformed
             mtpVerificaOpcao(56);
    }//GEN-LAST:event_jButton_Q56ActionPerformed

    private void jButton_Q57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q57ActionPerformed
             mtpVerificaOpcao(57);
    }//GEN-LAST:event_jButton_Q57ActionPerformed

    private void jButton_Q58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q58ActionPerformed
             mtpVerificaOpcao(58);
    }//GEN-LAST:event_jButton_Q58ActionPerformed

    private void jButton_Q59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q59ActionPerformed
            mtpVerificaOpcao(59);
    }//GEN-LAST:event_jButton_Q59ActionPerformed

    private void jButton_Q60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q60ActionPerformed
            mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q60ActionPerformed

    private void jButton_Q61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q61ActionPerformed
            mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q61ActionPerformed

    private void jButton_Q62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q62ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q62ActionPerformed

    private void jButton_Q63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q63ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q63ActionPerformed

    private void jButton_Q64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q64ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q64ActionPerformed

    private void jButton_65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_65ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_65ActionPerformed

    private void jButton_Q66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q66ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q66ActionPerformed

    private void jButton_Q67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q67ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q67ActionPerformed

    private void jButton_Q68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q68ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q68ActionPerformed

    private void jButton_Q69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q69ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q69ActionPerformed

    private void jButton_Q70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q70ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q70ActionPerformed

    private void jButton_Q71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q71ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q71ActionPerformed

    private void jButton_Q72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q72ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q72ActionPerformed

    private void jButton_Q73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q73ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q73ActionPerformed

    private void jButton_Q74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q74ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q74ActionPerformed

    private void jButton_Q75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q75ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q75ActionPerformed

    private void jButton_Q76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q76ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q76ActionPerformed

    private void jButton_Q77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q77ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q77ActionPerformed

    private void jButton_Q78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q78ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q78ActionPerformed

    private void jButton_Q79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q79ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q79ActionPerformed

    private void jButton_Q80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q80ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q80ActionPerformed

    private void jButton_Q81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q81ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q81ActionPerformed

    private void jButton_Q82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q82ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q82ActionPerformed

    private void jButton_Q83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q83ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q83ActionPerformed

    private void jButton_Q84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q84ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q84ActionPerformed

    private void jButton_Q85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q85ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q85ActionPerformed

    private void jButton_Q86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q86ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q86ActionPerformed

    private void jButton_Q87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q87ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q87ActionPerformed

    private void jButton_Q88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q88ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q88ActionPerformed

    private void jButton_Q89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q89ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q89ActionPerformed

    private void jButton_Q90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q90ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q90ActionPerformed

    private void jButton_Q91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q91ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q91ActionPerformed

    private void jButton_Q92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q92ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q92ActionPerformed

    private void jButton_Q93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q93ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q93ActionPerformed

    private void jButton_Q94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q94ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q94ActionPerformed

    private void jButton_Q95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q95ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q95ActionPerformed

    private void jButton_Q96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q96ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q96ActionPerformed

    private void jButton_Q97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q97ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q97ActionPerformed

    private void jButton_Q98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q98ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q98ActionPerformed

    private void jButton_Q99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q99ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q99ActionPerformed

    private void jButton_Q100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q100ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q100ActionPerformed

    private void jButton_Q101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q101ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q101ActionPerformed

    private void jButton_Q102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q102ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q102ActionPerformed

    private void jButton_Q103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q103ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q103ActionPerformed

    private void jButton_Q104ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q104ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q104ActionPerformed

    private void jButton_Q105ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q105ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q105ActionPerformed

    private void jButton_Q106ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q106ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q106ActionPerformed

    private void jButton_Q107ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q107ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q107ActionPerformed

    private void jButton_Q108ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q108ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q108ActionPerformed

    private void jButton_Q109ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q109ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q109ActionPerformed

    private void jButton_Q110ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q110ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q110ActionPerformed

    private void jButton_Q111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q111ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q111ActionPerformed

    private void jButton_Q112ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q112ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q112ActionPerformed

    private void jButton_Q113ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q113ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q113ActionPerformed

    private void jButton_Q114ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q114ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q114ActionPerformed

    private void jButton_Q115ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q115ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q115ActionPerformed

    private void jButton_Q116ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q116ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q116ActionPerformed

    private void jButton_Q117ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q117ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q117ActionPerformed

    private void jButton_Q118ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q118ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q118ActionPerformed

    private void jButton_Q119ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q119ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q119ActionPerformed

    private void jButton_Q120ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q120ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q120ActionPerformed

    private void jButton_Q121ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q121ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q121ActionPerformed

    private void jButton_Q122ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q122ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q122ActionPerformed

    private void jButton_Q123ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q123ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q123ActionPerformed

    private void jButton_Q124ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q124ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q124ActionPerformed

    private void jButton_Q125ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q125ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q125ActionPerformed

    private void jButton_Q126ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q126ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q126ActionPerformed

    private void jButton_Q127ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q127ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q127ActionPerformed

    private void jButton_Q128ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q128ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q128ActionPerformed

    private void jButton_Q129ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q129ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q129ActionPerformed

    private void jButton_Q130ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q130ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q130ActionPerformed

    private void jButton_Q131ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q131ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q131ActionPerformed

    private void jButton_Q132ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q132ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q132ActionPerformed

    private void jButton_Q133ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q133ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q133ActionPerformed

    private void jButton_Q134ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q134ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q134ActionPerformed

    private void jButton_Q135ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q135ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q135ActionPerformed

    private void jButton_Q136ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q136ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q136ActionPerformed

    private void jButton_Q137ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q137ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q137ActionPerformed

    private void jButton_Q138ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q138ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q138ActionPerformed

    private void jButton_Q139ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q139ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q139ActionPerformed

    private void jButton_Q140ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q140ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q140ActionPerformed

    private void jButton_Q141ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q141ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q141ActionPerformed

    private void jButton_Q142ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q142ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q142ActionPerformed

    private void jButton_Q143ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q143ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q143ActionPerformed

    private void jButton_Q144ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q144ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q144ActionPerformed

    private void jButton_Q145ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q145ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q145ActionPerformed

    private void jButton_Q146ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q146ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q146ActionPerformed

    private void jButton_Q147ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q147ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q147ActionPerformed

    private void jButton_Q148ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q148ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q148ActionPerformed

    private void jButton_Q149ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q149ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q149ActionPerformed

    private void jButton_Q150ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q150ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q150ActionPerformed

    private void jButton_Q151ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q151ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q151ActionPerformed

    private void jButton_Q152ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q152ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q152ActionPerformed

    private void jButton_Q153ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q153ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q153ActionPerformed

    private void jButton_Q154ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q154ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q154ActionPerformed

    private void jButton_Q155ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q155ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q155ActionPerformed

    private void jButton_Q156ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q156ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q156ActionPerformed

    private void jButton_Q157ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q157ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q157ActionPerformed

    private void jButton_Q158ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q158ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q158ActionPerformed

    private void jButton_Q159ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q159ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q159ActionPerformed

    private void jButton_Q160ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q160ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q160ActionPerformed

    private void jButton_Q161ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q161ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q161ActionPerformed

    private void jButton_Q162ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q162ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q162ActionPerformed

    private void jButton_Q163ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q163ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q163ActionPerformed

    private void jButton_Q164ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q164ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q164ActionPerformed

    private void jButton_Q165ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q165ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q165ActionPerformed

    private void jButton_Q166ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q166ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q166ActionPerformed

    private void jButton_Q167ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q167ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q167ActionPerformed

    private void jButton_Q168ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q168ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q168ActionPerformed

    private void jButton_Q169ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q169ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q169ActionPerformed

    private void jButton_Q170ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q170ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q170ActionPerformed

    private void jButton_Q171ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q171ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q171ActionPerformed

    private void jButton_Q172ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q172ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q172ActionPerformed

    private void jButton_Q173ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q173ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q173ActionPerformed

    private void jButton_Q174ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q174ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q174ActionPerformed

    private void jButton_Q175ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q175ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q175ActionPerformed

    private void jButton_Q176ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q176ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q176ActionPerformed

    private void jButton_Q177ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q177ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q177ActionPerformed

    private void jButton_Q178ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q178ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q178ActionPerformed

    private void jButton_Q179ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q179ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q179ActionPerformed

    private void jButton_Q180ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q180ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q180ActionPerformed

    private void jButton_Q181ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q181ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q181ActionPerformed

    private void jButton_Q182ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q182ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q182ActionPerformed

    private void jButton_Q183ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q183ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q183ActionPerformed

    private void jButton_Q184ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q184ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q184ActionPerformed

    private void jButton_Q185ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q185ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q185ActionPerformed

    private void jButton_Q186ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q186ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q186ActionPerformed

    private void jButton_Q187ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q187ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q187ActionPerformed

    private void jButton_Q188ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q188ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q188ActionPerformed

    private void jButton_Q189ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q189ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q189ActionPerformed

    private void jButton_Q190ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q190ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q190ActionPerformed

    private void jButton_Q191ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q191ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q191ActionPerformed

    private void jButton_Q192ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q192ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q192ActionPerformed

    private void jButton_Q193ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q193ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q193ActionPerformed

    private void jButton_Q194ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q194ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q194ActionPerformed

    private void jButton_Q195ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q195ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q195ActionPerformed

    private void jButton_Q196ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q196ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q196ActionPerformed

    private void jButton_Q197ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q197ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q197ActionPerformed

    private void jButton_Q198ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q198ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q198ActionPerformed

    private void jButton_Q199ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q199ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q199ActionPerformed

    private void jButton_Q200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q200ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q200ActionPerformed

    private void jButton_Q201ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q201ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q201ActionPerformed

    private void jButton_Q202ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q202ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q202ActionPerformed

    private void jButton_Q203ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q203ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q203ActionPerformed

    private void jButton_Q204ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q204ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q204ActionPerformed

    private void jButton_Q205ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q205ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q205ActionPerformed

    private void jButton_Q206ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q206ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q206ActionPerformed

    private void jButton_Q207ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q207ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q207ActionPerformed

    private void jButton_Q208ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q208ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q208ActionPerformed

    private void jButton_Q209ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q209ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q209ActionPerformed

    private void jButton_Q210ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q210ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q210ActionPerformed

    private void jButton_Q211ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q211ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q211ActionPerformed

    private void jButton_Q212ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q212ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q212ActionPerformed

    private void jButton_Q213ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q213ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q213ActionPerformed

    private void jButton_Q214ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q214ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q214ActionPerformed

    private void jButton_Q215ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q215ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q215ActionPerformed

    private void jButton_Q216ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q216ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q216ActionPerformed

    private void jButton_Q217ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q217ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q217ActionPerformed

    private void jButton_Q218ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q218ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q218ActionPerformed

    private void jButton_Q219ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q219ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q219ActionPerformed

    private void jButton_Q220ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q220ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q220ActionPerformed

    private void jButton_Q221ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q221ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q221ActionPerformed

    private void jButton_Q222ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q222ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q222ActionPerformed

    private void jButton_Q223ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q223ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q223ActionPerformed

    private void jButton_Q224ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Q224ActionPerformed
        mtpVerificaOpcao(getNumeroBts(evt));
    }//GEN-LAST:event_jButton_Q224ActionPerformed

    private void jB_cronometroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_cronometroActionPerformed
        final String titulo[] = {"",""};
        Cronometro.main(titulo);
    }//GEN-LAST:event_jB_cronometroActionPerformed



    @SuppressWarnings("unchecked")
    private void mtpVerificaOpcao(int i)
    {
        i = i+1;
        for(Integer opcao = 0; opcao<=i;opcao++)
        {
            switch (opcao)
            {

                case 1 :
                    if(jPanel1 == null)
                    {
                       jTabbedQuestoes2.add("Principal",jPanel1);
                    }
                try
                    {
                    jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}

                break;

                /* Item 1 */
                case 2 :
                if(cl_questao_1.statusComportamentoQuestoes.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_1);
                        opcao = opcao+1;
                        cl_questao_1.statusComportamentoQuestoes.setStatus_classe(true);

                    }
                try
                    {
                        jTabbedQuestoes2.setSelectedIndex(opcao-1);
                    }
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                break;
                /* Item 2 */
                case 3 :

                    if(q_02.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_2);
                        opcao = opcao+1;
                        q_02.setStatus_classe(true);
                    }
                  try
                    {
                    jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                break;
                /* Item 3 */
                case 4 :
                    if(q_03.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_3);
                        opcao = opcao+1;
                        q_03.setStatus_classe(true);
                    }
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                break;
                /* Item 4 */
                case 5 :
                    if(q_04.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_4);
                        opcao = opcao+1;
                        q_04.setStatus_classe(true);
                    }
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                break;
                /* Item 5 */
                case 6 :
                    if(q_05.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_5);
                        opcao = opcao+1;
                        q_05.setStatus_classe(true);
                    }
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                break;
                /* Item 6 */
                case 7 :
                    if(q_06.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_6);
                        opcao = opcao+1;
                        q_06.setStatus_classe(true);
                    }
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                break;
                /* Item 7 */
                case 8 :
                    if(q_07.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_7);
                        opcao = opcao+1;
                        q_07.setStatus_classe(true);
                    }
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                break;
                /* Item 8 */
                 case 9 :
                    if(q_08.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_8);
                        opcao = opcao+1;
                        q_08.setStatus_classe(true);
                    }
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                break;
                /* Item 9 */
                case 10 :
                    if(q_09.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_9);
                        opcao = opcao+1;
                        q_09.setStatus_classe(true);
                    }
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                break;
                /* Item 10 */
                case 11 :
                    if(q_10.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_10);
                        opcao = opcao+1;
                        q_10.setStatus_classe(true);
                    }
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                break;
                /* Item 11 */
                case 12 :
                    if(q_11.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_11);
                        opcao = opcao+1;
                        q_11.setStatus_classe(true);
                    }
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                break;
                /* Item 12 */
                case 13 :
                    if(q_12.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_12);
                        opcao = opcao+1;
                        q_12.setStatus_classe(true);
                    }
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                break;
                /* Item 13 */
                case 14 :
                    if(q_13.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_13);
                        opcao = opcao+1;
                        q_13.setStatus_classe(true);
                    }
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                break;
                /* Item 14 */
                case 15 :
                    if(q_14.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_14);
                        opcao = opcao+1;
                        q_14.setStatus_classe(true);
                    }
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                break;
                /* Item 15 */
                case 16 :
                    if(q_15.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_15);
                        opcao = opcao+1;
                        q_15.setStatus_classe(true);
                    }
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                break;
                /* Item 16 */
                case 17 :
                    if(q_16.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_16);
                        opcao = opcao+1;
                        q_16.setStatus_classe(true);
                    }
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                break;
                 /* Item 17 */
                case 18 :
                    if(q_17.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_17);
                        opcao = opcao+1;
                        q_17.setStatus_classe(true);
                    }
                    try
                        {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                        catch(IndexOutOfBoundsException e)
                        {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                break;
                    
                /* Item 18 */
                case 19 :
                    if(q_18.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_18);
                        opcao = opcao+1;
                        q_18.setStatus_classe(true);
                    }                   
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                break;
               /* Item 19 */
                case 20 :
                    if(q_19.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_19);
                        opcao = opcao+1;
                        q_19.setStatus_classe(true);
                    }                   
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                break;
                 /* Item 20 */
                case 21 :
                    if(q_20.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_20);
                        opcao = opcao+1;
                        q_20.setStatus_classe(true);
                    }                   
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                break;
                   /* Item 21 */
                case 22 :
                    if(q_21.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_21);
                        opcao = opcao+1;
                        q_21.setStatus_classe(true);
                    }                   
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                break; 
                     /* Item 22 */
                case 23 :
                    if(q_22.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_22);
                        opcao = opcao+1;
                        q_22.setStatus_classe(true);
                    }                   
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                break; 
                  /* Item 23 */
                case 24 :
                    if(q_23.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_23);
                        opcao = opcao+1;
                        q_23.setStatus_classe(true);
                    }                   
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                break; 
               /* Item 24 */
                case 25 :
                    if(q_24.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_24);
                        opcao = opcao+1;
                        q_24.setStatus_classe(true);
                    }                   
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                break;
                  /* Item 25 */
                case 26 :
                    if(q_25.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_25);
                        opcao = opcao+1;
                        q_25.setStatus_classe(true);
                    }                   
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                break;
                     /* Item 26 */
                case 27 :
                    if(q_26.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_26);
                        opcao = opcao+1;
                        q_26.setStatus_classe(true);
                    }                   
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                break;
                     /* Item 27 */
                case 28 :
                    if(q_27.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_27);
                        opcao = opcao+1;
                        q_27.setStatus_classe(true);
                    }                   
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                 break;
                     /* Item 28 */
                case 29 :
                    if(q_28.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_28);
                        opcao = opcao+1;
                        q_28.setStatus_classe(true);
                    }                   
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                 break;
                     /* Item 29 */
                 case 30 :
                    if(q_29.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_29);
                        opcao = opcao+1;
                        q_29.setStatus_classe(true);
                    }                   
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                 break;
                      /* Item 30 */
                case 31 :
                    if(q_30.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_30);
                        opcao = opcao+1;
                        q_30.setStatus_classe(true);
                    }                   
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                 break;
                 /* Item 31 */
                case 32 :
                    if(q_31.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_31);
                        opcao = opcao+1;
                        q_31.setStatus_classe(true);
                    }                   
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                 break;
                    /* Item 32 */
                case 33 :
                    if(q_32.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_32);
                        opcao = opcao+1;
                        q_32.setStatus_classe(true);
                    }                   
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                 break; 
                   /* Item 33 */
                case 34 :
                    if(q_33.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_33);
                        opcao = opcao+1;
                        q_33.setStatus_classe(true);
                    }                   
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                 break;
                  /* Item 34 */
                case 35 :
                    if(q_34.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_34);
                        opcao = opcao+1;
                        q_34.setStatus_classe(true);
                    }                   
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                 break;
                 /* Item 35 */
                case 36 :
                    if(q_35.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_35);
                        opcao = opcao+1;
                        q_35.setStatus_classe(true);
                    }                   
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                 break;
                 /* Item 36 */
                case 37 :
                    if(q_36.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_36);
                        opcao = opcao+1;
                        q_36.setStatus_classe(true);
                    }                   
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                 break;
               /* Item 37 */
                case 38 :
                    if(q_37.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_37);
                        opcao = opcao+1;
                        q_37.setStatus_classe(true);
                    }                   
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                 break;
                /* Item 38 */
                case 39 :
                    if(q_38.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_38);
                        opcao = opcao+1;
                        q_38.setStatus_classe(true);
                    }                   
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                 break;
                /* Item 39 */
                case 40 :
                    if(q_39.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_39);
                        opcao = opcao+1;
                        q_39.setStatus_classe(true);
                    }                   
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                 break;
                 /* Item 40 */
                case 41 :
                    if(q_40.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_40);
                        opcao = opcao+1;
                        q_40.setStatus_classe(true);
                    }                   
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                 break;
                  /* Item 41 */
                case 42 :
                    if(q_41.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_41);
                        opcao = opcao+1;
                        q_41.setStatus_classe(true);
                    }                   
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                 break;
                 /* Item 42 */
                case 43 :
                    if(q_42.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_42);
                        opcao = opcao+1;
                        q_42.setStatus_classe(true);
                    }                   
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                 break;
                 /* Item 43 */
                case 44 :
                    if(q_43.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_43);
                        opcao = opcao+1;
                        q_43.setStatus_classe(true);
                    }                   
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                 break;
                /* Item 44 */
                case 45 :
                    if(q_44.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_44);
                        opcao = opcao+1;
                        q_44.setStatus_classe(true);
                    }                   
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                 break;
                 /* Item 45 */
                case 46 :
                    if(q_45.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_45);
                        opcao = opcao+1;
                        q_45.setStatus_classe(true);
                    }                   
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                 break;
                /* Item 46 */
                case 47 :
                    if(q_46.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_46);
                        opcao = opcao+1;
                        q_46.setStatus_classe(true);
                    }                   
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                 break;
                /* Item 47 */
                case 48 :
                    if(q_47.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_47);
                        opcao = opcao+1;
                        q_47.setStatus_classe(true);
                    }                   
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                 break;
                 /* Item 48 */
                case 49 :
                    if(q_48.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_48);
                        opcao = opcao+1;
                        q_48.setStatus_classe(true);
                    }                   
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                 break;
                  /* Item 49 */
                case 50 :
                    if(q_49.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_49);
                        opcao = opcao+1;
                        q_49.setStatus_classe(true);
                    }                   
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                 break;
                 /* Item 50 */
                case 51 :
                    if(q_50.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_50);
                        opcao = opcao+1;
                        q_50.setStatus_classe(true);
                    }                   
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                 break;
               /* Item 51 */
                case 52 :
                    if(q_51.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_51);
                        opcao = opcao+1;
                        q_51.setStatus_classe(true);
                    }                   
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                 break;
                /* Item 52 */
                case 53 :
                    if(q_52.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_52);
                        opcao = opcao+1;
                        q_52.setStatus_classe(true);
                    }                   
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                 break;
                /* Item 53 */
                case 54 :
                    if(q_53.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_53);
                        opcao = opcao+1;
                        q_53.setStatus_classe(true);
                    }                   
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                 break;
               /* Item 54 */
                case 55 :
                    if(q_54.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_54);
                        opcao = opcao+1;
                        q_54.setStatus_classe(true);
                    }                   
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                 break;
                /* Item 55 */
                case 56 :
                    if(q_55.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_55);
                        opcao = opcao+1;
                        q_55.setStatus_classe(true);
                    }                   
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                 break;
               /* Item 56 */
                case 57 :
                    if(q_56.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_56);
                        opcao = opcao+1;
                        q_56.setStatus_classe(true);
                    }                   
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                 break; 
            /* Item 57 */
                case 58 :
                    if(q_57.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_57);
                        opcao = opcao+1;
                        q_57.setStatus_classe(true);
                    }                   
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                 break;
               /* Item 58 */
                case 59 :
                    if(q_58.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_58);
                        opcao = opcao+1;
                        q_58.setStatus_classe(true);
                    }                   
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                 break;
                /* Item 59 */
                case 60 :
                    if(q_59.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_59);
                        opcao = opcao+1;
                        q_59.setStatus_classe(true);
                    }
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                 break;
                 /* Item 60 */
                case 61 :
                    if(q_60.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_60);
                        opcao = opcao+1;
                        q_60.setStatus_classe(true);
                    }
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                 break;
                 /* Item 61 */
                case 62 :
                    if(q_61.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_61);
                        opcao = opcao+1;
                        q_61.setStatus_classe(true);
                    }
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                 break;
                 /* Item 62 */
                case 63 :
                    if(q_62.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_62);
                        opcao = opcao+1;
                        q_62.setStatus_classe(true);
                    }
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                 break;
               /* Item 63 */
                case 64 :
                    if(q_63.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_63);
                        opcao = opcao+1;
                        q_63.setStatus_classe(true);
                    }
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                 break;

                 /* Item 64 */
                case 65 :
                    if(q_64.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_64);
                        opcao = opcao+1;
                        q_64.setStatus_classe(true);
                    }
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                 break;
                  /* Item 65 */
                case 66 :
                    if(q_65.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_65);
                        opcao = opcao+1;
                        q_65.setStatus_classe(true);
                    }
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                 break;
                  /* Item 66 */
                case 67 :
                    if(q_66.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_66);
                        opcao = opcao+1;
                        q_66.setStatus_classe(true);
                    }
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                 break;
                 /* Item 67 */
                case 68 :
                    if(q_67.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_67);
                        opcao = opcao+1;
                        q_67.setStatus_classe(true);
                    }
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                 break;
                 /* Item 68 */
                case 69 :
                    if(q_68.isStatus_classe() == false)
                    {
                        opcao = opcao-1;
                        jTabbedQuestoes2.add(opcao.toString(),cl_questao_68);
                        opcao = opcao+1;
                        q_68.setStatus_classe(true);
                    }
                    try
                    {jTabbedQuestoes2.setSelectedIndex(opcao-1);}
                    catch(IndexOutOfBoundsException e)
                    {System.out.println("Erro de indice no JTabbed, tratado e controlado");}
                 break;
                 /********/
                  case 70:
                    if (q_69.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_69);
                        opcao = opcao + 1;
                        q_69.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                  case 71:
                    if (q_70.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_70);
                        opcao = opcao + 1;
                        q_70.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 72:
                    if (q_71.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_71);
                        opcao = opcao + 1;
                        q_71.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 73:
                    if (q_72.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_72);
                        opcao = opcao + 1;
                        q_72.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 74:
                    if (q_73.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_73);
                        opcao = opcao + 1;
                        q_73.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 75:
                    if (q_74.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_74);
                        opcao = opcao + 1;
                        q_74.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 76:
                    if (q_75.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_75);
                        opcao = opcao + 1;
                        q_75.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 77:
                    if (q_76.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_76);
                        opcao = opcao + 1;
                        q_76.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 78:
                    if (q_77.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_77);
                        opcao = opcao + 1;
                        q_77.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 79:
                    if (q_78.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_78);
                        opcao = opcao + 1;
                        q_78.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 80:
                    if (q_79.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_79);
                        opcao = opcao + 1;
                        q_79.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 81:
                    if (q_80.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_80);
                        opcao = opcao + 1;
                        q_80.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 82:
                    if (q_81.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_81);
                        opcao = opcao + 1;
                        q_81.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 83:
                    if (q_82.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_82);
                        opcao = opcao + 1;
                        q_82.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 84:
                    if (q_83.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_83);
                        opcao = opcao + 1;
                        q_83.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 85:
                    if (q_84.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_84);
                        opcao = opcao + 1;
                        q_84.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 86:
                    if (q_85.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_85);
                        opcao = opcao + 1;
                        q_85.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 87:
                    if (q_86.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_86);
                        opcao = opcao + 1;
                        q_86.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 88:
                    if (q_87.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_87);
                        opcao = opcao + 1;
                        q_87.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 89:
                    if (q_88.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_88);
                        opcao = opcao + 1;
                        q_88.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 90:
                    if (q_89.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_89);
                        opcao = opcao + 1;
                        q_89.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 91:
                    if (q_90.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_90);
                        opcao = opcao + 1;
                        q_90.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 92:
                    if (q_91.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_91);
                        opcao = opcao + 1;
                        q_91.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 93:
                    if (q_92.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_92);
                        opcao = opcao + 1;
                        q_92.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 94:
                    if (q_93.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_93);
                        opcao = opcao + 1;
                        q_93.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 95:
                    if (q_94.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_94);
                        opcao = opcao + 1;
                        q_94.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 96:
                    if (q_95.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_95);
                        opcao = opcao + 1;
                        q_95.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 97:
                    if (q_96.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_96);
                        opcao = opcao + 1;
                        q_96.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 98:
                    if (q_97.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_97);
                        opcao = opcao + 1;
                        q_97.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 99:
                    if (q_98.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_98);
                        opcao = opcao + 1;
                        q_98.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 100:
                    if (q_99.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_99);
                        opcao = opcao + 1;
                        q_99.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 101:
                    if (q_100.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_100);
                        opcao = opcao + 1;
                        q_100.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 102:
                    if (q_101.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_101);
                        opcao = opcao + 1;
                        q_101.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 103:
                    if (q_102.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_102);
                        opcao = opcao + 1;
                        q_102.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 104:
                    if (q_103.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_103);
                        opcao = opcao + 1;
                        q_103.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 105:
                    if (q_104.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_104);
                        opcao = opcao + 1;
                        q_104.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 106:
                    if (q_105.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_105);
                        opcao = opcao + 1;
                        q_105.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 107:
                    if (q_106.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_106);
                        opcao = opcao + 1;
                        q_106.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 108:
                    if (q_107.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_107);
                        opcao = opcao + 1;
                        q_107.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 109:
                    if (q_108.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_108);
                        opcao = opcao + 1;
                        q_108.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 110:
                    if (q_109.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_109);
                        opcao = opcao + 1;
                        q_109.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 111:
                    if (q_110.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_110);
                        opcao = opcao + 1;
                        q_110.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 112:
                    if (q_111.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_111);
                        opcao = opcao + 1;
                        q_111.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 113:
                    if (q_112.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_112);
                        opcao = opcao + 1;
                        q_112.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 114:
                    if (q_113.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_113);
                        opcao = opcao + 1;
                        q_113.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 115:
                    if (q_114.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_114);
                        opcao = opcao + 1;
                        q_114.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 116:
                    if (q_115.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_115);
                        opcao = opcao + 1;
                        q_115.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 117:
                    if (q_116.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_116);
                        opcao = opcao + 1;
                        q_116.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 118:
                    if (q_117.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_117);
                        opcao = opcao + 1;
                        q_117.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 119:
                    if (q_118.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_118);
                        opcao = opcao + 1;
                        q_118.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 120:
                    if (q_119.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_119);
                        opcao = opcao + 1;
                        q_119.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 121:
                    if (q_120.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_120);
                        opcao = opcao + 1;
                        q_120.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 122:
                    if (q_121.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_121);
                        opcao = opcao + 1;
                        q_121.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 123:
                    if (q_122.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_122);
                        opcao = opcao + 1;
                        q_122.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 124:
                    if (q_123.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_123);
                        opcao = opcao + 1;
                        q_123.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 125:
                    if (q_124.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_124);
                        opcao = opcao + 1;
                        q_124.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 126:
                    if (q_125.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_125);
                        opcao = opcao + 1;
                        q_125.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 127:
                    if (q_126.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_126);
                        opcao = opcao + 1;
                        q_126.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 128:
                    if (q_127.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_127);
                        opcao = opcao + 1;
                        q_127.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 129:
                    if (q_128.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_128);
                        opcao = opcao + 1;
                        q_128.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 130:
                    if (q_129.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_129);
                        opcao = opcao + 1;
                        q_129.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 131:
                    if (q_130.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_130);
                        opcao = opcao + 1;
                        q_130.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 132:
                    if (q_131.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_131);
                        opcao = opcao + 1;
                        q_131.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 133:
                    if (q_132.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_132);
                        opcao = opcao + 1;
                        q_132.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 134:
                    if (q_133.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_133);
                        opcao = opcao + 1;
                        q_133.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 135:
                    if (q_134.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_134);
                        opcao = opcao + 1;
                        q_134.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 136:
                    if (q_135.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_135);
                        opcao = opcao + 1;
                        q_135.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 137:
                    if (q_136.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_136);
                        opcao = opcao + 1;
                        q_136.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 138:
                    if (q_137.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_137);
                        opcao = opcao + 1;
                        q_137.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 139:
                    if (q_138.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_138);
                        opcao = opcao + 1;
                        q_138.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 140:
                    if (q_139.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_139);
                        opcao = opcao + 1;
                        q_139.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 141:
                    if (q_140.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_140);
                        opcao = opcao + 1;
                        q_140.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 142:
                    if (q_141.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_141);
                        opcao = opcao + 1;
                        q_141.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 143:
                    if (q_142.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_142);
                        opcao = opcao + 1;
                        q_142.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 144:
                    if (q_143.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_143);
                        opcao = opcao + 1;
                        q_143.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 145:
                    if (q_144.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_144);
                        opcao = opcao + 1;
                        q_144.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 146:
                    if (q_145.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_145);
                        opcao = opcao + 1;
                        q_145.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 147:
                    if (q_146.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_146);
                        opcao = opcao + 1;
                        q_146.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 148:
                    if (q_147.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_147);
                        opcao = opcao + 1;
                        q_147.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 149:
                    if (q_148.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_148);
                        opcao = opcao + 1;
                        q_148.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 150:
                    if (q_149.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_149);
                        opcao = opcao + 1;
                        q_149.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 151:
                    if (q_150.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_150);
                        opcao = opcao + 1;
                        q_150.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 152:
                    if (q_151.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_151);
                        opcao = opcao + 1;
                        q_151.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 153:
                    if (q_152.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_152);
                        opcao = opcao + 1;
                        q_152.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 154:
                    if (q_153.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_153);
                        opcao = opcao + 1;
                        q_153.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 155:
                    if (q_154.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_154);
                        opcao = opcao + 1;
                        q_154.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 156:
                    if (q_155.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_155);
                        opcao = opcao + 1;
                        q_155.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 157:
                    if (q_156.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_156);
                        opcao = opcao + 1;
                        q_156.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 158:
                    if (q_157.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_157);
                        opcao = opcao + 1;
                        q_157.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 159:
                    if (q_158.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_158);
                        opcao = opcao + 1;
                        q_158.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 160:
                    if (q_159.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_159);
                        opcao = opcao + 1;
                        q_159.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 161:
                    if (q_160.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_160);
                        opcao = opcao + 1;
                        q_160.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 162:
                    if (q_161.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_161);
                        opcao = opcao + 1;
                        q_161.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 163:
                    if (q_162.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_162);
                        opcao = opcao + 1;
                        q_162.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 164:
                    if (q_163.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_163);
                        opcao = opcao + 1;
                        q_163.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 165:
                    if (q_164.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_164);
                        opcao = opcao + 1;
                        q_164.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 166:
                    if (q_165.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_165);
                        opcao = opcao + 1;
                        q_165.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 167:
                    if (q_166.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_166);
                        opcao = opcao + 1;
                        q_166.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 168:
                    if (q_167.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_167);
                        opcao = opcao + 1;
                        q_167.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 169:
                    if (q_168.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_168);
                        opcao = opcao + 1;
                        q_168.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 170:
                    if (q_169.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_169);
                        opcao = opcao + 1;
                        q_169.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 171:
                    if (q_170.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_170);
                        opcao = opcao + 1;
                        q_170.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 172:
                    if (q_171.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_171);
                        opcao = opcao + 1;
                        q_171.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 173:
                    if (q_172.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_172);
                        opcao = opcao + 1;
                        q_172.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 174:
                    if (q_173.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_173);
                        opcao = opcao + 1;
                        q_173.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 175:
                    if (q_174.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_174);
                        opcao = opcao + 1;
                        q_174.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 176:
                    if (q_175.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_175);
                        opcao = opcao + 1;
                        q_175.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 177:
                    if (q_176.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_176);
                        opcao = opcao + 1;
                        q_176.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 178:
                    if (q_177.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_177);
                        opcao = opcao + 1;
                        q_177.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 179:
                    if (q_178.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_178);
                        opcao = opcao + 1;
                        q_178.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 180:
                    if (q_179.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_179);
                        opcao = opcao + 1;
                        q_179.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 181:
                    if (q_180.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_180);
                        opcao = opcao + 1;
                        q_180.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 182:
                    if (q_181.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_181);
                        opcao = opcao + 1;
                        q_181.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 183:
                    if (q_182.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_182);
                        opcao = opcao + 1;
                        q_182.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 184:
                    if (q_183.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_183);
                        opcao = opcao + 1;
                        q_183.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 185:
                    if (q_184.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_184);
                        opcao = opcao + 1;
                        q_184.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 186:
                    if (q_185.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_185);
                        opcao = opcao + 1;
                        q_185.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 187:
                    if (q_186.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_186);
                        opcao = opcao + 1;
                        q_186.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 188:
                    if (q_187.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_187);
                        opcao = opcao + 1;
                        q_187.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 189:
                    if (q_188.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_188);
                        opcao = opcao + 1;
                        q_188.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 190:
                    if (q_189.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_189);
                        opcao = opcao + 1;
                        q_189.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 191:
                    if (q_190.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_190);
                        opcao = opcao + 1;
                        q_190.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 192:
                    if (q_191.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_191);
                        opcao = opcao + 1;
                        q_191.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 193:
                    if (q_192.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_192);
                        opcao = opcao + 1;
                        q_192.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 194:
                    if (q_193.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_193);
                        opcao = opcao + 1;
                        q_193.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                  case 195:
                    if (q_194.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_194);
                        opcao = opcao + 1;
                        q_194.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 196:
                    if (q_195.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_195);
                        opcao = opcao + 1;
                        q_195.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 197:
                    if (q_196.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_196);
                        opcao = opcao + 1;
                        q_196.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 198:
                    if (q_197.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_197);
                        opcao = opcao + 1;
                        q_197.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 199:
                    if (q_198.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_198);
                        opcao = opcao + 1;
                        q_198.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                   case 200:
                    if (q_199.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_199);
                        opcao = opcao + 1;
                        q_199.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 201:
                    if (q_200.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_200);
                        opcao = opcao + 1;
                        q_200.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 202:
                    if (q_201.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_201);
                        opcao = opcao + 1;
                        q_201.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 203:
                    if (q_202.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_202);
                        opcao = opcao + 1;
                        q_202.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 204:
                    if (q_203.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_203);
                        opcao = opcao + 1;
                        q_203.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                 case 205:
                    if (q_204.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_204);
                        opcao = opcao + 1;
                        q_204.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 206:
                    if (q_205.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_205);
                        opcao = opcao + 1;
                        q_205.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                  case 207:
                    if (q_206.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_206);
                        opcao = opcao + 1;
                        q_206.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 208:
                    if (q_207.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_207);
                        opcao = opcao + 1;
                        q_207.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                  case 209:
                    if (q_208.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_208);
                        opcao = opcao + 1;
                        q_208.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 210:
                    if (q_209.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_209);
                        opcao = opcao + 1;
                        q_209.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                  case 211:
                    if (q_210.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_210);
                        opcao = opcao + 1;
                        q_210.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 212:
                    if (q_211.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_211);
                        opcao = opcao + 1;
                        q_211.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 213:
                    if (q_212.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_212);
                        opcao = opcao + 1;
                        q_212.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                 case 214:
                    if (q_213.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_213);
                        opcao = opcao + 1;
                        q_213.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 215:
                    if (q_214.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_214);
                        opcao = opcao + 1;
                        q_214.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 216:
                    if (q_215.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_215);
                        opcao = opcao + 1;
                        q_215.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 217:
                    if (q_216.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_216);
                        opcao = opcao + 1;
                        q_216.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 218:
                    if (q_217.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_217);
                        opcao = opcao + 1;
                        q_217.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 219:
                    if (q_218.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_218);
                        opcao = opcao + 1;
                        q_218.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 220:
                    if (q_219.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_219);
                        opcao = opcao + 1;
                        q_219.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 221:
                    if (q_220.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_220);
                        opcao = opcao + 1;
                        q_220.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 222:
                    if (q_221.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_221);
                        opcao = opcao + 1;
                        q_221.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 223:
                    if (q_222.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_222);
                        opcao = opcao + 1;
                        q_222.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 224:
                    if (q_223.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_223);
                        opcao = opcao + 1;
                        q_223.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 225:
                    if (q_224.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_224);
                        opcao = opcao + 1;
                        q_224.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                    case 226:
                    if (q_225.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_225);
                        opcao = opcao + 1;
                        q_225.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;
                case 227:
                    if (q_226.isStatus_classe() == false) {
                        opcao = opcao - 1;
                        jTabbedQuestoes2.add(opcao.toString(), cl_questao_226);
                        opcao = opcao + 1;
                        q_226.setStatus_classe(true);
                    }
                    try {
                        jTabbedQuestoes2.setSelectedIndex(opcao - 1);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Erro de indice no JTabbed, tratado e controlado");
                    }
                    break;

                 //////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            }
        }
    }
    



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private br.com.testkiller.graficos.GraficoBR graficoBR;
    private br.com.testkiller.graficos.GraficoUS graficoUS;
    private javax.swing.JButton jB_cronometro;
    private javax.swing.JButton jButton_65;
    private javax.swing.JButton jButton_Principal;
    private javax.swing.JButton jButton_Q100;
    private javax.swing.JButton jButton_Q101;
    private javax.swing.JButton jButton_Q102;
    private javax.swing.JButton jButton_Q103;
    private javax.swing.JButton jButton_Q104;
    private javax.swing.JButton jButton_Q105;
    private javax.swing.JButton jButton_Q106;
    private javax.swing.JButton jButton_Q107;
    private javax.swing.JButton jButton_Q108;
    private javax.swing.JButton jButton_Q109;
    private javax.swing.JButton jButton_Q110;
    private javax.swing.JButton jButton_Q111;
    private javax.swing.JButton jButton_Q112;
    private javax.swing.JButton jButton_Q113;
    private javax.swing.JButton jButton_Q114;
    private javax.swing.JButton jButton_Q115;
    private javax.swing.JButton jButton_Q116;
    private javax.swing.JButton jButton_Q117;
    private javax.swing.JButton jButton_Q118;
    private javax.swing.JButton jButton_Q119;
    private javax.swing.JButton jButton_Q120;
    private javax.swing.JButton jButton_Q121;
    private javax.swing.JButton jButton_Q122;
    private javax.swing.JButton jButton_Q123;
    private javax.swing.JButton jButton_Q124;
    private javax.swing.JButton jButton_Q125;
    private javax.swing.JButton jButton_Q126;
    private javax.swing.JButton jButton_Q127;
    private javax.swing.JButton jButton_Q128;
    private javax.swing.JButton jButton_Q129;
    private javax.swing.JButton jButton_Q130;
    private javax.swing.JButton jButton_Q131;
    private javax.swing.JButton jButton_Q132;
    private javax.swing.JButton jButton_Q133;
    private javax.swing.JButton jButton_Q134;
    private javax.swing.JButton jButton_Q135;
    private javax.swing.JButton jButton_Q136;
    private javax.swing.JButton jButton_Q137;
    private javax.swing.JButton jButton_Q138;
    private javax.swing.JButton jButton_Q139;
    private javax.swing.JButton jButton_Q140;
    private javax.swing.JButton jButton_Q141;
    private javax.swing.JButton jButton_Q142;
    private javax.swing.JButton jButton_Q143;
    private javax.swing.JButton jButton_Q144;
    private javax.swing.JButton jButton_Q145;
    private javax.swing.JButton jButton_Q146;
    private javax.swing.JButton jButton_Q147;
    private javax.swing.JButton jButton_Q148;
    private javax.swing.JButton jButton_Q149;
    private javax.swing.JButton jButton_Q150;
    private javax.swing.JButton jButton_Q151;
    private javax.swing.JButton jButton_Q152;
    private javax.swing.JButton jButton_Q153;
    private javax.swing.JButton jButton_Q154;
    private javax.swing.JButton jButton_Q155;
    private javax.swing.JButton jButton_Q156;
    private javax.swing.JButton jButton_Q157;
    private javax.swing.JButton jButton_Q158;
    private javax.swing.JButton jButton_Q159;
    private javax.swing.JButton jButton_Q160;
    private javax.swing.JButton jButton_Q161;
    private javax.swing.JButton jButton_Q162;
    private javax.swing.JButton jButton_Q163;
    private javax.swing.JButton jButton_Q164;
    private javax.swing.JButton jButton_Q165;
    private javax.swing.JButton jButton_Q166;
    private javax.swing.JButton jButton_Q167;
    private javax.swing.JButton jButton_Q168;
    private javax.swing.JButton jButton_Q169;
    private javax.swing.JButton jButton_Q170;
    private javax.swing.JButton jButton_Q171;
    private javax.swing.JButton jButton_Q172;
    private javax.swing.JButton jButton_Q173;
    private javax.swing.JButton jButton_Q174;
    private javax.swing.JButton jButton_Q175;
    private javax.swing.JButton jButton_Q176;
    private javax.swing.JButton jButton_Q177;
    private javax.swing.JButton jButton_Q178;
    private javax.swing.JButton jButton_Q179;
    private javax.swing.JButton jButton_Q180;
    private javax.swing.JButton jButton_Q181;
    private javax.swing.JButton jButton_Q182;
    private javax.swing.JButton jButton_Q183;
    private javax.swing.JButton jButton_Q184;
    private javax.swing.JButton jButton_Q185;
    private javax.swing.JButton jButton_Q186;
    private javax.swing.JButton jButton_Q187;
    private javax.swing.JButton jButton_Q188;
    private javax.swing.JButton jButton_Q189;
    private javax.swing.JButton jButton_Q190;
    private javax.swing.JButton jButton_Q191;
    private javax.swing.JButton jButton_Q192;
    private javax.swing.JButton jButton_Q193;
    private javax.swing.JButton jButton_Q194;
    private javax.swing.JButton jButton_Q195;
    private javax.swing.JButton jButton_Q196;
    private javax.swing.JButton jButton_Q197;
    private javax.swing.JButton jButton_Q198;
    private javax.swing.JButton jButton_Q199;
    private javax.swing.JButton jButton_Q200;
    private javax.swing.JButton jButton_Q201;
    private javax.swing.JButton jButton_Q202;
    private javax.swing.JButton jButton_Q203;
    private javax.swing.JButton jButton_Q204;
    private javax.swing.JButton jButton_Q205;
    private javax.swing.JButton jButton_Q206;
    private javax.swing.JButton jButton_Q207;
    private javax.swing.JButton jButton_Q208;
    private javax.swing.JButton jButton_Q209;
    private javax.swing.JButton jButton_Q210;
    private javax.swing.JButton jButton_Q211;
    private javax.swing.JButton jButton_Q212;
    private javax.swing.JButton jButton_Q213;
    private javax.swing.JButton jButton_Q214;
    private javax.swing.JButton jButton_Q215;
    private javax.swing.JButton jButton_Q216;
    private javax.swing.JButton jButton_Q217;
    private javax.swing.JButton jButton_Q218;
    private javax.swing.JButton jButton_Q219;
    private javax.swing.JButton jButton_Q220;
    private javax.swing.JButton jButton_Q221;
    private javax.swing.JButton jButton_Q222;
    private javax.swing.JButton jButton_Q223;
    private javax.swing.JButton jButton_Q224;
    private javax.swing.JButton jButton_Q36;
    private javax.swing.JButton jButton_Q37;
    private javax.swing.JButton jButton_Q38;
    private javax.swing.JButton jButton_Q39;
    private javax.swing.JButton jButton_Q40;
    private javax.swing.JButton jButton_Q41;
    private javax.swing.JButton jButton_Q42;
    private javax.swing.JButton jButton_Q43;
    private javax.swing.JButton jButton_Q44;
    private javax.swing.JButton jButton_Q45;
    private javax.swing.JButton jButton_Q46;
    private javax.swing.JButton jButton_Q47;
    private javax.swing.JButton jButton_Q48;
    private javax.swing.JButton jButton_Q49;
    private javax.swing.JButton jButton_Q50;
    private javax.swing.JButton jButton_Q51;
    private javax.swing.JButton jButton_Q52;
    private javax.swing.JButton jButton_Q53;
    private javax.swing.JButton jButton_Q54;
    private javax.swing.JButton jButton_Q55;
    private javax.swing.JButton jButton_Q56;
    private javax.swing.JButton jButton_Q57;
    private javax.swing.JButton jButton_Q58;
    private javax.swing.JButton jButton_Q59;
    private javax.swing.JButton jButton_Q60;
    private javax.swing.JButton jButton_Q61;
    private javax.swing.JButton jButton_Q62;
    private javax.swing.JButton jButton_Q63;
    private javax.swing.JButton jButton_Q64;
    private javax.swing.JButton jButton_Q66;
    private javax.swing.JButton jButton_Q67;
    private javax.swing.JButton jButton_Q68;
    private javax.swing.JButton jButton_Q69;
    private javax.swing.JButton jButton_Q70;
    private javax.swing.JButton jButton_Q71;
    private javax.swing.JButton jButton_Q72;
    private javax.swing.JButton jButton_Q73;
    private javax.swing.JButton jButton_Q74;
    private javax.swing.JButton jButton_Q75;
    private javax.swing.JButton jButton_Q76;
    private javax.swing.JButton jButton_Q77;
    private javax.swing.JButton jButton_Q78;
    private javax.swing.JButton jButton_Q79;
    private javax.swing.JButton jButton_Q80;
    private javax.swing.JButton jButton_Q81;
    private javax.swing.JButton jButton_Q82;
    private javax.swing.JButton jButton_Q83;
    private javax.swing.JButton jButton_Q84;
    private javax.swing.JButton jButton_Q85;
    private javax.swing.JButton jButton_Q86;
    private javax.swing.JButton jButton_Q87;
    private javax.swing.JButton jButton_Q88;
    private javax.swing.JButton jButton_Q89;
    private javax.swing.JButton jButton_Q90;
    private javax.swing.JButton jButton_Q91;
    private javax.swing.JButton jButton_Q92;
    private javax.swing.JButton jButton_Q93;
    private javax.swing.JButton jButton_Q94;
    private javax.swing.JButton jButton_Q95;
    private javax.swing.JButton jButton_Q96;
    private javax.swing.JButton jButton_Q97;
    private javax.swing.JButton jButton_Q98;
    private javax.swing.JButton jButton_Q99;
    private javax.swing.JButton jButton_q1;
    private javax.swing.JButton jButton_q10;
    private javax.swing.JButton jButton_q11;
    private javax.swing.JButton jButton_q12;
    private javax.swing.JButton jButton_q13;
    private javax.swing.JButton jButton_q14;
    private javax.swing.JButton jButton_q15;
    private javax.swing.JButton jButton_q16;
    private javax.swing.JButton jButton_q17;
    private javax.swing.JButton jButton_q18;
    private javax.swing.JButton jButton_q19;
    private javax.swing.JButton jButton_q2;
    private javax.swing.JButton jButton_q20;
    private javax.swing.JButton jButton_q21;
    private javax.swing.JButton jButton_q22;
    private javax.swing.JButton jButton_q225;
    private javax.swing.JButton jButton_q226;
    private javax.swing.JButton jButton_q227;
    private javax.swing.JButton jButton_q23;
    private javax.swing.JButton jButton_q24;
    private javax.swing.JButton jButton_q254;
    private javax.swing.JButton jButton_q26;
    private javax.swing.JButton jButton_q27;
    private javax.swing.JButton jButton_q28;
    private javax.swing.JButton jButton_q29;
    private javax.swing.JButton jButton_q3;
    private javax.swing.JButton jButton_q30;
    private javax.swing.JButton jButton_q31;
    private javax.swing.JButton jButton_q32;
    private javax.swing.JButton jButton_q33;
    private javax.swing.JButton jButton_q34;
    private javax.swing.JButton jButton_q4;
    private javax.swing.JButton jButton_q5;
    private javax.swing.JButton jButton_q6;
    private javax.swing.JButton jButton_q7;
    private javax.swing.JButton jButton_q8;
    private javax.swing.JButton jButton_q9;
    private javax.swing.JComboBox jComboBox_internacionalizacao;
    private javax.swing.JInternalFrame jInternalFrame;
    private javax.swing.JLabel jLabelDisplayAcertos;
    private javax.swing.JLabel jLabelDisplayN_Erros;
    private javax.swing.JLabel jLabelDisplayN_Feitas;
    private javax.swing.JLabel jLabelRelogio;
    private static javax.swing.JLabel jLabel_acertos;
    private static javax.swing.JLabel jLabel_erros;
    private javax.swing.JLabel jLabel_hora;
    private static javax.swing.JLabel jLabel_nao_feitas;
    private javax.swing.JLabel jLabel_qustoesTitulo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemRespostas;
    private javax.swing.JMenuItem jMenuItem_sair;
    private javax.swing.JMenuItem jMenuItem_sobre;
    private javax.swing.JMenu jMenu_ajuda;
    private javax.swing.JMenu jMenu_arquivo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JProgressBar jProgressBarLinguage;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTabbedPane jTabbedQuestoes2;
    // End of variables declaration//GEN-END:variables
    
    private void renomeiaButoes(String idioma)
    {
        if(idioma.equals("Br"))
        {
            idioma = "Questão";
            jLabel_qustoesTitulo.setText("Questões");
            jMenu_ajuda.setLabel        ("Ajuda"     );
            jMenu_arquivo.setLabel      ("Arquivo"     );
            jMenuItemRespostas.setLabel ("Respostas"  ); 
            jMenuItem_sair.setLabel     ("Sair"     );
            jMenuItem_sobre.setLabel    ("Sobre"    );
            jLabel_hora.setText("Hora:");
            jB_cronometro.setText("Cronometro");
           
            if(Respostas.jMenuItem_sobre != null)
           {
                Respostas.jMenuItem_sobre.setLabel("Sair"   );
                Respostas.jMenu_sobre.setLabel("Arquivo");
           }
            
        }
          
        else if(idioma.equals("Us"))
        {
           idioma = "Question";
           jLabel_qustoesTitulo.setText("Issues");
           jMenu_ajuda.setLabel        ("Help"     );
           jMenu_arquivo.setLabel      ("File"     );
           jMenuItemRespostas.setLabel ("Replies"  ); 
           jMenuItem_sair.setLabel     ("Exit"     );
           jMenuItem_sobre.setLabel    ("About"    );
           jLabel_hora.setText("Time:");
           jB_cronometro.setText("Timer");
           if(Respostas.jMenuItem_sobre != null)
           {
              Respostas.jMenuItem_sobre.setLabel("Exit");
              Respostas.jMenu_sobre.setLabel("File"); 
           }
           
        }
        AlxiliarRenomeiaButoes(jButton_Q100,idioma);
        AlxiliarRenomeiaButoes(jButton_Q101,idioma);
        AlxiliarRenomeiaButoes(jButton_Q102,idioma);
        AlxiliarRenomeiaButoes(jButton_Q103,idioma);
        AlxiliarRenomeiaButoes(jButton_Q104,idioma);
        AlxiliarRenomeiaButoes(jButton_Q105,idioma);
        AlxiliarRenomeiaButoes(jButton_Q106,idioma);
        AlxiliarRenomeiaButoes(jButton_Q107,idioma);
        AlxiliarRenomeiaButoes(jButton_Q108,idioma);
        AlxiliarRenomeiaButoes(jButton_Q109,idioma);
        AlxiliarRenomeiaButoes(jButton_Q110,idioma);
        AlxiliarRenomeiaButoes(jButton_Q111,idioma);
        AlxiliarRenomeiaButoes(jButton_Q112,idioma);
        AlxiliarRenomeiaButoes(jButton_Q113,idioma);
        AlxiliarRenomeiaButoes(jButton_Q114,idioma);
        AlxiliarRenomeiaButoes(jButton_Q115,idioma);
        AlxiliarRenomeiaButoes(jButton_Q116,idioma);
        AlxiliarRenomeiaButoes(jButton_Q117,idioma);
        AlxiliarRenomeiaButoes(jButton_Q118,idioma);
        AlxiliarRenomeiaButoes(jButton_Q119,idioma);
        AlxiliarRenomeiaButoes(jButton_Q120,idioma);
        AlxiliarRenomeiaButoes(jButton_Q121,idioma);
        AlxiliarRenomeiaButoes(jButton_Q122,idioma);
        AlxiliarRenomeiaButoes(jButton_Q123,idioma);
        AlxiliarRenomeiaButoes(jButton_Q124,idioma);
        AlxiliarRenomeiaButoes(jButton_Q125,idioma);
        AlxiliarRenomeiaButoes(jButton_Q126,idioma);
        AlxiliarRenomeiaButoes(jButton_Q127,idioma);
        AlxiliarRenomeiaButoes(jButton_Q128,idioma);
        AlxiliarRenomeiaButoes(jButton_Q129,idioma);
        AlxiliarRenomeiaButoes(jButton_Q130,idioma);
        AlxiliarRenomeiaButoes(jButton_Q131,idioma);
        AlxiliarRenomeiaButoes(jButton_Q132,idioma);
        AlxiliarRenomeiaButoes(jButton_Q133,idioma);
        AlxiliarRenomeiaButoes(jButton_Q134,idioma);
        AlxiliarRenomeiaButoes(jButton_Q135,idioma);
        AlxiliarRenomeiaButoes(jButton_Q136,idioma);
        AlxiliarRenomeiaButoes(jButton_Q137,idioma);
        AlxiliarRenomeiaButoes(jButton_Q138,idioma);
        AlxiliarRenomeiaButoes(jButton_Q139,idioma);
        AlxiliarRenomeiaButoes(jButton_Q140,idioma);
        AlxiliarRenomeiaButoes(jButton_Q141,idioma);
        AlxiliarRenomeiaButoes(jButton_Q142,idioma);
        AlxiliarRenomeiaButoes(jButton_Q143,idioma);
        AlxiliarRenomeiaButoes(jButton_Q144,idioma);
        AlxiliarRenomeiaButoes(jButton_Q145,idioma);
        AlxiliarRenomeiaButoes(jButton_Q146,idioma);
        AlxiliarRenomeiaButoes(jButton_Q147,idioma);
        AlxiliarRenomeiaButoes(jButton_Q148,idioma);
        AlxiliarRenomeiaButoes(jButton_Q149,idioma);
        AlxiliarRenomeiaButoes(jButton_Q150,idioma);
        AlxiliarRenomeiaButoes(jButton_Q151,idioma);
        AlxiliarRenomeiaButoes(jButton_Q152,idioma);
        AlxiliarRenomeiaButoes(jButton_Q153,idioma);
        AlxiliarRenomeiaButoes(jButton_Q154,idioma);
        AlxiliarRenomeiaButoes(jButton_Q155,idioma);
        AlxiliarRenomeiaButoes(jButton_Q156,idioma);
        AlxiliarRenomeiaButoes(jButton_Q157,idioma);
        AlxiliarRenomeiaButoes(jButton_Q158,idioma);
        AlxiliarRenomeiaButoes(jButton_Q159,idioma);
        AlxiliarRenomeiaButoes(jButton_Q160,idioma);
        AlxiliarRenomeiaButoes(jButton_Q161,idioma);
        AlxiliarRenomeiaButoes(jButton_Q162,idioma);
        AlxiliarRenomeiaButoes(jButton_Q163,idioma);
        AlxiliarRenomeiaButoes(jButton_Q164,idioma);
        AlxiliarRenomeiaButoes(jButton_Q165,idioma);
        AlxiliarRenomeiaButoes(jButton_Q166,idioma);
        AlxiliarRenomeiaButoes(jButton_Q167,idioma);
        AlxiliarRenomeiaButoes(jButton_Q168,idioma);
        AlxiliarRenomeiaButoes(jButton_Q169,idioma);
        AlxiliarRenomeiaButoes(jButton_Q170,idioma);
        AlxiliarRenomeiaButoes(jButton_Q171,idioma);
        AlxiliarRenomeiaButoes(jButton_Q172,idioma);
        AlxiliarRenomeiaButoes(jButton_Q173,idioma);
        AlxiliarRenomeiaButoes(jButton_Q174,idioma);
        AlxiliarRenomeiaButoes(jButton_Q175,idioma);
        AlxiliarRenomeiaButoes(jButton_Q176,idioma);
        AlxiliarRenomeiaButoes(jButton_Q177,idioma);
        AlxiliarRenomeiaButoes(jButton_Q178,idioma);
        AlxiliarRenomeiaButoes(jButton_Q179,idioma);
        AlxiliarRenomeiaButoes(jButton_Q180,idioma);
        AlxiliarRenomeiaButoes(jButton_Q181,idioma);
        AlxiliarRenomeiaButoes(jButton_Q182,idioma);
        AlxiliarRenomeiaButoes(jButton_Q183,idioma);
        AlxiliarRenomeiaButoes(jButton_Q184,idioma);
        AlxiliarRenomeiaButoes(jButton_Q185,idioma);
        AlxiliarRenomeiaButoes(jButton_Q186,idioma);
        AlxiliarRenomeiaButoes(jButton_Q187,idioma);
        AlxiliarRenomeiaButoes(jButton_Q188,idioma);
        AlxiliarRenomeiaButoes(jButton_Q189,idioma);
        AlxiliarRenomeiaButoes(jButton_Q190,idioma);
        AlxiliarRenomeiaButoes(jButton_Q191,idioma);
        AlxiliarRenomeiaButoes(jButton_Q192,idioma);
        AlxiliarRenomeiaButoes(jButton_Q193,idioma);
        AlxiliarRenomeiaButoes(jButton_Q194,idioma);
        AlxiliarRenomeiaButoes(jButton_Q195,idioma);
        AlxiliarRenomeiaButoes(jButton_Q196,idioma);
        AlxiliarRenomeiaButoes(jButton_Q197,idioma);
        AlxiliarRenomeiaButoes(jButton_Q198,idioma);
        AlxiliarRenomeiaButoes(jButton_Q199,idioma);
        AlxiliarRenomeiaButoes(jButton_Q200,idioma);
        AlxiliarRenomeiaButoes(jButton_Q201,idioma);
        AlxiliarRenomeiaButoes(jButton_Q202,idioma);
        AlxiliarRenomeiaButoes(jButton_Q203,idioma);
        AlxiliarRenomeiaButoes(jButton_Q204,idioma);
        AlxiliarRenomeiaButoes(jButton_Q205,idioma);
        AlxiliarRenomeiaButoes(jButton_Q206,idioma);
        AlxiliarRenomeiaButoes(jButton_Q207,idioma);
        AlxiliarRenomeiaButoes(jButton_Q208,idioma);
        AlxiliarRenomeiaButoes(jButton_Q209,idioma);
        AlxiliarRenomeiaButoes(jButton_Q210,idioma);
        AlxiliarRenomeiaButoes(jButton_Q211,idioma);
        AlxiliarRenomeiaButoes(jButton_Q212,idioma);
        AlxiliarRenomeiaButoes(jButton_Q213,idioma);
        AlxiliarRenomeiaButoes(jButton_Q214,idioma);
        AlxiliarRenomeiaButoes(jButton_Q215,idioma);
        AlxiliarRenomeiaButoes(jButton_Q216,idioma);
        AlxiliarRenomeiaButoes(jButton_Q217,idioma);
        AlxiliarRenomeiaButoes(jButton_Q218,idioma);
        AlxiliarRenomeiaButoes(jButton_Q219,idioma);
        AlxiliarRenomeiaButoes(jButton_Q220,idioma);
        AlxiliarRenomeiaButoes(jButton_Q221,idioma);
        AlxiliarRenomeiaButoes(jButton_Q222,idioma);
        AlxiliarRenomeiaButoes(jButton_Q223,idioma);
        AlxiliarRenomeiaButoes(jButton_Q224,idioma);
        AlxiliarRenomeiaButoes(jButton_Q36,idioma);
        AlxiliarRenomeiaButoes(jButton_Q37,idioma);
        AlxiliarRenomeiaButoes(jButton_Q38,idioma);
        AlxiliarRenomeiaButoes(jButton_Q39,idioma);
        AlxiliarRenomeiaButoes(jButton_Q40,idioma);
        AlxiliarRenomeiaButoes(jButton_Q41,idioma);
        AlxiliarRenomeiaButoes(jButton_Q42,idioma);
        AlxiliarRenomeiaButoes(jButton_Q43,idioma);
        AlxiliarRenomeiaButoes(jButton_Q44,idioma);
        AlxiliarRenomeiaButoes(jButton_Q45,idioma);
        AlxiliarRenomeiaButoes(jButton_Q46,idioma);
        AlxiliarRenomeiaButoes(jButton_Q47,idioma);
        AlxiliarRenomeiaButoes(jButton_Q48,idioma);
        AlxiliarRenomeiaButoes(jButton_Q49,idioma);
        AlxiliarRenomeiaButoes(jButton_Q50,idioma);
        AlxiliarRenomeiaButoes(jButton_Q51,idioma);
        AlxiliarRenomeiaButoes(jButton_Q52,idioma);
        AlxiliarRenomeiaButoes(jButton_Q53,idioma);
        AlxiliarRenomeiaButoes(jButton_Q54,idioma);
        AlxiliarRenomeiaButoes(jButton_Q55,idioma);
        AlxiliarRenomeiaButoes(jButton_Q56,idioma);
        AlxiliarRenomeiaButoes(jButton_Q57,idioma);
        AlxiliarRenomeiaButoes(jButton_Q58,idioma);
        AlxiliarRenomeiaButoes(jButton_Q59,idioma);
        AlxiliarRenomeiaButoes(jButton_Q60,idioma);
        AlxiliarRenomeiaButoes(jButton_Q61,idioma);
        AlxiliarRenomeiaButoes(jButton_Q62,idioma);
        AlxiliarRenomeiaButoes(jButton_Q63,idioma);
        AlxiliarRenomeiaButoes(jButton_Q64,idioma);
        AlxiliarRenomeiaButoes(jButton_Q66,idioma);
        AlxiliarRenomeiaButoes(jButton_Q67,idioma);
        AlxiliarRenomeiaButoes(jButton_Q68,idioma);
        AlxiliarRenomeiaButoes(jButton_Q69,idioma);
        AlxiliarRenomeiaButoes(jButton_Q70,idioma);
        AlxiliarRenomeiaButoes(jButton_Q71,idioma);
        AlxiliarRenomeiaButoes(jButton_Q72,idioma);
        AlxiliarRenomeiaButoes(jButton_Q73,idioma);
        AlxiliarRenomeiaButoes(jButton_Q74,idioma);
        AlxiliarRenomeiaButoes(jButton_Q75,idioma);
        AlxiliarRenomeiaButoes(jButton_Q76,idioma);
        AlxiliarRenomeiaButoes(jButton_Q77,idioma);
        AlxiliarRenomeiaButoes(jButton_Q78,idioma);
        AlxiliarRenomeiaButoes(jButton_Q79,idioma);
        AlxiliarRenomeiaButoes(jButton_Q80,idioma);
        AlxiliarRenomeiaButoes(jButton_Q81,idioma);
        AlxiliarRenomeiaButoes(jButton_Q82,idioma);
        AlxiliarRenomeiaButoes(jButton_Q83,idioma);
        AlxiliarRenomeiaButoes(jButton_Q84,idioma);
        AlxiliarRenomeiaButoes(jButton_Q85,idioma);
        AlxiliarRenomeiaButoes(jButton_Q86,idioma);
        AlxiliarRenomeiaButoes(jButton_Q87,idioma);
        AlxiliarRenomeiaButoes(jButton_Q88,idioma);
        AlxiliarRenomeiaButoes(jButton_Q89,idioma);
        AlxiliarRenomeiaButoes(jButton_Q90,idioma);
        AlxiliarRenomeiaButoes(jButton_Q91,idioma);
        AlxiliarRenomeiaButoes(jButton_Q92,idioma);
        AlxiliarRenomeiaButoes(jButton_Q93,idioma);
        AlxiliarRenomeiaButoes(jButton_Q94,idioma);
        AlxiliarRenomeiaButoes(jButton_Q95,idioma);
        AlxiliarRenomeiaButoes(jButton_Q96,idioma);
        AlxiliarRenomeiaButoes(jButton_Q97,idioma);
        AlxiliarRenomeiaButoes(jButton_Q98,idioma);
        AlxiliarRenomeiaButoes(jButton_Q99,idioma);
        AlxiliarRenomeiaButoes(jButton_q1 ,idioma);
        AlxiliarRenomeiaButoes(jButton_q10,idioma);
        AlxiliarRenomeiaButoes(jButton_q11,idioma);
        AlxiliarRenomeiaButoes(jButton_q12,idioma);
        AlxiliarRenomeiaButoes(jButton_q13,idioma);
        AlxiliarRenomeiaButoes(jButton_q14,idioma);
        AlxiliarRenomeiaButoes(jButton_q15,idioma);
        AlxiliarRenomeiaButoes(jButton_q16,idioma);
        AlxiliarRenomeiaButoes(jButton_q17,idioma);
        AlxiliarRenomeiaButoes(jButton_q18,idioma);
        AlxiliarRenomeiaButoes(jButton_q19,idioma);
        AlxiliarRenomeiaButoes(jButton_q2 ,idioma);
        AlxiliarRenomeiaButoes(jButton_q20,idioma);
        AlxiliarRenomeiaButoes(jButton_q21,idioma);
        AlxiliarRenomeiaButoes(jButton_q22,idioma);
        AlxiliarRenomeiaButoes(jButton_q225,idioma);
        AlxiliarRenomeiaButoes(jButton_q23 ,idioma);
        AlxiliarRenomeiaButoes(jButton_q24 ,idioma);
        AlxiliarRenomeiaButoes(jButton_q254,idioma);
        AlxiliarRenomeiaButoes(jButton_q26 ,idioma);
        AlxiliarRenomeiaButoes(jButton_q27 ,idioma);
        AlxiliarRenomeiaButoes(jButton_q28 ,idioma);
        AlxiliarRenomeiaButoes(jButton_q29 ,idioma);
        AlxiliarRenomeiaButoes(jButton_q3  ,idioma);
        AlxiliarRenomeiaButoes(jButton_q30 ,idioma);
        AlxiliarRenomeiaButoes(jButton_q31 ,idioma);
        AlxiliarRenomeiaButoes(jButton_q32 ,idioma);
        AlxiliarRenomeiaButoes(jButton_q33 ,idioma);
        AlxiliarRenomeiaButoes(jButton_q34 ,idioma);
        AlxiliarRenomeiaButoes(jButton_q226 ,idioma);
        AlxiliarRenomeiaButoes(jButton_q227 ,idioma);
        AlxiliarRenomeiaButoes(jButton_q4  ,idioma);
        AlxiliarRenomeiaButoes(jButton_q5  ,idioma);
        AlxiliarRenomeiaButoes(jButton_q6  ,idioma);
        AlxiliarRenomeiaButoes(jButton_q7  ,idioma);
        AlxiliarRenomeiaButoes(jButton_q8  ,idioma);
        AlxiliarRenomeiaButoes(jButton_q9  ,idioma);
        

    }
    
    private void AlxiliarRenomeiaButoes(JButton bt, String idioma)
    {
       // 

        if(idioma.equals("Questão")){      //procura   , substitue //
            idioma = bt.getText().replaceAll("Question",idioma);
          }
        else if(idioma.equals("Question")){//procura   , substitue //
            idioma = bt.getText().replaceAll("Questão",idioma);
        }
        
       bt.setLabel(idioma);

    }

    private int getNumeroBts(java.awt.event.ActionEvent evt){
        JButton b  = (JButton)evt.getSource();
        String n   = b.getText();
        int inicio = n.length()-3;
        n          = n.substring(inicio).trim();
        return Integer.parseInt(n);
    }



    public void startRelogio(){
        new Thread(new TicTac(this)).start();
    }
    @Override
    public void update(Observable o, Object arg){
        TicTac relogio = (TicTac)o;
        jLabelRelogio.setText(relogio.getHoras());
    }
    private class TicTac extends Observable implements Runnable{

        private String horas;

        public TicTac(Observer observador){
            addObserver(observador);
        }

        private String hora(){
            Calendar c = Calendar.getInstance();
            Date data = c.getTime();
            DateFormat f = DateFormat.getTimeInstance();
            return f.format(data);
        }

        @Override
        public void notifyObservers(){
            super.setChanged();
            super.notifyObservers();
        }

        public String getHoras(){
            return this.horas;
        }

        @Override
        public void run(){
            while(true){
                horas = hora();
                this.notifyObservers();
            }
        }
    }
 
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.testkiller.util;

import java.awt.Dimension;

/**
 *
 * @author taraujo
 */
public class RetonaSetaCalculosCartezianos
{

    public static int  DimesionXY(String XY)
    {
        Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        screenSize.width = (screenSize.width)/3;
        screenSize.height = (screenSize.height)/3;

        if(XY.equals("largura"))
            return  screenSize.width;   
        if(XY.equals("altura"))
            return  screenSize.height;

        return 0;

    }
}

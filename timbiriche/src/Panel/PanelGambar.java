/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panel;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author tonyo
 */
public class PanelGambar extends JPanel{
    
    
    
    Image gambar;
    int asies;
    public PanelGambar(int i ){
     
     if(i==0){
gambar = new ImageIcon(getClass( ).getResource("/Imagenes/TIMBIRICHEINICIOEXACTIMAGEYESSIR.png")).getImage( );
     }
     if(i==1){//Para Sala de Espera, jugador 1
      
gambar = new ImageIcon(getClass( ).getResource("/Imagenes/gameAvatar1(2).png")).getImage( );

     }
if(i==2){//Para Sala de Espera, Jugador 2
    gambar = new ImageIcon(getClass( ).getResource("/Imagenes/xboxAvatarBeanieNUVO.png")).getImage( );
}
if(i==10){
  gambar = new ImageIcon(getClass( ).getResource("/Imagenes/Connect the dots.png")).getImage( );  
}
    }
    
@Override
protected void paintComponent(Graphics g) {
   
super.paintComponent(g);
Graphics2D gd = (Graphics2D)g.create( );
gd.drawImage(gambar, 0, 0, getWidth( ),getHeight( ),null);
gd.dispose( );
 
    
    
    
}
}


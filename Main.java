import java.util.*;
import javax.swing.JFrame;


public class Main {
    public static void main(String[] args) {
      
      
   JFrame window= new JFrame("TETRIS GAME");
   window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   window.setResizable(true);
   
   // adding the gamePanel to the (the game window)
   
   gamePanel gameP= new gamePanel();
  window.add(gameP);
   window.pack();
   
   
   
   window.setLocationRelativeTo(null);
   window.setVisible(true);
   
      
      
  }
}
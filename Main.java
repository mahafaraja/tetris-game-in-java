import java.util.*;
import javax.swing.Jframe;

public class Main {
    public static void main(String[] args) {
      
      
   Jframe window= new Jframe("TETRIS GAME");
   window.setDefaulCloseOpreration(Jframe.EXIT_ON_CLOSE);
   window.setResizable(false);
   
   // adding the gamePanel to the (the game window)
   
   gamePanel gameP= new gamePanel();
  window.add(gameP);
   window.pack();
   
   
   
   window.setLocaltionRelativeTo(null);
   window.setVisible(true);
   
      
      
  }
}
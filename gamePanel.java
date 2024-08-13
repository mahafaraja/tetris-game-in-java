
import javax.swing.JPanel;
import java.awt.*;

public class gamePanel extends JPanel {

    public static final int width=1200;
    public static final int height=600;

    public gamePanel(){
        this.setPreferredSize(new Dimension(width,height));
        this.setBackground(Color.black);
        this.setLayout(null);
    

    }

}
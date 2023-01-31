import javax.swing.JFrame;

public class GameFrame extends JFrame{

	GameFrame(){
		
        //adding game panel to JFrame
		this.add(new GamePanel());
        
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
	}
}
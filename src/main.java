
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		login init = new login();
		while (!init.auth) {
			init.frame.setVisible(true);
			
		}
		Maint main = new Maint();
		init.frame.setVisible(false);
		main.frame.setVisible(true);
		init.frame.dispose();
		
	}

}

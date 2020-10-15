
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		login init = new login();
		while (!init.auth) {
			init.frmInicioDeSesin.setVisible(true);
			
		}
		Maint main = new Maint();
		init.frmInicioDeSesin.setVisible(false);
		main.frame.setVisible(true);
		init.frmInicioDeSesin.dispose();
		
	}

}

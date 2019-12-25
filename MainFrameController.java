package shuaige;

public class MainFrameController extends AbstractMainFrame{

	@Override
	public void showAdminDialog() {
		new AdminDialogController(this,true).setVisible(true);
	}

}

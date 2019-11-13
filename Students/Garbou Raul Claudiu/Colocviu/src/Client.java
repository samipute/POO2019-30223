import java.sql.*;

public class Client extends Persoana {
	int numarCamera;
	Date check_in;
	Date check_out;

	public int getNumarCamera() {
		return numarCamera;
	}

	public void setNumarCamera(int numarCamera) {
		this.numarCamera = numarCamera;
	}

	public Date getCheck_in() {
		return check_in;
	}

	public void setCheck_in(Date check_in) {
		this.check_in = check_in;
	}

	public Date getcheck_out() {
		return check_out;
	}

	public void setcheck_out(Date check_out) {
		this.check_out = check_out;
	}
}

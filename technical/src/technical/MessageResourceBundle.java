package technical;

import java.util.ResourceBundle;

public class MessageResourceBundle {
	ResourceBundle rb;

	public MessageResourceBundle() {
		rb = ResourceBundle.getBundle("message");
	}

	public String getValue(String key) {
		return rb.getString(key);
	}
}

package qa_session;

public class Pen {
	private String type;
	private String inkColor;
	private int amountInk;
	
	public Pen(String type, String inkColor, int amountInk) {
		this.type = type;
		this.inkColor = inkColor;
		this.amountInk = amountInk;
	}
	
	public String getType() {
		return this.type;
	}
	
	public String getInkColor() {
		return this.inkColor;
	}
	
	public int amountInk() {
		return this.amountInk;
	}
}
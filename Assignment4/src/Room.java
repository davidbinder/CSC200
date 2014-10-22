
public class Room {
	private String wallColor;
	private String floorType;
	private int windowCount;
	
	
	public Room(){
		wallColor = "Yellow";
		floorType = "Hard Wood";
		windowCount = 1;
	}
	public Room(String color, String floor, int windows){
		wallColor = color;
		floorType = floor;
		windowCount = windows;
	}
	public String toString(){
		return (wallColor + " walls\n" + floorType + " floor\n" + windowCount + " windows\n\n");
	}
	public String getWallColor(){
		return wallColor;
	}
	public String getFloorType(){
		return floorType;
	}
	public int getWindowCount(){
		return windowCount;
	}
	public void setWallColor(String color){
		wallColor = color;
	}
	public void setFloorType(String a){
		floorType = a;
	}
	public void setWindowCount(int a){
		windowCount = a;
	}

}

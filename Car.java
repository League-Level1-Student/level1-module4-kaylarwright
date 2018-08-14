


public class Car {
	String c = "color";
	String t = "type";

void setColor(String c) {
	this.c = c;
}
void setType(String t) {
	this.t = t;
}
String getColor() {
	return this.c;
}
String getType() {
	return this.t;
}
public String toString() {
	return "You have a " + c + " " + t + " car";
}
}

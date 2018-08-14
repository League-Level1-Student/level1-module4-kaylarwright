package extra;

import Car;

public class CarRunner {
public static void main(String[] args) {
	Car w = new Car();
	Car a = new Car();
	Car r = new Car();
w.setColor("white");
a.setColor("red");
r.setColor("blue");
w.setType("Chevrolet");
a.setType("Corvette");
r.setType("Toyata");
System.out.println(w.toString());
System.out.println(a.toString());
System.out.println(r.toString());
}
}

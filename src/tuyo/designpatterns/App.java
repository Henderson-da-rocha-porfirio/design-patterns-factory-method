package tuyo.designpatterns;

import tuyo.designpatterns.gui.Window;
import tuyo.designpatterns.shape.Shape;
import tuyo.designpatterns.shape.ShapeFactory;


public class App {

	public static void main(String[] args) {

		Window w = new Window("Shapes", 300, 300);
		w.show();
		
		Shape shape = ShapeFactory.newShape(); // Classe app deixa de referenciar um shape específico. E referencia apenas a super-classe Shape.
												// A dependência foi eliminada.
		
		w.drawShape(shape);
	}
}

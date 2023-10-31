import processing.core.PApplet;

public class App extends PApplet {

    public static void main(String[] args) {
        PApplet.main("App");
    }

    public void settings() {
        size(500, 500);
    }

    public void setup() {
        background(0);
    }

    public void draw() {
        stroke(255);
        if (mousePressed) {
            line(mouseX, mouseY, pmouseX, pmouseY);
        }
    }
}
import processing.core.PApplet;

public class App extends PApplet {
    int penColor = 255;
    int penThickness = 1;

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
        stroke(penColor);
        strokeWeight(penThickness); 
        if (mousePressed) {
            line(mouseX, mouseY, pmouseX, pmouseY);
        }
    }

    public void keyPressed() {
        if (key == 'c' || key == 'C') {
            background(0);
        } else if (key == 'q' || key == 'Q') {
            exit();
        } else if (key == 'y' || key == 'Y') {
            penColor = color(255, 255, 0);
        } else if (key == 'r' || key == 'R') {
            penColor = color(255, 0, 0);
        } else if (key == 'b' || key == 'B') {
            penColor = color(0, 0, 255);
        } else if (key == 'g' || key == 'G') {
            penColor = color(0, 128, 0);
        } else if (key == '+') {
            penThickness += 1.0; 
        } else if (key == '-') {
            penThickness = max(1, penThickness - 1); 
        }
    }
}

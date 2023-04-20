package Lab1.src.lab4.Task8;

import java.awt.*;

public class Label {
    private String text;
    private double x;
    private double y;
    private Font font;
    private Color color;

    public Label(String text, double x, double y, Font font, Color color) {
        this.text = text;
        this.x = x;
        this.y = y;
        this.font = font;
        this.color = color;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return this.x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return this.y;
    }

    public void setFont(Font font) {
        this.font = font;
    }

    public Font getFont() {
        return this.font;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }

    public void draw(Graphics g) {
        g.setColor(this.color);
        g.setFont(this.font);
        g.drawString(this.text, (int) this.x, (int) this.y);
    }
}


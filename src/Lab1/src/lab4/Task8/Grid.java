package Lab1.src.lab4.Task8;

import java.awt.*;

public class Grid {
    private Color color;
    private int thickness;
    private int xSpacing;
    private int ySpacing;

    public Grid(Color color, int thickness, int xSpacing, int ySpacing) {
        this.color = color;
        this.thickness = thickness;
        this.xSpacing = xSpacing;
        this.ySpacing = ySpacing;
    }

    public void draw(Graphics2D g2d, int width, int height) {
        g2d.setColor(color);
        g2d.setStroke(new BasicStroke(thickness));

        // Draw vertical lines
        for (int x = xSpacing; x < width; x += xSpacing) {
            g2d.drawLine(x, 0, x, height);
        }

        // Draw horizontal lines
        for (int y = ySpacing; y < height; y += ySpacing) {
            g2d.drawLine(0, y, width, y);
        }
    }

    // Getters and setters
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getThickness() {
        return thickness;
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }

    public int getXSpacing() {
        return xSpacing;
    }

    public void setXSpacing(int xSpacing) {
        this.xSpacing = xSpacing;
    }

    public int getYSpacing() {
        return ySpacing;
    }

    public void setYSpacing(int ySpacing) {
        this.ySpacing = ySpacing;
    }
}


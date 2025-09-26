package Assignment2;



public class Paint {
    protected int x, y;

    public Paint() {
        this.x = 0;
        this.y = 0;
    }

    public Paint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void display() {
        System.out.println("Paint coordinate: " + x + " " + y);
    }

    public static class ColorPaint extends Paint {
        private String color;

        public ColorPaint(int x, int y, String color) {
            super(x, y);
            this.color = color;
        }

       
        public void display() {
            System.out.println("Color paint coordinate: " + x + ", " + y + " Color: " + color);
        }
    }

    
    public static class Paint3D extends Paint {
        private int z;

        public Paint3D(int x, int y, int z) {
            super(x, y);
            this.z = z;
        }

     
        public void display() {
            System.out.println("Paint 3D coordinate: " + x + ", " + y + ", " + z);
        }
    }

    public static void main(String[] args) {
        Paint p = new Paint(7, 14);
        p.display();

        ColorPaint cp = new ColorPaint(7, 14, "blue");
        cp.display();

        Paint3D p3D = new Paint3D(2, 4, 6);
        p3D.display();
    }
}



    class Cylinder{
        private int radius;
        private int height;

        public int getRadius() {

            return radius;
        }

        public void setRadius(int radius) {
            this.radius = radius;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }
        public double surfaceArea(){
            double v = 2 * Math.PI * radius * radius * height;
            return v;
        }

public static class pvtcylinder{

        public static void main(String[] args) {
            Cylinder area = new Cylinder();
            area.setHeight(22);
            area.setRadius(20);
            System.out.println(area.getRadius());
            System.out.println(area.getHeight());
            System.out.println(area.surfaceArea());


        }
    }
}

package codewars;

//https://www.codewars.com/kata/playing-with-cubes-i/train/java
public class Task14 {
    public class Block {
        int width, length, height, surfaceArea, volume;

        Block(int[] block) {
            width = block[0];
            length = block[1];
            height = block[2];
            volume = width * length * height;
            surfaceArea = 2 * (length * height) + 2 * (length * width) + 2 * (width * height);
        }

        public int getWidth() {
            return width;
        }

        public int getLength() {
            return length;
        }

        public int getHeight() {
            return height;
        }

        public int getVolume() {
            return volume;
        }

        public int getSurfaceArea() {
            return surfaceArea;
        }
    }
}

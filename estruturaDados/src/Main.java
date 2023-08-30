public class Main {
    public static void main(String[] args) {

        FloodFill novo = new FloodFill();

        int[][] image = {
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1, 1, 1, 1, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 0, 1, 1},
                {1, 1, 1, 1, 1, 1, 0, 1, 1, 1},
                {1, 1, 1, 1, 1, 0, 1, 1, 1, 1},
                {1, 1, 1, 1, 0, 1, 1, 1, 1, 1},
                {1, 1, 1, 0, 1, 1, 1, 1, 1, 1},
                {1, 1, 0, 1, 1, 1, 1, 1, 1, 1},
                {1, 0, 1, 1, 1, 1, 1, 1, 1, 1},
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        };

        int modifiedX = 1; // Linha do valor modificado.
        int modificaY = 1; // Coluna do valor modificado.
        int newColor = 2; // Nova cor para aplicar.

        novo.floodFill(image, modifiedX, modificaY, newColor); // Executa o Flood Fill.
//
//        for (int i = 0; i < modifiedX; i++) {
//            for (int j = 0; j <= modificaY; j++) {
//                FloodFill.floodFill(image, i, j, newColor);
//            }
//        }

        FloodFill.printImage(image); // Imprime a matriz final.
    }
}
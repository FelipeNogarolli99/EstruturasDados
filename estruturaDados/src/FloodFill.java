public class FloodFill {

    public static void floodFill(int[][] image, int x, int y, int newColor) {
        int targetColor = image[x][y];
        int rows = image.length; // n linha
        int cols = image[0].length; // n couna

        if (targetColor == newColor) {
            // Nada a fazer se a nova cor for igual à cor de destino.
            return;
        }

        StaticStack<int[]> pilha = new StaticStack<>(rows * cols);
        pilha.add(new int[]{x, y});

        // aqui preenche os "quadrados"
        while (!pilha.isEmpty()) {
            int[] coords = pilha.remove();
            int linha = coords[0];
            int col = coords[1];

            // verifica se está dentro dos paramentros da matriz
            if (linha < 0 || linha >= rows || col < 0 || col >= cols || image[linha][col] != targetColor) {
                continue;

            }

            image[linha][col] = newColor;

            // add na pilha dos "quadrados"
            pilha.add(new int[]{linha - 1, col});
            pilha.add(new int[]{linha + 1, col});
            pilha.add(new int[]{linha, col - 1});
            pilha.add(new int[]{linha, col + 1});
        }
    }

//        Fila<int[]> fila = new Fila<>(rows * cols);
//        fila.add(new int[]{x, y});
//
//        while (!fila.isEmpty()) {
//            if (fila.isEmpty()) {
//                int[] coords = fila.remove(); // Pega as coordenadas do topo da fila, remove o primeiro elemento da fila.
//                int linha = coords[0];
//                int col = coords[1];
//
//                if (linha < 0 || linha >= rows || col < 0 || col >= cols || image[linha][col] != targetColor) {
//                    continue;
//                }
//
//                image[linha][col] = newColor;
//
//                fila.add(new int[]{linha - 1, col});
//                fila.add(new int[]{linha + 1, col});
//                fila.add(new int[]{linha, col - 1});
//                fila.add(new int[]{linha, col + 1});
//            }
//        }
//    }

    // função para imprimir matriz
    public static void printImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                System.out.print(image[i][j] + " "); // Imprime o valor do pixel
            }
            System.out.println(); // Pula para a próxima linha após cada linha da matriz
        }
    }
}
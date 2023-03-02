public class Matrice {

    int[][] matrice;
    int column;
    int row;

    public Matrice() {
        column = 0;
        row = 0;
        matrice = new int[column][row];
    }

    public Matrice(int Column, int row) {
        this.column = Column;
        this.row = row;
        matrice = new int[Column][row];
    }

    public void setMatrice(int[][] matrice) {
        this.matrice = matrice;
    }

    public int[][] getMatrice() {
        return matrice;
    }

    public void setM(int Column) {
        this.Column = Column;
    }

    public int getM() {
        return Column;
    }

    public void setN(int row) {
        this.row = row;
    }

    public int getN() {
        return row;
    }

    public void affiche() {
        for (int i = 0; i < Column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void remplir() {
        for (int i = 0; i < Column; i++) {
            for (int j = 0; j < row; j++) {
                matrice[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public void Add(Matrice m) {
        if (Column == m.getM() && row == m.getN()) {
            for (int i = 0; i < Column; i++) {
                for (int j = 0; j < row; j++) {
                    matrice[i][j] += m.getMatrice()[i][j];
                }
            }
        }
    }

    public void Sub(Matrice m) {
        if (Column == m.getM() && row == m.getN()) {
            for (int i = 0; i < Column; i++) {
                for (int j = 0; j < row; j++) {
                    matrice[i][j] -= m.getMatrice()[i][j];
                }
            }
        }
    }

    public void Mul(Matrice m) {
        if (row == m.getM()) {
            int[][] matrice2 = new int[Column][m.getN()];
            for (int i = 0; i < Column; i++) {
                for (int j = 0; j < m.getN(); j++) {
                    for (int k = 0; k < row; k++) {
                        matrice2[i][j] += matrice[i][k] * m.getMatrice()[k][j];
                    }
                }
            }
            matrice = matrice2;
            row = m.getN();
        }
    }

}

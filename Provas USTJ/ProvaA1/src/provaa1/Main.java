package provaa1;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        
        double altura1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da figura 1:"));
        double largura1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura da figura 1:"));
        double altura2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da figura 2:"));
        double largura2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura da figura 2:"));

        // Criar as figuras
        Figura figura1 = new Figura(altura1, largura1);
        Figura figura2 = new Figura(altura2, largura2);

        // Receber 50 valores de aumento de altura e largura
        for (int i = 0; i < 50; i++) {
            double aumentoAltura = Double.parseDouble(JOptionPane.showInputDialog("Digite o aumento de altura da figura 1:"));
            double aumentoLargura = Double.parseDouble(JOptionPane.showInputDialog("Digite o aumento de largura da figura 2:"));
            figura1.aumentaAltura(aumentoAltura);
            figura2.aumentaLagura(aumentoLargura);
        }

        // Comparar áreas e mostrar dados da figura com maior área
        double area1 = figura1.calcularArea();
        double area2 = figura2.calcularArea();

        if (area1 > area2) {
            System.out.println("Figura 1 tem maior área:");
            figura1.mostrar();
        } else if (area2 > area1) {
            System.out.println("Figura 2 tem maior área:");
            figura2.mostrar();
        } else {
            System.out.println("As figuras têm a mesma área.");
        }
    }
  }


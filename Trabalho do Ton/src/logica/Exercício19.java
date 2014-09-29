package logica;

import javax.swing.JOptionPane;

public class Exercício19 {
	

    public static void main(String[] Args)
    {
        String nomes[] = new String[10];
        String nomeSolic;

        for (int i = 0; i < 10; i++)
        {
            nomes[i] = JOptionPane.showInputDialog("Informe um nome");
        }
        nomeSolic = JOptionPane.showInputDialog("Informe um nome que deseja pesquisar");
        for (int i = 0; i < 10; i++)
        {
            if (nomeSolic.equals(nomes[i]))
            {
                JOptionPane.showMessageDialog(null,"Existe");

            }
        }
        JOptionPane.showMessageDialog(null,"Não existe");

    }

}

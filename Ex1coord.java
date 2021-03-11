import javax.swing.JOptionPane;
public class Ex1coord{
    public static void main (String [] args){
        double x,y;
        do{
            x = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a coordenada de X:"));
            y = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a coordenada de Y:"));
            if(x==0 && y == 0){ JOptionPane.showMessageDialog(null, "Sua coordenada representa a origem");}
            else if(x>0){
                if(y<0){
                    JOptionPane.showMessageDialog(null,"Sua coordenada se encontra no Q4");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Sua coordenada se encontra no Q1");
                }
            }
            else{
                if(y<0){
                    JOptionPane.showMessageDialog(null,"Sua coordenada se encontra no Q3");
                }
                else{
                    JOptionPane.showMessageDialog(null,"Sua coordenada se encontra no Q2");
                }
            }
        }while(x!=3.2 && y!=4.2);
    }
}
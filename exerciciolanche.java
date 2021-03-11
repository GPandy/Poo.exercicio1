import javax.swing.JOptionPane;
public class exerciciolanche{
    public static void main(String[] args) {
        double produto,quant,dinero=0;
        JOptionPane.showMessageDialog(null, "1 Cachorro Quente R$4.00\n2 X-Salada R$4.50\n3 X-Bacon R$5.00\n4 Torrada Simples R$2.00\n5 Refrigerante R$1.50");
        produto= Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o codigo do produto:"));
        quant= Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a quantidade de produtos:"));
        if(produto==1){
            dinero=4.00*quant;
        }
        else if(produto==2){
            dinero=4.50*quant;
        }
        else if(produto==3){
            dinero=5.00*quant;
        }
        else if(produto==4){
            dinero=2.00*quant;
        }
        else if(produto==5){
            dinero=1.50*quant;
        }
        JOptionPane.showMessageDialog(null, "O total a pagar é de: "+dinero); 
    }
}
import javax.swing.JOptionPane;

public class buttons {

	
	void bháskara() {
		double a=Integer.parseInt(JOptionPane.showInputDialog("A"));
		double b=Integer.parseInt(JOptionPane.showInputDialog("B"));
		double c=Integer.parseInt(JOptionPane.showInputDialog("C"));
		
		double f=0;
		
		double d;
		double x1;
		double x2;
		
		
		d=(b*b)-4*a*c;
		for (double i=0;i<=d;i++) {
			if (i*i==d) {f=i;}
		}
		
		if (d<=0) {JOptionPane.showMessageDialog(null, "Como o (Delta) e negativo, logo nao temos raizes reais.");}	
		else {
		x1=(-(b) + (f)) / (2*a); 
		x2=(-(b) - (f)) / (2*a);
		
		JOptionPane.showMessageDialog(null, "Valor de x1: " + x1 + "\n" + "Valor de x2: " + x2);}
	}
	
	void regra() {
		double a,b,c,x,x1;
		JOptionPane.showMessageDialog(null,"Digite os valores da regra de três para encontrar o valor de 'X'");
		a= Double.parseDouble(JOptionPane.showInputDialog("A"));
		b=Double.parseDouble(JOptionPane.showInputDialog("B"));
		c=Double.parseDouble(JOptionPane.showInputDialog("C"));
			x=(b*a)/c;
			x1=(b*c)/a;
			JOptionPane.showMessageDialog(null,"O valor inversamente proporcional é: "+x+"\n"+"\n"+"O valor diretamente proporcional é: "+x1);
		
	
	}
}

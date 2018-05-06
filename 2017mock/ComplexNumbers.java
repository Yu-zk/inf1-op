import java.util.Arrays;

public class ComplexNumbers {
	public static double[] complexAdd(double[] z1, double[] z2) {
		double[] re=new double[2];
		re[0]=z1[0]+z2[0];
		re[1]=z1[1]+z2[1];
		return re;
		
	}
	
	public static double[] complexConjugate(double[] z) {
		double re[]={z[0],-z[1]};
		return re;
	}
	public static double[] complexMultiply(double[] z1, double[] z2) {
		double[] re=new double[2];
		re[0]=z1[0]*z2[0]-z1[1]*z2[1];
		re[1]=z1[1]*z2[0]+z1[0]*z2[1];
		return re;
	}
	public static double[] complexReciprocal(double[] z) {
		double[] re=new double[2];
		if (z[0]*z[0]+z[1]*z[1]==0) {
			re[0]=0;
			re[1]=0;
			return re;
		}
		re[0]=z[0]/(z[0]*z[0]+z[1]*z[1]);
		re[1]=-z[1]/(z[0]*z[0]+z[1]*z[1]);
		return re;
	}
	public static String toString(double[] z) {
		String s="";
		if (z[0]!=0) {
			s=s+String.format("%.1f", z[0]);
			if (z[1]<0) s=s+String.format("%.1fi", z[1]);
			if (z[1]>0) s=s+String.format("+%.1fi", z[1]);
		}else {
			if (z[1]==0) s="0.0";
			else s=s+String.format("%.1fi", z[1]);
		}
		return s;
	}
	
	public static double[][] sortByMagnitude(double[][] complexList){
		double[][] m=new double[complexList.length ][3];
		double[] t=new double[3];
		for (int i=0;i<complexList.length ;i++) {
			m[i][0]=complexList[i][0];
			m[i][1]=complexList[i][1];
			m[i][2]=Math.sqrt(complexList[i][0]*complexList[i][0]+
					complexList[i][1]*complexList[i][1]);
		}
		for (int i=0;i<m.length ;i++) {
			for (int j=0;j<m.length-1;j++) {
				if (m[j][2]>m[j+1][2]) {
					t[0]=m[j][0];
					t[1]=m[j][1];
					t[2]=m[j][2];
					m[j][0]=m[j+1][0];
					m[j][1]=m[j+1][1];
					m[j][2]=m[j+1][2];
					m[j+1][0]=t[0];
					m[j+1][1]=t[1];
					m[j+1][2]=t[2];
					
				}
			}
		}
		for (int i=0;i<complexList.length ;i++) {
			complexList[i][0]=m[i][0];
			complexList[i][1]=m[i][1];
		}
		return complexList;
	}

	public static void main(String[] args) {
		double[] z1= {0,0};
		double[] z2= {0,0};
		if (args.length==4) {
			z1[0]=Double.parseDouble(args[0]);
			z1[1]=Double.parseDouble(args[1]);
			z2[0]=Double.parseDouble(args[2]);
			z2[1]=Double.parseDouble(args[3]);
		}
		System.out.println("("+toString(complexAdd( z1, z2)    )+")");
		System.out.println("("+toString(complexConjugate( z1)    )+")");
		System.out.println("("+toString(complexMultiply(z1,  z2)    )+")");
		System.out.println("("+toString(complexReciprocal( z1)     )+")");
		System.out.println("("+toString(complexConjugate( complexAdd( z1, z2))    )+")");
	}
	
	

}

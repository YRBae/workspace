package chapter2;

public class exex {
	public static void main(String[] args){
		int[][] a = {{1,2},{1,2,3}};
		int i, j;
		for(i=0; i<a.length; i++)
			for(j=0; j<a[i].length; j++)
				System.out.println(a[i][j]);
		System.out.println();
	}
}

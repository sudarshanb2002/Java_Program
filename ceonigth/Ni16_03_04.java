package ceonigth;
import java.util.*;
class matrix{
	int n=0;
	int m=0;
	int ar[][]=new int[this.n][this.m];
	public  void  get_the_number_of_rows() {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER ROW");
		this.n=sc.nextInt();
	}
	public void  get_the_number_of_columns(){
		Scanner scc=new Scanner(System.in);
		System.out.println("ENTER COLUMN");
		this.m=scc.nextInt();
	}
	public void set_the_elements_of_the_matrix_at_given_position(){
		Scanner sd=new Scanner(System.in);
		int i=this.n;
		int j=this.m;
	    ar=new int[this.n][this.m];
		for(int a=0;a<this.n;a++) {
			for(int b=0;b<this.m;b++) {
				ar[a][b]=sd.nextInt();
			}
		}
	}
	public void adding_two_matrices(){
		for(int a=0;a<this.n;a++) {
			for(int b=0;b<this.m;b++) {
				System.out.print(ar[a][b]+ar[a][b]);
			}
			System.out.println();
			}
	}
	public void  multiplying() {
		int arrr[][]=new int [this.n][this.m];
		for(int a=0;a<this.n;a++) {
			for(int b=0;b<this.m;b++) {
				arrr[a][b]=0;
				for(int c=0;c<this.n;c++) {
					arrr[a][b]+=ar[a][c]*ar[c][b];
					}
				}
			}
		for(int a=0;a<this.n;a++) {
			for(int b=0;b<this.m;b++) {
			System.out.print(arrr[a][b]);
			}System.out.println();}
	}
}
public class Ni16_03_04 {
	public static void main(String[] args) {
		matrix mat=new matrix();
		Scanner n=new Scanner(System.in);
		mat.get_the_number_of_rows();
		mat.get_the_number_of_columns();
		mat.set_the_elements_of_the_matrix_at_given_position();
		mat.adding_two_matrices();
		mat.multiplying();
	}

}

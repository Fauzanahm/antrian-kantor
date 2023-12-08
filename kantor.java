package projectUAS_ASD_kantor;

import java.util.Scanner;

public class kantor {
    int Nim;
	String nama,keperluan;
	kantor next;
	static Scanner in = new Scanner(System.in);
	static Scanner syhb = new Scanner(System.in);
	public void input(){

		/*menginput data */
        System.out.println("\nSilahkan isi data berikut : ");

		System.out.print("Masukkan Nim       : ");
		Nim = in.nextInt();
		System.out.print("Masukkan nama      : ");
		nama = syhb.nextLine();
		System.out.print("Masukkan keperluan : ");
		keperluan = syhb.nextLine();
		next = null;
	}
	public void read(){
		System.out.println("||   " +Nim+ "  ||  " +nama+ "   ||   " +keperluan+ "     ||");
		
	}
	public static void main(String[] args){
		int menu = 0;
		linked que = new linked();
		while(menu!= 4){
		System.out.println("\n================================");
		System.out.println(" Selamat datang Di kantor Ebs");
		System.out.println("================================");
		System.out.println("\nPilih Menu   : ");
			System.out.print("\n1.Isi Data   :\n2.Next       :\n3.Lihat Data :\n4.Keluar\n\nPilih : ");
			
	/*proses pada pilihan menu */
			menu = in.nextInt();
			if(menu==1)que.enque();
			else if(menu==2)que.deque();
			else if(menu==3)que.view();
			else if(menu==4)System.out.println("- keluar -");
			else System.out.println("- Eror -");
			System.out.println("");
		}
	}
}
class linked{
	/*mahasiswa */
	kantor head,tail;
	public linked(){

		head=null;
		tail=null;
	}
	
	public void enque(){
		kantor baru=new kantor();
		baru.input();
		if(head==null)head=baru;
		else tail.next=baru;
		tail=baru;
	}
	public void deque(){
		if(head==null)System.out.println("- Kosong -");
		else{
			System.out.println("Mahasiswa dengan NIM : "+head.Nim+" Telah selesai,Silahkan Keluar !!!");
			System.out.println(" Terimakasih telah berkunjung");
			head=head.next;
		}
	}
	public void view(){
		if(head==null)System.out.println("- Data Kosong -");

		else{
			System.out.println("\n=======================================");
			System.out.println("||   NIM    ||  Nama  || Keperluan  || ");
			System.out.println("=======================================");
			for(kantor a=head; a!=null; a=a.next) a.read();
		}
	}
}
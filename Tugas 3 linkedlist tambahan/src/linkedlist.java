import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) throws Exception {

        //Membuat variabel linkedlist
        LinkedList <Integer> nim = new LinkedList<>();
        LinkedList <String> nama = new LinkedList<>(); 
        LinkedList <String> alamat = new LinkedList<>();

        nim.add(2111522015);
        nama.add("Muhammad Dzaky Dinnul Haq");
        alamat.add("Pariaman");
        System.out.println("NO Bp (NIM) \t= "+nim);
        System.out.println("Nama Mahasiswa \t= "+nama);
        System.out.println("Alamat \t\t= "+alamat);

        //add
           System.out.println("\n-- ADD --");
           nim.addFirst(211152201);
           nim.addLast(2111522019);
           nim.add(211152203);
           nim.add(211152209);
   
           nama.addFirst("Ahmad");
           nama.addLast("Siska");
           nama.add("Raihan");
           nama.add("Caca");
   
           alamat.addFirst("Jakarta");
           alamat.addLast("Agam");
           alamat.add("Payakumbuh");
           alamat.add("Tanah Datar");
   
           System.out.println("No Bp \t\t= "+nim+"\t Size = "+nim.size());
           System.out.println("Nama Mahasiswa \t= "+nama+"\t Size = "+nim.size());
           System.out.println("Alamat \t\t= "+alamat+"\t\t Size = "+nim.size());
   
        //set
            System.out.println("\n-- SET --");
            nama.set(1,"Putra");
            nama.set(4,"Humaira");
            alamat.set(1,"Solok");
            alamat.set(4,"Riau");

            System.out.println("No Bp \t\t= "+nim+"\t Size = "+nim.size());
            System.out.println("Nama Mahasiswa \t= "+nama+"\t\t\t Size = "+nim.size());
            System.out.println("Alamat \t\t= "+alamat+"\t\t\t Size = "+nim.size());

        //remove
            System.out.println("\n-- REMOVE --");

            nim.remove(3);
            nama.remove(3);
            alamat.remove(3);

            System.out.println("No Bp \t\t= "+nim+"\t Size = "+nim.size());
            System.out.println("Nama Mahasiswa \t= "+nama+"\t\t\t Size = "+nim.size());
            System.out.println("Alamat \t\t= "+alamat+"\t\t\t\t Size = "+nim.size());

        //pop
            System.out.println("\n-- POP --");
            nim.pop();
            nama.pop();
            alamat.pop();
            System.out.println("No Bp \t\t= "+nim+"\t Size = "+nim.size());
            System.out.println("Nama Mahasiswa \t= "+nama+"\t\t Size = "+nim.size());
            System.out.println("Alamat \t\t= "+alamat+"\t\t\t Size = "+nim.size());

        //push
            System.out.println("\n-- PUSH --");
            nim.push(2111522012);   
            nama.push("Wahyu");
            alamat.push("Jambi");

            System.out.println("No Bp \t\t= "+nim+"\t Size = "+nim.size());
            System.out.println("Nama Mahasiswa \t= "+nama+"\t\t\t Size = "+nim.size());
            System.out.println("Alamat \t\t= "+alamat+"\t\t\t\t Size = "+nim.size());

        //get
            System.out.println("\n-- GET --");
            //mencari mahasiswa pertama
            System.out.println("Nama Mahasiswa Pertama          :\t" +nama.getFirst());
            System.out.println("Nomor Induk Mahasiswa Pertama   :\t" +nim.getFirst());
            System.out.println("Alamat Mahasiswa Pertama        :\t" +alamat.getFirst());
            System.out.println("");

            //mencari mahasiswa terakhir
            System.out.println("Nama Mahasiswa Terakhir         :\t" +nama.getLast());
            System.out.println("Nomor Induk Mahasiswa Terakhir  :\t" +nim.getLast());
            System.out.println("Alamat Mahasiswa Terakhir       :\t" +alamat.getLast());
            System.out.println("");

        //isEmpty()
            System.out.println("\n-- isEmpty --");

            System.out.println("Apakah data nim ada yang kosong?\t"+nim.isEmpty());
            System.out.println("Apakah data nama ada yang kosong?\t"+nama.isEmpty());
            System.out.println("Apakah data alamat ada yang kosong?\t"+alamat.isEmpty());

        //indexof
            System.out.println("\n-- indexof --");

            System.out.println("NIM 2111522019 pada index ke = \t"+nim.indexOf(2111522019));
            System.out.println("Nama Siska pada index ke     = \t"+nama.indexOf("Siska"));
            System.out.println("Alamat Agam pada index ke    = \t"+alamat.indexOf("Agam"));
        
    }
}

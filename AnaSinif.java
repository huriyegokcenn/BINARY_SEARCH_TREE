package BİNARY_SEARCH_TREE;

public class AnaSinif {
    public static void main(String[]args) {
		Dugum kok=new Dugum(100);
		BST bst= new BST();
		Dugum dg=new Dugum(50);
		Dugum dg1=new Dugum(120);
		Dugum dg2=new Dugum(80);
		Dugum dg3 = new Dugum (105);
		
//		bst.ekle(kok);
//		bst.ekle(dg);
//		bst.ekle(dg1);
//		bst.ekle(dg3);
//		bst.ekle(dg2);
//		kok.OnceGezinti();
		kok.DugumEkle(dg);
		kok.DugumEkle(dg1);
		kok.DugumEkle(dg2);		
		kok.DugumEkle(dg3);
		kok.OnceGezinti();
		System.out.println("************************************");
		kok.AraGezinti();
		System.out.println("ELEMAN SİLİYORUZ");
		kok.sil(kok, 50);
    	kok.OnceGezinti();
		
		
	}

}

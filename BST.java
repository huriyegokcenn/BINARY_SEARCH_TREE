package BİNARY_SEARCH_TREE;

public class BST {
    Dugum kok;                 //ARAMA AĞACI TANIMI
	BST(){
		kok=null;
	}
	void ekle(Dugum yeni) {
		Dugum tmp=kok;
		Dugum ebeveyn =tmp;
		if(kok==null) {
			System.out.println(yeni.icerik+"kök düğüm olur");     //iteratif ekleme
			kok=yeni;
			return;
		}
		while(tmp!=null) {
			if(yeni.icerik<tmp.icerik) {
				tmp=tmp.sol;
			}else {
				tmp=tmp.sag;
			}
		}
		System.out.println("KAYDEDİLECEK YER"+ebeveyn.icerik);
		if(yeni.icerik< ebeveyn.icerik) {
			ebeveyn.sol=yeni;
		}else {
			ebeveyn.sag=yeni;
		}
	}
}

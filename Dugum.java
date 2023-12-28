package BİNARY_SEARCH_TREE;

public class Dugum {
	int icerik;
	Dugum sol;
	Dugum sag;
	public Dugum(int icerik) {
		this.icerik=icerik;
		sol=null;
		sag=null;
		}
	void OnceGezinti() {
		System.out.println(this.icerik);     //EBEVEYN BAŞTA YAZILDIĞI İÇİN
		if(sol!=null) 
			sol.OnceGezinti();
		if(sag!=null) 
			sag.OnceGezinti();
	}
	void AraGezinti() {
		if(sol!=null) 
			sol.OnceGezinti();
		System.out.println(this.icerik);     //EBEVEYN ORTADA YAZILDIĞI İÇİN
		if(sag!=null) 
			sag.OnceGezinti();
	}
	void SonraGezinti() {
		if(sol!=null) 
			sol.OnceGezinti();
		if(sag!=null) 
			sag.OnceGezinti();
		System.out.println(this.icerik);     //EBEVEYN SONDA YAZILDIĞI İÇİN
	}
	void ekle(int deger) {
		if (deger>this.icerik) {
			if(sag!=null)
				sag.ekle(deger);
			else
				sag=new Dugum(deger);
		}else {
			if(sol!=null)
				sol.ekle(deger);
			else
				sol=new Dugum(deger);
		}
	}
	void DugumEkle(Dugum yeni) {
		if(yeni.icerik>this.icerik) {
			if(sag!=null)
				sag.DugumEkle(yeni);
			else
				sag=yeni;
		}else {
			if(sol!=null)
				sol.DugumEkle(yeni);
			else
				sol=yeni;
		}
	}
	Dugum AgacAra(int Eleman) {
		if(icerik==Eleman) {
			return this;
		}else {
			if(icerik>Eleman)
				if (sol!=null)
					return sol.AgacAra(Eleman);
				else
					return null;
			else
				if (sag!=null)
					return sag.AgacAra(Eleman);
				else
					return null;
		}
	}
	Dugum AsgariAra() {
		if(sol==null)
			return this;
		else
			return sol.AsgariAra();
	}
	Dugum AzamiAra() {
		if(sag==null)
			return this;
		else
			return sag.AsgariAra();
	}
	
	void sil(Dugum parent, int deger) {
	    if (this.icerik != deger) {
	        if (deger > this.icerik) {
	            if (sag != null) {
	                parent = this;
	                sag.sil(parent, deger);
	            } else {
	                System.out.println("silinecek değer bulunamadı" + this.icerik);
	                return;
	            }
	        } else {
	            if (sol != null) {
	                parent = this;
	                sol.sil(parent, deger);
	            } else {
	                System.out.println("silinecek değer bulunamadı" + this.icerik);
	                return;
	            }
	        }
	    } else {
	        System.out.println("Silinecek İçerik:" + this.icerik);
	        System.out.println("Silinecek içeriğin atası:" + parent);

	        if ((sag == null) && (sol == null)) {
	            if (this.icerik > parent.icerik) {
	                parent.sag = null;
	            } else {
	                parent.sol = null;
	            }
	        } else if ((sag != null) && (sol == null)) {
	            System.out.println("SİLİNECEK DÜĞÜM TEK SAĞ ÇOCUKTUR");
	            if (this.icerik > parent.icerik) {
	                parent.sag = this.sag;
	            } else {
	                parent.sol = this.sag;
	            }
	        } else if ((sag == null) && (sol != null)) {
	            System.out.println("SİLİNECEK DÜĞÜM TEK SOL ÇOCUKTUR");
	            if (this.icerik > parent.icerik) {
	                parent.sag = this.sol;
	            } else {
	                parent.sol = this.sol;
	            }
	        } else if ((sag != null) && (sol != null)) {
	            System.out.println("SİLİNECEK DÜĞÜM İKİ ÇOCUKLUDUR");
	            int x = this.icerik;
	            this.sil(this, x);
	            this.icerik = x;
	        }
	    }
	}

}
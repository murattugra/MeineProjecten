package LebensMittelAutomat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lager {
	
List<String>no=new ArrayList(Arrays.asList("00","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15"));
List<String> urunler=new ArrayList(Arrays.asList("Negro","Tutku","Biskrem","Krovasan","Cizi","Albeni","Burcak",
		 									"Kraker","Sakiz","Cocacola","Fanta","Soda","IceTee","MeyveSuyu","Su"));
	
List<Double>fiyatlar=new ArrayList(Arrays.asList(1.20,1.40,1.60,1.0,0.90,0.80,1.50,0.50,
													0.50,1.20,1.20,1.00,1.10,0.90,0.50));

public List<String> getUrunler() {
	return urunler;
}

public List<Double> getFiyatlar() {
	return fiyatlar;
}	
	
	
	protected static void urunList() {
	Lager obj=new Lager();
	System.out.println("***********H O S G E L D I N I Z***********");
	System.out.println("**********U R U N  L I S T E M I Z**********");
	for (int i = 0; i < obj.getUrunler().size(); i++) {
		System.out.println(obj.no.get(i)+"\t"+obj.getUrunler().get(i)+"\t\t"+obj.getFiyatlar().get(i)+" TL");
	
	}
}

	public List<String> getNo() {
		return no;
	}
	
	
}

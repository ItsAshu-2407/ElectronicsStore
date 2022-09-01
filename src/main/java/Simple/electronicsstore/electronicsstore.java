package Simple.electronicsstore;

import java.util.ArrayList;
import java.util.stream.*;

public class electronicsstore 
{
    public static void main( String[] args )
    {
    	electronicelements e1 = new electronicelements(1, "Hp Pavillion", "HP", 75000, 2018);
    	electronicelements e2 = new electronicelements(2, "DELL Inspiron", "DELL", 30000, 2019);
    	electronicelements e3 = new electronicelements(4, "Lenovo IdeaPad 3 Celeron", "Lenovo", 27000, 2020);
    	electronicelements e4 = new electronicelements(5, "ASUS TUF Gaming F15", "ASUS", 52000, 2018);
    	electronicelements e5 = new electronicelements(6, "Google Pixel 6", "Google", 50000, 2021);
    	electronicelements e6 = new electronicelements(7, "iPhone 14 Pro", "APPLE", 120000, 2022);
    	
       	ArrayList<electronicelements> li = new ArrayList<electronicelements>();
       	li.add(e6);
       	li.add(e5);
       	li.add(e4);
       	li.add(e3);
       	li.add(e2);
       	li.add(e1);
       	
       	li.stream().filter(i->i.getePrice()<=30000).forEach(i->System.out.println(i.toString()));
    }
}

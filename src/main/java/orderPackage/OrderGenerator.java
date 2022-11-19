package orderPackage;

import java.util.List;

public class OrderGenerator {

    public static Order getColorBlack(){
        return new Order(
                "Alla",
                "Alekovna",
                "Tashkent, Chehov street",
                "4",
                "+7 800 355 35 35",
                "5",
                "2020-06-06",
                "Saske, come back to Konoha",
                List.of("BLACK") );
    }
    public static Order getColorGrey(){
        return new Order(
                "Alla_2",
                "Alekovna_2",
                "Tashkent, Chehov street_2",
                "4",
                "+7 800 355 35 35",
                "5",
                "2020-06-02",
                "Saske, come back to Konoha",
                List.of("GREY") );
    }

    public static Order getColorBlackAndGrey(){
        return new Order(
                "Alla_3",
                "Alekovna_3",
                "Tashkent, Chehov street_3",
                "4",
                "+7 800 355 35 35",
                "5",
                "2020-06-03",
                "Saske, come back to Konoha_3",
                List.of("BLACK,GREY") );
    }
    public static Order getWhithoutColor(){
        return new Order(
                "Alla_4",
                "Alekovna_4",
                "Tashkent, Chehov street_4",
                "4",
                "+7 800 355 35 35",
                "5",
                "2020-06-04",
                "Saske, come back to Konoha_4",
                List.of() );
    }
}

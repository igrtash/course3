import java.text.*;

public class course3_01_2 {
    public static void main(String[] args) {
        // city
        String sCity = "Москва";
        Long iPopulation = 12000000L;
        Float fUnEmployed = 12.34F;
        System.out.printf("город %s население %d процент безработных %.2f %%", sCity, iPopulation, fUnEmployed);
        // formating decimal
        DecimalFormat formatter=new DecimalFormat();
        DecimalFormatSymbols symbols=DecimalFormatSymbols.getInstance();
        symbols.setGroupingSeparator(' '); //явно задаем символ разделителя тысяч
        formatter.setDecimalFormatSymbols(symbols);
        String sPopulation=formatter.format(iPopulation).toString();
        System.out.printf("\nгород %s | население %s | процент безработных %.2f %%", sCity, sPopulation, fUnEmployed);
        // car
        String carRegNumWords = "ТВУ";
        Short carRegNum = 555;
        Double carWeight = 1234.5679;
        System.out.printf("%nАвтомобиль госномер %s%d%s весит %.3f кг", carRegNumWords.charAt(0), carRegNum, carRegNumWords.substring(1,3), carWeight);
    }
}

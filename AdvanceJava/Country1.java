package AdvanceJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Country1 {
    public static void main(String[] args) {
        List<Country> cntry = new ArrayList<>();
        cntry.add(new Country("ABW","Aruba",78.4f));
        cntry.add(new Country("AFG","Afganistan",49.5f));
        cntry.add(new Country("AGO","Angola",80.3f));
        cntry.add(new Country("AIA","Anguilla",55.4f));
        cntry.add(new Country("ALB","Albania",68.4f));
        cntry.add(new Country("AND","Andora",78.9f));
        cntry.add(new Country("ANT","Antalitis",87.5f));
        cntry.add(new Country("ARE","United Arab Emirates",78f));

        List<Float> lifeExpect = new ArrayList<>();
        for(Country cnt: cntry){
            if(cnt.lifeExpectancy>=76){
                lifeExpect.add(cnt.lifeExpectancy);
            }

        }
        System.out.println(lifeExpect);
        List<Float> lifeExp = cntry.stream().filter(c->c.lifeExpectancy>=76).map(c->c.lifeExpectancy).collect(Collectors.toList());
        System.out.println("By stream method "+lifeExp);
        System.out.println("*************************************************************************************");
        cntry.stream().filter(c->c.lifeExpectancy>=76).forEach(c-> System.out.println(c.name));
        System.out.println("*************************************************************************************");

        Float totalLifeExp = cntry.stream().filter(c->c.lifeExpectancy>=76).map(c->c.lifeExpectancy).reduce(0.0f,Float::sum);
        System.out.println(totalLifeExp);
        System.out.println("*************************************************************************************");
        List<String> names = cntry.stream().filter(c->c.lifeExpectancy>=76).map(c->c.name).collect(Collectors.toList());
        System.out.println(names);
        System.out.println("*************************************************************************************");

        System.out.println(cntry.stream().filter(c->c.lifeExpectancy>=76).count());
        Map<String,String> lis = cntry.stream().filter(c->c.lifeExpectancy>=76).collect(Collectors.toMap(c->c.code,c->c.name));
        System.out.println(lis);
    }
}

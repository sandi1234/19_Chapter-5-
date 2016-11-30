/**
 * Created by Samson on 30-09-2016.
 */
public class Run {
    public static void main(String[] args){

        CostumArrayList<String> list3 = new CostumArrayList<>();

        list3.add("Samson");
        list3.add("Madeeha");
        list3.add("Firdaus");
        list3.add("Nour");
        list3.add("Luca");
        list3.add("Luca");


        System.out.println(list3.toString());

        list3.remove(1);

        System.out.println(list3.toString());
        System.out.println(list3.get(1));

        list3.add("Laila");
        list3.add("Laila");
        list3.add("Laila");
        System.out.println(list3.toString());

    }
}

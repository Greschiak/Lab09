import java.util.*;

public class Main {
    public static void main(String[] args) {
       zadanie1();
       zadanie2();
       zadanie3();
       zadanie4();
       zadanie5();

    }
    public static void zadanie1(){
        String name;
        final String noName ="-";
        Set<String> names = new HashSet<>();
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Podaj imie");
            name = input.next();
            if (!name.equals(noName))
                names.add(name);
        } while (!name.equals(noName));

        System.out.println("Wprowadzono: "+ names.size()+ " wartosci");

    }
    public static void zadanie2() {
        Map<String, String> pairs = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String name1, name2;
        boolean condition = true;

        while (true) {
            System.out.println("Podaj imie: ");
            name1 = input.next();
            if (name1.equals("-")) {
                break;
                //condition=false;
            }
            System.out.println("Podaj imie: ");
            name2 = input.next();
            if (name2.equals("-")) {
                break;
                //condition=false;
            }
            pairs.put(name1, name2);
        }

        System.out.println("Podaj imie partnera do sprawdzenia: ");
        name1 = input.next();
        if (pairs.containsKey(name1)) {
            System.out.println("Partnerka dla " + name1 + " to " + pairs.get(name1));
        } else {
            System.out.println("Brak partnerki dla " + name1);
        }
    }

    public static void zadanie3(){
        List<Event> events = new LinkedList<>(
                Arrays.asList(
                        new Event("Jan",12),
                        new Event("Ania",14),
                        new Event("Kacper",44),
                        new Event("Andrzej",23),
                        new Event("Kamil",45),
                        new Event("Krzysztof",90)
                )
        );
        System.out.println("Lista uczestnikow: ");
        for (Event item: events) {
            System.out.println(item.toString()+" ");

        }
        System.out.println("Lista pelnoletnich uczestnikow: ");
        for (Event item: events) {
            if(item.getWiek() >=18)
            System.out.println(item.toString()+" ");

        }
    }
    public static void zadanie4(){
        Pojazd[] pojazdy = new Pojazd[4];
        pojazdy[0] = new Pojazd("Samochód", 2020);
        pojazdy[1] = new Pojazd("Motocykl", 2018);
        pojazdy[2] = new Pojazd("Rower", 2021);
        pojazdy[3] = new Pojazd("Skuter", 2019);

        List<Pojazd> lista = new ArrayList<>(Arrays.asList(pojazdy));
        System.out.println("Lista przed usunięciem podlisty:");
        for (Pojazd pojazd : lista) {
            System.out.println(pojazd.getNazwa()+ " " +pojazd.getRokProdukcji());
        }

        List<Pojazd> podlista = new ArrayList<>(lista.subList(0,2));
        lista.removeAll(podlista);

        System.out.println("Podlista:");
        for (Pojazd pojazd : podlista) {
            System.out.println(pojazd.getNazwa() +" "+ pojazd.getRokProdukcji());
        }

        System.out.println("Lista po usunięciu podlisty:");
        for (Pojazd pojazd : lista) {
            System.out.println(pojazd.getNazwa() + " " + pojazd.getRokProdukcji());
        }
    }

    public static void zadanie5(){
        List<Integer> listaPierwsza = new ArrayList<>();
        for (int i = 0; i < 6 ; i++) {
            listaPierwsza.add(i);
        }
        List<Integer> listaDruga = new ArrayList<>();
        ListIterator<Integer> iterator = listaPierwsza.listIterator(listaPierwsza.size());
        while (iterator.hasPrevious()) {
            int element = iterator.previous();
            listaDruga.add(element);
        }

        System.out.println("Pierwsza lista: " + listaPierwsza);
        System.out.println("Druga lista: " + listaDruga);
    }




}
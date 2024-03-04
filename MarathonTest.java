public class MarathonTest {public static void main(String[] args) {
    Marathon kisiler = new Marathon();
    kisiler.addRacer(341, "Kadir");
    kisiler.addRacer(273, "Gökhan");
    kisiler.addRacer(278, "Hakan");
    kisiler.addRacer(329, "Suzan");
    kisiler.addRacer(445, "Pınar");
    kisiler.addRacer(402, "Mehmet");
    kisiler.addRacer(388, "Ali");
    kisiler.addRacer(270, "Emel");
    kisiler.addRacer(243, "Fırat");
    kisiler.addRacer(334, "James");
    kisiler.addRacer(412, "Jale");
    kisiler.addRacer(393, "Ersin");
    kisiler.addRacer(299, "Deniz");
    kisiler.addRacer(343, "Gözde");
    kisiler.addRacer(317, "Anıl");
    kisiler.addRacer(265, "Burak");

    int [] sureler = {341, 273, 278, 329, 445, 402, 388, 270, 243, 334, 412, 393, 299, 343, 317, 265};

    kisiler.ilkUc();
    System.out.println("birinci:"+kisiler.findFirst(sureler)+" "+ kisiler.isimBul(kisiler.findFirst(sureler)));
    System.out.println("ikinci:"+kisiler.findSecond(sureler)+" "+ kisiler.isimBul(kisiler.findSecond(sureler)));
    System.out.println("üçüncü:"+kisiler.findThird(sureler)+" "+ kisiler.isimBul(kisiler.findThird(sureler)));
    kisiler.abc();
}

}

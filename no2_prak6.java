//public class no2_prak6  {
//    public static void main(String[] args) {
//
//        System.out.println("=== Pesawat ===");
//        Flyer airplane = new Airplane();
//        System.out.println(airplane.takeOff());
//        System.out.println(airplane.land());
//        System.out.println(airplane.fly());
//
//        System.out.println("\n=== Burung ===");
//        Flyer bird = new Bird();
//        System.out.println(bird.takeOff());
//        System.out.println(bird.land());
//        System.out.println(bird.fly());
//        System.out.println(((Bird) bird).buildNest());
//        System.out.println(((Bird) bird).layEggs());
//
//        System.out.println("\n=== Superman ===");
//        Flyer superman = new Superman();
//        System.out.println(superman.takeOff());
//        System.out.println(superman.land());
//        System.out.println(superman.fly());
//        System.out.println(((Superman) superman).leapBuilding());
//        System.out.println(((Superman) superman).stopBullet());
//
//    }
//}
//
//interface Flyer{
//    String takeOff();
//    String land();
//    String fly();
//}
//
//class Airplane implements Flyer {
//
//    @Override
//    public String takeOff() {
//        return "+ Pesawat Lepas Landas Dari Bandara Surabaya Ke Bandara USA";
//    }
//
//    @Override
//    public String land() {
//        return "+ Pesawat Berhasil Mendarat Di Bandara USA";
//    }
//
//    @Override
//    public String fly() {
//        return "+ Pesawat Terbang Selama 5 Jam";
//    }
//}
//
//class Bird implements Flyer{
//
//    @Override
//    public String takeOff() {
//        return "+ Burung Garuda Terbang Dari Ketinggian 1000 Meter Diatas Permukaan Laut";
//    }
//
//    @Override
//    public String land() {
//        return "+ Burung Garuda Mendarat Tepat Pada Batang Pohon";
//    }
//
//    @Override
//    public String fly() {
//        return "+ Burung Garuda Terbang Selama 2 Jam";
//    }
//
//    public String buildNest() {
//        return "+ Burung Garuda Membangun Sarangnya Di Bukit";
//    }
//
//    public String layEggs() {
//        return "+ Burung Garuda Mengerami Telurnya";
//    }
//}
//
//class Superman implements Flyer {
//
//    @Override
//    public String takeOff() {
//        return "+ Batman Terbang Dengan Sangat Cepat Menuju Tempat Terjadinya kebakaran";
//    }
//
//    @Override
//    public String land() {
//        return "+ Batman Mendarat Di Tempat Terjadinya Perampokan";
//    }
//
//    @Override
//    public String fly() {
//        return "+ Batman Terbang Dengan Kecepatan 120 Km/jam";
//    }
//
//    public String leapBuilding() {
//        return "+ Batman Terbang Melewati Banyak Gedung Tinggi";
//    }
//
//    public String stopBullet() {
//        return "+ Batman Tidak Bisa Ditembak Peluru";
//    }
//}
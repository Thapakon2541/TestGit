public class Character {
    public static void main(String[] args) {
        Novice np = new Novice();
        np.setHp(1);
        np.setExp(2);
        np.setAtk(10);
        np.setLevel(1);
        System.out.println("HP:"+np.getHp());
        System.out.println("Status:"+np.getStatus());

    }
   
}

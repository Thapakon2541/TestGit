public class Novice {
    private int hp;
    private int exp;
    private int atk;
    private int level;
    private String status;
    public int getHp() {
        
        System.out.println(status);
        System.out.println(hp);
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp ;
        int tempHp = 0;
         tempHp -= hp;
        if(this.hp <= 0){
            this.hp  = 0;
            status = "Dead";
        }else{
            hp = tempHp;
            status = "Alive";
        }
    }
    public int getExp() {
        return exp;
    }
    public void setExp(int exp) {
        this.exp = exp;
        int expTemp = 0; 
        int value = 0;
        expTemp += value;
        

    }
   public int getAtk() {
       return atk;
   }
   public int getLevel() {
       return level;
   }
   public String getStatus() {
       return status;
   }
   public void setAtk(int atk) {
       this.atk = atk;
   }
   public void setLevel(int level) {
       this.level = level;
   }
   public void setStatus(String status) {
       this.status = status;
   }

}

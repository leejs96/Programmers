class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int maxHealth = health;
        int lastTime = attacks[attacks.length - 1][0];
        int contin = 0; // 연속 
        int t = bandage[0]; // 시전 시간
        int heal = bandage[1]; // 초당 회복량
        int addHealth = bandage[2]; // 추가 회복량
        int idx = 0;
        
        for(int i = 1; i <= lastTime; i++) {
            if(attacks[idx][0] == i) { // 공격시
                contin = 0;
                health -= attacks[idx++][1];
            } else { // 붕대 감기
                health += heal;
                contin++;
                
                if(contin == t) {
                    health += addHealth;
                    contin = 0;
                }
            }
            
            health = health > maxHealth ? maxHealth : health;
            
            if(health <= 0) {
                return -1;
            }
        }
        return health;
    }
}

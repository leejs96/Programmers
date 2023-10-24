class Solution {
    public long solution(String numbers) {
        long answer = 0;
        
        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] number = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        
        for(int i=0; i < 10; i++) {
            numbers = numbers.replaceAll(num[i], number[i]);
        }
        
        return answer = Long.parseLong(numbers);
    }
}

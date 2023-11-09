class Solution {
    public String solution(String phone_number) {
        int start = phone_number.length()-4;
        return "*".repeat(start) + phone_number.substring(start, phone_number.length());
    }
}

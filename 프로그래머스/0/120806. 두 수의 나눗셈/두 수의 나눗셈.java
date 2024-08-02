class Solution {
    public int solution(int num1, int num2) {
        double answer = 0;
        
        double a = (double) num1 / num2;
        answer = a * 1000;
        
        return (int) answer;
    }
}
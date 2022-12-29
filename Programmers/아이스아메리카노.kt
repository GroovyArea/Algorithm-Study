package Programmers

class 아이스아메리카노 {

    // 내 풀이 : 절차적, Java 적 풀이
    fun solution(money: Int): IntArray {
        val answer: IntArray

        if (money < 5500) {
            return intArrayOf(0, money)
        }

        val cost = 5500;
        var count = 0;
        var restMoney = money;
        
        while (true) {
            if (restMoney < 5500) {
                break;
            }
            restMoney = money - cost;


            count++;
        }

        answer = intArrayOf(count, restMoney)

        return answer
    }

    // 함수형 풀이 => 익숙해질 것.
    fun solution(money: Int) = intArrayOf(money/5500, money % 5500)
}

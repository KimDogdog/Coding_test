package Coding_test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class N_lunch_GameTest {

    N_lunch_Game m = new N_lunch_Game();

    @Test
    void solution() {
        String str = m.solution(16,16,2,1);
        System.out.print(str);
    }
}
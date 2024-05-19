package bowling3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BowlingGameTest {

   
	
    @Test
    void test1_Minimum() { 
        BowlingGame bgame = new BowlingGame("[0,0][0,0][0,0][0,0][0,0][0,0][0,0][0,0][0,0][0,0][0,0]");
        assertEquals(0,bgame.getScore());
    }
    @Test
    void test2_Maximum() { 
        BowlingGame bgame = new BowlingGame("[9,0][9,0][9,0][9,0][9,0][9,0][9,0][9,0][9,0][9,0]");
        assertEquals(90,bgame.getScore());
    }
    @Test
    void test3_openFrame() { 
        BowlingGame bgame = new BowlingGame("[1,5][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]");
        assertEquals(81,bgame.getScore());
    }

    @Test
	void test4_oneStrike() {
		BowlingGame bowlingGame = new BowlingGame("[10,0][7,3][1,2][4,6][9,0][7,2][7,3][8,2][9,1][2,0]");
		assertEquals(122, bowlingGame.getScore());
	}
	
    @Test
	void test5_multipleStrikes() {
		BowlingGame bowlingGame = new BowlingGame("[10,0][10,0][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]");
		assertEquals(112, bowlingGame.getScore());
	}
    @Test
	void test6_allStrikes() {
		BowlingGame bowlingGame = new BowlingGame("[10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,10]");
		assertEquals(300, bowlingGame.getScore());
	}
	@Test
	void test7_strikeLastFrame() {
		BowlingGame bowlingGame = new BowlingGame("[1,5][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][10,0][7,2]");
		assertEquals(92, bowlingGame.getScore());
	}
	@Test
	void test8_oneSpare() {
		BowlingGame bowlingGame = new BowlingGame("[10,0][4,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]");
		assertEquals(103, bowlingGame.getScore());
	}
	@Test
	void test9_multipleSpare() {
		BowlingGame bowlingGame = new BowlingGame("[8,2][5,5][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]");
		assertEquals(98, bowlingGame.getScore());
	}
	@Test
	void test10_allSpares() {
		BowlingGame bowlingGame = new BowlingGame("[1,9][2,8][3,7][4,6][5,5][6,4][7,3][8,2][9,1][1,9][9]");
		assertEquals(154, bowlingGame.getScore());
	}
	@Test
	void test11_maxScoreAllSparesNoStrike() {
		BowlingGame bowlingGame = new BowlingGame("[9,1][9,1][9,1][9,1][9,1][9,1][9,1][9,1][9,1][9,1][9]");
		assertEquals(190, bowlingGame.getScore());
	}
	@Test
	void test12_spareLastFrame() {
		BowlingGame bowlingGame = new BowlingGame("[1,5][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,8][7]");
		assertEquals(90, bowlingGame.getScore());
	}

    @Test
	void test13() {
		BowlingGame bowl= new BowlingGame ("[9,1][9,1][9,1][9,1][9,1][9,1][9,1][9,1][9,1][9,1][9]");
				assertEquals(190, bowl.getScore());
	}
	@Test
	void test14() {
		BowlingGame bowl= new BowlingGame ("[2,3][4,5][10,0][9,1][2,2][3,6][5,1][4,1][3,2][2,3]");
				assertEquals(80, bowl.getScore());
	}
	@Test
	void test15() {
		BowlingGame bowl= new BowlingGame ("[10,0][5,5][0,0][0,0][0,0][0,0][0,0][0,0][0,0][0,0]");
				assertEquals(30, bowl.getScore());
	}
	@Test
	void test16() {
		BowlingGame bowl= new BowlingGame ("[10,0][9,1][9,0][0,9][8,1][7,2][3,6][4,5][2,7][1,8]");
				assertEquals(111, bowl.getScore());
	}
	@Test
	void test17() {
		BowlingGame bowl= new BowlingGame ("[5,5][10,0][2,2][6,3][9,0][4,2][3,3][1,1][4,0][3,5]");
				assertEquals(82, bowl.getScore());
	}
	@Test
	void test18() {
		BowlingGame bowl= new BowlingGame ("[2,2][6,3][9,0][4,2][3,3][1,1][4,0][3,5]");
				assertEquals(-1, bowl.getScore());
	}
	@Test
	void test19() {
		BowlingGame bowl= new BowlingGame ("[9,6][1,2][3,1][5,0][4,2][3,1][2,3][8,0][9,0][2,2]");
				assertEquals(-1, bowl.getScore());
	}@Test
	void test20() {
		BowlingGame bowl= new BowlingGame ("[1,2][3,1][5,0][4,2][3,1][2,3][8,0][9,0][2,2][10,0]");
				assertEquals(-1, bowl.getScore());
	}	
	@Test
	void test21() {
		BowlingGame bowl= new BowlingGame ("[1,2][20,16][18,0][4,2][3,1][2,9][8,24][9,0][2,2][2,2]");
				assertEquals(-1, bowl.getScore());
	}
	@Test
	void test22() {
		BowlingGame bowl= new BowlingGame ("[a,2][3,1][8,c][4,2][+,1][?,9][8,!][9,0][2,2][2,2]");
				assertEquals(-1, bowl.getScore());
	}
	@Test
	void test23() {
		BowlingGame bowl= new BowlingGame ("[10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,10]");
				assertEquals(300, bowl.getScore());
	}
	@Test
	void test24() {
		BowlingGame bowl= new BowlingGame ("[10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0]");
				assertEquals(-1, bowl.getScore());
	}
	@Test
	void test25() {
		BowlingGame bowl= new BowlingGame ("[9,1][9,1][6,4][2,8][8,2][6,4][1,9][7,3][3,7][10,0]");
				assertEquals(-1, bowl.getScore());
	}
	@Test
	void test26() {
		BowlingGame bowl= new BowlingGame ("[9,1][9,1][6,4][2,8][8,2][6,4][1,9][7,3][3,7][10,0][4]");
				assertEquals(156, bowl.getScore());
	}
	@Test
	void test27() {
		BowlingGame bowl= new BowlingGame ("[20,20][20,20][20,20][20,20][20,20][20,20][20,20][20,20][20,20][20,20][20,20]");
				assertEquals(-1, bowl.getScore());
	}
	@Test
	void test28() {
		BowlingGame bowl= new BowlingGame ("[0,10][0,10][0,10][0,10][0,10][0,10][0,10][0,10][0,10][0,10][0,10]");
				assertEquals(100, bowl.getScore());
	}
	@Test
	void test29() {
		BowlingGame bowl= new BowlingGame ("hhhhhhhhh");
				assertEquals(-1, bowl.getScore());
	}
	@Test
	void test30() {
		BowlingGame bowl= new BowlingGame ("[9,1][9,1][6,4][2,8][8,2][6,4][1,9][7,3][3,7][5,3][1,0]");
				assertEquals(145, bowl.getScore());
	}
	@Test
	void test31() {
		BowlingGame bowl= new BowlingGame ("[1,2][3,1][5,0][4,2][3,1][2,3][8,0][9,0][2,2][7,3]");
				assertEquals(-1, bowl.getScore());
	}	
	@Test
	void test32() {
		BowlingGame bowl= new BowlingGame ("[3,2][4,3][7,3][5,3][5,2][1,3][5,4][3,3][5,1][6,2]");
				assertEquals(75, bowl.getScore());
	}	

	@Test
	void test33() {
		BowlingGame bowl= new BowlingGame ("[1,5][9][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,8]");
				assertEquals(-1, bowl.getScore());
	}	
	@Test
	void test34() {
		BowlingGame bowl= new BowlingGame ("[6,3][1,2][5,2][3,5][6,3][2,3][6,1][3,2][1,1][10,0][5,5][10,0]");
				assertEquals(-1, bowl.getScore());
	}	
	@Test
	void test35() {
		BowlingGame bowl= new BowlingGame ("[A,B][C,D][E,F][G,H][I,J][K,A][B,C][D,E][F,G][H,I]");
				assertEquals(-1, bowl.getScore());
	}	
	@Test
	void test36() {
		BowlingGame bowl= new BowlingGame ("[1,2][3,1][5,0][4,2][3,1][2,3][8,0][9,0][2,2][7,3]");
				assertEquals(-1, bowl.getScore());
	}
    @Test
    void test373() { 
        BowlingGame bowlingGame = new BowlingGame("[2,5][7,1][2,4][1,5][1,3][8,1][7,1][1,2][1,0][9,1][");
		assertEquals(-1,bowlingGame.getScore());
    }
   @Test
   void tlest28() { 
       BowlingGame bgame= new BowlingGame("[1,5][3,6][7,2][3,6][4,4][5,3][3,3][2,8][9,0][7,0]");
       boolean frame = bgame.new Frame(10,0).IsSpare();
       assertEquals(false,frame);
   }	
}
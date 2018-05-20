/**
 * ������������� �������������� ������ � ������ testPackage
 */
package peoples;
/**
* ����������� ����������
*/
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* �������� �����
*/
class CalculationTest {
	/**
	* ������������� ����� Calculation ��� �����������
	*/
 Calculation testingClass;
 /**
	* �������������� ����� Calculation
	*/
    @BeforeEach
   void setUp() {
        testingClass = new Calculation();
    }
	
    @Test
    void calc_n() {
    	/**
    	* ��������� ����� � �������� ����������� 13, 10000 � � �������������� ����������� 1300
    	*/
        assertEquals(1300, Calculation.Calc_n(13, 10000));
    }
	
	    @Test
    void calc_n2() {
	    	/**
	    	* ��������� ����� � �������� ����������� 15, 10000 � � �������������� ����������� 1500
	    	*/
        assertEquals(1500, Calculation.Calc_n(15, 10000));
    }
	
	    @Test
    void calc_n3() {
	    	/**
	    	* ��������� ����� � �������� ����������� 23, 50000 � � �������������� ����������� 11500
	    	*/
        assertEquals(11500, Calculation.Calc_n(23, 50000));
    }
	
	    @Test
    void calc_n4() {
	    	/**
	    	* ��������� ����� � �������� ����������� 18, 24000 � � �������������� ����������� 4320
	    	*/
        assertEquals(4320, Calculation.Calc_n(18, 24000));
    }
	
		@Test
    void calc_n5() {
			/**
	    	* ��������� ����� � �������� ����������� 9, 7000 � � �������������� ����������� 630
	    	*/
        assertEquals(630, Calculation.Calc_n(9, 7000));
    }
	    
		@Test
    void calc_n6() {
			/**
	    	* ��������� ����� � �������� ����������� 12, 16000 � � �������������� ����������� 1920
	    	*/
        assertEquals(1920, Calculation.Calc_n(12, 16000));
    }
	
	@Test
    void calc_n7() {
		/**
    	* ��������� ����� � �������� ����������� 17, 22500 � � �������������� ����������� 3825
    	*/
        assertEquals(3825, Calculation.Calc_n(17, 22500));
    }
	
    @Test
    void calc_n8() {
    	/**
    	* ��������� ����� � �������� ����������� 33, 120000 � � �������������� ����������� 39600
    	*/
        assertEquals(39600, Calculation.Calc_n(33, 120000));
    }
}

/**
 * Устанавливаем принадлежность класса к пакету testPackage
 */
package peoples;
/**
* Импортируем библиотеки
*/
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* Основной класс
*/
class CalculationTest {
	/**
	* Устанавливаем класс Calculation как тестируемый
	*/
 Calculation testingClass;
 /**
	* Инициализируем класс Calculation
	*/
    @BeforeEach
   void setUp() {
        testingClass = new Calculation();
    }
	
    @Test
    void calc_n() {
    	/**
    	* Тестируем метод с входными параметрами 13, 10000 и с предполагаемым результатом 1300
    	*/
        assertEquals(1300, Calculation.Calc_n(13, 10000));
    }
	
	    @Test
    void calc_n2() {
	    	/**
	    	* Тестируем метод с входными параметрами 15, 10000 и с предполагаемым результатом 1500
	    	*/
        assertEquals(1500, Calculation.Calc_n(15, 10000));
    }
	
	    @Test
    void calc_n3() {
	    	/**
	    	* Тестируем метод с входными параметрами 23, 50000 и с предполагаемым результатом 11500
	    	*/
        assertEquals(11500, Calculation.Calc_n(23, 50000));
    }
	
	    @Test
    void calc_n4() {
	    	/**
	    	* Тестируем метод с входными параметрами 18, 24000 и с предполагаемым результатом 4320
	    	*/
        assertEquals(4320, Calculation.Calc_n(18, 24000));
    }
	
		@Test
    void calc_n5() {
			/**
	    	* Тестируем метод с входными параметрами 9, 7000 и с предполагаемым результатом 630
	    	*/
        assertEquals(630, Calculation.Calc_n(9, 7000));
    }
	    
		@Test
    void calc_n6() {
			/**
	    	* Тестируем метод с входными параметрами 12, 16000 и с предполагаемым результатом 1920
	    	*/
        assertEquals(1920, Calculation.Calc_n(12, 16000));
    }
	
	@Test
    void calc_n7() {
		/**
    	* Тестируем метод с входными параметрами 17, 22500 и с предполагаемым результатом 3825
    	*/
        assertEquals(3825, Calculation.Calc_n(17, 22500));
    }
	
    @Test
    void calc_n8() {
    	/**
    	* Тестируем метод с входными параметрами 33, 120000 и с предполагаемым результатом 39600
    	*/
        assertEquals(39600, Calculation.Calc_n(33, 120000));
    }
}

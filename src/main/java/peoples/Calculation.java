/**
* Устанавливаем принадлежность класса к пакету
 */
package peoples;

public class Calculation {
	/**
	* Класс расчета НДФЛ(налог на доход физ. лиц)
	 */
    public static float Calc_n(float rad, float sumok) {
    	/**
    	* Объявляем переменную суммы налога
    	 */
        float sum_n;
        /**
        * Определяем чему равна переменная
         */
        sum_n=(sumok/100)*rad;/**формула расчета
        * Возвращаем переменную
         */
        return sum_n;
        
    }
    /**
    * Класс расчета Суммы на руки
     */
    public static float Calc_nar(float oklad, float sum_n) {
    	/**
    	* Объявляем переменную суммы Суммы на руки
    	 */
        float sum_nar;
        /**
    	* Определяем чему равна переменная
    	 */
        sum_nar=oklad-sum_n;/**формула расчета
        * Возвращаем переменную
         */
        return sum_nar;
    }
}

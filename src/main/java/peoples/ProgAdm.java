/**
* Устанавливаем принадлежность класса к пакету
 */
package peoples;
/**
 * Подключаем библиотеку для работы с графическим интерфейсом
 */
import java.awt.*;
/**
 * Подключаем класс событий
 */
import java.awt.event.*;
/**
 * Подключаем библиотеку для работы с графическим интерфейсом
 */
import javax.swing.*;
/**
 * Подключаем библиотеку для работы с отступами
 */
import javax.swing.border.*;
/**
 * Объявляем класс, который наследует от родительского класса
 */
public class ProgAdm extends JFrame{
	/**
	 * Объявляем переменную результат вычисления налога 
	 */
	float result;
	/**
	 * Объявляем переменную результат вычисления суммы на руки
	 */
	float rez;
	/**
	 * Объявляем панели для расположения элементов
	 */
	private JPanel panel, panel1;
	/**
	 * Объявляем кнопку
	 */
	private JButton calc;
	/**
	 * Объявляем надписи
	 */
	private JLabel label_1,label_2,label_3, label_4,sum_n,sum;
	/**
	 * Объявляем поля ввода
	 */
	public static JTextField sum_ok;
	public static JTextField sum_proc;
	/**
	 * Объявляем переменную: процент налога
	 */
	public static int int_rad;
	/**
	 * Объявляем конструктор
	 */
	public ProgAdm() {
		/**
		 * Определяем название окна
		 */
		setTitle("Калькулятор НДФЛ");
		/**
		 * Определяем размеры окна
		 */
		setSize(320, 240);
		/**
		 * Определяем расположение окна на экране
		 */
		setLocationRelativeTo(null);
		/**
		 * Определяем опции закрытия окна: выход из приложения
		 */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/**
		 * Определяем тип расположения элементов в окне
		 */
		setLayout (new BorderLayout()); 
		/**
		 * Объявляем панель для расположения элементов
		 */
		panel = new JPanel();
		/**
		 * Объявляем панель для расположения элементов
		 */
		panel1 = new JPanel();
		/**
		 * Добавляем панель в окно в центр
		 */
		add(panel, BorderLayout.CENTER);
		/**
		 * Добавляем панель в окно в низ
		 */
		add(panel1, BorderLayout.SOUTH);
		/**
		 * Устанавливаем отступы для панели (вверх,лево,низ,право)
		 */
		panel.setBorder(new EmptyBorder(10,10,10,10));
		/**
		 * Устанавливаем отступы для панели (вверх,лево,низ,право)
		 */
		panel1.setBorder(new EmptyBorder(10,10,10,10));
		/**
		 * Определяем тип расположения элементов (строки, столбцы, промежуток по горизонтали, промежуток по вертикали)
		 */
		panel.setLayout(new GridLayout(6,2,15,0));
		/**
		 * Определяем тип расположения элементов (строки, столбцы)
		 */
		panel1.setLayout(new GridLayout(1,1));
		/**
		 * Определяем содержание надписей и выравнивание по левой стороне
		 */
		label_1 = new JLabel("Сумма оклада, руб.", JLabel.LEFT);
		label_2 = new JLabel("Налоговая ставка", JLabel.LEFT);
		label_3 = new JLabel("Сумма налога, руб.", JLabel.LEFT);
		label_4 = new JLabel("Сумма на руки, руб.", JLabel.LEFT);
		/**
		 * Определяем содержание надписей и выравнивание по центру
		 */
		sum_n = new JLabel("", JLabel.CENTER);
		sum = new JLabel("", JLabel.CENTER);
		/**
		 * Определяем содержание надписи кнопки
		 */
		calc = new JButton("Рассчитать");
		/**
		 * Объявляем поле ввода:сумма оклада
		 */
		sum_ok = new JTextField();
		/**
		 * Определяем выравнивание по центру по горизонтали
		 */
		sum_ok.setHorizontalAlignment(JTextField.CENTER);
		/**
		 * Объявляем поле ввода:Процент налога
		 */
		sum_proc = new JTextField();
		/**
		 * Определяем выравнивание по центру по горизонтали
		 */
		sum_proc.setHorizontalAlignment(JTextField.CENTER);
		/**
		 * Добавляем созданные ранее кнопки, надписи, и поля ввода в панели
		 */
		//calc.setBackground(Color.GREEN);//Сделать кнопку зеленой
		panel.add(label_1);
		panel.add(sum_ok);
		panel.add(label_2);
		panel.add(sum_proc);
		panel.add(label_3);
		panel.add(sum_n);
		panel.add(label_4);
		panel.add(sum);
		panel1.add(calc);
		/**
		 * Задаем цвет фона для панелей
		 */
		panel.setBackground(new Color(182,234,131));
		panel1.setBackground(new Color(182,234,131));
		/**
		 * Добавляем слушателя на круглую кнопку
		 */
		calc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**
				 * Считываем введенное значение из поля Сумма оклада
				 * и преобразуем в переменную с плавающей точкой
				 */
			Float sumok = Float.parseFloat((sum_ok.getText( )));
			/**
			 * Считываем введенное значение из поля Процент налога
			 * и преобразуем в переменную с плавающей точкой
			 */
			Float sumproc = Float.parseFloat((sum_proc.getText( )));
			/**
			 * Выводим результат сумму налога, после того
			 * как передали в класс Calculation и вернул нам ответ
			 */
			sum_n.setText(""+ (result=  Calculation.Calc_n(sumproc,sumok)));
			/**
			 * Выводим результат сумму на руки, после того
			 * как передали в класс Calculation и вернул нам ответ
			 */
			sum.setText(""+ (rez=  Calculation.Calc_nar(sumok,result)));
		}
		});
sum_ok.addKeyListener(new KeyAdapter() {
	   public void keyReleased(KeyEvent e) {
		   /**
		    * Проверяем если нажата кнопка "Backspase" или кнопка "." то пропускаем
		    */
		      if ((e.getKeyCode() == KeyEvent.VK_BACK_SPACE)|(e.getKeyCode() == KeyEvent.VK_PERIOD)) {
		    	  return;
		      }
		      /**
		        * Вывод опционального окна, приведенного под окно ошибки,
		        * для вывода информации об ошибке,
			    * если нажаты другие кнопки кроме цифр от "0" до "9" 
			    * 
			    */
		      char t = e.getKeyChar();
		      if ((t < '0') || (t > '9')){
		    	 final JPanel panel = new JPanel();
				 JOptionPane.showMessageDialog(panel,"Введен недопустимый символ!", "Ошибка", JOptionPane.ERROR_MESSAGE);
		         e.consume();
		         /**
					 * Очищаем поле для ввода
					 */
		         sum_ok.setText("");
		      }
	   }});
sum_proc.addKeyListener(new KeyAdapter() {
	   public void keyReleased(KeyEvent e) {
		   /**
		    * Проверяем если нажата кнопка "Backspase" или кнопка "." то пропускаем
		    */
		      if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
		    	  return;
		      }
		      /**
		        * Вывод опционального окна, приведенного под окно ошибки,
		        * для вывода информации об ошибке,
			    * если нажаты другие кнопки кроме цифр от "0" до "9" 
			    * 
			    */
		      char t = e.getKeyChar();
		      if ((t < '0') || (t > '9')){
		    	 final JPanel panel = new JPanel();
				 JOptionPane.showMessageDialog(panel,"Введен недопустимый символ!", "Ошибка", JOptionPane.ERROR_MESSAGE);
		         e.consume();
		         /**
					 * Очищаем поле для ввода
					 */
		         sum_proc.setText("");
		      }
	   }});}}

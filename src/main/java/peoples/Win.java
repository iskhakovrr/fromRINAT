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
import java.awt.event.ActionEvent;
/**
 * Подключаем класс прослушки
 */
import java.awt.event.ActionListener;
/**
 * Подключаем библиотеку для работы с графическим интерфейсом
 */
import javax.swing.*;
/**
 * Объявляем класс, который наследует от родительского класса
 */
public class Win extends JFrame{
/**
 * Объявляем конструктор
 */
public Win(){
/**
 * Создаем окно
 */
super("Окно авторизации");
/**
 * Определяем положение окна на экране и размеры окна
 */
setBounds(800, 400, 400, 200);
/**
 * Объявляем панель для расположения элементов
 */
JPanel panel1=new JPanel();
/**
 * Определяем тип расположения элементов (строки, столбцы, промежуток по горизонтали, промежуток по вертикали)
 */
GridLayout layout = new GridLayout(5, 2, 5, 6);
/**
 * Объявляем надпись и определяем ее содержимое
 */
JLabel text1=new JLabel("Введите логин:");
/**
 * Объявляем переменную Логин для типа пользователя Пользователь
 */
String right_login="User";
/**
 * Объявляем переменную Пароль для типа пользователя Пользователь
 */
String right_password="1991";
/**
 * Объявляем переменную Логин для типа пользователя Администратор
 */
String right_login_adm="Admin";
/**
 * Объявляем переменную Пароль для типа пользователя Администратор
 */
String right_password_adm="9119";
/**
 * Объявляем надпись и определяем ее содержимое
 */
JLabel text2=new JLabel("Введите пароль:");//объявляем текстовые строки
/**
 * Объявляем поля ввода для ввода Логина и Пароля соответственно
 */
JTextField box1=new JTextField();
JTextField box2=new JTextField();
/**
 * Объявляем круглые Кнопки и определяем их названия
 */
JRadioButton SW = new JRadioButton("Пользователь",true);
JRadioButton SW1 = new JRadioButton("Администратор",false);
/**
 * Объявляем Кнопку и определяем ее название
 */
JButton go=new JButton("Войти");
/**
 * Присваиваем тип расположения элементов (объявленный и определенный ранее) для панели
 */
panel1.setLayout(layout);
/**
 * Добавляем созданные ранее кнопки, надписи, и поля ввода в панель
 */
panel1.add(SW);panel1.add(SW1);
panel1.add(text1);panel1.add(box1);
panel1.add(text2);panel1.add(box2);
panel1.add(go);
/**
 * Задаем цвет фона для круглыя кнопкок
 */
SW.setBackground(new Color(182,234,131));
SW1.setBackground(new Color(182,234,131));
/**
 * Задаем цвет фона для панели
 */
panel1.setBackground(new Color(182,234,131));
/**
 * Устанавливаем панель содержимого для окна
 */
setContentPane(panel1);
/**
 * Устанавливаем параметр видимости окна
 */
setVisible(true);
/**
 * Определяем опции закрытия окна: выход из приложения
 */
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
/**
 * Объявляем группу кнопок
 */
ButtonGroup group = new ButtonGroup();
/**
 * Добавляем круглые кнопки в группу гнопок
 */
group.add(SW);
group.add(SW1);
//go.setBackground(Color.GREEN);	//Сделать кнопку зеленой
/**
 * Добавляем слушателя на кнопку
 */
go.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
	/**
	 * Проверяем активна ли круглая кнопка с типом пользователя Пользователь
	 */
	if(SW.isSelected()) {
		/**
		 * Если да, то проверяем правильность Логина
		 */
		if(box1.getText( ).equals(right_login)) {
			/**
			 * Если да, то проверяем правильность Пароля
			 */
			if(box2.getText( ).equals(right_password)) {
				/**
				 * Инициализируем класс Prog
				 */
				Prog prog=new Prog();
				/**
				 * Выводим окно находящееся в классе Prog
				 */
				prog.show();
				/**
				 * Скрываем окно авторизации
				 */
				setVisible(false);
			}
			/**
			 * Вывод опционального окна, приведенного под окно ошибки,
			 * для вывода информации об ошибке, при неверном Пароле
			 */
			else {
				/**
				 * Объявляем панель
				 */
				final JPanel panel = new JPanel();
				/**
				 * определяем название и содержимое окна, а так же тип окна
				 */
				JOptionPane.showMessageDialog(panel,"Логин или пароль введены неверно!", "Ошибка", JOptionPane.ERROR_MESSAGE);
				/**
				 * Очищаем поля для ввода Логина и Пароля соответственно
				 */
				box1.setText("");
				box2.setText("");}
		}
		/**
		 * Вывод опционального окна, приведенного под окно ошибки,
		 * для вывода информации об ошибке, при неверном Логине
		 */
		else {
			/**
			 * Объявляем панель
			 */
			final JPanel panel = new JPanel();
			/**
			 * определяем название и содержимое окна, а так же тип окна
			 */
			JOptionPane.showMessageDialog(panel,"Логин или пароль введены неверно!", "Ошибка", JOptionPane.ERROR_MESSAGE);
			/**
			 * Очищаем поля для ввода Логина и Пароля соответственно
			 */
			box1.setText("");
			box2.setText("");}
}
	/**
	 * Проверяем активна ли круглая кнопка с типом пользователя Администратор
	 */
	if(SW1.isSelected()) {
		/**
		 * Если да, то проверяем правильность Логина
		 */
		if(box1.getText( ).equals(right_login_adm)) {
			/**
			 * Если да, то проверяем правильность Пароля
			 */
			if(box2.getText( ).equals(right_password_adm)) {
				/**
				 * Инициализируем класс ProgAdm
				 */
				ProgAdm progadm=new ProgAdm();
				/**
				 * Выводим окно находящееся в классе Prog
				 */
				progadm.show();
				/**
				 * Скрываем окно авторизации
				 */
				setVisible(false);
				
			}
			/**
			 * Вывод опционального окна, приведенного под окно ошибки,
			 * для вывода информации об ошибке, при неверном Пароле
			 */
			else {
				/**
				 * Объявляем панель
				 */
					final JPanel panel = new JPanel();
					/**
					 * определяем название и содержимое окна, а так же тип окна
					 */
					JOptionPane.showMessageDialog(panel,"Логин или пароль введены неверно!", "Ошибка", JOptionPane.ERROR_MESSAGE);
					/**
					 * Очищаем поля для ввода Логина и Пароля соответственно
					 */
					box1.setText("");
					box2.setText("");}
		}
		/**
		 * Вывод опционального окна, приведенного под окно ошибки,
		 * для вывода информации об ошибке, при неверном Пароле
		 */
		else {
			/**
			 * Объявляем панель
			 */
			final JPanel panel = new JPanel();
				/**
				 * определяем название и содержимое окна, а так же тип окна
				 */
				JOptionPane.showMessageDialog(panel,"Логин или пароль введены неверно!", "Ошибка", JOptionPane.ERROR_MESSAGE);
				/**
				 * Очищаем поля для ввода Логина и Пароля соответственно
				 */
				box1.setText("");
				box2.setText("");}
}}
});
}
/**
 * Метод main, точка входа программы
 */
public static void main(String[] args) {
	Win s=new Win();
}
}
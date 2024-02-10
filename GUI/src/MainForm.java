import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeListener;

public class MainForm {
    private JPanel mainPanel;
   // private JTextArea textArea;  удалили, чтобы протестировать работу
    private JButton clearButton;
    private JButton countButton;
    private JPanel drawPanel;

    public MainForm(){

        countButton.addActionListener(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                Graphics2D graphics2D = (Graphics2D) drawPanel.getGraphics(); //преобразуем drawPanel.getGraphics() к ГРАФИКС 2Д
                //рисуем в graphics2D:
                graphics2D.setColor(Color.RED);
                graphics2D.drawRect(55,55,12, 22);

            }
        });

        }

  /*
    public MainForm() {
       clearButton.addActionListener(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
textArea.setText("");
            }
        });

        countButton.addActionListener(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
String text = textArea.getText();
int length = text.length();
JOptionPane.showMessageDialog(  //статич метод, у него много параметров
      mainPanel, //родительский комп
      length + " символов",  //текст который будет отображаться
      "Длина текста", //заголовок вспл-го окна
       JOptionPane.PLAIN_MESSAGE //переменная которая соотв. типу всплыв. окна
);            }
        });

        textArea.addMouseListener(new MouseListener() { //обработка работы МЫШИ
            @Override
            public void mouseClicked(MouseEvent e) {  // клик
textArea.setBackground(Color.YELLOW); //делаем фон желтым
            }

            @Override
            public void mousePressed(MouseEvent e) { //нажали

            }

            @Override
            public void mouseReleased(MouseEvent e) { //отпустили

            }

            @Override
            public void mouseEntered(MouseEvent e) {  //фокус

            }

            @Override
            public void mouseExited(MouseEvent e) { //расфокус

            }
        });

        textArea.addKeyListener(new KeyListener() { //обработка клавы
            @Override
            public void keyTyped(KeyEvent e) { //нажали - отпустили
                //проверяем какой символ был напечатан:
if (e.getKeyChar() == '6'){
    textArea.setBackground(Color.blue);
}
                if (e.getKeyChar() == '0'){
                    textArea.setText(textArea.getText() + "Лошади"); //todo "Лошади" добавляются до цифры 0
                }
            }

            @Override
            public void keyPressed(KeyEvent e) { //нажали

            }

            @Override
            public void keyReleased(KeyEvent e) { //отпустили
              //  textArea.setBackground(Color.green);

            }
        });

    */



    public JPanel getMainPanel(){
        return mainPanel;
    }

}

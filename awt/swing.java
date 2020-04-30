import javax.swing.*;
class gui{
    public static void main(String args[]){
       JFrame frame = new JFrame("My First GUI");
       JButton button = new JButton("Press");       
       button.setBounds(100,100,80,30);
       frame.add(button);
       //frame.getContentPane().add(button); // Adds Button to content pane of frame
       frame.setSize(300,300);
       frame.setLayout((null));
       frame.setVisible(true);
    }
}
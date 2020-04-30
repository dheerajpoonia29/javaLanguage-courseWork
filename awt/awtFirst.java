import java.awt.*;
class awtFirst extends Frame{  

    First(){  
              
        TextArea area1=new TextArea();  
        area1.setBounds(50,50,150,20);  
        add(area1);
        setSize(50,200);  

        TextArea area2=new TextArea();  
        area2.setBounds(50,100,150,20);  
        add(area2);
        setSize(50,200);  

        Button btn = new Button("Click Me");          
        btn.setBounds(30,150,80,30);
        add(btn);
        setSize(300,300);
        
        setLayout(null);
        setVisible(true);

    }

    public static void main(String arg[]){
        First f = new First();
    }

} 
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Dimension;
import javax.swing.JCheckBoxMenuItem;

public class TaskSectionOne {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(550,400);
        frame.setResizable(false);
        //head of the project
        
        
        /**we make a container for the lift part of the head
         * adding the user options in the container
         */
        //design
        Font font = new Font("Arial", Font.BOLD, 16);
        JButton profilebtn=new JButton("profile"); //button for user profile
        JButton statusbtn=new JButton("status"); //button for user status
        JButton callbtn=new JButton("calls"); //buton for user calls
        profilebtn.setFont(font);
        profilebtn.setBackground(new Color(206, 246, 206));
        statusbtn.setFont(font);
        statusbtn.setBackground(new Color(206, 246, 206));
        callbtn.setFont(font);
        callbtn.setBackground(new Color(206, 246, 206));
        //-----------------
                //the container 1 to add all the buttons
        JPanel userpanel=new JPanel();
        userpanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        userpanel.setBackground(new Color(56, 97, 11));
        userpanel.add(callbtn);
        userpanel.add(statusbtn);
        userpanel.add(profilebtn);
        //----------------------------------------------------
        /**
         * a container for the right part of the head 
         * adding the setting options
         */
        JMenuBar mainmenu=new JMenuBar();// container of the menue 
 
        JButton loginbtn=new JButton("login");//login otpin
        JMenu settingmenu=new JMenu("setting");//setting option
        loginbtn.setFont(font);
        //loginbtn.setBorder(new LineBorder(Color.BLACK,1));
        loginbtn.setBackground(new Color(206, 246, 206));
        
        
        settingmenu.setFont(font);
        settingmenu.setOpaque(true);
        settingmenu.setBorder(new LineBorder(Color.BLACK,1));
        settingmenu.setBackground(new Color(206, 246, 206));
        settingmenu.addSeparator();
        //subsetting options
        JMenu submenu1=new JMenu("chang color"); //changing color option
        JMenu submenu2=new JMenu("language"); //choosing language
        JMenu submenu3=new JMenu("Privacy"); //user privacy
        //change color option
        JCheckBoxMenuItem checkitem1= new JCheckBoxMenuItem("white");
        JCheckBoxMenuItem checkitem2= new JCheckBoxMenuItem("black");
        //language option
        JCheckBoxMenuItem checkitem3= new JCheckBoxMenuItem("Arabic");
        JCheckBoxMenuItem checkitem4= new JCheckBoxMenuItem("English");
        submenu1.setFont(font);
        submenu1.setOpaque(true);
        submenu1.setBackground(new Color(206, 246, 206));
        submenu2.setFont(font);
        submenu2.setOpaque(true);
        submenu2.setBackground(new Color(206, 246, 206));
        submenu3.setFont(font);
        submenu3.setOpaque(true);
        submenu3.setBackground(new Color(206, 246, 206));
        checkitem1.setFont(font);
        checkitem1.setOpaque(true);
        checkitem1.setBackground(new Color(206, 246, 206));
        checkitem2.setFont(font);
        checkitem2.setOpaque(true);
        checkitem2.setBackground(new Color(206, 246, 206));
        checkitem3.setFont(font);
        checkitem3.setOpaque(true);
        checkitem3.setBackground(new Color(206, 246, 206));
        checkitem4.setFont(font);
        checkitem4.setOpaque(true);
        checkitem4.setBackground(new Color(206, 246, 206));
        //adding option to change color and language
        submenu1.add(checkitem1);
        submenu1.add(checkitem2);
        submenu2.add(checkitem3);
        submenu2.add(checkitem4);
        //anding submenu to setting menu
        settingmenu.add(submenu1);
        settingmenu.add(submenu2);
        settingmenu.add(submenu3);
        //---
        mainmenu.add(settingmenu);
        mainmenu.add(loginbtn);
        //the container 2 to add all setting options
        JPanel settingpanel=new JPanel();
        settingpanel.setBackground(new Color(56, 97, 11));
        settingpanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        settingpanel.add(mainmenu);
        /**
         * create the head container which contains
         * the user and setting options
         */
        GridLayout headlayout=new GridLayout(1,2);
        JPanel headpanel=new JPanel(); 
        headpanel.setBorder(new LineBorder(Color.BLACK,1));
        headpanel.setLayout(headlayout);
        headpanel.add(settingpanel);
        headpanel.add(userpanel);
        //end of the head
        
        /**
         * the east part of the project
         */
        
        JButton member1=new JButton("yassmeen");
        JButton member2=new JButton("123456");
        JButton member3=new JButton("sffegrg");
        JButton member4=new JButton("4gbgdgb");
        JButton member5=new JButton("5ererg");
        JButton member6=new JButton("6gghrf");
        JButton member7=new JButton("7dfgdg");
        JButton member8=new JButton("8afgd");
        JButton member9=new JButton("9bgfnf");
        JButton member10=new JButton("10fdgfg");
        JButton member11=new JButton("11dasd");
        JButton member12=new JButton("12bgbn");
        JButton member13=new JButton("13fngn");
        member1.setFont(font);
        member2.setFont(font);
        member3.setFont(font);
        member4.setFont(font);
        member5.setFont(font);
        member6.setFont(font);
        member7.setFont(font);
        member8.setFont(font);
        member9.setFont(font);
        member10.setFont(font);
        member11.setFont(font);
        member12.setFont(font);
        member13.setFont(font);
        member1.setBackground(new Color(129, 247, 159 ));
        member2.setBackground(new Color(129, 247, 159 ));
        member3.setBackground(new Color(129, 247, 159 ));
        member4.setBackground(new Color(129, 247, 159 ));
        member5.setBackground(new Color(129, 247, 159 ));
        member6.setBackground(new Color(129, 247, 159 ));
        member7.setBackground(new Color(129, 247, 159 ));
        member8.setBackground(new Color(129, 247, 159 ));
        member9.setBackground(new Color(129, 247, 159 ));
        member10.setBackground(new Color(129, 247, 159 ));
        member11.setBackground(new Color(129, 247, 159 ));
        member12.setBackground(new Color(129, 247, 159 ));
        member13.setBackground(new Color(129, 247, 159 ));
        /*member1.setBorder(new LineBorder(Color.BLACK,2));
        member2.setBorder(new LineBorder(Color.BLACK,2));
        member3.setBorder(new LineBorder(Color.BLACK,2));
        member4.setBorder(new LineBorder(Color.BLACK,2));
        member5.setBorder(new LineBorder(Color.BLACK,2));
        member6.setBorder(new LineBorder(Color.BLACK,2));
        member7.setBorder(new LineBorder(Color.BLACK,2));
        member8.setBorder(new LineBorder(Color.BLACK,2));
        member9.setBorder(new LineBorder(Color.BLACK,2));
        member10.setBorder(new LineBorder(Color.BLACK,2));
        member11.setBorder(new LineBorder(Color.BLACK,2));
        member12.setBorder(new LineBorder(Color.BLACK,2));
        member13.setBorder(new LineBorder(Color.BLACK,2));*/
        
        
        JPanel friendpanel=new JPanel();
       //+++++++++++++++++++++maybye
        GridLayout friendlayout=new GridLayout(0,1);
        
        //***
        friendpanel.setLayout(friendlayout);
        friendpanel.add(member1);
        friendpanel.add(member2);
        friendpanel.add(member3);
        friendpanel.add(member4);
        friendpanel.add(member5);
        friendpanel.add(member6);
        friendpanel.add(member7);
        friendpanel.add(member8);
        friendpanel.add(member9);
        friendpanel.add(member10);
        friendpanel.add(member11);
        friendpanel.add(member12);
        friendpanel.add(member13);
        
        JScrollPane scroll=new JScrollPane(friendpanel);
        scroll.setBorder(new LineBorder(Color.BLACK,2));
        scroll.setBackground(new Color(255,228,196));
        
        
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        //-------------
        /**
         * center part of the project
         */
        JTextField writefield=new JTextField("message");
        JButton sendbtn=new JButton("send");
        //writefield.setPreferredSize(new Dimension(300,30));
        sendbtn.setPreferredSize(new Dimension(100,30));
        JLabel chatarea=new JLabel("sending..",SwingConstants.CENTER);
        sendbtn.setFont(font);
        chatarea.setFont(font);
        sendbtn.setBackground(new Color(8, 138, 41));
        writefield.setBackground(new Color(216, 216, 216));
        sendbtn.setBorder(new LineBorder(Color.BLACK,1));
        writefield.setBorder(new LineBorder(Color.BLACK,2));
        
        
        
        JPanel mainpanel=new JPanel();
        JPanel chatpanel=new JPanel();
        JPanel msgepanel=new JPanel();
        
        mainpanel.setBorder(new LineBorder(Color.BLACK,1));
        mainpanel.setBackground(new Color(56, 97, 11));
        chatpanel.setBorder(new LineBorder(new Color(27, 42, 10),3));
        chatpanel.setBackground(new Color( 159, 247, 129));
        
       // msgepanel.setBorder(new LineBorder(new Color(27, 42, 10),3));
        msgepanel.setBackground(new Color(56, 97, 11));
        FlowLayout msglayout=new FlowLayout();
        
        //GridLayout mainlayout=new GridLayout(2,1,5,5);
        
        
        msgepanel.setLayout(msglayout);
       // mainpanel.setLayout(mainlayout);
        
        chatpanel.add(chatarea);
        
        msgepanel.add(writefield);
        msgepanel.add(sendbtn);
     
        // adding the two panels in one for the frame
        chatpanel.setPreferredSize(new Dimension(420, 250));
        msgepanel.setPreferredSize(new Dimension(420, 50));
        mainpanel.add(chatpanel,BorderLayout.CENTER);
        mainpanel.add(msgepanel,BorderLayout.SOUTH);
        

        //*******
        
        frame.add(headpanel,BorderLayout.NORTH);
        frame.add(scroll,BorderLayout.WEST);
        frame.add(mainpanel,BorderLayout.CENTER);
        
        //****************************
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}

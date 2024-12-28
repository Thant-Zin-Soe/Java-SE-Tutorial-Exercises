import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.net.URL;
import javax.swing.*;
 
public class PlayAlarm extends JFrame implements ActionListener {
 
    JButton btn, btn2;
    AudioClip click;
 
    public PlayAlarm() {
        setSize(400, 300);
        btn = new JButton("Play");
        btn2 = new JButton("Stop");
        setTitle("Play Alarm");
        setLayout(new FlowLayout());
        getContentPane().add(btn);
        getContentPane().add(btn2);
 
        btn.addActionListener(PlayAlarm.this);
        btn2.addActionListener(PlayAlarm.this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn) {
            URL urlClick = PlayAlarm.class.getResource("DesiJourney.wav");
            click = Applet.newAudioClip(urlClick);
            click.play();
        }
 
        else if (e.getSource() == btn2) {
           // click.stop();
            click.loop();
        }
    }
 
    public static void main(String[] args) {
        PlayAlarm p = new PlayAlarm();
        p.setVisible(true);
    }
}
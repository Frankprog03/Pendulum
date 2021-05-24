package pendulum;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;

import static java.lang.Math.*;

import javax.swing.JPanel;

/**
 *
 * @author labinf22
 */
public class PendulumPanel extends JPanel implements ComponentListener{
    private volatile double phasex = PI/2;
    private volatile double phasey = 0f;
    private volatile double fx = 1/(2*PI);
    private volatile double fy = 1/(2*PI);
    
    private volatile double posx = 0f;
    private volatile double posy = 0f;
    private volatile double oldx = 0f;
    private volatile double oldy = 0f;
    
    private volatile double time = 0;
    
    private int w = 1;
    
    private BufferedImage img = new BufferedImage(w, w, BufferedImage.TYPE_INT_ARGB);
    
    Color drawColor;
    double increment = 0.00001;
    double term = 2.00;
    boolean shouldStop = true;
    boolean tpfEnabled = true;
    boolean tsim = true;
    boolean rainbow = false;
    
    private boolean init;
    
    public PendulumPanel(){
        super();
        
        addComponentListener(this);
        
        init = true;
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2d.fillRect(0, 0, getWidth(), getHeight());
        g2d.drawImage(img, (getWidth()-w)/2, (getHeight()-w)/2, w, w, this);
        g2d.dispose();
    }
    
    private float color = 0;
    
    public void drawSegment(double x1, double y1, double x2, double y2){
        Graphics2D g = img.createGraphics();
        
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
        
        if(color < 1 && rainbow) color += 0.000001;
        else color = 0;
        
        g.setColor((rainbow) ? Color.getHSBColor(color, 1, 1) : drawColor);
        g.draw(new Line2D.Double(x1 + w / 2, y1 + w / 2, x2 + w / 2, y2 + w / 2));
        
        g.dispose();
    }
    
    public void setPhaseX(float v){
        phasex = v;
    }
    
    public void setPhaseY(float v){
        phasey = v;
    }
    
    public void setFrequencyX(double v){
        fx = v;
    }
    
    public void setFrequencyY(double v){
        fy = v;
    }
    
    public void resizeImage(int x, int y){
        clear();
        oldx = 0;
        oldy = 0;
        w=(x>y)?y:x;
        img = new BufferedImage(w, w, BufferedImage.TYPE_INT_RGB);
        firstTime = true;
        time = 0;
        color = 0;
    }
    
    public void clear(){
        Graphics2D g = img.createGraphics();
        
        g.setColor(Color.black);
        g.drawRect(0, 0, getWidth(), getHeight());
        
        g.dispose();
    }
    
    public void reset(){
        resizeImage(getWidth(), getHeight());
        clear();
    }//AibsK was here
    
    private volatile boolean firstTime = true;
    
    public void update(){
        while(isDisplayable()){
            double pulsex = 2*PI*fx;
            double pulsey = 2*PI*fy;

            double tpf = (tpfEnabled) ? 0.00001/increment : 1;

            if(time * tpf > term * PI && shouldStop) {
                continue;
            }

            posx = (w/2 - 20)*sin(pulsex * time * tpf + phasex);
            posy = (w/2 - 20)*sin(pulsey * time * tpf + phasey);

            if(!firstTime)drawSegment(oldx, oldy, posx, posy);
            else {
                reset();
                firstTime = false;
            }

            oldx = posx;
            oldy = posy;

            if(tsim){
                delay(1000);
                time += increment;
            }
            else time += 0.0001;
        }
    }
    
    @SuppressWarnings("empty-statement")
    private void delay(long nanos){
        long start = System.nanoTime();
        
        while(System.nanoTime() - start < nanos);
    }

    @Override
    public void componentResized(ComponentEvent e) {
        resizeImage(getWidth(), getHeight());
    }

    @Override
    public void componentMoved(ComponentEvent e) {}

    @Override
    public void componentShown(ComponentEvent e) {}

    @Override
    public void componentHidden(ComponentEvent e) {}
}

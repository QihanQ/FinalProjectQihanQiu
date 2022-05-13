import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyControls implements KeyListener {

    public boolean upPressed;
    public boolean downPressed;
    public boolean leftPressed;
    public boolean rightPressed;

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        if(keyCode == KeyEvent.VK_W)
        {
            upPressed = true;
        }
        if(keyCode == KeyEvent.VK_S)
        {
            downPressed = true;
        }
        if(keyCode == KeyEvent.VK_A)
        {
            leftPressed = true;
        }
        if(keyCode == KeyEvent.VK_D)
        {
            rightPressed = true;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();

        if(keyCode == KeyEvent.VK_W)
        {
            upPressed = false;
        }
        if(keyCode == KeyEvent.VK_S)
        {
            downPressed = false;
        }
        if(keyCode == KeyEvent.VK_A)
        {
            leftPressed = false;
        }
        if(keyCode == KeyEvent.VK_D)
        {
            rightPressed = false;
        }
    }
}
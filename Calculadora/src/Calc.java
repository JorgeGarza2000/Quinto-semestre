/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;

/**
 * @author Ensamble
 */
public class Calc extends MIDlet implements CommandListener {
    
    private boolean midletPaused = false;

    double valor1=0, valor2=0, result=0;
//<editor-fold defaultstate="collapsed" desc=" Generated Fields ">//GEN-BEGIN:|fields|0|
    private Form form;
    private TextField a;
    private TextField b;
    private StringItem r;
    private Command suma;
    private Command resta;
    private Command multiplicacion;
    private Command division;
    private Command exitCommand;
//</editor-fold>//GEN-END:|fields|0|
    /**
     * The Calc constructor.
     */
    public Calc() {
    }

//<editor-fold defaultstate="collapsed" desc=" Generated Methods ">//GEN-BEGIN:|methods|0|
//</editor-fold>//GEN-END:|methods|0|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: initialize ">//GEN-BEGIN:|0-initialize|0|0-preInitialize
    /**
     * Initializes the application. It is called only once when the MIDlet is
     * started. The method is called before the <code>startMIDlet</code> method.
     */
    private void initialize() {
//GEN-END:|0-initialize|0|0-preInitialize
        // write pre-initialize user code here
//GEN-LINE:|0-initialize|1|0-postInitialize
        // write post-initialize user code here
}//GEN-BEGIN:|0-initialize|2|
//</editor-fold>//GEN-END:|0-initialize|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: startMIDlet ">//GEN-BEGIN:|3-startMIDlet|0|3-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Started point.
     */
    public void startMIDlet() {
//GEN-END:|3-startMIDlet|0|3-preAction
        // write pre-action user code here
switchDisplayable(null, getForm());//GEN-LINE:|3-startMIDlet|1|3-postAction
        // write post-action user code here
}//GEN-BEGIN:|3-startMIDlet|2|
//</editor-fold>//GEN-END:|3-startMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: resumeMIDlet ">//GEN-BEGIN:|4-resumeMIDlet|0|4-preAction
    /**
     * Performs an action assigned to the Mobile Device - MIDlet Resumed point.
     */
    public void resumeMIDlet() {
//GEN-END:|4-resumeMIDlet|0|4-preAction
        // write pre-action user code here
//GEN-LINE:|4-resumeMIDlet|1|4-postAction
        // write post-action user code here
}//GEN-BEGIN:|4-resumeMIDlet|2|
//</editor-fold>//GEN-END:|4-resumeMIDlet|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: switchDisplayable ">//GEN-BEGIN:|5-switchDisplayable|0|5-preSwitch
    /**
     * Switches a current displayable in a display. The <code>display</code>
     * instance is taken from <code>getDisplay</code> method. This method is
     * used by all actions in the design for switching displayable.
     *
     * @param alert the Alert which is temporarily set to the display; if
     * <code>null</code>, then <code>nextDisplayable</code> is set immediately
     * @param nextDisplayable the Displayable to be set
     */
    public void switchDisplayable(Alert alert, Displayable nextDisplayable) {
//GEN-END:|5-switchDisplayable|0|5-preSwitch
        // write pre-switch user code here
Display display = getDisplay();//GEN-BEGIN:|5-switchDisplayable|1|5-postSwitch
        if (alert == null) {
            display.setCurrent(nextDisplayable);
        } else {
            display.setCurrent(alert, nextDisplayable);
        }//GEN-END:|5-switchDisplayable|1|5-postSwitch
        // write post-switch user code here
}//GEN-BEGIN:|5-switchDisplayable|2|
//</editor-fold>//GEN-END:|5-switchDisplayable|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Method: commandAction for Displayables ">//GEN-BEGIN:|7-commandAction|0|7-preCommandAction
    /**
     * Called by a system to indicated that a command has been invoked on a
     * particular displayable.
     *
     * @param command the Command that was invoked
     * @param displayable the Displayable where the command was invoked
     */
    public void commandAction(Command command, Displayable displayable) {
//GEN-END:|7-commandAction|0|7-preCommandAction
 // write pre-action user code here
if (displayable == form) {//GEN-BEGIN:|7-commandAction|1|22-preAction
            if (command == division) {//GEN-END:|7-commandAction|1|22-preAction
  valor1=Double.parseDouble(a.getString());
valor2=Double.parseDouble(b.getString());
if(valor1==0){
    r.setText(String.valueOf(result));
}else{
    result=valor1 / valor2;
    r.setText(String.valueOf(result));
}
//GEN-LINE:|7-commandAction|2|22-postAction
 // write post-action user code here
} else if (command == exitCommand) {//GEN-LINE:|7-commandAction|3|24-preAction
 // write pre-action user code here
exitMIDlet();//GEN-LINE:|7-commandAction|4|24-postAction
 // write post-action user code here
} else if (command == multiplicacion) {//GEN-LINE:|7-commandAction|5|20-preAction
 valor1=Double.parseDouble(a.getString());
valor2=Double.parseDouble(b.getString());
result=valor1 * valor2;
r.setText(String.valueOf(result));
//GEN-LINE:|7-commandAction|6|20-postAction
 // write post-action user code here
} else if (command == resta) {//GEN-LINE:|7-commandAction|7|18-preAction
valor1=Double.parseDouble(a.getString());
valor2=Double.parseDouble(b.getString());
result=valor1 - valor2;
r.setText(String.valueOf(result));
//GEN-LINE:|7-commandAction|8|18-postAction
 // write post-action user code here
} else if (command == suma) {//GEN-LINE:|7-commandAction|9|16-preAction
valor1=Double.parseDouble(a.getString());
valor2=Double.parseDouble(b.getString());
result=valor1 + valor2;
r.setText(String.valueOf(result));
//GEN-LINE:|7-commandAction|10|16-postAction
 // write post-action user code here
}//GEN-BEGIN:|7-commandAction|11|7-postCommandAction
        }//GEN-END:|7-commandAction|11|7-postCommandAction
 // write post-action user code here
}//GEN-BEGIN:|7-commandAction|12|
//</editor-fold>//GEN-END:|7-commandAction|12|


//<editor-fold defaultstate="collapsed" desc=" Generated Getter: form ">//GEN-BEGIN:|14-getter|0|14-preInit
    /**
     * Returns an initialized instance of form component.
     *
     * @return the initialized component instance
     */
    public Form getForm() {
        if (form == null) {
//GEN-END:|14-getter|0|14-preInit
 // write pre-init user code here
form = new Form("form", new Item[]{getA(), getB(), getR()});//GEN-BEGIN:|14-getter|1|14-postInit
            form.addCommand(getSuma());
            form.addCommand(getResta());
            form.addCommand(getMultiplicacion());
            form.addCommand(getDivision());
            form.addCommand(getExitCommand());
            form.setCommandListener(this);//GEN-END:|14-getter|1|14-postInit
 // write post-init user code here
}//GEN-BEGIN:|14-getter|2|
        return form;
    }
//</editor-fold>//GEN-END:|14-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: a ">//GEN-BEGIN:|30-getter|0|30-preInit
    /**
     * Returns an initialized instance of a component.
     *
     * @return the initialized component instance
     */
    public TextField getA() {
        if (a == null) {
//GEN-END:|30-getter|0|30-preInit
 // write pre-init user code here
a = new TextField("Ingrese el primer numero", null, 32, TextField.ANY);//GEN-LINE:|30-getter|1|30-postInit
 // write post-init user code here
}//GEN-BEGIN:|30-getter|2|
        return a;
    }
//</editor-fold>//GEN-END:|30-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: b ">//GEN-BEGIN:|31-getter|0|31-preInit
    /**
     * Returns an initialized instance of b component.
     *
     * @return the initialized component instance
     */
    public TextField getB() {
        if (b == null) {
//GEN-END:|31-getter|0|31-preInit
 // write pre-init user code here
b = new TextField("Ingrese el segundo numero", null, 32, TextField.ANY);//GEN-LINE:|31-getter|1|31-postInit
 // write post-init user code here
}//GEN-BEGIN:|31-getter|2|
        return b;
    }
//</editor-fold>//GEN-END:|31-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: r ">//GEN-BEGIN:|32-getter|0|32-preInit
    /**
     * Returns an initialized instance of r component.
     *
     * @return the initialized component instance
     */
    public StringItem getR() {
        if (r == null) {
//GEN-END:|32-getter|0|32-preInit
 // write pre-init user code here
r = new StringItem("stringItem", null);//GEN-LINE:|32-getter|1|32-postInit
 // write post-init user code here
}//GEN-BEGIN:|32-getter|2|
        return r;
    }
//</editor-fold>//GEN-END:|32-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: suma ">//GEN-BEGIN:|15-getter|0|15-preInit
    /**
     * Returns an initialized instance of suma component.
     *
     * @return the initialized component instance
     */
    public Command getSuma() {
        if (suma == null) {
//GEN-END:|15-getter|0|15-preInit
 // write pre-init user code here
suma = new Command("Sumar", Command.ITEM, 0);//GEN-LINE:|15-getter|1|15-postInit
 // write post-init user code here
}//GEN-BEGIN:|15-getter|2|
        return suma;
    }
//</editor-fold>//GEN-END:|15-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: resta ">//GEN-BEGIN:|17-getter|0|17-preInit
    /**
     * Returns an initialized instance of resta component.
     *
     * @return the initialized component instance
     */
    public Command getResta() {
        if (resta == null) {
//GEN-END:|17-getter|0|17-preInit
 // write pre-init user code here
resta = new Command("Restar", Command.ITEM, 0);//GEN-LINE:|17-getter|1|17-postInit
 // write post-init user code here
}//GEN-BEGIN:|17-getter|2|
        return resta;
    }
//</editor-fold>//GEN-END:|17-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: multiplicacion ">//GEN-BEGIN:|19-getter|0|19-preInit
    /**
     * Returns an initialized instance of multiplicacion component.
     *
     * @return the initialized component instance
     */
    public Command getMultiplicacion() {
        if (multiplicacion == null) {
//GEN-END:|19-getter|0|19-preInit
 // write pre-init user code here
multiplicacion = new Command("Multiplicacion", Command.ITEM, 0);//GEN-LINE:|19-getter|1|19-postInit
 // write post-init user code here
}//GEN-BEGIN:|19-getter|2|
        return multiplicacion;
    }
//</editor-fold>//GEN-END:|19-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: division ">//GEN-BEGIN:|21-getter|0|21-preInit
    /**
     * Returns an initialized instance of division component.
     *
     * @return the initialized component instance
     */
    public Command getDivision() {
        if (division == null) {
//GEN-END:|21-getter|0|21-preInit
 // write pre-init user code here
division = new Command("Division", Command.ITEM, 0);//GEN-LINE:|21-getter|1|21-postInit
 // write post-init user code here
}//GEN-BEGIN:|21-getter|2|
        return division;
    }
//</editor-fold>//GEN-END:|21-getter|2|

//<editor-fold defaultstate="collapsed" desc=" Generated Getter: exitCommand ">//GEN-BEGIN:|23-getter|0|23-preInit
    /**
     * Returns an initialized instance of exitCommand component.
     *
     * @return the initialized component instance
     */
    public Command getExitCommand() {
        if (exitCommand == null) {
//GEN-END:|23-getter|0|23-preInit
 // write pre-init user code here
exitCommand = new Command("Exit", Command.EXIT, 0);//GEN-LINE:|23-getter|1|23-postInit
 // write post-init user code here
}//GEN-BEGIN:|23-getter|2|
        return exitCommand;
    }
//</editor-fold>//GEN-END:|23-getter|2|



    /**
     * Returns a display instance.
     *
     * @return the display instance.
     */
    public Display getDisplay() {
        return Display.getDisplay(this);
    }

    /**
     * Exits MIDlet.
     */
    public void exitMIDlet() {
        switchDisplayable(null, null);
        destroyApp(true);
        notifyDestroyed();
    }

    /**
     * Called when MIDlet is started. Checks whether the MIDlet have been
     * already started and initialize/starts or resumes the MIDlet.
     */
    public void startApp() {
        if (midletPaused) {
            resumeMIDlet();
        } else {
            initialize();
            startMIDlet();
        }
        midletPaused = false;
    }

    /**
     * Called when MIDlet is paused.
     */
    public void pauseApp() {
        midletPaused = true;
    }

    /**
     * Called to signal the MIDlet to terminate.
     *
     * @param unconditional if true, then the MIDlet has to be unconditionally
     * terminated and all resources has to be released.
     */
    public void destroyApp(boolean unconditional) {
    }
    
}

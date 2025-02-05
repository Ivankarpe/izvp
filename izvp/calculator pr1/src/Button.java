import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Button extends JButton{
    String _symbol;
    String _value;
    InputField inputField;
    Button(String symbol, String value, InputField inputField){
        super(symbol);
        setSymbol(symbol);
        setValue(value);
        this.inputField = inputField;
        addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                try {
                    inputField.AddPart(value);
                } catch (Exception e1) {
                    //TODO: exeptions
                    e1.printStackTrace();
                }
            }
        });
    }
    public void setSymbol(String symbol) {
        this._symbol = symbol;
    }
    public void setValue(String value) {
        this._value = value;
    }
}

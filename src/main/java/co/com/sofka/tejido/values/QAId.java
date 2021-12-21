package co.com.sofka.tejido.values;

import co.com.sofka.generico.Id;

public class QAId extends Id {
    private QAId(String value){
        super(value);
    }

    public QAId() {
    }

    public static QAId of(String value){
        return new QAId(value);
    }

}

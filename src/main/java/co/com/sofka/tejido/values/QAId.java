package co.com.sofka.tejido.values;


import co.com.sofka.domain.generic.Identity;

public class QAId extends Identity {
    private QAId(String value){
        super(value);
    }

    public QAId() {
    }

    public static QAId of(String value){
        return new QAId(value);
    }

}

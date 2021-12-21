package co.com.sofka.tejido.values;

import co.com.sofka.domain.generic.Identity;

public class QAResponsableId extends Identity {
    private QAResponsableId(String id) {
        super(id);
    }

    public QAResponsableId() {
    }

    public static QAResponsableId of(String value) {
        return new QAResponsableId(value);
    }
}

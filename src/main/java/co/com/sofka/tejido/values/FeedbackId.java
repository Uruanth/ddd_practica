package co.com.sofka.tejido.values;

import co.com.sofka.generico.Id;

public class FeedbackId extends Id {

    private FeedbackId(String value) {
        super(value);
    }

    public FeedbackId(){}

    public static FeedbackId of(String value) {
        return new FeedbackId(value);
    }

}
